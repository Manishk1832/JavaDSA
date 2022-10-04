public class Pattern2 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int numst = 1;
        while (row<=n){

            int cst = 0;
            while (cst<numst){
                System.out.print("* ");
                cst++;
            }





            row++;
            System.out.println();
            numst++;
        }
    }
}
