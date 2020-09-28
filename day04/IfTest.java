import  java.util.Scanner;

class IfTest{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("岳小鹏JAVA成绩 0 - 100 分");
        short score = scan.nextShort();
        if (score == 100) {
            System.out.println("奖励一台BMW");
        } else if (score > 80 && score <= 99) {
            System.out.println("奖励一台Iphone xs max");
        } else if (score > 60 && score <= 80) {
            System.out.println("奖励一个ipad");
        } else {
            System.out.println("什么奖励也没有");
        }
    }
}