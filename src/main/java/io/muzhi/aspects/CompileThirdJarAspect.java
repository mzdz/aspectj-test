package io.muzhi.aspects;

import io.muzhi.service.IA;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;

@Aspect
public class CompileThirdJarAspect {

    @Autowired
    IA ia;
    /**
     * 切第三方库
     * @param joinPoint 切点
     * @return 返回对象
     * @throws Throwable 异常
     */
    @Around("execution(* com.alibaba.fastjson.JSON.toJSONString(Object))")
    public Object callCompileClassThirdJar(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("third jar before ...");
        Object obj =joinPoint.proceed();
        ia.aMethod();
        System.out.println("third jar after...");
        return obj;
    }
}
