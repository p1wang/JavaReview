package myLoopsPack;

/*
   for(declaration : expression) {
      // Statements
   }


   while(Boolean_expression) {
   // Statements
}


   do {
      // Statements
   }while(Boolean_expression);
*/


public class Loops {

   public static void main(String args[]) {
      int [] numbers = {10, 20, 30, 40, 50};

      for(int x : numbers ) {
         System.out.print( x );
         System.out.print(",");
      }
      System.out.print("\n");
      String [] names = {"James", "Larry", "Tom", "Lacy"};

      for( String name : names ) {
         System.out.print( name );
         System.out.print(",");
      }
   }
}