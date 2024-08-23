/*this code is to find the length of elements or nodes in linkedList  */

public class ls_length {
  public static void LinkedList(Node head) {
    int count = 0;
    Node temp = head;
    while (head != null) {
      System.out.println(temp.data);
      temp = temp.next;
      count++;
      System.out.println("length of ls is = " + count);

    }

  }

  // public static int DisplayLength(Node head){

  // }

  public static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;

    }

  }

  public static void main(String[] args) {
    Node a = new Node(3);
    Node b = new Node(6);
    Node c = new Node(5);
    Node d = new Node(4);
    Node e = new Node(9);
    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    e.next = null;

    LinkedList(a);
  }
}
