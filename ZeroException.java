package com.example.calculatertest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ZeroException extends Exception {
    public ZeroException() {
    }

    public ZeroException(String message) {
        super(message);
    }

    public ZeroException(String message, Throwable cause) {
        super(message, cause);
    }

    public ZeroException(Throwable cause) {
        super(cause);
    }

    public ZeroException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

