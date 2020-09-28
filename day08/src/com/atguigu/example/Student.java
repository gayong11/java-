package com.atguigu.example;

public class Student {
	/**
	 * 	学号
	 */
	public int number;
	
	/**
	 * 	年级
	 */
	public int state;
	
	/**
	 * 	成绩
	 */
	public int score;
	
	public void info() {
		System.out.println("学号为：" + number + ", 年级为：" + state + "，分数为：" + score);
	}
}
