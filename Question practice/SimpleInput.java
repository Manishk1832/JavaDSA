import java.util.Scanner;

public class SimpleInput {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int i = 0;
            while(i<n){
                if(n>0){
                    System.out.println(n);
                }
                i++;
            }
        }

}
