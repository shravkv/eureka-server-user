package com.bridgelabz.bookstore_user.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Aspect
@Component
public class AspectService {

    @Before(value = "execution(* com.bridgelabz.bookstore_user.service.UserService.*(..))")
    public void Before(JoinPoint joinPoint) {
        System.out.println("Before:" + joinPoint.getSignature().getName());

    }

    @After(value = "execution(* com.bridgelabz.bookstore_user.service.UserService.*(..))")
    public void After(JoinPoint joinPoint) {
        System.out.println("After:" + Arrays.toString(joinPoint.getArgs()));
    }
}
