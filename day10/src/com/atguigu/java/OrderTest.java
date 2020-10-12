package com.atguigu.java;

import com.atguigu.com.Order;

public class OrderTest {
	public static void main(String[] args) {
		Order order = new Order();
		
		// 不同包可以调用另一个包中public修饰发属性及方法
		order.methodPublic();
		
		// 不同包外不能调用private,缺省 修饰的属性及方法
//		order.methodDefault();
//		order.methodPrivate();
	}
}
