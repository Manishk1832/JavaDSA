public class Pattern21 {

    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int nst = 1;
        int nsp = 1;
        while (row<=n){
            int cst1 =0;
            while (cst1<nst){
                System.out.print("*");
                cst1++;
            }
            int csp = 0;
            while (csp<nsp){
                System.out.println(" ");
                csp++;
            }
            int cst2 =0;
            if(row==n){
                cst2 =1;
            }
            while (cst2<nst){
                System.out.print("* ");
                cst2++;
            }
            nsp  = nsp-2;
            row++;
            nst++;
            System.out.println();
        }
    }
}
