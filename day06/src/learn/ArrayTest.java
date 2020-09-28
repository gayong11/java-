package learn;

public class ArrayTest {
	public static void main(String[] args) {
		// 声明一个字符串数组,数组长度为5
		String[] names = new String[5];
		
		// 声明一个整型的数组,并给数组设置预定义元素
		int[] ages = new int[] {18, 28, 30};
		
		  names[0] = "姚明"; 
		  names[1] = "科比"; 
		  names[2] = "乔丹"; 
		  names[3] = "艾弗森"; 
		  names[4]  = "杜兰特";
		 
//		names[5] = "詹姆斯"; // 超出数组长度，编辑会报错
		
		// 获取数组的长度 .length
		int length = names.length;
		System.out.println("姓名数组的长度为: " + length);
		
		// 遍历数组
		for(int i = 0; i < length; i++) {
			System.out.println(names[i]);
		}
		
		/*
		 * 数组元素默认化初始值 
		 * > 整型数组 0
		 * > 浮点数组 0.0
		 * > char数组 0
		 * > boolean数组 false
		 * > string数组 null
		 */	
		
		int[] int1 = new int[3];
		for(int i = 0; i < int1.length; i++) {
			System.out.println(int1[i]);
		}
		
		System.out.println("-----------------");
		
		short[] short1 = new short[3];
		for(int i = 0; i < short1.length; i++) {
			System.out.println(short1[i]);
		}
	
		System.out.println("-----------------");
	
		float[] float1 = new float[3];
		for(int i = 0; i < float1.length; i++) {
			System.out.println(float1[i]);
		}
		
		System.out.println("-----------------");
		
		char[] char1 = new char[3];
		for(int i = 0; i < char1.length; i ++) {
			System.out.println(char1[i]);
		}
		
		if (char1[0] == 0) {
			System.out.println("char数组默认值为: 0");
		}
		
		System.out.println("-----------------");
		
		boolean[] boolean1 = new boolean[3];
		
		for(int i = 0; i < boolean1.length; i++) {
			System.out.println(boolean1[i]);
		}
		
		System.out.println("-----------------");
		
		String[] string1 = new String[3];
		
		for(int i = 0; i < string1.length; i++) {
			System.out.println(string1[i]);
		}
		
		System.out.println("-----------------");
	}
}
