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
    }
}
