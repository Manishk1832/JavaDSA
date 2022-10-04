public class HCF {
    public static void main(String[] args) {
        int a = 6;
        int b = 15;
        int divisor = a;
        int dividend  = b;

        while (divisor !=0){
            int rem  = dividend%divisor;

            System.out.println("Printing remainder "+ rem);
            dividend = divisor;
            System.out.println("Printing dividend "+ dividend);
            divisor = rem;
            System.out.println("Printing divisor "+ divisor);

        }
        System.out.println(dividend);
    }
}
