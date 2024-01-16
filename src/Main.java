import java.awt.*;
import java.util.Arrays;
import java.util.Date;
//import java.util.Scanner;
//import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        //int age = 30;
        //age = 35;
        //int myAge = 30;
        //int herAge = myAge;
       //byte x = 1;
       //byte y = x;
       //x = 2;
        //System.out.println(y);
        //Point point1 = new Point(1,1);
        //Point point2 = point1;
        //point1.x = 2;
        //System.out.println(point2);
        //String message = "c:\\windows\\...";
        //System.out.println(message.trim());
        //System.out.println(message);

        //Arrays
        //int[] numbers = new int[5];
        // number to numbers, because we're dealing with a list of items
        // [5] refers to 5 items are included in this array.
        //short a = 128;
        //byte b = (byte)a;
       /* int a = 1;
        a++;
        System.out.println(a++);
        System.out.println(a);*/

        /*int a = -1;
        System.out.println(a << 1);*/
        /*int a = -3;
        System.out.println(a >> 1);*/
/*        System.out.println(5/2);
        System.out.println((float) 5/2);
        System.out.println(5/(float)2);
        System.out.println((float)(5/2));*/
        /*System.out.println(10%3);
        System.out.println(10%-3);*/
        /*System.out.println(11.5%2);*/
       /* int a = 3;
        int b = 2;
        double d = a*1.0/b;
        System.out.println(d);*/
       /* int a = 1;
        int b = 0;
        System.out.println(1+0.5);*/
       /* int a = 2;
        System.out.println(a%= 3);*/
        /*int a = 1;
        a++;
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);*/

        /*int a = 10;
        int b = a++;
        int b1 = ++a;
        System.out.println(b);
        System.out.println(b1);*/
//        int a = -2;
//        System.out.println(&-2);
/*        int a = 1;
        int b = 2;
        System.out.println(a == 1 && b ==2);
        System.out.println(!(a == 1));*/
//        int a = 0xf;
//        System.out.printf("%x\n", ~a);
//        System.out.printf("%x\n", a);
//        System.out.printf("%d\n", a);
//        int number = 42;
//        String binary = Integer.toBinaryString(number);
//        System.out.printf("%d is %s%n", number, binary);
//        int a = 0x10;
//        System.out.printf("%d\n", a);
//        System.out.printf("%x", a<<1);
//        int a = -1;
//        System.out.println(a>>2);
//        int a = 10;
//        int b = 20;
//        System.out.println(a>b?a:b);
//        System.out.printf("aaa\n");
//        System.out.printf("bbb\n");
//        System.out.printf("ccc");
//        System.out.println("aaa");
//        System.out.println("ccc");
//        System.out.println("bbb");
//        int score = 92;
//        if(score >= 92){
//            System.out.println("奖励一朵小红花");
//        }

//        int score = 86;
//        if(score>= 92){
//            System.out.println("a free ticket to Tokyo");
//        } else{
//            System.out.println("家で勉強してください");
//        }
//        int score = 93;
//        if(score > 90 && score <= 100) {
//            System.out.println("Excellent");
//        }else if(score > 80 && score <= 90) {
//            System.out.println("Good");
//        }else{
//            System.out.println("Need to be improved");
//        }
//        int a = 10;
//        if(a % 2 == 0){
//            System.out.println("even number");
//        }else{
//            System.out.println("odd number");
//        }
//        int a = -3;
//        if(a > 0){
//            System.out.println("a is a positive number");
//        }else if(a == 0){
//            System.out.println("a equals to zero");
//        }else{
//            System.out.println("a is a negative number");
//        }

//        int year = 1988;
//        if(year % 4 == 0 && year / 100 != 0){
//            System.out.println("leap year");
//        }else{
//            System.out.println("not a leap year");
//        }
//
//        int a = 2;
//        switch(a){
//            case 1:{
//                System.out.println(12);
//                break;}
//            case 2:{
//                System.out.println(9);
//                break;}
//            default:{
//                System.out.println("wrong value");
//                break;}
//        }
//        int num = 1;
//        while(num <=10){
//            System.out.println(num);
//            num++;
//        }
//        int num = 1;
//        int sum = 0;
//        while(num <= 100){
//            System.out.println(num);
//            sum += num;
//            num++;
//        }
//        int score = 333;
//        if(score >= 90 && score <= 100){
//            System.out.println("play time");
//        }else if(score >= 60 && score < 90){
//            System.out.println("one more lesson");
//        }else if(score >= 0 && score <60){
//            System.out.println("punishment");
//        }else{
//            System.out.println("wrong value");
//        }
//        int score = 66;
//        if(score >= 90){ System.out.println("优秀");
//        }else if(score >= 80 && score < 90){ System.out.println("良好");
//        }else if(score >= 70 && score < 80){ System.out.println("中等");
//        }else if(score >= 60 && score < 70){ System.out.println("及格");
//        }else if(score >= 0 && score < 60){ System.out.println("不及格");
//        }else{ System.out.println("错误数据");
//        }
//        int num = -0;
//        if(num > 0) {
//            System.out.println("positive");
//        }else if(num == 0) {
//            System.out.println("zero");
//        }else{
//            System.out.println("negative");
//        }
//        int num = 0;
//        if(num % 2 == 0) {
//            System.out.println("even");
//        }else{
//            System.out.println("odd");
//        }
//        Scanner scanner = new Scanner(System.in);
//        int year = scanner.nextInt();
//        if(year % 100 == 0) {
//            if(year % 400 == 0){
//                System.out.println("century leap year");
//            }else{
//                System.out.println("not a century leap year");
//            }
//
//        }else{
//            if(year % 4 == 0){
//                System.out.println("leap year");
//            }else{
//                System.out.println("not a leap year");
//            }
//        }
//        int x = 10;
//        int y = 12;
//        if(x == 10)
//            if(y == 11)
//                System.out.println("aaa");
//        else
//                System.out.println("bbb");
//        int a = 2;
//        switch(a){
//            case 1:{
//                System.out.println("yes");
//            break;}
//            case 2:{
//                System.out.println("yes or no");
//            break;}
//            default:{
//                System.out.println("should be no");
//            break;}
//        }
//        int num = 2;
//        while(num <= 10) {
//            System.out.println(num);
//            ++num;
//        }
//        int num = 1;
//        int sum = 0;
//        while(num <= 100){
//            System.out.println(sum + num);
//            num++;
//        }
//        System.out.println(sum);

