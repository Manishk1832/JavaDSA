import java.util.Scanner;

import java.util.Scanner;
public class odd_Even {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        int remainder = num % 2;

        if (remainder == 0) {
            System.out.println("Even");
        } else {
            System.out.println("odd");
        }
    }
}
