package com.lovato.core.controller;

import com.lovato.core.exception.ApiError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import springfox.documentation.annotations.ApiIgnore;

import javax.persistence.EntityNotFoundException;

@ApiIgnore
@ControllerAdvice
public class ExceptionHandlingController {

    @ExceptionHandler(EntityNotFoundException.class)
    protected ResponseEntity handleEntityNotFound(EntityNotFoundException ex) {
        ApiError apiError = new ApiError(HttpStatus.NOT_FOUND);
        apiError.setMessage("Entity not found");
        return new ResponseEntity(apiError, apiError.getStatus());
    }
}
