public class Welcome {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.print("你好，世界\n");
        char c1 = 'a';
        char c2 = '中';
        char c3 = '\u0061';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        
        //java中的字符串不是基本数据类型，而是一个独立定义的类
        String str = "我爱中国";
        System.out.println(str);
        //boolean类型一般占4个字节，在数组中是1个字节

        //测试逻辑运算符
        boolean b1 = true;
        boolean b2 = false;

        System.out.println(b1&b2);  //与：有一个false,结果false
        System.out.println(b1|b2);  //或：有一个true,结果true
        System.out.println(!b1);    //非：结果fasle
        System.out.println(b1^b2);  //异或：相同false，不同true     
        
        //测试位运算符
        int a=7;
        int b=8;
        System.out.println(a&b); //结果0
        System.out.println(a|b); //结果15
        System.out.println(a^b); //结果15
        System.out.println(~b);  //结果-9

        //移位
        int c =5<<2;
        System.out.println(c); //相当于5*2*2=20
        System.out.println(40>>3); //相当于40/2/2/2=8
    }
}
