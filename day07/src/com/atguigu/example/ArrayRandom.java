package com.atguigu.example;

/**
 * 一个6位数组，随机赋值1-30的数字，数字在数组中不能重复
 * @author gaoyong
 *
 */
public class ArrayRandom {
	public static void main(String[] args) {
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			int num = (int) (Math.random() * 30) + 1;
			arr[i] = num;
			for (int j = 0; j < i; j++) {
				if (arr[j] == num) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
