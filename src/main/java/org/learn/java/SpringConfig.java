package org.learn.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(basePackages = {"org.learn.java"})
public class SpringConfig {

    @Bean
//    @Lazy
    public ClassA classA(){
        return new ClassA();
    }
    @Bean
//    @Lazy
    public ClassB classB(){
        return new ClassB();
    }
}
