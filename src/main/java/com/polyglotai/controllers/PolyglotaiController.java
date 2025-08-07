package com.polyglotai.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1")
public class PolyglotaiController {

    @PostMapping(value = "/translate")
    public ResponseEntity<String> getTranslate () {
        return ResponseEntity.ok(null);
    }
}
