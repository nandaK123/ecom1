package com.abc.ecom1.exception;

@SuppressWarnings("serial")
public class CustomerNotFoundException extends RuntimeException {
	
	public CustomerNotFoundException(String msg) {
		super(msg);

}
}
