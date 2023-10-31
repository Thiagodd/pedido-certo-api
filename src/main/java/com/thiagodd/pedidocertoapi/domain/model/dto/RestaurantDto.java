package com.thiagodd.pedidocertoapi.domain.model.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * DTO for {@link com.thiagodd.pedidocertoapi.domain.model.Restaurant}
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RestaurantDto extends BaseDto implements Serializable {
    @NotNull
    @NotEmpty
    private String name;
    @Positive
    private BigDecimal shippingRate;
    @NotNull
    private Boolean active;
    @NotNull
    private Boolean open;

    private CuisineDto cuisineDto;
}