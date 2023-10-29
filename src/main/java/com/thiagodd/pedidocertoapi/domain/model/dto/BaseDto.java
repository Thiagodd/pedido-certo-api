package com.thiagodd.pedidocertoapi.domain.model.dto;

import lombok.Data;

import java.util.UUID;

@Data
public abstract class BaseDto {

    private UUID id;
}
