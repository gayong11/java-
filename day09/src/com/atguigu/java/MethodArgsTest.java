package com.atguigu.java;

/*
 * 方法重载
 * 	1.参数不同，数据类型不一致时
 * 	2.参数数量不一致时
 * 	注意：
 * 	1.可变参数需要是方法的最后一个参数
 * @author gaoyong
 *
 */
public class MethodArgsTest {
	public static void main(String[] args) {
		MethodArgsTest test = new MethodArgsTest();
		test.show(1234);
		test.show("abcd");
		test.show("abcd", "efgh");
		
		String[] str = new String[] {"aaa", "bbb", "ccc"};
		test.show(str);
	}
	
	public void show(int i) {
		System.out.println("show(int i)");
	}
	
	// 返回值不同时,不算方法重载
	public int show(String i) {
		System.out.println("show(String i)");
	}

	public void show(String ... args) {
		System.out.println("show(String ... args)");
		
		// 获取参数值，使用for循环
		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i] + "\t");
		}
		System.out.println();
	}
	
//	public void show(String s) {
//		System.out.println("show(String s)");
//	}
	
}
