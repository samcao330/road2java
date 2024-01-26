public class Code002 {
//    public static void main(String[] args) {
//        int num = 1;
//        do {
//            System.out.println(num);
//            num++;
//        } while (num <= 10);
//    }
//}
        public static void main(String[] args) {
        int sum = 0;
        for(int num = 1; num <= 5; num++){
            int product = 1;
            for(int proVar = 1; proVar <= num; proVar++){
                product = product * proVar;
            }
            sum = sum + product;
        }
        System.out.println(sum);
    }
}
