package com.bridge.Distance;

public class Distance {

	public static void main(String[] args) {
		double x = Integer.parseInt(args[0]);
		double y = Integer.parseInt(args[1]);
		
		double xsqure = Math.pow(x, 2);
		double ysqure = Math.pow(y, 2);
		
		double distance =Math.sqrt(xsqure + ysqure) ;
		System.out.println("Distance between origin to (x,y) is "+distance);
	}

}
