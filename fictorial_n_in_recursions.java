public class fictorial_n_in_recursions {
    public static int printFictorial(int n) {
        if(n==1||n==0){

           
           
            return 1;
        }
        int n_1=printFictorial(n-1);

       int fact_n=n*n_1;
       return fact_n;
        
    }
    public static void main(String[] args) {
        int n=6;

       int ans= printFictorial(n);
       System.out.println(ans);
         
    }
}
