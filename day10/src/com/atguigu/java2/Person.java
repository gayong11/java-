package com.atguigu.java2;

/**
 * this的使用
 * @author gaoyong
 *
 */
public class Person {
	/**
	 * 姓名
	 */
	private String name;

	/**
	 * 年龄
	 */
	private int age;
	
	public Person() {
		System.out.println("初始化执行很多操作：1，2，3，4，5。。。。");
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(int age) {
		// 调用空参数的构造器
		this();
		// 属性赋值
		this.age = age;
	}
	
	public Person(String name, int age) {
		this(age);
		this.name = name;
		this.state();
	}

	/**
	 * 设置姓名
	 * 
	 * @param n
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取姓名
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置年龄
	 * 
	 * @param a
	 */
	public void setAge(int age) {
		this.age = age;
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
	 * 输出用户信息
	 */
	public void state() {
		System.out.println("name = " + name + ", age = " + age);
	}
}
