package com.thiagodd.pedidocertoapi.controller;

import com.thiagodd.pedidocertoapi.domain.model.BaseEntity;
import com.thiagodd.pedidocertoapi.domain.model.dto.BaseDto;
import com.thiagodd.pedidocertoapi.domain.service.CrudService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.UUID;

import static com.thiagodd.pedidocertoapi.utils.UriUtils.createURI;

public abstract class CrudController<T extends BaseEntity, D extends BaseDto> {

    protected final CrudService<T, D> crudService;

    public CrudController(CrudService<T, D> crudService) {
        this.crudService = crudService;
    }

    @GetMapping
    public ResponseEntity<Page<D>> findAll(Pageable pageable) {
        Page<D> page = crudService.findAll(pageable);

        return ResponseEntity.ok(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity<D> findById(@PathVariable UUID id) {
        var cuisineDTO = crudService.findById(id);

        return ResponseEntity.ok(cuisineDTO);
    }

    @PostMapping()
    public ResponseEntity<D> create(@Valid @RequestBody D requestDTO) {
        D cuisineDTO = crudService.create(requestDTO);
        URI location = createURI(cuisineDTO.getId());

        return ResponseEntity.created(location).body(cuisineDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<D> update(@PathVariable UUID id, @Valid @RequestBody D requestDTO) {
        D cuisineDTO = crudService.update(id, requestDTO);
        URI location = createURI();

        return ResponseEntity.ok().location(location).body(cuisineDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable UUID id) {
        crudService.delete(id);

        return ResponseEntity.noContent().build();
    }
}
