
/*
 * 测试获得键盘输入,Scanner类
 */
import java.util.Scanner;

public class TestScannner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入您的用户名:");
        String uname = s.nextLine();
        System.out.println("请输入您的年龄:");
        int age = s.nextInt();
        System.out.println("请输入您的月薪:");
        double salary = s.nextDouble();

        System.out.println("用户名:" + uname + "\t年龄:" + age + "\t月薪" + salary);

    }

}
