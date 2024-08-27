/*java program to insert value  between stack */

import java.util.Stack;

public class stack2 {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(1);
    st.push(2);
    st.push(4);
    st.push(9);
    st.push(5);

    System.out.println(st);
    int idx = 2;
    int x = 3;
    Stack<Integer> temp = new Stack<>();

    // store stack value in other stack
    while (st.size() > idx) {
      temp.push(st.pop());

    }
    st.push(x); // insert value

    while (temp.size() > 0) {
      st.push(temp.pop());

    }
    System.out.println(st);

  }
}
