package io.muzhi.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class RuntimeAspect {

    @Around("execution(* io.muzhi.models.RuntimeClass.aMethod())")
    public Object callRuntimeClass(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("runtime before");
        Object obj = joinPoint.proceed();
        System.out.println("runtime after");
        return obj;
    }
}
