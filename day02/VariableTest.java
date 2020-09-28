/*
 变量命名规则:
    1.字母,数字,下划线,$符不能以数字开头
    2.规避系统关键字,预设字 goto、const
变量的定义：
    格式为 变量类型 变量名 = 变量值 例如：int age = 18;
    不能使用未定的变量
    使用变量前需要先定义
    变量作用域：只能在作用域范围内使用，作用域外无法使用，在同一个作用域下不能定义同名的变量
 */
public class VariableTest {
    public static void main(String[] args) {
        // 变量的定义
        int myNumber = 1001;
        // 变量的使用
        System.out.println(myNumber);

        // 不能调用未声明的变量
        // System.out.println(age);

        // 声明一个变量但未赋值，不能调用
        // int age;
        // System.out.println(age);

        int age = 18;
        System.out.println(age);

        // 在同一个作用域下不能定义同名的变量
        // int age = 28;

    }
}
