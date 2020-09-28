package com.atguigu.example;

public class YangHui {
	public static void main(String[] args) {
		// 初始化
		int[][] yangHui = new int[10][];
		
		for (int i = 0; i < yangHui.length; i++) {
			// 设置列
			yangHui[i] = new int[i + 1];
			
			// 首末元素为1
			yangHui[i][0] = yangHui[i][i] = 1;
			
			// 给每一列赋值
			for (int j = 1; j < yangHui[i].length - 1; j++) {
				yangHui[i][j] = yangHui[i - 1][j] + yangHui[i - 1][j - 1];
			}
		}
		
		// 遍历数组
		for (int j = 0; j < yangHui.length; j++) {
			for (int j2 = 0; j2 < yangHui[j].length; j2++) {
				System.out.print(yangHui[j][j2] + " ");
			}
			System.out.println();
		}
	}
}
