--
-- Licensed to the Apache Software Foundation (ASF) under one
-- or more contributor license agreements.  See the NOTICE file
-- distributed with this work for additional information
-- regarding copyright ownership.  The ASF licenses this file
-- to you under the Apache License, Version 2.0 (the
-- "License"); you may not use this file except in compliance
-- with the License.  You may obtain a copy of the License at
--
--   http://www.apache.org/licenses/LICENSE-2.0
--
-- Unless required by applicable law or agreed to in writing,
-- software distributed under the License is distributed on an
-- "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
-- KIND, either express or implied.  See the License for the
-- specific language governing permissions and limitations
-- under the License.
--

CREATE TABLE ptah_addresses(
  id BIGSERIAL NOT NULL,
  street       VARCHAR(256) NOT NULL,
  city         VARCHAR(256) NOT NULL,
  postal_code  VARCHAR(32) NULL,
  region       VARCHAR(256) NULL,
  country_code VARCHAR(2) NOT NULL,
  country      VARCHAR(256) NOT NULL,
  CONSTRAINT ptah_addresses_pk PRIMARY KEY (id)
);

CREATE TABLE ptah_group_definitions (
  id                 BIGSERIAL     NOT NULL,
  identifier         VARCHAR(32)   NOT NULL,
  description        VARCHAR(2048) NULL,
  minimal_size       INTEGER       NOT NULL,
  maximal_size       INTEGER       NOT NULL,
  number_of_reportings INTEGER       NOT NULL,
  frequency          VARCHAR(32)   NOT NULL,
  adjustment         VARCHAR(32)   NULL,
  created_on         TIMESTAMP(3)  NOT NULL,
  created_by         VARCHAR(32)   NOT NULL,
  last_modified_on   TIMESTAMP(3)  NULL,
  last_modified_by   VARCHAR(32)   NULL,
  CONSTRAINT ptah_group_definitions_pk PRIMARY KEY (id),
  CONSTRAINT ptah_group_definitions_identifier_uq UNIQUE (identifier)
);

CREATE TABLE ptah_groups (
  id                  BIGSERIAL     NOT NULL,
  identifier          VARCHAR(32)   NOT NULL,
  group_definition_id BIGINT        NOT NULL,
  a_name              VARCHAR(256)  NOT NULL,
  leaders             VARCHAR(512)  NULL,
  members             VARCHAR(2048) NOT NULL,
  office              VARCHAR(32)   NOT NULL,
  assigned_employee   VARCHAR(32)   NOT NULL,
  weekday             INTEGER       NOT NULL,
  group_status        VARCHAR(32)   NOT NULL,
  current_cycle       BIGINT        NOT NULL ,
  address_id          BIGINT        NOT NULL,
  created_on          TIMESTAMP(3)  NOT NULL,
  created_by          VARCHAR(32)   NOT NULL,
  last_modified_on    TIMESTAMP(3)  NULL,
  last_modified_by    VARCHAR(32)   NULL,
  CONSTRAINT ptah_groups_pk PRIMARY KEY (id),
  CONSTRAINT ptah_groups_identifier_uq UNIQUE (identifier),
  CONSTRAINT ptah_groups_definitions_fk FOREIGN KEY (group_definition_id) REFERENCES ptah_group_definitions (id),
  CONSTRAINT ptah_group_addresses_fk FOREIGN KEY (address_id) REFERENCES ptah_addresses (id)
);

CREATE TABLE ptah_group_commands (
  id         BIGSERIAL    NOT NULL,
  group_id   BIGINT       NOT NULL,
  a_action   VARCHAR(32)  NOT NULL,
  note       VARCHAR(256) NOT NULL,
  created_on TIMESTAMP(3) NOT NULL,
  created_by VARCHAR(32)  NOT NULL,
  CONSTRAINT ptah_group_commands_pk PRIMARY KEY (id),
  CONSTRAINT ptah_group_commands_definitions_fk FOREIGN KEY (group_id) REFERENCES ptah_groups (id)
);

CREATE TABLE ptah_reportings (
  id               BIGSERIAL    NOT NULL,
  group_id         BIGINT       NOT NULL,
  reporting_sequence BIGINT       NOT NULL,
  current_cycle    BIGINT       NOT NULL,
  scheduled_for    DATE         NOT NULL,
  held_on          DATE         NULL,
  duration         BIGINT       NULL,
  created_on       TIMESTAMP(3) NOT NULL,
  created_by       VARCHAR(32)  NOT NULL,
  CONSTRAINT ptah_reportings_pk PRIMARY KEY (id),
  CONSTRAINT ptah_group_reportings_fk FOREIGN KEY (group_id) REFERENCES ptah_groups (id)
);

CREATE TABLE ptah_attendees (
  id                  BIGSERIAL    NOT NULL,
  reporting_id          BIGINT       NOT NULL,
  customer_identifier VARCHAR(32)  NOT NULL,
  a_status            VARCHAR(256) NOT NULL,
  CONSTRAINT ptah_attendees_pk PRIMARY KEY (id),
  CONSTRAINT ptah_reporting_attendees_fk FOREIGN KEY (reporting_id) REFERENCES ptah_attendees (id)
);
