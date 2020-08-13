package com.scb.ratelimit.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ratelimit")
public class UserController {

    @GetMapping("/simple")
    public ResponseEntity<String> getSimple() {
        return ResponseEntity.ok("my simple response");
    }

    @GetMapping("/advanced")
    public ResponseEntity<String> getAdvanced() {
        return ResponseEntity.ok("My Advanced response");
    }
}
