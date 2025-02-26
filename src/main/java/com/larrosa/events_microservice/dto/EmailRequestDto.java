package com.larrosa.events_microservice.dto;

public record EmailRequestDto(String to, String subject, String body) {
}
