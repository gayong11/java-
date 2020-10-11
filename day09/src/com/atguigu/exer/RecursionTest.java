package com.atguigu.exer;

public class RecursionTest {
	public static void main(String[] args) {
		RecursionTest test = new RecursionTest();
		
		int sum = test.getSum(4);
		System.out.println(sum);
	}
	
	/**
	 *	计算1-n的和
	 * @param n
	 * @return
	 */
	public int getSum(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n + getSum(n - 1);
		}
	}
	
}
