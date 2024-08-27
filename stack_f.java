import java.util.Stack;

public class stack_f {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    System.out.println("My Stack is empty: " + st.empty());
    st.push(3);
    st.push(6);
    st.push(9);
    st.push(7);
    st.push(4);
    st.push(11);

    System.out.println(st.peek()); // follow lifo principle
    System.out.println(st); // use to print all value of stack
    st.pop(); // it removes element which come first in stack
    System.out.println(st);

    System.out.println("Size of Stack:" + st.size());

    while (st.size() > 3) {
      st.pop();

    }
    System.out.println(st);
    System.out.println("My Stack is empty: " + st.empty());
  }
}
