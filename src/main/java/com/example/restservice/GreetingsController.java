package com.example.restservice;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

//@Controller
//@ResponseBody
//Same as:
@RestController
@RequestMapping("/something")
public class GreetingsController {
    private static final String template = "Hello, %s";
    private final AtomicLong counter = new AtomicLong(0);

    @GetMapping
    public List<Something> listAll(){

    }

    @GetMapping("/{id}")
    public Something getById(@PathVariable("id") long userId) {

    }

    @PostMapping
    public Something create(){

    }

    @PutMapping("/{id}")
    public Something update(@PathVariable("id") long userId){

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long userId){

    }
}
