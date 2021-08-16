package io.muzhi.aspects;

import io.muzhi.service.IA;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;

@Aspect
public class CompileAspect {

    @Autowired
    IA ia;
    /**
     * 切本地方法
     * @param joinPoint 切点
     * @return 对象
     * @throws Throwable 异常
     */
    @Around("execution(* io.muzhi.models.CompileClass.aMethod())")
    public Object callCompileClass(ProceedingJoinPoint joinPoint) throws Throwable {
       System.out.println("compile before");
       Object obj = joinPoint.proceed();
       ia.aMethod();
       System.out.println("compile after");
       return obj;
    }
}
