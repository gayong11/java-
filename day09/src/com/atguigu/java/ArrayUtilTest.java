package com.atguigu.java;

public class ArrayUtilTest {
	public static void main(String[] args) {
		int[] arr = new int[] {5, 8, 3, 9, 1, 0, 7, 12};
		
		ArrayUtil util = new ArrayUtil();
		
		// 数组最大值
		System.out.println("最大值为：" + util.getMax(arr));
		
		// 数组最小值
		System.out.println("最小值为：" + util.getMin(arr));
		
		// 数组求和
		System.out.println("数组求和：" + util.sum(arr));
		
		// 数组平均值
		System.out.println("数组平均值：" + util.avg(arr));
		
		// 数组反转
		util.reverse(arr);
		
		// 遍历数组
		util.print(arr);
		System.out.println("-----------------------");
		
		// 数组复制 
		int[] arr1 = util.copy(arr);
		util.print(arr1);
		System.out.println("-----------------------");
		
		// 数组排序
		util.bubbleSort(arr);
		util.print(arr);
		System.out.println("-----------------------");
		
		// 数组查找
		int index = util.binarySearch(arr, 9);
		System.out.println(index);
	}
}
