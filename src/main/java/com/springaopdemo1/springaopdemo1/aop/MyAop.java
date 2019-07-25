package com.springaopdemo1.springaopdemo1.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAop {

    @After(" execution (* com.springaopdemo1.springaopdemo1.impl.MyImpl.checkAop())")
    public void checkingAOP(){
        System.out.println("-----Hiiiii------");
    }
}
