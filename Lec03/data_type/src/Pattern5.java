public class Pattern5 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        while (row<=n){
            int space = n - row;
            while(space!=0){
                System.out.print(" ");
                space = space - 1;
            }
            int col =1;
            while(col<=row-n+1) {
                System.out.print("*");
                col = col+1;
            }
            System.out.println();
            row = row+1;

        }
    }
}
