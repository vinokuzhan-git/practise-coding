package com.railway.ticket.booking.system.exception;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class CustomException extends RuntimeException {
	
	 public CustomException(String message) {
		 super(message);
		// TODO Auto-generated constructor stub
	}


	private static final Logger LOGGER = LoggerFactory.getLogger(CustomException.class);

	   

}
