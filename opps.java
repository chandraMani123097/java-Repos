class Car {
  String BrandName;
  String carName;
  int carModel;
  int price;
  String money = "Rupees only";

  public void printCar() {
    System.out.println(this.carName);
    System.out.println("Model of this Car = " + this.carModel + " price is " + this.price + this.money);
  }

}

public class opps {

  public static void main(String[] args) {
    Car Car1 = new Car();
    Car1.carName = "BMW";
    Car1.carModel = 2015;
    Car1.price = 5500000;
    Car1.printCar();

    Car Car2 = new Car();
    Car2.carName = "Range Rover";
    Car2.carModel = 2016;
    Car2.price = 9000000;
    Car2.printCar();

  }
}
