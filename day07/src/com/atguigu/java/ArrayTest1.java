package com.atguigu.java;

/**
 * 获取长度为10的数组中的最大值,最小值,总和,平均值,要求数组的中数都为2位数: 10-99
 * @author gaoyong
 *
 */
public class ArrayTest1 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 90) + 10;
		}
		
		int maxNum = 0;
		int minNum = arr[0];
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			if (maxNum < arr[i]) {
				maxNum = arr[i];
			}
			if (minNum > arr[i]) {
				minNum = arr[i];
			}
			total += arr[i];
		}
		float avg = total / (arr.length);
		System.out.println("maxNum: " + maxNum);
		System.out.println("minNum: " + minNum);
		System.out.println("total: " + total);
		System.out.println("agv: " + avg);
		
		System.out.println("-----------------");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}
