package org.learn.java;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
public class Application {
    public static void main(String[] args) {
//        ClassA a = new ClassA();
//        ClassB b = new ClassB();
//
//        b.setClassA(a);
//
//        System.out.println(b.getClassA().doSomething());

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        System.out.println("Application context is loaded");
        ClassB b= (ClassB) context.getBean(ClassB.class);
//
//        ClassB b2= (ClassB) context.getBean(ClassB.class);
//
//
//        b2.setId(2020);
//
//        System.out.println(b.getId());

        ((AnnotationConfigApplicationContext)context).close();

    }
}
