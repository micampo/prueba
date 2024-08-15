package com.co.konexinnovtion.exceptions;

public class ExceptionGlobal extends AssertionError{

    public static final String TITLE_FAIL = "EL TITULO NO ES VISIBLE";

    public ExceptionGlobal(String message, Throwable causa){
        super(message, causa);
    }
}
