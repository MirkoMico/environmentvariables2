package co.develhope.environmentvariables2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private Environment environment;

    @Value("${myCustomEnvs.welcomeMsg}")
    String msg;

    @GetMapping("/")
    public String get(){
        String a =environment.getProperty("myCustomEnvs.welcomeMsg");
        return a;
    }
   /* @GetMapping
    public String getMsg(){
        return msg;
    }*/
}