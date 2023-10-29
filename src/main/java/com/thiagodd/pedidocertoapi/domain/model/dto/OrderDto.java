package com.thiagodd.pedidocertoapi.domain.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

/**
 * DTO for {@link com.thiagodd.pedidocertoapi.domain.model.Order}
 */
public record OrderDto(@NotNull @NotBlank String createdBy) implements Serializable {
}