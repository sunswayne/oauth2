package com.sun;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wayne on 12/03/2017.
 */
@RestController
@RequestMapping("/private")
public class PrivateController {

    @PreAuthorize("#oauth2.hasScope('read')")
    @RequestMapping(method = RequestMethod.GET)
    public String index(){
        return "Hello private!";
    }
}
