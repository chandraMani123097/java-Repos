import java.util.Stack;

public class displayS {
  public static void disRec(Stack<Integer> st) {
    if (st.size() == 0) {
      return;
    }
    int x = st.pop();
    System.out.print(x + " ");
    disRec(st);
    st.push(x);
  }

  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(1);
    st.push(2);
    st.push(4);
    st.push(9);
    st.push(5);
    System.out.println("given Stack is: " + st);
    System.out.println("Reverse stack by Recursion");
    disRec(st);
  }

}
