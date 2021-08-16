package io.muzhi.aspects;

import io.muzhi.service.IA;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;

@Aspect
public class RuntimeAspect {

    @Autowired
    IA ia;

    @Around("execution(* io.muzhi.models.RuntimeClass.aMethod())")
    public Object callRuntimeClass(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("runtime before");
        Object obj = joinPoint.proceed();
        ia.aMethod();
        System.out.println("runtime after");
        return obj;
    }
}
