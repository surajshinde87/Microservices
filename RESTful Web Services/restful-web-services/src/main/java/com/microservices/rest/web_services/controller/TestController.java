package com.microservices.rest.web_services.controller;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContext;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequestMapping("/test")
public class TestController {

    private MessageSource messageSource;

    public TestController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @GetMapping
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/internationalized")
    public String helloInternationlized(){
        Locale locale = LocaleContextHolder.getLocale();
       return  messageSource.getMessage("good.morning.message",null, "Default Message", locale);

    }

}
