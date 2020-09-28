package com.atguigu.java;

/**
 * 冒泡排序 循环数组,将数组中的相邻的两个数比较大小
 * 
 * @author gaoyong
 *
 */
public class BubbleTest2 {
	public static void main(String[] args) {
		int[] arr = new int[] { 4, 8, 9, 5, 7, 10, 3, 11, 18, 2 };

		// 从小到大排序
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i -1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		// 从大到小排序
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = arr.length - i - 1; j > 0; j--) {
//				if (arr[j] > arr[j - 1]) {
//					int temp = arr[j];
//					arr[j] = arr[j - 1];
//					arr[j - 1] = temp;
//				}
//			}
//		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
