package com.atguigu.java;

/**
 * 简单的数组操作
 * 
 * @author gaoyong
 *
 */
public class ArrayUtil {
	/**
	 * 求数组的最大值
	 * 
	 * @param arr
	 * @return
	 */
	public int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		return max;
	}

	/**
	 * 求数组的最小值
	 * 
	 * @param arr
	 * @return
	 */
	public int getMin(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}

		return min;
	}

	/**
	 * 求数组的和
	 * 
	 * @param arr
	 * @return
	 */
	public int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		return sum;
	}

	/**
	 * 求数组的平均值
	 * 
	 * @param arr
	 * @return
	 */
	public int avg(int[] arr) {
		return (int) (sum(arr) / arr.length);
	}

	/**
	 * 反转数组
	 * 
	 * @param arr
	 */
	public void reverse(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
	}

	/**
	 * 复制数组
	 * 
	 * @param arr
	 * @return
	 */
	public int[] copy(int[] arr) {
		int[] arr1 = new int[arr.length];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = arr[i];
		}

		return arr1;
	}

	/**
	 * 遍历数组
	 * 
	 * @param arr
	 */
	public void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}

	/**
	 * 数组排序 (冒泡排序)
	 * 
	 * @param arr
	 */
	public void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	/**
	 * 查找指定元素
	 * 
	 * @param arr
	 * @param dest
	 * @return
	 */
	public int binarySearch(int[] arr, int dest) {		
		int start = 0;
		int end = arr.length - 1;
		
		while (start <= end) {
			int middle = (start + end) >>> 1;
			if (arr[middle] == dest) {
				return middle;
			} else if (arr[middle] > dest) {
				end = middle - 1;
			} else {
				start = middle + 1;
			}
		}

		return -1;
	}

}
