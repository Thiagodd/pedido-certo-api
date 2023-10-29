package com.thiagodd.pedidocertoapi.domain.model.dto;

import com.thiagodd.pedidocertoapi.domain.model.Cuisine;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.UUID;

/**
 * DTO for {@link Cuisine}
 */
@Data
public class CuisineDto extends BaseDto implements Serializable{

    UUID id;

    @NotNull
    @NotBlank
    String name;
}