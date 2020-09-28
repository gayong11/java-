
public class VariableChar {
    /*
        char字符类型只有2个字节，
        定义时使用单引号包裹。
        可以包含转义字符 \n \r \t等
        可以是一个文字
        还可以时一个Unicode编码
            例如：char c = 'a';
            char c2 = '\r';
            char c3 = '\u0033';
    */
    public static void main(String[] args) {
        char c1 = 'a';
        System.out.println(c1);

        char c2 = '\n';
        System.out.println(c2);

        char c3 = '\u0025';
        System.out.println(c3);

        char c4 = '国';
        System.out.println(c4);

        // 不能使用双引号定义char字符类型，编译不通过
        // char c5 = "a";
        // System.out.pringln(c5);
    }
}