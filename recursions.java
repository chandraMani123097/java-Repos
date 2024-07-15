public class recursions {
    public static void printNum(int n) {
        if (n==0){
            return;
        } 
       
        System.out.println(n);
        printNum(n-1);
            
        
        
    }

    public static void printNum1(int num) {
        if(num==6){
            return;
        }

        System.out.println(num);
        printNum1(num+1);
        
    }
      public static void main(String[] args) {
        int n=5;
        printNum(n);
          System.out.println();
        int num=1;
        printNum1(num);
        
      }
}
