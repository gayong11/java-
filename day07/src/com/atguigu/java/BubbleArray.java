package com.atguigu.java;

/**
 * 冒泡排序 将数组中的元素从小到大进行排序 排序思想将数组中两个相邻的数组进行比较
 * 
 * @author gaoyong
 *
 */
public class BubbleArray {
	public static void main(String[] args) {
		int[] arr = new int[] { 8, 3, 10, 35, 88, 7, 18, 16 };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}
