import java.util.*;

class Condition{
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);
        int btn= myObj.nextInt();
        switch (btn) {
            case 1: System.out.println("Hello");
                
                break;
            case 2: System.out.println("Namaste");
                break;
            case 3:  System.out.println("Ram Ram");
            break;
        
            default: System.out.println("Enter worng value");
                break;
        }
        myObj.close();
    }
 }

