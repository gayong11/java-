package com.atguigu.com;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Animal();
		
		animal.name = "大黄";
		animal.age = 2;
		
//		animal.legs = 4;// The field Animal.legs is not visible
		
		// 设置腿
		animal.setLegs(4);
		animal.show();
		
		animal.setLegs(-6);
		animal.show();
	}
}
