package com.thiagodd.pedidocertoapi.domain.exception;

public class BusinessRuleException extends RuntimeException{

    public BusinessRuleException() {
    }

    public BusinessRuleException(String message) {
        super(message);
    }
}
