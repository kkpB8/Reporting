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
package org.apache.fineract.cn.reporting.internal.exception;


public interface CustomStatus {
    Integer EC_CBO_GUID_NOT_FOUND_CODE =1001;
    String EC_CBO_GUID_NOT_FOUND_MSG ="Group Code not found for Member Name : {0}";
    Integer EC_MEMBER_NOT_FOUND_CODE =2001;
    String EC_MEMBER_NOT_FOUND_MSG ="Member does not exists for Member Id : {0}";
    Integer EC_STATE_ID_NOT_FOUND_CODE = 4001;
    String EC_STATE_ID_NOT_FOUND_MSG = "State Id not found for search";
    Integer EC_DISTRICT_ID_NOT_FOUND_CODE = 4002;
    String EC_DISTRICT_ID_NOT_FOUND_MSG = "District Id not found for search";
    Integer EC_BLOCK_ID_NOT_FOUND_CODE = 4003;
    String EC_BLOCK_ID_NOT_FOUND_MSG = "Block Id not found for search";
    Integer EC_PANCHAYAT_ID_NOT_FOUND_CODE = 4004;
    String EC_PANCHAYAT_ID_NOT_FOUND_MSG = "panchayat Id not found for search";
    Integer EC_VILLAGE_ID_NOT_FOUND_CODE = 4005;
    String EC_VILLAGE_ID_NOT_FOUND_MSG = "Village Id not found for search";
    Integer EC_PAGE_NO_NOT_FOUND_CODE = 4006;
    String EC_PAGE_NO_NOT_FOUND_MSG = "Page Number Id not found for search";
    Integer EC_SIZE_NOT_FOUND_CODE = 4006;
    String EC_SIZE_NOT_FOUND_MSG = "Size not found for search";
    Integer EC_SORT_COLUMN_NOT_FOUND_CODE = 4006;
    String EC_SORT_COLUMN_NOT_FOUND_MSG = "SORT_COLUMN not found for search";
    Integer EC_SORT_DIRECTION_NOT_FOUND_CODE = 4006;
    String EC_SORT_DIRECTION_NOT_FOUND_MSG = "SORT_DIRECTION not found for search";
    Integer EC_SHG_NOT_FOUND_CODE =1002;
    String EC_SHG_NOT_FOUND_MSG ="SHG not found or SHG not Active for SHG ID : {0}";
    Integer EC_CBO_ID_NOT_FOUND_CODE = 4007;
    String EC_CBO_ID_NOT_FOUND_MSG = "Cbo Id not found for search";
    Integer BANK_BRANCH_NOT_EXISTS_ON_IFSC = 1003;
    String BANK_BRANCH_NOT_EXISTS_ON_IFSC_MSG = "Bank Branch does not exists to the corresponding IFSC Code";



    String NO_DATABASE_CONNECTION_CODE="640";
    String SQL_EXCEPTION_CODE="644";
    String MANDATORY_FILED_DATA_NOT_PROVIDED_CODE="645";
    String VALUE_TOO_LONG_PLEASE_CHECK_LENGTH_OR_STRING_PROVIDED_CODE="646";
    String DATA_TYPE_MISMATCHED_CODE	="647";
    String SPECIAL_CHARACTERS_NOT_ALLOWED_CODE="648"	;
    String DATA_DOES_NOT_EXISTS_CODE	="649";
    String  NOT_A_VALID_DATE_FORMAT_CODE	="650";
    String EITHER_DATABASE_IS_NOT_REACHABLE_OR_DB_SERVICES_ARE_DOWN_PLEASE_TRY_AGAIN_CODE ="651";
    String PORT_NOT_AVAILABLE_CODE ="652";
    String  REQUEST_REJECTED_OR_BAD_REQUEST_CODE	="653";
    String REQUEST_TIMEOUT_CODE = "654";
    String QUERY_TIMEOUT_CODE="655";
    String  REQUEST_ENTITY_TOO_LARGE_CODE = "656";
    String REQUEST_INPUT_NOT_PRESENT_CODE = "700";


