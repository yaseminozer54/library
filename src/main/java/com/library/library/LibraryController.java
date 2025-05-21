package com.library.library;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

    @GetMapping("/")
    public String hello() {
        return "Library Management System is running!!";
    }
}
