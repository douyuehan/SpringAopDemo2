package com.company.aop;

import org.aspectj.lang.JoinPoint;

/**
 * Created by Administrator on 2018/11/23.
 */
public class SecurityHandler {

    public void checkSecurity(JoinPoint joinPoint)
    {
        System.out.println(joinPoint.getSignature().getName());
        Object[] args = joinPoint.getArgs();
        for(Object object : args)
        {
            System.out.println(object.toString());
        }
    }
}
