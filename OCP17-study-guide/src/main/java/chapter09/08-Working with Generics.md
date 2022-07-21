# Working with Generics

Why do we need generics? Imagine if we weren’t specifying the type of our lists and merely hoped the caller didn’t put
in something that we didn’t expect. The following does just that:

    public class WorkingWithGenericsExample1 {
        static void printNames(List list) {
            for (int i = 0; i < list.size(); i++) {
                String name = (String) list.get(i); // ClassCastException
                System.out.println(name);
            }
        }
    
        public static void main(String[] args) {
            List names = new ArrayList();
            names.add(new StringBuilder("Webby"));
             printNames(names);
        }
    }

Generics fix this by allowing you to write and use parameterized types. Since we specify that we want an ArrayList of
String objects, the compiler has enough information to prevent this problem in the first place.

    List<String> names = new ArrayList<String>(); 
    names.add(new StringBuilder("Webby")); // DOES NOT COMPILE

## Creating Generic Classes

You can introduce generics into your own classes. The syntax for introducing a generic is to declare a formal type
parameter in angle brackets. For example, the following class named Crate has a generic type variable declared after the
name of the class:

    public class Crate<T> {
        private T contents;
    
        public T lookInCrate() {
            return contents;
        }
    
        public void packCrate(T contents) {
            this.contents = contents;
        }
    }

**Naming Conventions for Generics**

A type parameter can be named anything you want.The convention is to use single upper- case letters to make it obvious
that they aren’t real class names.The following are common letters to use:

- E for an element
- K for a map key
- V for a map value
- N for a number
- T for a generic data type
- S,U,V, and so forth for multiple generic types

````
    Elephant elephant = new Elephant();
    Crate<Elephant> crateForElephant = new Crate<>(); 
    crateForElephant.packCrate(elephant);
    Elephant inNewHome = crateForElephant.lookInCrate();

    Robot joeBot = new Robot();
    Crate<Robot> robotCrate = new Crate<>(); 
    robotCrate.packCrate(joeBot);
````

Generic classes aren’t limited to having a single type parameter. This class shows two generic parameters:

    public class SizeLimitedCrate<T, U> {
        private T contents;
        private U sizeLimit;
    
        public SizeLimitedCrate(T contents, U sizeLimit) {
            this.contents = contents;
            this.sizeLimit = sizeLimit;
        }
    }

T represents the type that we are putting in the crate. U represents the unit that we are using to measure the maximum
size for the crate. To use this generic class, we can write the following:

    Elephant elephant = new Elephant();
    Integer numPounds = 15_000;
    SizeLimitedCrate<Elephant, Integer> c1 = new SizeLimitedCrate<>(elephant, numPounds);

## Understanding Type Erasure

Behind the scenes, the compiler replaces all references to T in Crate with Object. In other words, after the code
compiles, your generics are just Object types. The Crate class looks like the following at runtime:

    public class Crate {
        private Object contents; 
        
        public Object lookInCrate() {
            return contents; 
        }
        
        public void packCrate(Object contents) { 
            this.contents = contents;
        } 
    }

This means there is only one class file. There aren’t different copies for different parameterized types. (Some other
languages work that way.) This process of removing the generics syntax from your code is referred to as type erasure.
Type erasure allows your code to be compatible with older versions of Java that do not contain generics.

The compiler adds the relevant casts for your code to work with this type of erased class. For example, you type the
following:

    Robot r = crate.lookInCrate();

The compiler turns it into the following:

    Robot r = (Robot) crate.lookInCrate();

### Overloading a Generic Method

Only one of these two methods is allowed in a class because type erasure will reduce both sets of arguments to (List
input):

    public class LongTailAnimal {
        protected void chew(List<Object> input) {}
        protected void chew(List<Double> input) {} // DOES NOT COMPILE
    }

For the same reason, you also can’t overload a generic method from a parent class.

    public class Anteater extends LongTailAnimal {
        protected void chew(List<Double> input) {} // DOES NOT COMPILE
    }

Both of these examples fail to compile because of type erasure. In the compiled form, the generic type is dropped, and
it appears as an invalid overloaded method. Now, let’s look at a subclass:

    public class Anteater extends LongTailAnimal { 
        protected void chew(List<Object> input) {} 
        protected void chew(ArrayList<Double> input) {}
    }

The first chew() method compiles because it uses the same generic type in the overridden method as the one defined in
the parent class. The second chew() method compiles as well.

However, it is an overloaded method because one of the method arguments is a List and the other is an ArrayList. When
working with generic methods, it’s important to consider the underlying type.

### Returning Generic Types

When you’re working with overridden methods that return generics, the return values must be covariant. In terms of
generics, this means that the return type of the class or interface declared in the overriding method must be a subtype
of the class defined in the parent class. The generic parameter type must match its parent’s type exactly.

    public class Mammal {
        public List<CharSequence> play() {...}
        public CharSequence sleep() {...}
    }

    public class Monkey extends Mammal {
        public ArrayList<CharSequence> play() {...}
    }


    public class Goat extends Mammal {
        public List<String> play() { ... } // DOES NOT COMPILE 
        public String sleep() { ... }
    }

The Monkey class compiles because ArrayList is a subtype of List. The play() method in the Goat class does not compile,
though. For the return types to be covariant, the generic type parameter must match. Even though String is a subtype of
CharSequence, it does not exactly match the generic type defined in the Mammal class. Therefore, this is considered an
invalid override.

Notice that the sleep() method in the Goat class does compile since String is a subtype of CharSequence. This example
shows that covariance applies to the return type, just not the generic parameter type.

For the exam, it might be helpful for you to apply type erasure to questions involving generics to ensure that they
compile properly. Once you’ve determined which methods are overridden and which are being overloaded, work backward,
making sure the generic types match for overridden methods. And remember, generic methods cannot be overloaded by
changing the generic parameter type only.