/*
1. 编写：以.java结尾的一个源文件
2. 编译：命令行运行javac 源文件.java。格式：javac 源文件.java
3. 运行：命令行运行java 字节码类文件。 格式：java 字节码文件

4. 一个源文件中可以包含多个类，但public只能修饰于源文件同名的类
5. 程序的入口main方法，格式是固定的
6. System.out.println() 输出换行
7. System.out.print() 输出不换行
8. 每一行都以;结束
9. 编译时一个源文件中有多个类时，编译时会产生多个字节码文件

*/
public class Hello {
    public static void main(String[] args) {
        // 输出换行
        System.out.println("Hello");
        System.out.println(" World！");
        // 输出不换行
        System.out.print("Hello ");
        System.out.print("World");
    }
}

class Person {

}

class Animal {

}
