import java.util.Scanner;

class IfExer {
    public static void main(String[] args) {
        boolean b = true;
        if (b = false) {
            System.out.println("a");
        } else if (b) {
            System.out.println("b");
        } else if (!b) {
            System.out.println("c");
        } else {
            System.out.println("d");
        }

        Scanner scan = new Scanner(System.in);

        System.out.println("请输入狗的年龄");

        int dogAge = scan.nextInt();
        double age;

        if (dogAge > 0) {
            if (dogAge <= 2) {
                age = dogAge * 10.5;
            } else {
                age = (dogAge - 2) * 4 + (2 * 10.5);
            }
            System.out.println("狗的年龄相当于人的年龄：" + age);
        } else {
            System.out.println("请输入正确的年龄");
        }
    }
}