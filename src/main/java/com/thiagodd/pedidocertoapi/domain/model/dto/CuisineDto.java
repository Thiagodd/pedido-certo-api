package com.thiagodd.pedidocertoapi.domain.model.dto;

import com.thiagodd.pedidocertoapi.domain.model.Cuisine;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * DTO for {@link Cuisine}
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CuisineDto extends BaseDto implements Serializable{

    @NotNull
    @NotBlank
    String name;
}