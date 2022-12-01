package com.ntt.exceptions;

import org.springframework.http.HttpStatus;

public class Msad0ForbiddenException extends Msad0DomainException {

	private static final long serialVersionUID = -6106500527886476791L;

	public Msad0ForbiddenException(String message) {
        this(message, Msad0ErrorCode.CODE_GENERIC);
    }

    public Msad0ForbiddenException(String message, String code) {
        super(message, code, HttpStatus.FORBIDDEN);
    }

}
