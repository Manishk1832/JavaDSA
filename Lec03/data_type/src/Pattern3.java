public class Pattern3 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        while(row<=n){
            int col = 1;
            while (col<=n-row+1){
                System.out.print("*");
                col = col+1;
            }
            System.out.println();
            row = row+1;
        }

    }
}
