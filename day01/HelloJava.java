/*
java 注释
1. // 单行注释
2.  多行注释 
3. 文档注释 注释内容可以被JDK提供的工具 javadoc所解析，生成一套以网页文件形式提现的该程序的说明文档
*/

/**
  @author gaoyong
  @version v1.0 这是第一个java程序
 */
public class HelloJava {
    /**
      文档注释
      main 方法是程序的入口
      main方法格式是固定的
      @param args
     */
    public static void main(String[] args) {
        // 单行注释
        System.out.println("Hellor java!");
    }
}