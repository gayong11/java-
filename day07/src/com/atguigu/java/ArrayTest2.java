package com.atguigu.java;

public class ArrayTest2 {
	public static void main(String[] args) {
		// 数组的复制
		int[] arr1 = new int[] { 2, 3, 5, 7, 11, 13, 17, 19 };

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "\t");
		}
		System.out.println();

		// arr1复制给arr2
		int[] arr2 = new int[arr1.length];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr1[i];
		}
		// arr2中的值修改,不会影响arr1中的值
		for (int i = 0; i < arr2.length; i++) {
			if (i % 2 == 0) {
				arr2[i] = i;
			}
		}
		// 打印arr1
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "\t");
		}
		System.out.println();
		// 打印arr2
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + "\t");
		}
		System.out.println();

		// 数组反转
		String[] arr = new String[] { "aa", "bb", "cc", "dd", "ee", "ff" };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();

		for (int i = 0; i < arr.length / 2; i++) {
			String temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		// 数组查找
		String[] arr3 = new String[] { "aa", "bb", "cc", "dd", "ee", "ff" };
		String dest = "dd";
		boolean flag = true;
		// 线性查找
		for (int i = 0; i < arr3.length; i++) {
			if (dest.equals(arr3[i])) {
				System.out.println("找到了，下标为: " + i);
				flag = false;
			}
		}
		if (flag) {
			System.out.println("没有找到");
		}

		// 二分法查找，所要查找的数组需要时有序的
		int[] arr4 = new int[] { 3, 5, 7, 9, 11, 13, 15, 17, 19, 21 };
		int dest1 = 19;
		boolean flag2 = true;
		int start = 0;
		int end = arr4.length - 1;
		while (start <= end) {
			int middle = (start + end) / 2;
			if (arr4[middle] == dest1) {
				System.out.println("找到了，下标为：" + middle);
				flag2 = false;
				break;
			} else if (arr4[middle] > dest1) {
				end = middle - 1;
			} else {
				start = middle + 1;
			}
		}
		if (flag2) {
			System.out.println("未找到");
		}
	}
}
