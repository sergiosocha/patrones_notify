package com.patrones.notify.DTO;

public record ProviderDTO(
        String provider,
        String code,
        String body,
        int retries) {}