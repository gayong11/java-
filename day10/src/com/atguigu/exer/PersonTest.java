package com.atguigu.exer;

public class PersonTest {
	public static void main(String[] args) {
		Person person = new Person();
		
		// 通过方法设置年龄为28
		person.setAge(28);
		System.out.println("年龄为: " + person.getAge()); 
		
		// 通过构造器设置年龄为18
		Person person2 = new Person();
		System.out.println("年龄为: " + person2.getAge());
		
		// 通过构造器设置人的姓名，年龄
		Person person3 = new Person("Demo", 20);
		System.out.println("姓名：" + person3.getName() + ",年龄：" + person3.getAge());
	}
}
