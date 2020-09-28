public class VariableFloat {
    public static void main(String[] args) {
        /*
            数值类型-浮点型
            float (4个字节) 定义时需要在结尾添加小写f或大写F，存储值的范围比整型 int还大，保留7位精度
            double（8个字节）存储值范围比long要大，精度时float的两倍
        */
        double d1 = 1234.3456;
        System.out.println(d1);

        // 定义float时需要以小写f或大写F结尾
        float f1 = 13.125235F;
        System.out.println(f1);
    }
}