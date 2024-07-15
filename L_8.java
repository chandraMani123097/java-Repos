import java.util.Scanner;

public class L_8 {
    public static void main(String[] args) {
       
        // int[] marks=new int[4];
        // marks[0]=99;
        // marks[1]=56;
        // marks[2]=88;
        // marks[3]=57;
        // // System.out.println(marks[0]);
        // // System.out.println(marks[1]);
        // // System.out.println(marks[2]);
        // // System.out.println(marks[3]);

        // for(int  i=0;i<4;i++){
        //     System.out.println(marks[i]);

        // }
        Scanner sc=new Scanner(System.in);
        System.out.println("Select size of an array");
        int size=sc.nextInt();
        int[] arr1=new int[size];

        for(int i=0;i<size;i++){
            System.out.print("Enter elements in array at index:\n");
            arr1[i]=sc.nextInt();
        }
           
        
        for(int i=0;i<size;i++){
            System.out.println(arr1[i]);
        }

        

      sc.close();
    

        

    }
    
}
