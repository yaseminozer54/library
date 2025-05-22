package com.library.library;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

   @Value("${HOSTNAME}")
    private String hostname;

    @GetMapping("/")
    public String hello() {
        return "Hello from pod: " + hostname;
    }
}
