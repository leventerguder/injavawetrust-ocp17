# Passing Data among Methods

Java is a "pass-by-value" language. This means that a copy of the variable is made and the method receives that copy.

    public static void main(String[] args) {
        int num = 4;
        newNumber(num);
        System.out.print(num); // 4
    }

    public static void newNumber(int num) {
        num = 8;
    }

## Passing Objects

Let’s try an example with a reference type.

    public class Dog {

        public static void main(String[] args) {
            String name = "Webby";
            speak(name);
            System.out.print(name);
        }
    
        public static void speak(String name) {
            name = "Georgette";
        }
    }

The correct answer is Webby. Just as in the primitive example, the variable assignment is only to the method parameter
and doesn’t affect the caller.

As an example, here is code that calls a method on the StringBuilder passed into the method:

    public static void main(String[] args) {
        var name = new StringBuilder("Webby");
        speak(name);
        System.out.print(name); // WebbyGeorgette
    }

    public static void speak(StringBuilder s) {
        s.append("Georgette");
    }

**Pass-by-Value vs. Pass-by-Reference**

Different languages handle parameters in different ways. Pass-by-value is used by many languages, including Java. In
this example, the swap() method does not change the original values. It only changes a and b within the method.

    public static void main(String[] args) {
        int original1 = 1;
        int original2 = 2;
        swap(original1, original2);
        System.out.println(original1); // 1
        System.out.println(original2); // 2
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

## Returning Objects

Let’s try an example. Pay attention to the return types.

    public class ZooTickets {

        public static void main(String[] args) {
            int tickets = 2;
            String guests = "abc";
            addTickets(tickets);
            guests = addGuests(guests);
            System.out.println(tickets + guests); //2abcd
        }
    
    
        public static int addTickets(int tickets) {
            tickets++;
            return tickets;
        }
    
        public static String addGuests(String guests) {
            guests += "d";
            return guests;
        }
    }

## Autoboxing and Unboxing Variables

Java supports some helpful features around passing primitive and wrapper data types, such as int and Integer.

    int quack = 5;
    Integer quackquack = Integer.valueOf(quack); // Convert int to Integer
    int quackquackquack = quackquack.intValue(); // Convert Integer to int

Autoboxing is the process of converting a primitive into its equivalent wrapper class, while unboxing is the process of
converting a wrapper class into its equivalent primitive.

    int quack = 5;
    Integer quackquack = quack; // Autoboxing
    int quackquackquack = quackquack; // Unboxing

Autoboxing applies to all primitives and their associated wrapper types, such as the following:

    Short tail = 8; // Autoboxing
    Character p = Character.valueOf('p'); 
    char paw = p; // Unboxing
    Boolean nose = true; // Autoboxing
    Integer e = Integer.valueOf(9);
    long ears = e; // Unboxing, then implicit casting

**Limits of Autoboxing and Numeric Promotion**

While Java will implicitly cast a smaller primitive to a larger type, as well as autobox, it will not do both at the
same time. Do you see why the following does not compile?
    
    Long badGorilla = 8; // DOES NOT COMPILE

Java will automatically cast or autobox the int value to long or Integer, respectively.
Neither of these types can be assigned to a Long reference variable, though, so the code does not compile.

    Character elephant = null;
    char badElephant = elephant; // NullPointerException

Java will cast or autobox the value automatically, but not both at the same time.

    public class Gorilla {
        public void rest(Long x) {
            System.out.print("long"); 
        }
        public static void main(String[] args) { 
            var g = new Gorilla();
            g.rest(8); // DOES NOT COMPILE
        } 
    }
