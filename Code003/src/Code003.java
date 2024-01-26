import java.util.Scanner;

public class Code003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的姓名：");
        String name = sc.nextLine();
        System.out.println("请输入你的年龄：");
        int age = sc.nextInt();
        System.out.println("请输入你的工资：");
        float salary = sc.nextFloat();
        System.out.println("你的信息如下：");
        System.out.println("姓名：" + name + "\n" + "年龄：" + age + "\n" + "工资：" + salary + "\n");
        sc.close();
    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please input your name: ");
//        String name = sc.nextLine();
//        System.out.println(name);
//    }
//    public static void main(String[] args) {
//        System.out.println("hello");
//        System.out.print("hello1");
//        System.out.printf("%d", 38);
//    }
//    public static void main(String[] args) {
//        int sum = 0;
//        for(int count = 1; count <= 5; count++){
//            int product = 1;
//            for(int proVar = 1; proVar <= count; proVar++){
//                product = product * proVar;
//            }
//            sum = sum + product;
//        }
//        System.out.println("sum equals to: " + sum);
//    }

}
