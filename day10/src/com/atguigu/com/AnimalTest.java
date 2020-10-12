package com.atguigu.com;

/*
 * java中4种权限修饰符及使用权限
 * 	修饰符		类内部	同一个包	不同包的子类	同一个工程
 * 	private		yes	
 * 	缺省			yes		yes
 * 	protected	yes		yes		yes
 * 	public		yes		yes		yes			yes	
 * 
 * 	类的修饰只能使用 public、缺省来修饰
 */
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
