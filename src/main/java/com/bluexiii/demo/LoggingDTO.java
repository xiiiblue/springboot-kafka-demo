package com.bluexiii.demo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class LoggingDTO {
    private String loggingTime;
    private String duration;
    private String url;
    private String method;
    private Map<String, String> requestHeaders;
    private String requestBody;
    private int responseStatus;
    private String responseBody;
}


