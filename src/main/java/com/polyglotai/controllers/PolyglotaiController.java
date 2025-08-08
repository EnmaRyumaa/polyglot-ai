package com.polyglotai.controllers;

import com.polyglotai.dto.RequestDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1")
public class PolyglotaiController {

    @PostMapping(value = "/translate")
    public RequestDTO getTranslate (@RequestBody RequestDTO body) {
        return ResponseEntity.ok(body).getBody();
    }
}
