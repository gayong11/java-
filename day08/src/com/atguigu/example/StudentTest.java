package com.atguigu.example;

public class StudentTest {
	public static void main(String[] args) {
		Student[] students = new Student[20];

		// 数组赋值
		for (int i = 0; i < students.length; i++) {
			// 数组初始化
			students[i] = new Student();
			// 学号赋值
			students[i].number = i + 1;
			// 年级赋值 1 - 6
			students[i].state = (int) (Math.random() * (6 - 1 + 1) + 1);
			// 分数赋值 0 - 100
			students[i].score = (int) (Math.random() * (100 - 0 + 1));
		}
		
		StudentTest test = new StudentTest();

		// 查找3年级的学生
		test.searchState(students, 3);

		System.out.println("------------------------------------------------");

		// 使用冒泡排序对学生的分数进行排序 （从小到大）
		test.sortScore(students);

		System.out.println("学生分数排序结果为：");
		// 输出学生信息
		test.printStudents(students);
	}

	/**
	 * 查找学生年级为指定年级的学生信息
	 * 
	 * @param students 学生数据
	 * @param state    指定年级
	 */
	public void searchState(Student[] students, int state) {
		for (int i = 0; i < students.length; i++) {
			if (students[i].state == state) {
				students[i].info();
			}
		}
	}

	/**
	 * 学生分数排序，从大到小，冒泡排序
	 * 
	 * @param students
	 */
	public void sortScore(Student[] students) {
		for (int i = 0; i < students.length - 1; i++) {
			for (int j = 0; j < students.length - i - 1; j++) {
				if (students[j].score > students[j + 1].score) {
					Student temp = students[j];
					students[j] = students[j + 1];
					students[j + 1] = temp;
				}
			}
		}
	}

	/**
	 * 打印学生数据
	 * 
	 * @param students
	 */
	public void printStudents(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			students[i].info();
		}
	}
}
