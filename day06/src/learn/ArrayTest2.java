package learn;

public class ArrayTest2 {
	public static void main(String[] args) {
		// 二维数组静态赋值
		int[][] arr1 = new int[][] {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
		// 二维数组动态赋值
		int[][] arr2 = new int[2][3];
		
		// 数组其他写法
		int[][] arr3 = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
		int arr4[][] = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
		
		int arr5[][] = new int[2][];
		
		System.out.println(arr3.length); // 3
		System.out.println(arr4[0]); // [I@... 数组第一个元素的索引
		System.out.println(arr4[1][1]); // 5  数组第二个元素下的一个2个值
		
		System.out.println(arr5[0]); // null
//		System.out.println(arr5[1][]); // 报错
		
	}
}
