package myNestedClassPack;

class OuterClass {
	public int x = 10;

  class InnerClass {
    int y = 5;
  }
}


public class NestedClass {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();

    System.out.println(myInner.y + myOuter.x);
  }
}


// Create an object of the class to use properties of the that class

// Without creating an object, to access the properties in another class, the properties
// have to be static, the class also has to be inherited 


// Without object or inheritance/static, the variable can be accessed if its public







//  Private Inner Class
//  Static Inner Class
//  Access Outer Class From Inner Class


//  https://www.w3schools.com/java/java_inner_classes.asp
