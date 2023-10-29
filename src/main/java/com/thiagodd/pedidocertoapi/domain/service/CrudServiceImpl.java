package com.thiagodd.pedidocertoapi.domain.service;

import com.thiagodd.pedidocertoapi.domain.mapper.GenericMapper;
import com.thiagodd.pedidocertoapi.domain.model.BaseEntity;
import com.thiagodd.pedidocertoapi.domain.model.dto.BaseDto;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public class CrudServiceImpl<T extends BaseEntity, D extends BaseDto> implements CrudService<T, D>{

    protected final JpaRepository<T, UUID> repository;
    protected final GenericMapper<T, D> mapper;

    public CrudServiceImpl(JpaRepository<T, UUID> repository, GenericMapper<T, D> mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Page<D> findAll(Pageable pageable) {
        return repository.findAll(pageable)
            .map(mapper::toDto);
    }

    @Override
    public D findById(UUID id) {
        return mapper.toDto(findEntityById(id));
    }

    @Override
    public D create(@Valid D requestDto) {
        var newEntity = mapper.toEntity(requestDto);
        var entityCreated = repository.save(newEntity);
        return mapper.toDto(entityCreated);
    }

    @Override
    public D update(UUID id, @Valid D requestDto) {
        var entityToUpdate = findEntityById(id);
        mapper.partialUpdate(requestDto, entityToUpdate);
        var entityUpdated = repository.save(entityToUpdate);
        return mapper.toDto(entityUpdated);
    }

    @Override
    public void delete(UUID id) {
        try{
            repository.deleteById(id);
        }catch (DataIntegrityViolationException exception){
            throw new DataIntegrityViolationException(String.format("Entity with id '%s' in use", id));
        }
    }

    @Override
    public T findEntityById(UUID id) {
        return repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException(
                String.format("Entity with id '%s' not found.", id)));
    }
}
