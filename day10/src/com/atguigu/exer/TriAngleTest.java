package com.atguigu.exer;

public class TriAngleTest {
	public static void main(String[] agrs) {
		TriAngle angle = new TriAngle();
		System.out.println("base = " + angle.getBase() + ", height = " + angle.getHeight());
		
		// 构造器设置三角形高边长
		TriAngle angle2 = new TriAngle(3.0, 5.0);
		System.out.println("base = " + angle2.getBase() + ", height = " + angle2.getHeight());
	}
}
