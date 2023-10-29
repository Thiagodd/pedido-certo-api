package com.thiagodd.pedidocertoapi.domain.service;

import com.thiagodd.pedidocertoapi.domain.mapper.GenericMapper;
import com.thiagodd.pedidocertoapi.domain.model.Cuisine;
import com.thiagodd.pedidocertoapi.domain.model.dto.CuisineDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CuisineService extends CrudServiceImpl<Cuisine, CuisineDto> {

    public CuisineService(JpaRepository<Cuisine, UUID> repository, GenericMapper<Cuisine, CuisineDto> mapper) {
        super(repository, mapper);
    }
}
