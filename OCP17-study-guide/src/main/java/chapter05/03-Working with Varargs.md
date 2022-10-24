# Working with Varargs

## Creating Methods with Varargs

There are a number of important rules for creating a method with a varargs parameter.

- A method can have at most one varargs parameter.
- If a method contains a varargs parameter, it must be the last parameter in the list.

  public class VisitAttractions {

        public void walk1(int... steps) { }
    
        public void walk2(int start, int... steps) { }
    
        // public void walk3(int... steps, int start) {} // DOES NOT COMPILE 
    
        // public void walk4(int... start, int... steps) {} // DOES NOT COMPILE
  }

## Calling Methods with Varargs

When calling a method with a varargs parameter, you have a choice. You can pass in an array, or you can list the
elements of the array and let Java create it for you.

    // Pass an array
    int[] data = new int[] {1, 2, 3}; 
    walk1(data);

    // Pass a list of values 
    walk1(1,2,3);

You can even omit the varargs values in the method call, and Java will create an array of length zero for you.

    walk1();

## Accessing Elements of a Vararg

Accessing a varargs parameter is just like accessing an array.

    public static void main(String[] args) {
        run(11, 77); // 77
    }

    public static void run(int... steps) {
        System.out.print(steps[1]);
    }

## Using Varargs with Other Method Parameters

Can you figure out why each method call outputs what it does?

    public class DogWalker {

      public static void walkDog(int start, int... steps) {
          System.out.println("Start : " + start + " Steps : " + steps.length);
      }
  
      public static void main(String[] args) {
          walkDog(1);
          walkDog(1, 2);
          walkDog(1, 2, 3);
          walkDog(1, new int[]{4, 5});
      }
    }

It just passes on the null array object to walkDog(). Then the walkDog() method throws an exception because it tries to
determine the length of null.

    walkDog(1, null); // Triggers NullPointerException in walkDog()

Since null isn’t an int, Java treats it as an array reference that happens to be null. It just passes on the null array
object to walkDog(). Then the walkDog() method throws an exception because it tries to determine the length of null.

