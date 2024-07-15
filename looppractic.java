import java.util.Scanner;
public class looppractic {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        System.out.println("enter any number");
        int num = sc.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            sum= sum+i;
        }
        System.out.println("Sum of n number=");
        System.out.println(sum);
        

        sc.close();
    }
}
