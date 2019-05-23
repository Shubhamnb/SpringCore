package com.bridge.service;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class LogServiceAfterMethod implements AfterReturningAdvice{

	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("After Deposite");
		System.out.println("Return Value ="+returnValue);
		System.out.println("Method Name  ="+method);
		/*
		 * for (Object object : args) { System.out.println(args); }
		 * System.out.println(target);
		 */
	}
	
}
