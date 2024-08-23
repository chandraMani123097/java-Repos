/**
 * OPPS2
 */
abstract class Animal {
  abstract void walk();

}

class Horse extends Animal {
  public void walk() {
    System.out.println("walk on four legs");
  }
}

class Chicken extends Animal {
  public void walk() {
    System.out.println("walk on two legs");
  }
}

public class OPPS2 {
  public static void main(String[] args) {
    Horse horse = new Horse();
    horse.walk();

    Chicken chicken = new Chicken();
    chicken.walk();
  }

}