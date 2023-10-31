package com.thiagodd.pedidocertoapi.domain.service;

import com.thiagodd.pedidocertoapi.domain.mapper.GenericMapper;
import com.thiagodd.pedidocertoapi.domain.model.Restaurant;
import com.thiagodd.pedidocertoapi.domain.model.dto.RestaurantDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RestaurantService extends CrudServiceImpl<Restaurant, RestaurantDto> {

    public RestaurantService(JpaRepository<Restaurant, UUID> repository, GenericMapper<Restaurant, RestaurantDto> mapper) {
        super(repository, mapper);
    }
}
