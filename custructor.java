class Student {
  Student() {
    System.out.println("Cunstructor created");
  }
}

class Student2 {
  String name;
  int age;

  public void printInfo() {
    System.out.println(this.name + "\n" + this.age);
  }

  Student2(String name, int age) {
    this.name = name;
    this.age = age;
  }
}

public class custructor {
  public static void main(String[] args) {
    Student s1 = new Student();

    Student2 s2 = new Student2("Abhi", 21);
    s2.printInfo();

  }
}
