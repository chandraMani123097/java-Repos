import java.util.Scanner;

public class strings {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // String name="Chandramani";
        // System.out.println(name);
        // System.out.println("Enter your name:");
        // String name=sc.nextLine();
        // System.out.println("your name is "+name);
      
        // String name="chandramani";
        // String lastName="Singh";
        // String fullName=name+" "+lastName;
        // System.out.println(fullName);
        // System.out.println(fullName.length());

        // // System.out.println("Enter char to find in string");
        // // char x=sc.next().charAt(0);
        // // for(int i=0;i<fullName.length();i++){
        // //     System.out.println(fullName.charAt(i));
        // // }
        //     System.out.println("Enter  your first string");
        // String name1=sc.nextLine();
        // System.out.println("Enter  your second string");
        // String name2=sc.nextLine();
        // if(name1.compareTo(name2)==0){
        //       System.out.println("Strings are equal");
        // } else{
        //     System.out.println("Strings are not equal");
        // }

        // String sentence=name1;
        // String subName=sentence.substring(0,7);
        // System.out.println(subName);


        //String-builder
        StringBuilder sb=new StringBuilder("Tiger");
        System.out.println(sb);


        System.out.println(sb.charAt(0)+"\n");


        //set char at index 0
        sb.setCharAt(0, 'l');
        sb.insert(5,"  lions" );
        System.out.println( sb );

        sb.delete(5,13);
        System.out.println(sb);

        System.out.println( sb.length());



        
        
        

        sc.close();
       
    }
}
