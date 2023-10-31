package com.thiagodd.pedidocertoapi.domain.mapper;

import com.thiagodd.pedidocertoapi.domain.model.Restaurant;
import com.thiagodd.pedidocertoapi.domain.model.dto.RestaurantDto;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface RestaurantMapper extends GenericMapper<Restaurant, RestaurantDto> {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Restaurant partialUpdate(RestaurantDto cuisineDto, @MappingTarget Restaurant cuisine);
}