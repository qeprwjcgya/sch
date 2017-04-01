package com.cadyd.sch.common.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class BootController {
  @RequestMapping("/")
  String home() {
    return "Hello World!";
  }

  @RequestMapping("/hello/{myName}")
  String index(@PathVariable String myName) {
    return "Hello " + myName + "!!!";
  }
}
