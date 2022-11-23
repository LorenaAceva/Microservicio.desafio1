package com.nttdata.bootcamp.productservice.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Value("${server.port}")
    private String port;

    @GetMapping("/port")
    public String getPort(){
        return "El puerto es " + port;

    }

}
