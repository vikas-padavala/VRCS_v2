package com.vrcs.livemenu.Exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class MenuItemStatusCodeInvalid extends RuntimeException {
    public MenuItemStatusCodeInvalid(String message) {
        super(message);
    }
}
