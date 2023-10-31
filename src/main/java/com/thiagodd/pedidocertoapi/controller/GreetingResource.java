package com.thiagodd.pedidocertoapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class GreetingResource {

    @GetMapping
    public String hello(){
        StringBuilder html = new StringBuilder();

        html.append("<p style=\"font-family: 'Arial', sans-serif; font-size: 24px; color: #0A0A0A; ");

        // Propriedades CSS separadas
        appendCSSProperty(html, "background-color", "#f2f2f2");
        appendCSSProperty(html, "padding", "20px 10px");
        appendCSSProperty(html, "border-radius", "5px");
        appendCSSProperty(html, "box-shadow", "3px 3px 5px #888888");

        html.append("text-align: center;\">Hello from ");
        appendBoldText(html, "Pedido Certo");
        html.append("</p>\n");

        return html.toString();
    }

    private void appendCSSProperty(StringBuilder builder, String property, String value) {
        builder.append(property).append(": ").append(value).append("; ");
    }

    private void appendBoldText(StringBuilder builder, String text) {
        builder.append("<span style=\"font-weight: bold;\">").append(text).append("</span>");
    }


}
