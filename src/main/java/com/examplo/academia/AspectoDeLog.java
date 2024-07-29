package com.examplo.academia;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectoDeLog {

    @Before("execution(* Academia.adicionarMembro(..)) || execution(* Academia.removerMembro(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Método Chamado: " + joinPoint.getSignature().getName());
    }
}

