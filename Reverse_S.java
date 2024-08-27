/*this code is for Reverse and copy Stack elements */

import java.util.Stack;

public class Reverse_S {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> rt = new Stack<>();
    Stack<Integer> rrt = new Stack<>();
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    System.out.println(st);
    while (st.size() > 0) {
      int x = st.peek();
      rt.push(x);
      st.pop();

    }
    System.out.println(rt);

    System.out.println("copying... element in other  stack");
    while (rt.size() > 0) {
      rrt.push(rt.pop());

    }
    System.out.println(rrt);
    while (rrt.size() > 0) {
      st.push(rrt.pop());

    }
    System.out.println("Reversed stack:\n" + st);
  }
}

// reverse and store elements in same stack;
