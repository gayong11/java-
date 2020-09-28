/*
    +=、-=、*=、/= 不会改变原有数据类型
*/
class AriTest {
    public static void main(String[] args) {
        int a = 10;
        a += 2; // 12
        System.out.println(a);
        a -= 2; // 10
        System.out.println(a);
        a *= 2; // 20
        System.out.println(a);
        a /= 2; // 10
        System.out.println(a);

        int b = 2;
        b += 0.1; // 2
        System.out.println(b);
        b -= 0.1; // 1
        System.out.println(b);
        b *= 0.1; // 0
        System.out.println(b);
        int c = 2;
        c /= 0.1; // 20
        System.out.println(c);

    }
}
