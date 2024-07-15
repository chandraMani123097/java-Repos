public class sum_of_num {
        public static void printSum(int i,int n, int sum){
            if(i==n){
                sum+=i;
                System.out.print(sum);
                return;
            }

            sum+=i;
            printSum(i+1, n, sum);
            System.out.println(i);
        }

    public static void main(String[] args) {

        printSum(0, 10, 0);
        
    }
    
}
