package org.learn.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassB {

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
