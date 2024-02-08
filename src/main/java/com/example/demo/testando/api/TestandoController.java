package com.example.demo.testando.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("testando")
@RestController
public class TestandoController {

    @GetMapping("Get")
    public ResponseEntity<String> metodoGet() {
        return new ResponseEntity<String>("Ola Mundo", HttpStatus.OK);
    }

}
