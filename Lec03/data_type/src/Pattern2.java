public class Pattern2 {
    public static void main(String[] args) {
        int n = 5;
        int  row = 1;
        while(row<=n){
            int col = 1;
            while(col<row){
                System.out.print("*");
                col = col+1;
            }
            System.out.println();
            row = row+1;

        }
    }
}
