public class prime_number {
    public static void main(String[] args) {
        int n = 6;
        int div = 1;

        int numFact = 0;

        while(div<=n){

            int rem = n%div;
            if(rem==0){
                System.out.println("nacho");
                numFact = numFact+1;
            }
            System.out.println(div + " , " + rem);

            div++;

        }
        if(numFact==2){
            System.out.println("Prime");
        }
        else{
            System.out.println("not a prime");
        }
    }
}
