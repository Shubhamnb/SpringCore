package com.bridge.AOP_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridge.bussiness.AccountNumberNotFound;
import com.bridge.bussiness.Bank;

/**
 * Hello world!
 *
 */
public class TestApp 
{
    public static void main( String[] args ) throws AccountNumberNotFound
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
       Bank bank = (Bank) context.getBean("pfb");
       int amount = bank.deposite("sbi123", 1000);
       System.out.println("Amount : "+amount);
    }
}
