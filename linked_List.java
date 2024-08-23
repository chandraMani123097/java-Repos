public class linked_List {
  public static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }

  }

  public static void main(String[] args) {
    Node a = new Node(3);
    // System.out.println(a.data + "Add " + a);
    Node b = new Node(6);
    Node c = new Node(5);
    Node d = new Node(4);
    Node e = new Node(9);
    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    e.next = null;
    System.out.println(b.next.data); // to get data c
    System.out.println(a.next.next.next.data); // get d data

    System.out.println("\n \n");
    // Node temp = a;
    // for (int i = 1; i <= 5; i++) {
    // System.out.print(temp.data + " ");
    // temp = temp.next;
    // }

    // when we dont have stop condition in linkedList
    Node temp = a;
    while (temp != null) {
      System.out.print(temp.data);
      temp = temp.next;

    }

  }
}
