package com.atguigu.example;

/*
 *	计算圆的面积
 * @author gaoyong
 *
 */
public class Circle {
	/**
	 * 圆的半径
	 */
	public double radius;
	
	/**
	 * 计算圆的面积
	 * @return
	 */
	public double findArea() {
		return Math.PI * radius * radius;
	}
}
