package io.hieule.travelyapp.config;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping(path = "/home")
    public ResponseEntity<Object> indexPage(){
        return ResponseEntity.ok().body("Accessed successfully!");
    }

    @GetMapping(path = "/hello")
    public ResponseEntity<Object> successPage(){
        return ResponseEntity.ok().body("Accessed successfully to HELLO!");
    }
}
