import java.util.Scanner;

/**
 * hanoi
 */
public class hanoi {

    public static void towerHanoi(int n, String source, String helper, String destinantion ) {
        if(n==1){
            System.out.println("transfer disk" + n + " from "+ source + " to " + destinantion);
            return;
        }

        towerHanoi(n-1, source, destinantion, helper);
        System.out.println("transfer disk" + n + "from" + source + " to " +destinantion);
        towerHanoi(n-1, helper, source, destinantion);
        
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter number of Disk: ");
        int n=sc.nextInt();

        towerHanoi(n,  " S ", " H ", " D ");

        sc.close();
    }
}