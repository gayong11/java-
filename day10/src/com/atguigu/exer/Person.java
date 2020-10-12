package com.atguigu.exer;

public class Person {
	/**
	 * 年龄
	 */
	private int age;

	/**
	 * 姓名
	 */
	private String name;

	/**
	 * 构造器设置年龄为18
	 */
	public Person() {
		age = 18;
	}

	/**
	 * 构造器设置人的姓名,年龄
	 * 
	 * @param n
	 * @param a
	 */
	public Person(String n, int a) {
		age = a;
		name = n;
	}

	/**
	 * 设置年龄范围为 0 - 130
	 * 
	 * @param age
	 */
	public void setAge(int a) {
		if (a < 0 || a > 130) {
			System.out.println("传入参数非法");
			return;
		}
		age = a;
	}

	/**
	 * 获取年龄
	 * 
	 * @return
	 */
	public int getAge() {
		return age;
	}

	/**
	 * 获取姓名
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}
}
