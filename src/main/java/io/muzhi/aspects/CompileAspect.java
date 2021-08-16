package io.muzhi.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class CompileAspect {

    /**
     * 切第三方库
     * @param joinPoint
     * @return
     * @throws Throwable
     */
    @Around("execution(* com.alibaba.fastjson.JSON.toJSONString(Object))")
    public Object setStartTimeInThreadLocal(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("third jar before ...");
        Object obj =joinPoint.proceed();
        System.out.println("third jar after...");
        return obj;
    }

    /**
     * 切本地方法
     * @param joinPoint
     * @return
     * @throws Throwable
     */
    @Around("execution(* io.muzhi.models.CompileClass.aMethod())")
    public Object callCompileClass(ProceedingJoinPoint joinPoint) throws Throwable {
       System.out.println("compile before");
       Object obj = joinPoint.proceed();
       System.out.println("compile after");
       return obj;
    }
}
