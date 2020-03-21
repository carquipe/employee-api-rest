package com.carquipe.firstapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class EmployeeNotFoundAdvice {
  /* Annotation which indicates that the result of method will be written
  *  inside HTTP Response body */
  @ResponseBody
  /* Annotation which incidates that it will be trigered when a
  *  *.class object is instantiated */
  @ExceptionHandler(EmployeeNotFoundException.class)
  /* Annotation which indicates the Response Status */
  @ResponseStatus(HttpStatus.NOT_FOUND)
  String employeeNotFoundHandler(EmployeeNotFoundException ex) {
    return ex.getMessage();
  }
}