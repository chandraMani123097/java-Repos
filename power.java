public class power {
    public static int calPower(int x, int n) {
       if(x==0){
        return 0;
       }

       if(n==0){
        return 1;
       }
        
        int xpower1= calPower(x, n-1);
        int xpower2= x*xpower1;
        return xpower2;

    }

    public static void main(String[] args) {
        
        int x=2, n=6;

       int ans= calPower(x, n);
       System.out.println(ans) ;

    }
}
