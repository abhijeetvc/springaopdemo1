package com.springaopdemo1.springaopdemo1.controller;

import com.springaopdemo1.springaopdemo1.impl.MyImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private MyImpl myImpl;

    @GetMapping(value="/getdata")
    public String getData(){
        String str=myImpl.checkAop();
        return str;
    }
}
