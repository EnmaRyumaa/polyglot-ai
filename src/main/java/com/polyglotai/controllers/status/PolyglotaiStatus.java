package com.polyglotai.controllers.status;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController()
@RequestMapping(value = "/v1/ping")
public class PolyglotaiStatus {

    @GetMapping
    public ResponseEntity<HashMap<String,String>> ping() {
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "OK");

        return ResponseEntity.ok(map);
    }
}
