package com.atguigu.java;

import java.util.Arrays;

/**
 * 数组操作
 * @author gaoyong
 * equals(arr, arr1) 判断两个数组是否相等
 * toString(arr) 输出数组中的元素
 * fill(arr, value) 将数组中的值使用value填充
 * sort(arr) 对数组进行升序的排序 
 * binarySearch(arr, value) 在数组中查找指定的值,存在返回数组中的下标,不存在返回负数 
 *
 */
public class ArraysTest {
	public static void main(String[] args) {
		int[] arr1 = new int[] {1, 2, 3, 4};
		int[] arr2 = new int[] {1, 2, 4, 3};
		
		// 判断两个数组是否相等 equals(arr1, arr2);
		boolean isEquals = Arrays.equals(arr1, arr2);
		System.out.println(isEquals);
		// 输出数组的元素
		System.out.println(Arrays.toString(arr1));
		// fill() 将数组中值替换为给定的值
		Arrays.fill(arr1, 5);
		System.out.println(Arrays.toString(arr1));
		
		// srot(); 数组排序 升序
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		
		// binarySearch() 在数组中查找给定的值,找到时返回数组的下标,没找到时返回负数
		int key = Arrays.binarySearch(arr2, 3);
		System.out.println(key);
	}
}
