package com.patrones.notify.DTO;

public record ResponseDTO(
        String result,
        String code,
        String provider,
        String timeReceived,
        String timeResponded,
        int retries) {}