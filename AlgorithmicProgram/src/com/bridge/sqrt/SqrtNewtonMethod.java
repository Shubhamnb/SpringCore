package com.bridge.sqrt;

import java.util.Scanner;

public class SqrtNewtonMethod {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter C : ");
        double c = sc.nextDouble();

        double epsilon = 1e-15;    // relative error tolerance
        double t = c;              // estimate of the square root of c

        // repeatedly apply Newton update step until desired precision is achieved
        while (Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2.0;
        }
        // print out the estimate of the square root of c
        System.out.println(t);
    }
}
