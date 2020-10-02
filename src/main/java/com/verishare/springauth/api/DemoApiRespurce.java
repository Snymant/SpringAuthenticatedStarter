package com.verishare.springauth.api;

import java.util.Date;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class DemoApiRespurce {
    
    
    @GetMapping("now")
    public Date getNow(){
        return new Date();
    }
    
}
