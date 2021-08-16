package io.muzhi.config;

import io.muzhi.aspects.CompileAspect;
import io.muzhi.aspects.CompileThirdJarAspect;
import io.muzhi.aspects.RuntimeAspect;
import org.aspectj.lang.Aspects;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AspectConfig {

    @Bean
    public CompileAspect compileAspect() {
        return Aspects.aspectOf(CompileAspect.class);
    }

    @Bean
    public CompileThirdJarAspect compileThirdJarAspect() {
        return Aspects.aspectOf(CompileThirdJarAspect.class);
    }

    @Bean
    public RuntimeAspect runtimeAspect() {
        return Aspects.aspectOf(RuntimeAspect.class);
    }
}
