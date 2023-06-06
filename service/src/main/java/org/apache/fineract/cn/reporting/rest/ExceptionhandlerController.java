package org.apache.fineract.cn.reporting.rest;
import com.google.gson.Gson;
import org.apache.fineract.cn.reporting.internal.Error.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;

import java.sql.Timestamp;
import java.util.Date;
@RestControllerAdvice
public class ExceptionhandlerController {

    Gson gson=new Gson();
    Timestamp timestamp=new Timestamp(new Date().getTime());
    @ExceptionHandler(HttpClientErrorException.class)
    public ResponseEntity<GlobleException> getHttpClientErrorException(HttpClientErrorException exception){
        GlobleException globleException=gson.fromJson(exception.getResponseBodyAsString().toString(),GlobleException.class);
        return new ResponseEntity<>(new GlobleException(globleException.getResponseCode(),globleException.getResponseMsg(),globleException.getStatus(),String.valueOf(timestamp)), HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(GlobleException.class)
    public ResponseEntity<GlobleException> getGlobleException(HttpClientErrorException exception){
        GlobleException globleException=gson.fromJson(exception.getResponseBodyAsString().toString(),GlobleException.class);
        return new ResponseEntity<>(new GlobleException(globleException.getResponseCode(),globleException.getResponseMsg(),globleException.getStatus(),String.valueOf(timestamp)), HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(MaximumLoginAttempsReached.class)
    public ResponseEntity<GlobleException> getMaximumLoginAttempsReached(MaximumLoginAttempsReached exception){
        return new ResponseEntity<>(new GlobleException("429",exception.getMessage(),"429",String.valueOf(timestamp)), HttpStatus.TOO_MANY_REQUESTS);
    }


    @ExceptionHandler(InActiveException.class)
    public ResponseEntity<GlobleException> getGlobleException(InActiveException exception){
        return new ResponseEntity<>(new GlobleException("401",exception.getMessage(),"401",String.valueOf(timestamp)), HttpStatus.UNAUTHORIZED);
    }


    @ExceptionHandler(TokenAlreadyFoundException.class)
    public ResponseEntity<GlobleException> getTokenAlreadyFoundException(TokenAlreadyFoundException exception){
        return new ResponseEntity<>(new GlobleException("401",exception.getMessage(),"401",String.valueOf(timestamp)), HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<GlobleException> getNotFoundException(NotFoundException exception){
        return new ResponseEntity<>(new GlobleException("400",exception.getMessage(),"400",String.valueOf(timestamp)), HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(NumberFormatException.class)
    public ResponseEntity<GlobleException> getNumberFormatException(NumberFormatException exception){
        return new ResponseEntity<>(new GlobleException("400",exception.getMessage(),"400",String.valueOf(timestamp)), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<GlobleException> getBadRequestException(BadRequestException exception){
        return new ResponseEntity<>(new GlobleException("400",exception.getMessage(),"400",String.valueOf(timestamp)), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UserWithStateNotFoundException.class)
    public ResponseEntity<GlobleException> getBadRequestException(UserWithStateNotFoundException exception){
        return new ResponseEntity<>(new GlobleException("400",exception.getMessage(),"400",String.valueOf(timestamp)), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UserAuthenticationFailedException.class)
    public ResponseEntity<GlobleException> getBadRequestException(UserAuthenticationFailedException exception){
        return new ResponseEntity<>(new GlobleException("401",exception.getMessage(),"401",String.valueOf(timestamp)), HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(InternalCompilerError.class)
    public ResponseEntity<GlobleException> getInternalCompilerError(InternalCompilerError exception){
        return new ResponseEntity<>(new GlobleException("900",exception.getMessage(),"900",String.valueOf(timestamp)), HttpStatus.BAD_REQUEST);
    }


//    @ExceptionHandler(geoFlag.class)
//    public ResponseEntity<GlobleException> getBadRequestException(geoFlag exception){
//        return new ResponseEntity<>(new GlobleException("660",exception.getMessage(),"400",String.valueOf(timestamp)), HttpStatus.BAD_REQUEST);
//    }




}