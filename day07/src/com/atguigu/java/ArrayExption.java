package com.atguigu.java;

/**
 * 数组中的异常处理
 * 
 * @author gaoyong
 *
 */
public class ArrayExption {
	public static void main(String[] args) {
		int[] arr = new int[] {1, 2, 3, 4, 5};
		// ArrayIndexOutOfBoundExption 角标越界后面的代码不会执行
//		for (int i = 0; i <= arr.length; i++) {
//			System.out.print(arr[i] + "\t");
//		}
		// ArrayIndexOutOfBoundExption 角标越界
//		System.out.println(arr[-1]);
		
//		NullPotinterExptions 空指针
		int[] arr1 = {1, 2, 3};
		arr1 = null;
//		System.out.println(arr1[0]);
		
	}
}
