package com.atguigu.com;

public class OrderTest {
	public static void main(String[] args) {
		Order order = new Order();
		
		// 同一个包中可以调用另一个类中缺省,public修饰的属性及方法 
		order.methodPublic();
		order.methodDefault();
		
		// 同一个包中不能调用另一个类中private修饰的属性及方法
//		order.methodPrivate();
	}
}
