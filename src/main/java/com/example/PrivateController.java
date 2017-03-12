package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zy on 12/03/2017.
 */
@RestController
public class PrivateController {

    @RequestMapping("/private")
    public String index(){
        return "Hello private!";
    }
}