//        int num = 1;
//        int sum = 0;
//        while(num <= 100) {
//            sum = sum + num;
//            num++;
//        }
////        System.out.println("1-100的总和是：" + sum);
//        int num = 1;
//        int sum = 0;
//        while(num <= 100) {
//            System.out.println("循环" + num);
//            sum = sum + num;
//            num++;
//        }
//        System.out.println("sum:" + sum);
//        int num1 = 1;
//        int num2 = 2;
//        int sumOdd = 0;
//        int sumEven = 0;
//        while(num1 <=100){
//            sumOdd = sumOdd + num1;
//            num1 += 2;
//        }
//        System.out.println("sumOdd:" + sumOdd);
//        while(num2 <= 100) {
//            sumEven = sumEven + num2;
//            num2 += 2;
//        }
//        System.out.println("sumEven:" + sumEven);
//        int a = 1;
//        int b = 1;
//        int c = 1;
//        int d = 1;
//        int e = 1;
//        int a1 = 1;
//        while(num <= 5){
//            sum = sum * num;
//            num += 1;
//        }
//        System.out.println("sum:" + sum);
//        int count = 1;
//        int sum = 0;
//        while (count <= 5) {
//            int proVar = 1;
//            int product = 1;
//            while (proVar <= count) {
//                product = product * proVar;
//                proVar++;
//            }
//            sum = sum + product;
//            count++;
//        }

//        int proVar = 1;
//        int product = 1;
//        while (proVar <= 5) {
//            product = product * proVar;
//            proVar++;
//        }
//        System.out.println(product);

//        int count = 1;
//        int sum = 0;
//        while (count <= 5) {
//            int proVar = 1;
//            int product = 1;
//            while (proVar <= count) {
//                product *= proVar;
//                proVar++;
//            }
//            sum += product;
//            count++;}
//         System.out.println(sum);

//        int count = 5;
//        int sum = 0;
//        while (count <= 5) {
//            int proVar = 1;
//            int product = 1;
//            while (proVar <= count) {
//                product *= proVar;
//                proVar++;
//            }
//            sum += product;
//            count++;
//        }
//        System.out.println(sum);

//        int count = 1;
//        int sum = 0;
//        while (count <= 5) {
//            int proVar = 1;
//            int product = 1;
//            while (proVar <= count) {
//                product *= proVar;
//                proVar++;
//            }
//            sum += product;
//            count++;
//        }
//        System.out.println(sum);
//        int count = 1;
//        int sum = 0;
//        while(count <= 5){
//            int proVar = 1;
//            int product = 1;
//            while(proVar <= count){
//                product = product * proVar;
//                proVar++;
//            }
//            sum = sum + product;
//            count++;
//        }
//        System.out.println(sum);
//        int num = 1;
//        while(num <= 100){
//            System.out.println("hello");
//            num = num + 1;
//        }
//        int num = 1;
//        while(num <= 10);{
//            System.out.println(num);
//            num++;
//        }
//        int num = 1;
//        while(num <= 10){
//            if(num % 3 == 0){
//                System.out.println("num equals to:" + num);
//                break;
//            }
//            num++;
//        }

//        int num = 100;
//        while(num <= 200) {
//            if(num % 3 == 0){
//                System.out.println("num equals to:" + num);
//                break;
//            }
//            num++;
//        }
//        int num = 1;
//        while(num <= 10){
//            if(num % 3 == 0){
//                System.out.println("num equals to:" + num);
//                continue;
//            }
//            num++;
//        }
//        int num = 1;
//        while(num <= 100){
//            if(num % 15 != 0){
//                continue;
//                num++;
//            }
//            System.out.println("num equals to: " + num);
//            num++;
//
//        }

//        int num = 100;
//        while(num <= 200) {
//            if(num % 3 != 0){
//                num++;// 这里的 ++ 不要忘记! 否则会死循环.
//                continue;
//            }
//            System.out.println("100-200中可以被3整除的数：" +num);
//            num++;
//        }
        for(int num = 0; num < 10; num++){
            System.out.println(num);
        }

























        // Press Ctrl+R or click the green arrow button in the gutter to run the code.

    }
}