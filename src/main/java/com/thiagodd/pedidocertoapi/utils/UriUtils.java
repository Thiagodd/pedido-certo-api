package com.thiagodd.pedidocertoapi.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.UUID;

public class UriUtils {

    public static URI createURI(UUID id) {
        return ServletUriComponentsBuilder.fromCurrentRequest()
            .path("/{id}")
            .buildAndExpand(id)
            .toUri();
    }

    public static URI createURI() {
        return ServletUriComponentsBuilder.fromCurrentRequest().build().toUri();
    }
}
