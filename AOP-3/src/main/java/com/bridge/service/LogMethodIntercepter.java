package com.bridge.service;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogMethodIntercepter implements MethodInterceptor{

	public Object invoke(MethodInvocation mi) throws Throwable {
		System.out.println("Before Deposite");
		
		Object ret = mi.proceed();
		
		System.out.println("After Deposite");
		return ret;
	}

}
