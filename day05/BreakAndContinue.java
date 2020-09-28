class BreakAndContinue {
    public static void main(String[] args) {
        // break 结束当前循环 continue 跳过当前循环
        for(int i = 1; i <= 4; i++) {
            for(int j = 1; j <= 10; j++) {
                if (j % 4 == 0) {
                    // break; // 输出 123 123 123 123
                    continue; // 123567910 123567910 123567910 123567910 
                }
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        
        label:for(int i = 1; i <= 4; i++) {
            for(int j = 1; j <= 10; j++) {
                if (j % 4 == 0) {
                    // break label; // 结束一个标识为label的循环 输出: 123
                    continue label; // 跳过一个标识为label的循环 输出 123123123123
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
