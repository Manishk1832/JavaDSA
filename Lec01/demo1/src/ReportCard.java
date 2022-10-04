import java.util.Scanner;

public class ReportCard {
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);

        int marks = scn.nextInt();
        if(50<marks && marks<60){
            System.out.println("Grade A");
        } else if (marks>=80) {
            System.out.println("Grade B");
        }
        else if (marks>=70) {
            System.out.println("Grade C");
        }
        else if (marks>=60) {
            System.out.println("Grade D");
        }
        else if (marks>=50) {
            System.out.println("Grade E");
        }
        else   {
            System.out.println("Fail");
        }

    }
}
