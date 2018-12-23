package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.time.Instant;
import java.time.LocalDateTime;

@Controller
public class HelloWorldController {

  @Get
  public HelloMessage hello() {
    HelloMessage message = new HelloMessage();
    message.setContent("Hello");
    message.setInstant(Instant.now());
    message.setLocalDateTime(LocalDateTime.now());
    return message;
  }

}
