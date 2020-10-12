package com.atguigu.java2;

/**
 * this的使用
 * @author gaoyong
 * 
 * 1. this 指向当前对象或正在创建的对象
 * 2. 在类的方法中可以使用this.属性或this.方法，调用当前对象的属性或方法
 * 3. 在类的构造器中可以使用this.属性或this.方法，调用当前方法的属性或方法
 * 4. 在构造器中
 * 		可以显示的使用this(形参列表)方式，调用本类中的其他构造器
 * 		构造器中不能通过this(形参列表)方式调用自己
 * 		有n个构造器时，最多只能有n-1个构造中使用this(形参列表)
 * 		this(形参列表)必须声明在当前构造器首行
 * 		构造器内部最多有一个this(形参列表)调用
 *
 */
public class PersonTest {
	public static void main(String[] args) {
		Person person = new Person();
		
		person.setAge(1);
		System.out.println("age = " + person.getAge());
		person.setName("Tom");
		System.out.println("name = " + person.getName());
		
		System.out.println("------------------------------");
		
		Person person2 = new Person(2);
		System.out.println(person2.getAge());
		
		System.out.println("\n------------------------------");
		Person person3 = new Person("Job", 3);
		System.out.println(person3.getAge());
	}
}
