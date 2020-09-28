package com.atguigu.example;

/*
 *	测试 
 * @author gaoyong
 *
 */
public class ExampleTest {
	public static void main(String[] args) {
		// 实例化对象
		Example examp = new Example();
		// 调用输出 10行8列的 * 
//		examp.method();
		
		// 调用输出10行8列的* 并获取返回值输出
//		System.out.println(examp.method2());
		
		// 调用输出
		System.out.println(examp.method3(5, 4));
	}
}

/*
 * 	输出10行8列的*号
 * @author gaoyong
 *
 */
class Example {
	/**
	 * 	输出10行8列的*号
	 */
	public void method() {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 8; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	/**
	 *	输出10行8列的*号并输出 10 * 8 的和
	 * @return
	 */
	public int method2() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		return 10 * 8;
	}
	
	/**
	 * 	输出m行n列的数据,并返回计算m*n的值
	 * @param m 行
	 * @param n 列
	 * @return
	 */
	public int method3(int m, int n) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print('*');
			}			
			System.out.println();
		}
		
		return m * n;
	}
}
