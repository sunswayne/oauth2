package com.sun;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wayne on 12/03/2017.
 */
@RestController
public class PublicController {

    @RequestMapping("/public")
    public String index(){
        return "Hello public!";
    }
}
