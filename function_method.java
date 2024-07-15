import java.util.Scanner;

public class function_method {
    public static int calculateSum(int a,int b){
        int sum=a+b;
        return sum;
    }

    public static int calculateProduct(int a,int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your two numbers:\t");
        int a = sc.nextInt();
        int b=sc.nextInt();
        int sum =calculateSum(a, b);
        System.out.println("Sum of two number is:"+sum);
        System.out.println("Product of two number is:"+calculateProduct(a, b));
        
        sc.close();
    }
}
