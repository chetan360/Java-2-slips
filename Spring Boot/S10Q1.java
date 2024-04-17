package com.cm;

import java.time.LocalTime;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class S10Q1 {
    @RequestMapping("/S10Q1")
    public ResponseEntity<?> getTime() {
        LocalTime t = LocalTime.now();
        return ResponseEntity.ok(t.toString());
    }
}
