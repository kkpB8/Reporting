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
package org.apache.fineract.cn.reporting.internal.Error;

import org.apache.fineract.cn.reporting.internal.exception.CustomStatus;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;

/*@ControllerAdvice
public class GlobalExceptionHandler {
 int x=0;
 int y = 0;

    // Let Spring handle the exception, we just override the status code
    @ExceptionHandler(UserWithStateNotFoundException.class)
    public void springHandleNotFound(HttpServletResponse response) throws IOException {
        response.sendError(HttpStatus.NOT_ACCEPTABLE.value(),"Welcome");
    }

}*/

@RestControllerAdvice
class CustomGlobalExceptionHandler  {
  // Let Spring handle the exception, we just override the status code
  @ExceptionHandler(RecordNotFoundException.class)
  public ResponseEntity<CustomErrorResponse> handleGenericNotFoundException(RecordNotFoundException e) {
    CustomErrorResponse error = new CustomErrorResponse(CustomStatus.NOT_FOUND_CODE,e.getMessage());
    error.setTimestamp(LocalDateTime.now().toString());
    error.setStatus((HttpStatus.NOT_FOUND.value()));
    return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
  }

  @ExceptionHandler(CboIdNotFoundException.class)
  public ResponseEntity<CustomErrorResponse> handleGenericNotFoundException(CboIdNotFoundException e) {
    CustomErrorResponse error = new CustomErrorResponse(CustomStatus.CBO_ID_NOT_FOUND_CODE,e.getMessage());
    error.setTimestamp(LocalDateTime.now().toString());
    error.setStatus((HttpStatus.NOT_FOUND.value()));
    return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
  }

  @ExceptionHandler(NullPointerException.class)
  public ResponseEntity<CustomErrorResponse> handleGenericNullPointerException(NullPointerException e) {
    CustomErrorResponse error = new CustomErrorResponse("402",e.getMessage());
    error.setTimestamp(LocalDateTime.now().toString());
    error.setStatus((HttpStatus.PARTIAL_CONTENT.value()));
    return new ResponseEntity<>(error, HttpStatus.PARTIAL_CONTENT);
  }

  /*@ExceptionHandler(TokenAlreadyFoundException.class)
  public void springHandleNotTokenAlreadyFound(HttpServletResponse response) throws IOException {
    response.sendError(609,"You already have a valid token. If your token is lost, you can force Login");
  }*/


  @ExceptionHandler(value = LevelReached.class)
  public ResponseEntity<CustomErrorResponse> handleGenericNotFoundException(LevelReached e) {
    CustomErrorResponse error = new CustomErrorResponse("109",e.getMessage());
    error.setTimestamp(LocalDateTime.now().toString());
    error.setStatus((HttpStatus.OK.value()));
    return new ResponseEntity<>(error, HttpStatus.OK);
  }

  @ExceptionHandler(value = RequestInputMissing.class)
  public ResponseEntity<CustomErrorResponse> handleGenericNotFoundException(RequestInputMissing e) {
    CustomErrorResponse error = new CustomErrorResponse(CustomStatus.REQUEST_INPUT_NOT_PRESENT_CODE,e.getMessage());
    error.setTimestamp(LocalDateTime.now().toString());
    error.setStatus((HttpStatus.BAD_REQUEST.value()));
    return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
  }
  
  
   @ExceptionHandler(value = RecordAlreadyExistsException.class)
  public ResponseEntity<CustomErrorResponse> RecordAlreadyExistsException(RecordAlreadyExistsException e) {
    CustomErrorResponse error = new CustomErrorResponse(CustomStatus.ALREADY_EXISTS_CODE,e.getMessage());
    error.setTimestamp(LocalDateTime.now().toString());
    error.setStatus((HttpStatus.CONFLICT.value()));
    return new ResponseEntity<>(error, HttpStatus.CONFLICT);
  }

  @ExceptionHandler(value = BadRequest.class)
  public ResponseEntity<CustomErrorResponse> BadRequest(BadRequest e) {
    CustomErrorResponse error = new CustomErrorResponse(CustomStatus.REQUEST_REJECTED_OR_BAD_REQUEST_CODE,e.getMessage());
    error.setTimestamp(LocalDateTime.now().toString());
    error.setStatus((HttpStatus.BAD_REQUEST.value()));
    return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler(value = RuntimeExceptions.class)
  public ResponseEntity<CustomErrorResponse> RuntimeExceptions(RuntimeExceptions e) {
    CustomErrorResponse error = new CustomErrorResponse(CustomStatus.REQUEST_REJECTED_OR_BAD_REQUEST_CODE,e.getMessage());
    error.setTimestamp(LocalDateTime.now().toString());
    error.setStatus((HttpStatus.BAD_REQUEST.value()));
    return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
  }
  @ExceptionHandler(value = DatabaseOperationError.class)
  public ResponseEntity<CustomErrorResponse> BadRequest(DatabaseOperationError e) {
    CustomErrorResponse error = new CustomErrorResponse("715",e.getMessage());
    error.setTimestamp(LocalDateTime.now().toString());
    error.setStatus((HttpStatus.INTERNAL_SERVER_ERROR.value()));
    return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
  }

  @ExceptionHandler(value = BadRequestError.class)
  public ResponseEntity<CustomErrorResponse> BadRequest2(BadRequestError e) {
    CustomErrorResponse error = new CustomErrorResponse("900",e.getMessage());
    error.setTimestamp(LocalDateTime.now().toString());
    error.setStatus((HttpStatus.BAD_REQUEST.value()));
    return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler(value = Exception.class)
  @ResponseStatus(value = HttpStatus.BAD_REQUEST)
  public ResponseEntity<CustomErrorResponse> exception(Exception e) {
    int startIndex = e.getMessage().indexOf("'") + 1;
    int endIndex = e.getMessage().indexOf("'", startIndex);
    String value = e.getMessage().substring(startIndex, endIndex);
    CustomErrorResponse error = new CustomErrorResponse(CustomStatus.BAD_REQUEST_CODE,value+" must not be null.");
    error.setTimestamp(LocalDateTime.now().toString());
    error.setStatus((HttpStatus.BAD_REQUEST.value()));
    return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);

  }
}
