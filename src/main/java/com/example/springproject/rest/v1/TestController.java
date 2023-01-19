package com.example.springproject.rest.v1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/v1")
public class TestController {
    @GetMapping(value = "/print")
    ResponseEntity<String> callData(@RequestParam(value = "Name") String name) {
        return new ResponseEntity<>("Hi " + name + " Good Morning.", HttpStatus.OK);
    }
}
