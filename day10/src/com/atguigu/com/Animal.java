package com.atguigu.com;

public class Animal {
	/**
	 * 姓名
	 */
	public String name;
	
	/**
	 * 年龄
	 */
	public int age;
	
	/**
	 * 腿
	 */
	private int legs;
	
	/**
	 * 设置腿的条数
	 * @param leg
	 */
	public void setLegs(int leg) {
		if (leg >=0 && leg % 2 ==0 ) {
			legs = leg;
		} else {
			legs = 0;
		}
	}
	
	/**
	 * 显示数据
	 */
	public void show() {
		System.out.println("name = " + name + ",age = " + age + ",legs = " + legs);
	}
}
