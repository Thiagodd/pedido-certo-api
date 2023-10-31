package com.thiagodd.pedidocertoapi.domain.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

/**
 * DTO for {@link com.thiagodd.pedidocertoapi.domain.model.Order}
 */
@Data
public class OrderDto implements Serializable {

    @NotNull
    @NotBlank
    public String createdBy;
}