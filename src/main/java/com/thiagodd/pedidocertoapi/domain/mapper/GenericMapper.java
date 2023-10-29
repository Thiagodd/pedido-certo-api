package com.thiagodd.pedidocertoapi.domain.mapper;

import java.util.List;

public interface GenericMapper<T, D> {
    D toDto(T entity);

    List<D> toDto(List<T> entityList);

    T toEntity(D dto);

    void partialUpdate(D dto, T entity);
}
