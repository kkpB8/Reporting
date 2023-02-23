
/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.fineract.cn.reporting;

        import org.apache.fineract.cn.anubis.config.EnableAnubis;
        import org.apache.fineract.cn.async.config.EnableAsync;
        import org.apache.fineract.cn.cassandra.config.EnableCassandra;
        import org.apache.fineract.cn.lang.config.EnableServiceException;
        import org.apache.fineract.cn.lang.config.EnableTenantContext;
        import org.apache.fineract.cn.postgresql.config.EnablePostgreSQL;
        import org.modelmapper.ModelMapper;
        import org.slf4j.Logger;
        import org.slf4j.LoggerFactory;
        import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
        import org.springframework.boot.web.servlet.MultipartConfigFactory;
        import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.ComponentScan;
        import org.springframework.context.annotation.Configuration;
        import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
        import org.springframework.stereotype.Component;
        import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
        import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

        import javax.servlet.MultipartConfigElement;

@SuppressWarnings("WeakerAccess")
@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableAsync
@EnableTenantContext
@EnableCassandra
@EnablePostgreSQL
//@EnableCommandProcessing
@EnableAnubis
@EnableServiceException
@ComponentScan({
        "org.apache.fineract.cn.reporting.rest",
        "org.apache.fineract.cn.reporting.internal.logger",
        "org.apache.fineract.cn.anubis.security",
        "org.apache.fineract.cn.reporting.internal.service",
        "org.apache.fineract.cn.reporting.internal.repository",
        //"org.apache.fineract.cn.reporting.internal.command.handler",
        "org.apache.fineract.cn.reporting.internal.exception",
        "org.apache.fineract.cn.reporting.internal.Error",
        "org.apache.fineract.cn.reporting.internal.Filter"
})
@EnableJpaRepositories({
        "org.apache.fineract.cn.reporting.internal.repository"
})
public class ReportingConfiguration extends WebMvcConfigurerAdapter {

  public ReportingConfiguration() {
    super();
  }

  @Bean(name = ServiceConstants.LOGGER_NAME)
  public Logger logger() {
    return LoggerFactory.getLogger(ServiceConstants.LOGGER_NAME);
  }

  /*@Bean(name = "multipartResolver")
  public CommonsMultipartResolver multipartResolver()
  {
    CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
    multipartResolver.setMaxUploadSize(5242880);
    return multipartResolver;
  }*/

  @Bean
  public MultipartConfigElement multipartConfigElement() {
    MultipartConfigFactory factory = new MultipartConfigFactory();
    factory.setMaxFileSize("124MB");
    factory.setMaxRequestSize("124MB");
    return factory.createMultipartConfig();
  }


  @Override
  public void configurePathMatch(final PathMatchConfigurer configurer) {
    configurer.setUseSuffixPatternMatch(Boolean.FALSE);
  }

  @Component
  public class ModelMapperUtil extends ModelMapper {
    public ModelMapperUtil() {
      this.getConfiguration().setFieldMatchingEnabled(true).setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE);
    }
  }
}
