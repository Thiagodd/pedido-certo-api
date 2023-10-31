package com.thiagodd.pedidocertoapi.controller;

import com.thiagodd.pedidocertoapi.domain.model.Restaurant;
import com.thiagodd.pedidocertoapi.domain.model.dto.RestaurantDto;
import com.thiagodd.pedidocertoapi.domain.service.CrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/restaurants")
public class RestaurantController extends CrudController<Restaurant, RestaurantDto> {

    public RestaurantController(CrudService<Restaurant, RestaurantDto> crudService) {
        super(crudService);
    }
}
