class Country {
  static String countryName;
  static String Nationality;

}

class City extends Country {
  String name;
  String city;

  public void printDetails() {
    System.out.println(name + "\nCity" + city + "\nNationlity" + Nationality + "\n Country:" + countryName);
  }

}

public class opps3 {
  public static void main(String[] args) {
    Country.countryName = "India";
    Country.Nationality = "Indian";

    City cityC = new City();
    cityC.name = "Golu";
    cityC.city = "Noida";
    cityC.printDetails();
  }

}
