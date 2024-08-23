class Student {
  String name;
  int age;

  public void printInfo(String name) {
    System.out.println(name);
  }

  public void printInfo(int age) {
    System.out.println(age);
  }

  public void printInfo(String name, int age) {
    System.out.println(name + " " + age);
  }
}

public class funcOverloading {
  public static void main(String[] args) {
    Student S1 = new Student();
    S1.name = "Abhi";
    S1.age = 32;
    S1.printInfo(S1.age);

  }
}
