public class Jan16 {
    public static void main(String[] args) {
        int num = 1;
        while(num <= 100){
            if(num % 15 != 0){
                num++;
                continue;
            }
            System.out.println(num);
            num++;
        }
    }
}
