public class replaceThemAll {
    public static void main(String[] args) {
        int num = 7890;
        int mult = 1;
        int ans = 0;
        while(num > 0){

            int digit  = num%10;

            if(digit==0){
                digit = 5;
            }
            //System.out.println(digit + " " + mult);
            ans = ans + digit*mult;
            mult = mult*10;
            num = num/10;



    }
        System.out.println(ans);


    }
}
