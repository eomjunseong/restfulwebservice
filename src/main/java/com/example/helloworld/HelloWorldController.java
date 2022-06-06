package com.example.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class HelloWorldController {


    @Autowired
    private MessageSource messageSource;


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
    @GetMapping(path = "/hello-world-internationalized")
    public String helloWorldInternationalized( @RequestHeader(name="Accept-Language", required=false) Locale locale) {
        return messageSource.getMessage("greeting.message", null, locale);
    }
}
