public class Pattern04 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int numsp = n-1;
        int  numst = 1;
        while (row<=n){
            int csp =0;
            while (csp<numsp){
                System.out.print(" ");
                csp++;
            }
            int cst = 0;
            while (cst < numst) {
                System.out.print(" *");
                cst++;
            }
            numsp--;
            numst++;
            row++;
            System.out.println();
        }

    }
}
