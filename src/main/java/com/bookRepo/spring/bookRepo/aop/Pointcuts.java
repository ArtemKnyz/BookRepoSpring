package com.bookRepo.spring.bookRepo.aop;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {

    @Pointcut("execution(* com.bookRepo.spring.bookRepo.service.BookService.get*(..))")
    public void allGetMethods(){

    }

    @Pointcut("execution(* com.bookRepo.spring.bookRepo.service.BookService.add*(..))")
    public void allAddMethods(){

    }

}
