package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    //GET
    // /hello-world(end-point)
    @GetMapping("/hello-world")
    public String helloWorld(){
        return "eom_jun_seung";
    }
    @GetMapping("/hello-world-bean")
    public HelloWorldBeen helloWorldBean(){
        return new HelloWorldBeen("Hello-wworld");
    }
    @GetMapping("/hello-world-bean/path-variable/{name}")
    public HelloWorldBeen helloWorldBean(@PathVariable String name){
        return new HelloWorldBeen(String.format("Hello-wworld,%s",name));
    }
}
