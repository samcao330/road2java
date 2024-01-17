public class Code001 {
    //    public static void main(String[] args) {
//        int sum = 0;
//        int product = 1;
//        for(int num = 1; num <= 5; num++){
//            for(int proVar = 1; proVar <= 5; proVar++){
//                product = product * proVar;
//            }
//            sum = sum + product;
//        }
//        System.out.println(sum);
//    }
//}
//    public static void main(String[] args) {
//        int sum = 0;
//        int product = 1;
//        for(int num =1; num <= 5; num++){
//            product = product * num;
//            sum = sum + product;
//        }
//        System.out.println(sum);
//    }
//}
//    public static void main(String[] args) {
//        int num = 1;
//        int sum = 0;
//        while(num <= 5){
//            int proVar = 1;
//            int product = 1;
//            while(proVar <= num){
//                product = product * proVar;
//                proVar++;
//            }
//            sum = sum + product;
//            num++;
//        }
//        System.out.println(sum);
//    }
//}
//    public static void main(String[] args) {
//        int num = 1;
//        while (num <= 100) {
//            if (num % 15 != 0) {
//                continue;
//            }
//            System.out.println("num equals to: " + num);
//            num++;
//        }
//    }
//}

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0 && i % 5 != 0 ) {
                continue; //当i = 3时，if里第一个表达式为false，则直接短路运行，因为结果为false
                //所以不继续运行continue
            }
            System.out.println(i);
        }
    }
}
