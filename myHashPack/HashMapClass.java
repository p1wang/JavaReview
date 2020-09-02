package myHashPack;
// Import the HashMap class
import java.util.HashMap;

public class HashMapClass {
  public static void main(String[] args) {
    // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities);
  }
}



/*// Basically like a dictionary in Python3


HashMap     // Like a dictionary

    .get()
    .remove()
    .clear()
    .size()
    .keySet()
    .values()

HashSet     // Like a set, unique item
    .add()
    .contains()
    .remove()
    .clear()
    .size()
    

ArrayList  

    .add()
    .get()
    .set()
    .remove()
    .clear()
    .size()
    .sort()

LinkedList

    .addFirst()
    .addLast()
    .removeFirst()
    .removeLast()
    .getFirst()
    .getLast()*/




