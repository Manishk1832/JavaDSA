import java.util.Scanner;

public class count_number {
    public static void main(String[] args) {

        System.out.println("Enter the number : ");

        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i<=n){
            System.out.println(i);
            i = i+1;
            
        }
    }
}
