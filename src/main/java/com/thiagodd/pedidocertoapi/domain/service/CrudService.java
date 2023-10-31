package com.thiagodd.pedidocertoapi.domain.service;

import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface CrudService<T, D> {

    Page<D> findAll(Pageable pageable);

    D findById(UUID id);

    D create(@Valid D inputDto);

    D update(UUID id, @Valid D inputDto);

    void delete(UUID id);

}
