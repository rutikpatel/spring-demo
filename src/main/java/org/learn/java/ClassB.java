package org.learn.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value= "prototype")
public class ClassB {

    @Value("1010")
    private int id;
    @Autowired
    private ClassA classA;

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
