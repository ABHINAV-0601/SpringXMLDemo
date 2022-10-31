package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("springexample.xml");

        Student student1 = context.getBean("studentbean1",Student.class);
        Student student2 = context.getBean("studentbean2",Student.class);

        System.out.println(student1);
        System.out.println();
        System.out.println(student2);
    }
}
