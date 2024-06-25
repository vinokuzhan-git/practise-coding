package com.railway.ticket.booking.system.exception;

public class CustomError {
	
	private String errorMessage;
	private String fieldName;
	public CustomError(String fieldName, String errorMessage) {
		super();
		this.errorMessage = errorMessage;
		this.fieldName = fieldName;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	@Override
	public String toString() {
		return "CustomError [errorMessage=" + errorMessage + ", fieldName=" + fieldName + "]";
	}
	
	
	
	

}
