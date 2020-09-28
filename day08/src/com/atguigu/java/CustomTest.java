package com.atguigu.java;

/**
 * 方法中 void 表示没有返回值
 * 	String 表示返回一个人String对象
 *  Int 表示返回一个Int对象 ....
 *  
 *  方法格式 :  权限修饰符 返回值类型 方法名(形参列表)  {
 *  	方法体
 *  }
 *  
 * @author gaoyong
 *
 */
public class CustomTest {

}

class Custom {
	// 属性
	String name;
	int age = 1;
	boolean isMail;
	
	// 方法
	public void eat() {
		System.out.println("吃了顿饭");
	}

	public void sleep(int hour) {
		System.out.println("休息了" + hour + "小时");
	}
	
	public String name(String name) {
		return name;
	}
	
	public String getNation(String nation) {
		String info = "来自: " + nation;
		return info;
	}
	
}