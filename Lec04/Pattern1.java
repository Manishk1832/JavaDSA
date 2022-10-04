public class Pattern1 {
    public static void main(String[] args) {
        int n = 5;
        int numst = n;
        int row = 1;
        while(row<=n){
            int cst = 0;
            while (cst <numst){
                System.out.print("*");
                cst++;
            }
            row++;
            System.out.println();

        }

    }
}
