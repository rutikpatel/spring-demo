package org.learn.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
//        ClassA a = new ClassA();
//        ClassB b = new ClassB();
//
//        b.setClassA(a);
//
//        System.out.println(b.getClassA().doSomething());

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        ClassB b= (ClassB) context.getBean(ClassB.class);
        ClassB b2= (ClassB) context.getBean(ClassB.class);

        System.out.println(b.getId());

        b2.setId(2020);
        System.out.println(b.getId());
        context.close();
    }
}
