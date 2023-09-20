package org.learn.java;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ClassA {

    @PostConstruct
    public void init() {
        System.out.println("Init method get called of class a");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Pre Destroy method get called of class a");
    }
    public String doSomething(){
        return "Hello Spring World";
    }
}
