package com.railway.ticket.booking.system.controller.advise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.railway.ticket.booking.system.exception.CustomError;
import com.railway.ticket.booking.system.exception.CustomException;

@ControllerAdvice
public class TicketBookingControllerAdvice {
	
	 @ExceptionHandler(CustomException.class)
	    public ResponseEntity<String> handlyMyCustomException(CustomException e) {
	      //  logger.error("error occurred {}", e);
	        return new ResponseEntity<>("Something happened: " + e.getMessage(), HttpStatus.BAD_REQUEST);
	    }
	 
	 @ExceptionHandler(MethodArgumentNotValidException.class)
	    public ResponseEntity<List<CustomError>> handlyMyCustomException(MethodArgumentNotValidException ex) {

		 List<CustomError> errlist = new ArrayList<>();

	        ex.getBindingResult().getAllErrors().forEach((error) -> {
	            String fieldName =  ex.getFieldError().getField();
	            String errorMessage = error.getDefaultMessage();
	            CustomError err  = new CustomError(fieldName,errorMessage);
	           errlist.add(err);
	        });
	        return new ResponseEntity<>(errlist, HttpStatus.BAD_REQUEST);
	    }
	 

}
