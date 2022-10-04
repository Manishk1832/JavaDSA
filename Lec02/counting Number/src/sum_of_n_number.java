import java.util.Scanner;

public class sum_of_n_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int i = 1;
        int  sum = 0;
        while (i <= n) {
            System.out.println(i);


            sum = sum + i;
            i = i + 1;


        }
        System.out.println("sum , " + sum);
    }


}
