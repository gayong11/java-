import java.util.Scanner;

class ForExer {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        int a = 1;
        for (System.out.print('a'); a <= 3; System.out.print('c'), a++) {
            System.out.print('b');
        }
        // abcbcbc

        // 输出100以内的偶数并输出偶数之和
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
            }
        }

        System.out.println("0-100偶数之和：" + sum);

        /**
         * 输出1大150的数,并输出后缀
         * 3的倍数输出加 foo
         * 5的倍数输出加 biz
         * 7的倍数输出加 baz
         */
        for (int i = 1; i <= 150; i++) {
            String str = i + " ";
            if (i % 3 == 0) {
                str += "foo ";
            }
            if (i % 5 == 0) {
                str += "biz ";
            }
            if (i % 7 == 0) {
                str += "baz";
            }

            System.out.println(str);
        }

        /**
         * 获取两个数的最大公约数,最小公倍数
         * 如 12, 20 的最大公约数为 4 ,最大公倍数为 60
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入第一个正整数");
        int n = scan.nextInt();

        System.out.println("请输入第二个正整数");
        int m = scan.nextInt();

        int min = n < m ? n : m;
        int max = n < m ? m : n;
        // 最大公约数
        for (int i = min; i >= 1; i--) {
            if (n % i == 0 && m % i == 0) {
                System.out.println("最大公约数为: " + i);
                break;
            }
        }
        // 最小公倍数
        for (int i = max; i <= n * m; i++) {
            if (i % n == 0 && i % m == 0) {
                System.out.println("最小公倍数为: " + i);
                break;
            }
        }
        
        System.out.println("最小数为： " + min);
        System.out.println("最大数为: " + max);
    }
}