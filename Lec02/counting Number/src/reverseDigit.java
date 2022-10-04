public class reverseDigit {
    public static void main(String[] args) {
        int num = 12345;
       int ans = 0;
        while(num!=0){
            int digit = num %10;
            ans = ans* 10 + digit;
            System.out.println("Printing ans " + ans);
            //System.out.print(digit);
            num = num/10;
            System.out.println("Printing num "+num);

        }
        System.out.println(ans);
    }
}
