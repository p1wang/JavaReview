package myArrayListPack;
import java.util.ArrayList;

public class ArrayListClass {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
    System.out.println("This is index 0: " + cars.get(0));
    System.out.println("This is index 1: " + cars.get(1));
    System.out.println("This is index 2: " + cars.get(2));
    System.out.println("This is index 3: " + cars.get(3));
  }
}