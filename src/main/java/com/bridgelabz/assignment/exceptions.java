package com.bridgelabz.assignment;

public class exceptions extends Exception {
    public enum exception{
        NULL_INPUT, EMPTY_INPUT, SHORT_INPUT, INVALID_INPUT
    }
    public exception type;

    public exceptions(exception type, String message){
        super(message);
        this.type=type;
    }
}
