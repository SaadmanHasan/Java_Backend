package com.fdm.dto;

public record ErrorResponse(
        int status,
        String message,
        String path
) {
}
