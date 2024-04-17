package com.cm;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class S9Q2 {
    @RequestMapping("/S9Q2")
    public ResponseEntity<?> getMessage() {
        return ResponseEntity.ok("If you can't explain it simply, you don't understand it well  enough");
    }
}
