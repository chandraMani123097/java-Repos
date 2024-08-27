import java.util.Scanner;
import java.util.Stack;

public class copyS {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Stack<Integer> st = new Stack<>();
    System.out.print("Enter number you want to enter in stack: ");
    int n = sc.nextInt();
    System.out.print("Enter Elements in Stack");

    for (int i = 1; i <= n; i++) {
      int x = sc.nextInt();
      st.push(x);
      System.out.print(" ");
    }

    System.out.println(st);

    sc.close();
  }

}
