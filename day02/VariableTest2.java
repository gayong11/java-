/*
基本数据运算 只包含7中数据类型不包含boolean类型
基本数据类型：
    整型：byte、short、int、long
    浮点型：float、double
    字符型：char

    1. 自动类型转换
    byte short char int long float double
    byte、short、char 运算时应至少使用int类型变量接受

*/
class VariableTest2 {
    public static void main(String[] args) {
        byte b1 = 2;
        int i1 = 123;
        // 编译不通过 err1 应为至少为 int类型
        // byte err1 = b1 + i1;
        int res1 = b1 + i1;
        System.out.println(res1);

        // 可以使用float类型变量接受值
        float res2 = b1 + i1;
        System.out.println(res2);

        byte b2 = 3;
        char c1 = 'a'; // a => 97

        // long类型变量结尾需要使用小写l或大写L结尾,不然超出int时会编译错误
        long l2 = 12345;
        System.out.println(l2);
        // long l3 = 20678765422; // 编译失败,结尾需要使用L
        // System.out.println(l3);
        long l4 = 23456787654333L;
        System.out.println(l4);

        // float类型的变量结尾需要使用小写f或大写F,不然编译会报错 浮点型默认使用doubel接收
        // float f4 = 12.3;
        // System.out.println(f4); // 编译报错,需要使用f结尾或使用double接收变量
        float f5 = 12.33F;
        System.out.println(f5);
        double f6 = 123.45;
        System.out.println(f6);

        // byte、short、char类型运算结果应至少使用int类型接收
        // short res3 = b2 + c1; // 编译不通过
        // System.out.println(res3);

        int res4 = b2 + c1;
        System.out.println(res4);

        // 整型常量运算时:默认类型为int型
        byte b3 = 3;
        // byte b4 = b3 + 12; // 编译不通过,计算结果变量类型至少需要为int型
        int i4 = b3 + 12;
        System.out.println(i4);
        // 浮点型常量运算时:默认类型为double型
        // float f3 = b3 + 12.3;
        // System.out.println(f3); // 编译错误, 结果需要使用double类型的变量接受
        double d2 = b3 + 12.4;
        System.out.println(d2);


    }   
}