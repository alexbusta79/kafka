package com.ntt.exceptions;

import java.util.Map;
import org.springframework.http.HttpStatus;

public interface IMsad0DomainException {

    String getCode();
    
    HttpStatus getResponseStatus();
    
    Map<String, Object> getAdditionalInfo();
}
