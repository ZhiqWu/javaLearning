public class Test1017 {
    public static void main(String[] args) {
        System.out.println("NIHAO");
        int a = 3;
        int b = 4;
        System.out.println(a + b);
        String c = "3";
        System.out.println(c + b);

        // 连接符的条件是String
        char c1 = 'h';
        char c2 = 'i';
        System.out.println(c1 + c2);
        System.out.println("" + c1 + c2); // 通过加""+，快速将整个运算转为字符串连接操作

        // 条件运算符
        int score = 80;
        String isOK = score < 60 ? "不及格" : "及格";
        System.out.println(isOK);

        if (score < 60) {
            isOK = "不及格";
        } else {
            isOK = "及格";
        }
        int x = -100;
        int flag = x > 0 ? 1 : (x == 0 ? 0 : -1);
        System.out.println(flag);

        // 测试运算符优先级
        boolean s1 = true, s2 = true, s3 = false;
        System.out.println(s1 || s2 && s3); // 与的优先级高于或
        boolean s4 = (3 > 1 || 1 < 3) && (3 < 6);// 遇到复杂表达式使用小括号
        System.out.println(s4);
    }
}