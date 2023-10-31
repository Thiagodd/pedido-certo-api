package com.thiagodd.pedidocertoapi.controller;

import com.thiagodd.pedidocertoapi.domain.model.Cuisine;
import com.thiagodd.pedidocertoapi.domain.model.dto.CuisineDto;
import com.thiagodd.pedidocertoapi.domain.service.CrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/cuisines")
public class CuisineController extends CrudController<Cuisine, CuisineDto> {

    public CuisineController(CrudService<Cuisine, CuisineDto> crudService) {
        super(crudService);
    }
}
