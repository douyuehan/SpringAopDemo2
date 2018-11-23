package com.company.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;

/**
 * Created by Administrator on 2018/11/23.
 */
public class AroundAudience {

    public void watchPerformance(ProceedingJoinPoint proceedingJoinPoint)
    {
        try {
            System.out.println("The audience is taking their seats.");
            System.out.println("The audience is turning off their cellphones");
            long start = System.currentTimeMillis();

            proceedingJoinPoint.proceed();//执行目标方法perform（）

            long end = System.currentTimeMillis();
            Signature signature = proceedingJoinPoint.getSignature();
            System.out.println(signature.getName() + "方法执行了" + (end - start) / 1000 + "秒");

            System.out.println("CLAP CLAP CLAP CLAP CLAP");
        } catch (Throwable throwable) {
            System.out.println("Boo! We want our money back!");
        }

    }

}
