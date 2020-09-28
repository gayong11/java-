package com.atguigu.contact;

import java.util.Scanner;

class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("你的姓名？");
        String name = scan.next();
        System.out.println(name);

        System.out.println("你的年龄是多少？");
        int age = scan.nextInt();
        System.out.println(age);

        System.out.println("你的体重？");
        double weight = scan.nextDouble();
        System.out.println(weight);

        System.out.println("你是否单身？（true/false）");
        boolean dan = scan.nextBoolean();
        System.out.println(dan);
    }
}
