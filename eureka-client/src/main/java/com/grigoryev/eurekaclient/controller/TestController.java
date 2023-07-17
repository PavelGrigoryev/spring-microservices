package com.grigoryev.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${eureka.instance.instance-id}")
    private String id;

    @Value("${tmpVar}")
    private Integer tmpVar;

    @GetMapping
    public ResponseEntity<Response> test() {
        return ResponseEntity.ok(new Response("Hello Eureka! With id = " + id + " and tmpVar = " + tmpVar));
    }

    record Response(String message) {
    }

}
