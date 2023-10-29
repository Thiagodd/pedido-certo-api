package com.thiagodd.pedidocertoapi.domain.mapper;

import com.thiagodd.pedidocertoapi.domain.model.Cuisine;
import com.thiagodd.pedidocertoapi.domain.model.dto.CuisineDto;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface CuisineMapper extends GenericMapper<Cuisine, CuisineDto>{
    Cuisine toEntity(CuisineDto cuisineDto);

    CuisineDto toDto(Cuisine cuisine);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Cuisine partialUpdate(CuisineDto cuisineDto, @MappingTarget Cuisine cuisine);
}