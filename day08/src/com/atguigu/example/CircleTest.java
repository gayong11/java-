package com.atguigu.example;

/*
 * 计算圆的面积测试
 */
public class CircleTest {
	public static void main(String[] args) {
		// 实例化
		Circle cir = new Circle();
		// 设置半径
		cir.radius = 10;
		double area = cir.findArea();

		System.out.println("圆的面积为: " + area);
	}
}
