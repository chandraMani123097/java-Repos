import java.util.ArrayList;
import java.util.Collections;

public class arr_list {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();

    // add elements in in ArrayList;
    list.add(0);
    list.add(2);
    list.add(4);
    list.add(8);

    System.out.println("Elements of ArraysList= " + list);

    // get elements;
    System.out.println(list.get(2));

    // add in between;
    list.add(1, 1);
    list.add(3, 3);
    list.add(3, 9);
    System.out.println(list);

    // set element
    list.set(5, 5);
    System.out.println(list);

    // remove element;
    list.remove(5);
    System.out.println(list);

    // to get size;
    int size = list.size();
    System.out.println(size);

    // sorting
    Collections.sort(list);
    System.out.println(list);

  }

}
