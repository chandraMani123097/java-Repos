import java.util.Scanner;

public class permutation {
   public static int countPaths(int i ,int j,int m , int n){
    if (i==m||j==n) {
        return 0;
    }

    if(i==m-1 && j==n-1){
        return 1;
    }
    int rightPath=countPaths(i, j+1, m, n);
    int downPath= countPaths(i+1, j, m, n);
    return rightPath+downPath;
            
   }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of row and column");
        int m=sc.nextInt();
        int n=sc.nextInt();
        // int  m=5, n=3;
        int totalPath=countPaths(0, 0, m, n);
        System.out.println(totalPath);
      
        sc.close();
    }
}