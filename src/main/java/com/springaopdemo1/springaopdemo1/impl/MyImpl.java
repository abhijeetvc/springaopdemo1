package com.springaopdemo1.springaopdemo1.impl;

import com.springaopdemo1.springaopdemo1.repository.MyInterface;
import org.springframework.stereotype.Service;

@Service
public class MyImpl implements MyInterface {


    @Override
    public String checkAop() {
        System.out.println("-----Helllooooooo-------");
        return "Hello AOP";
    }
}
