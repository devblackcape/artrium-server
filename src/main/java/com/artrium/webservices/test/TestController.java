package com.artrium.webservices.test;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    private TestRepository testRepository;

    public TestController(TestRepository testRepository) {
        this.testRepository = testRepository;
    }


    @GetMapping("/test")
    public String test(){
        return "hi";
    }

    @PostMapping("/join")
    public ResponseEntity<Tester> join(@RequestBody Tester tester){
        Tester savedTester = testRepository.save(tester);
        return ResponseEntity.ok(savedTester);
    }

    @GetMapping("/test/{username}")
    public ResponseEntity<Tester> getOneUser(@PathVariable("username") String username){
        Tester tester = testRepository.findByUsername(username);
        return ResponseEntity.ok(tester);
    }
}
