package com.ntt.exceptions;

import org.springframework.http.HttpStatus;
import java.util.Map;

public class Msad0DomainException extends Exception implements IMsad0DomainException {

	private static final long serialVersionUID = -7106410725106229997L;

	/**
	 * error code
	 */
	private final String code;

	/**
	 * status of the http response (default 500)
	 */
	private final HttpStatus responseStatus;

	/**
	 * error type (default TECHNICAL)
	 */
	private final Msad0ErrorTypeEnum errorType;

	/**
	 * error severity (default ERROR)
	 */
	private final Msad0SeverityEnum severity;

	/**
	 * map of custom domain information
	 */
	private final Map<String, Object> additionalInfo;

	public Msad0DomainException(String message, String code, HttpStatus responseStatus) {
		super(message);
		this.code = code;
		this.responseStatus = responseStatus;
		this.errorType = Msad0ErrorTypeEnum.BUSINESS;
		this.severity = Msad0SeverityEnum.ERROR;
		this.additionalInfo = null;
	}

	public Msad0DomainException(String message, String code, HttpStatus responseStatus,
			Msad0ErrorTypeEnum errorType, Msad0SeverityEnum severity) {
		super(message);
		this.code = code;
		this.responseStatus = responseStatus;
		this.errorType = errorType;
		this.severity = severity;
		this.additionalInfo = null;
	}

	public Msad0DomainException(String message, String code, HttpStatus responseStatus,
			Msad0ErrorTypeEnum errorType, Msad0SeverityEnum severity, Map<String, Object> additionalInfo) {
		super(message);
		this.code = code;
		this.responseStatus = responseStatus;
		this.errorType = errorType;
		this.severity = severity;
		this.additionalInfo = additionalInfo;
	}

	@Override
	public String getCode() {
		return code;
	}

	@Override
	public HttpStatus getResponseStatus() {
		return responseStatus;
	}

	public Msad0ErrorTypeEnum getErrorType() {
		return errorType;
	}

	public Msad0SeverityEnum getSeverity() {
		return severity;
	}

	@Override
	public Map<String, Object> getAdditionalInfo() {
		return additionalInfo;
	}
}
