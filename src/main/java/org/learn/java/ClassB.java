package org.learn.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import jakarta.inject.Inject;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Scope(value="prototype")
@Component
public class ClassB {

    @Value("1010")
    private int id;
//    @Inject
    @Autowired
    private ClassA classA;

    @PostConstruct
    public void init() {
        System.out.println("Init method get called of class b");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Pre Destroy method get called of class b");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ClassA getClassA() {
        return classA;
    }

    public void setClassA(ClassA classA) {
        this.classA = classA;
    }
}
