//强制类型转换和溢出问题
public class TestTypeCast {
    public static void main(String[] args) {
        double a = 3.1415;
        int b = (int) a; // b:3 浮点数强制转成整数，则直接丢失小数部分
        System.out.println(b);

        int c = 97;
        System.out.println((char) c);

        // 强制转型，超过了表数范围，则会转成一个完全不同的数。
        byte d = (byte) 300;
        System.out.println(d);

        //注意溢出问题
        int money = 1000000000; //10亿
        int years = 20;
        //返回的total是负数，超过了int范围
        int total = money *years;
        System.out.println("total"+total);
        //返回的total1仍然是负数，默认是int，因此结果会转成int值,再转成long。
        //但是已经发生了数据丢失。
        long total1 = money *years;
        System.out.println("total1"+total1);
        //返回的total2正确，先将一个因子变成long，整个表达式发生提升。全部用long来计算。
        long total2 = money *((long)years);
        System.out.println("total"+total2);

        //人的寿命是80岁，经历了多少次心跳
        long num = 100*60*24*365*80L;
        System.out.println(num);//约42亿次
    }
}
