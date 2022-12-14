package com.bookRepo.spring.bookRepo.util;

import lombok.Getter;

@Getter
public enum CustomStatus {
    SUCCESS(0, "Success"),
    NOT_FOUND(1, "Not foound"),
    EXCEPTION(2, "Exceptioin");

    private final int code;
    private final String message;

    CustomStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
