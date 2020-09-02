package myArraysPack;

public class Array {

   public static double[] reverse(double[] list) {
      double[] result = new double[list.length];

      for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
         result[j] = list[i]; // reversing the array
      }

   return result;
}


   public static void main(String[] args) {
      double[] myList = {1.9, 2.9, 3.4, 3.5};

      // Print all the array elements
      System.out.println("Processing array using for loop");
      for (int i = 0; i < myList.length; i++) {
         System.out.println(myList[i] + " ");
      }

      System.out.println("Processing array using the foreach Loops");

      for (double i: myList){
         System.out.println(i);
      }
     
      // Summing all elements
      double total = 0;
      for (int i = 0; i < myList.length; i++) {
         total += myList[i];
      }
      System.out.println("Total is " + total);
      
      // Finding the largest element
      double max = myList[0];
      for (int i = 1; i < myList.length; i++) {
         if (myList[i] > max) max = myList[i];
      }
      System.out.println("Max is " + max);  


      //Array obj = new Array();
      System.out.println("This is using foreach loop, and reverse method");
      //passing myList into reverse function 
      for (double i: reverse(myList)){
         System.out.print(i);
      }
      System.out.println();



   }
}