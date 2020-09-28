package com.atguigu.java;

/**
 * 二分法查找
 * 只能对有序的数据进行排序
 * @author gaoyong
 *
 */
public class DichotomyArray {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		int dest = 33;
		boolean flag = true;
		int start = 0;
		int end = arr.length - 1;
		
		while (start <= end) {
			// 中间值
			int middle = (start + end) / 2;
			
			if (arr[middle] == dest) {
				System.out.println("找到了,下标为: " + middle);
				flag = false;
				break;
			} else if (arr[middle] > dest) {
				end = middle - 1;
			} else if (arr[middle] < dest) {
				start = middle + 1;
			}
		}
		if (flag) {
			System.out.println("没有找到");
		}
	}
}
