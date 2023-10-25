package com.thiagodd.pedidocertoapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class GreetingResource {

    @GetMapping
    public String hello(){

        return "<p style=\"font-family: 'Arial', " +
                "sans-serif; font-size: 24px; color: #0A0A0A; " +
                "background-color: #f2f2f2; padding: 10px; " +
                "border-radius: 5px; box-shadow: 3px 3px 5px #888888; " +
                "text-align: center;\">Hello from " +
                "<span style=\"font-weight: bold;" +
                "\">Pedido Certo</span></p>\n";
    }
}
