package dev.sushant.productcatalog.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScalerController {

    @GetMapping("/")
    public String hiEveryone(){
        return "hello everyone";
    }
}
