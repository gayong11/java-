class ForForTest {
    public static void main(String[] args) {
        for(int i = 0; i <= 5; i++) {
            System.out.print('*');
        }
        System.out.println('\n');

        for(int i = 0; i <= 5; i++) {
            for(int j = 0; j <= 5; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println('\n');

        for(int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }

            System.out.println();
        }

        System.out.println('\n');

        for(int i = 1; i <= 9; i++) {
            for(int j = 10-i; j >= 1; j--) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println('\n');
    }
}