    String NO_DATABASE_CONNECTION_MSG="No Database connection.";
    String SQL_EXCEPTION_MSG="SQL exception.";
    String MANDATORY_FILED_DATA_NOT_PROVIDED_MSG="Mandatory filed data not provided.";
    String VALUE_TOO_LONG_PLEASE_CHECK_LENGTH_OR_STRING_PROVIDED_MSG="Value too long, Please check length or string provided.";
    String DATA_TYPE_MISMATCHED_MSG	="Data type mismatched.";
    String SPECIAL_CHARACTERS_NOT_ALLOWED_MSG="Special characters not allowed."	;
    String DATA_DOES_NOT_EXISTS_MSG	="Data does not exists.";
    String  NOT_A_VALID_DATE_FORMAT_MSG	="Not a valid date format.";
    String EITHER_DATABASE_IS_NOT_REACHABLE_OR_DB_SERVICES_ARE_DOWN_PLEASE_TRY_AGAIN_MSG ="Either database is not reachable or DB services are down. Please try again.";
    String PORT_NOT_AVAILABLE_MSG ="Port not available.";
    String  REQUEST_REJECTED_OR_BAD_REQUEST_MSG	="Request rejected or bad request.";
    String REQUEST_TIMEOUT_MSG = "Request Timeout.";
    String QUERY_TIMEOUT_MSG="Query Timeout.";
    String  REQUEST_ENTITY_TOO_LARGE_MSG = "Request entity too large.";

    String REQUEST_INPUT_NOT_PRESENT_MSG = "Request data missing.";
	String REQUEST_INPUT_VALIDATION_MSG = "Input validation failed.";



    String NOT_NULL_CODE ="400";
    String NOT_NULL_MSG ="Record may not be null";
    String ALREADY_EXISTS_CODE ="409";
    String ALREADY_EXISTS_MSG ="Record already exists";
    String NOT_FOUND_CODE ="404";
    String CBO_ID_NOT_FOUND_CODE ="704";
    String NOT_FOUND_MSG ="Record not found";
    String TOKEN_INVALID_CODE ="403";
    String TOKEN_INVALID_MSG ="Invalid token. Please use new token";
    String CREATED_SUCCESSFULLY_CODE ="202";
    String CREATED_SUCCESSFULLY_MSG ="Record created successfully";

    String USER = "User";
    String ROLE = "role";

    String STATUS = "status";
    String RESPONSE = "response";
    String MESSAGE = "message";
    String FAIL = "fail";
    String EXCEPTION = "Exception ";
    String INVALID_INPUT = "Invalid input";
    String DELETED  = "deleted";
    String SAVINGS_ID = "savingsId";
    String LOAN_REQ_ID = "loanRequestId";
    String FUND_ID = "fundId";
    String REPORTING_ID = "reportingId";
    String REPORTING_DETAILS_ID = "reportingDetailIds";
    String DELETE_SUCCESSFULL=  "deleted successfully";

    String RECORD_NOT_INSERT = "Record not inserted in queue, there is some issue";
    String RECORD_NOT_UPDATED = "Record not updated, there is some issue";
    String DATABASE_ERROR_AT_INSERTION = "Database error at the time record save";
    String LOAN_REQ_RECORD_DELETED_SUCCESS = "Loan request deleted successfully";
    String LOAN_REQ_RECORD_DELETED_FAILED = "Loan request delete failed";
    String FUND_INSERT_FAILED = "insert fund entry Failed!";
    String FUND_RECORD_DELETED_SUCCESS = "Fund record deleted successfully";
    String LOAN_RECORD_DELETED_FAILED = "Fund record delete failed";

    String REMOVE_REPORTING_EXCEPTION = "Cannot delete this reporting.Make sure this reporting is last reporting and belongs to this CLF";


    String NO_MATCH_FOUND_FOR_INPUT = "No match found for given input";
    String FLAGOPEN = "o";
    String FLAGCLOSE = "c";
    String NO_RECORD_FOUND = "No record found";

    String WRONG_MORATORIUM = "Moratorium should be less than Number of Installments";
}
