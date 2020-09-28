public class VariableInt {
    public static void main(String[] args) {
        /*
            数值类型-整型
            byte （1个字节=8bite）范围 -128 ~ 127
            short （2个字节）
            int （4个字节）
            long（8个字节）定义long时需要以小写l或大写L结尾
        */

        byte b1 = 12;
        System.out.println(b1);
        // 超出范围编译不通过
        // byte b2 = 128;

        short s1 = 128;
        int i1 = 123456;
        // 定义long类型时需要以小写l或大写L结尾
        long l1 = 1345678L;
        System.out.println(l1);
    }
}