package ru.geekbrains.nostromo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
public class HealthController {

    @RequestMapping(value = "/isAlive", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    public String isAlive(){
        return "I'm alive!";
    }
}
