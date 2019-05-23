package com.bridge.AOP_1;



import org.springframework.aop.framework.ProxyFactoryBean;

import com.bridge.bussiness.AccountNumberNotFound;
import com.bridge.bussiness.Bank;
import com.bridge.service.LogServiceAfterMethod;


/**
 * Hello world!
 *
 */
public class TestApp 
{
    public static void main( String[] args ) throws AccountNumberNotFound
    {
       Bank b = new Bank();
       LogServiceAfterMethod lbs = new LogServiceAfterMethod();
       
       ProxyFactoryBean pfb = new ProxyFactoryBean();
       pfb.setTarget(b);
       pfb.addAdvice(lbs);
       
       Bank bank = (Bank) pfb.getObject();
       int amount = bank.deposite("sbi123", 1000);
       System.out.println("Amount : "+amount);
    }
}
