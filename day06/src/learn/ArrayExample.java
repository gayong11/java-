package learn;

import java.util.Scanner;

public class ArrayExample {
	public static void main(String[] args) {
		// 实例化Scanner
		Scanner scan = new Scanner(System.in);

		System.out.print("请输入学生个数：");

		int num = scan.nextInt();

		// 初始化数组
		int[] arr = new int[num];

		// 最高分
		int max = 0;

		for (int i = 1; i <= num; i++) {
			System.out.print("请输入第" + i + "个学生成绩：");
			int grades = scan.nextInt();
			// 找出最高的分数
			if (grades > max) {
				max = grades;
			}
			arr[i - 1] = grades;
		}

		System.out.println("最高分数是: " + max);

		for (int i = 0; i < num; i++) {
			int diff = max - arr[i];
			char grade;
			if (diff <= 10) {
				grade = 'A';
			} else if (diff <= 20) {
				grade = 'B';
			} else if (diff <= 30) {
				grade = 'C';
			} else {
				grade = 'D';
			}

			System.out.println("student " + i + " score is " + arr[i] + " grade is " + grade);
		}
	}
}
