//insert value in stack using recursion

import java.util.Stack;

public class stack3 {
  public static void insertEl(Stack<Integer> st, int value) {
    if (st.size() > 1) {
      st.push(value);
      System.out.println(st);
      return;
    }

    // int x = st.pop();
    // insertEl(st, value);

  }

  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(1);
    st.push(2);
    st.push(4);
    st.push(9);
    st.push(5);
    int value = 9;
    insertEl(st, value);
  }
}
