package myIteratorPack;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorObject {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(12);
    numbers.add(8);
    numbers.add(2);
    numbers.add(23);
    Iterator<Integer> it = numbers.iterator();
    while(it.hasNext()) {
      Integer i = it.next();
      if(i < 10) {
        it.remove();
      }
    }
    System.out.println(numbers);
  }
}


// The purpose is to use the object and loop through any collections




/*
Iterator

  forEachRemaining(Consumer<? super E> action)  
  // Performs the given action for each remaining element 
  // until all elements have been processed or 
  // the action throws an exception.

  hasNext()   
  // Returns true if the iteration has more elements.

  next()      
  // Returns the next element in the iteration.

  remove()    
  // Removes from the underlying collection the 
  // last element returned by this iterator (optional operation).*/