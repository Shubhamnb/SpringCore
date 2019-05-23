package com.bridge.AOP_1;



import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridge.bussiness.AccountNumberNotFound;
import com.bridge.bussiness.Bank;
import com.bridge.service.LogMethodIntercepter;



/**
 * Hello world!
 *
 */
public class TestApp 
{
    public static void main( String[] args ) throws AccountNumberNotFound
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
       ProxyFactoryBean pfb = context.getBean("pbf", ProxyFactoryBean.class);
       Bank bank = (Bank) pfb.getObject();
       int amount = bank.deposite("sbi123", 1000);
       System.out.println("Amount : "+amount);
    }
}
