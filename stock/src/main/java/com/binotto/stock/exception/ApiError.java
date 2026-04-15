package com.binotto.stock.exception;

import java.time.LocalDateTime;
import java.util.Map;

public class ApiError {

    private final LocalDateTime timestamp;
    private final int status;
    private final String error;
    private final String message;
    private final String path;
    private final Map<String, String> errors;

    public ApiError(int status, String error, String message, String path,  Map<String, String> errors ) {
        this.timestamp = LocalDateTime.now();
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
        this.errors = errors;

    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public int getStatus() {
        return status;
    }

    public String getError() {
        return error;
    }

    public String getMessage() {
        return message;
    }

    public String getPath() {
        return path;
    }
    public Map<String, String> getErrors() {
        return errors;
    }
}