class PrimeNumberTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        for (int i = 2; i <= 100000; i++) {
            boolean flag = true;
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                // System.out.println(i);
            }
        }
        long end = System.currentTimeMillis();

        System.out.println("开始时间(毫秒): " + start);
        System.out.println("结束时间(毫秒): " + end);
        System.out.println("共计用时(毫秒): " + (end - start));
    }
}