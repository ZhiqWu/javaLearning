public class TestTypeAtutoConvert {
    public static void main(String[] args) {
        //从容量小的类型可以自动转化为容量大的类型
        int a = 2345;
        long b = a;
        //int c = b;//long不能自动转为int
        double d=b;
        float f=b;

        //特例：整型常量是int类型，但是可以自动转为：byte, short, char。只要不超过对应类型的表数范围。
        int h=123;
        byte h1=123;
        char h3=97;  //char[0,65535]之间
        System.out.println(h3);


    }
}
