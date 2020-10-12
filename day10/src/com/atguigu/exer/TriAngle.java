package com.atguigu.exer;

public class TriAngle {
	/**
	 * 三角形高
	 */
	private double height;

	/**
	 * 三角形底边长
	 */
	private double base;
	
	/**
	 * 构造器
	 */
	public TriAngle() {
		
	}

	/**
	 * 构造器初始化高边长
	 * @param b
	 * @param h
	 */
	public TriAngle(double b, double h) {
		base = b;
		height = h;
	}
	
	/**
	 * 设置高
	 * 
	 * @param h
	 */
	public void setHeight(double h) {
		height = h;
	}

	/**
	 * 获取三角形高
	 * 
	 * @return
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * 设置底边长
	 * 
	 * @param b
	 */
	public void setBase(double b) {
		base = b;
	}

	/**
	 * 获取三角形底边长
	 * 
	 * @return
	 */
	public double getBase() {
		return base;
	}
}
