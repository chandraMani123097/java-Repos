
public class ls_f {
  public static void DisplayLs(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data);
      temp = temp.next;
    }
  }

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

    DisplayLs(a);

  }

}
