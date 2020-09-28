/*
引用类型字符串 String
1. String 属于引用类型
2. 声明String时使用 双引号 "" 


*/
class StringTest {
    public static void main(String[] args) {
        // char 类型使用单引号包裹
        char c1 = 'c';
        System.out.println(c1);
        // char c2 = "c"; // 编译出错,chat类型只能使用单引号包裹
        // System.out.println(c2);

        String s1 = "Hello World!";
        System.out.println(s1);
        // String s2 = 'Hello'; // 编译出错,String类型只能使用双引号包裹
        // Systrm.out.println(s2);

        String s3 = "";
        System.out.println(s3);

        String s4 = "a";
        System.out.println(s4);

        //练习一
        char c = 'a';
        int num = 10;
        String str = "Hello";
        System.out.println(c + num + str); // 107Hello
        System.out.println(c + str + num); // aHello10
        System.out.println(c + (num + str)); // a10Hello
        System.out.println((c + num) + str); // 107Hello
        System.out.println(str + num + c); // Hello10a

        // 练习二 输出 *    * 
        System.out.println("*   *"); // 可以
        System.out.println('*' + '\t' + '*'); // 不可以
        System.out.println('*' + "\t" + '*'); // 可以
        System.out.println('*' + 't' + "*"); // 不可以
        System.out.println('*' + ('\t' + "*")); // 可以

    }
}
