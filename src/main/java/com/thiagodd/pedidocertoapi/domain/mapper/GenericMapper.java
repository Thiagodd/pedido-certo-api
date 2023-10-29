package com.thiagodd.pedidocertoapi.domain.mapper;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface GenericMapper<T, D> {
    D toDto(T entity);

    List<D> toDto(List<T> entityList);

    T toEntity(D dto);

    T partialUpdate(D dto, T entity);
}
