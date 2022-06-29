# Creating Immutable Objects

An immutable object is one that cannot change state after it is created. The immutable objects pattern is an
object-oriented design pattern in which an object cannot be modified after it is created.

Immutable objects are helpful when writing secure code because you don’t have to worry about the values changing. They
also simplify code when dealing with concurrency since immutable objects can be easily shared between multiple threads.

## Declaring an Immutable Class

- Mark the class as final or make all of the constructors private.
- Mark all the instance variables private and final.
- Don’t define any setter methods.
- Don’t allow referenced mutable objects to be modified.
- Use a constructor to set all properties of the object, making a copy if needed.

The first rule prevents anyone from creating a mutable subclass. The second and third rules ensure that callers don’t
make changes to instance variables and are the hallmarks of good encapsulation.
The fourth rule for creating immutable objects is subtle.

    // Not an immutable object declaration
    public final class Animal1 {
    
        private final ArrayList<String> favoriteFoods;
    
        public Animal1() {
            this.favoriteFoods = new ArrayList<String>();
            this.favoriteFoods.add("Apples");
        }
    
        public List<String> getFavoriteFoods() {
            return favoriteFoods;
        }
    }

We carefully followed the first three rules, but unfortunately, a malicious caller could still modify our data:

    var zebra = new Animal1();
    System.out.println(zebra.getFavoriteFoods()); // [Apples]

    zebra.getFavoriteFoods().clear();
    zebra.getFavoriteFoods().add("Chocolate Chip Cookies");
    System.out.println(zebra.getFavoriteFoods()); // [Chocolate Chip Cookies]

If we don’t have a getter for the favoriteFoods object, how do callers access it? Simple: by using delegate or wrapper
methods to read the data.

    // An immutable object declaration
    public class Animal2 {
    
        private final List<String> favoriteFoods;
    
        public Animal2() {
            this.favoriteFoods = new ArrayList<>();
            this.favoriteFoods.add("Apples");
        }
    
        public int getFavoriteFoodsCount() {
            return favoriteFoods.size();
        }
    
        public String getFavoriteFoodsItem(int index) {
            return favoriteFoods.get(index);
        }

    }

**Copy on Read Accessor Methods**

Besides delegating access to any private mutable objects, another approach is to make a copy of the mutable object any
time it is requested.

    public ArrayList<String> getFavoriteFoods() {
        return new ArrayList<String>(this.favoriteFoods);
    }

Of course, changes in the copy won’t be reflected in the original, but at least the original is protected from external
changes.This can be an expensive operation if called frequently by the caller.

## Performing a Defensive Copy

So, what’s this about the fifth and final rule for creating immutable objects? In designing our class, let’s say we want
a rule that the data for favoriteFoods is provided by the caller and that it always contains at least one element. This
rule is often called an invariant; it is true any time we have an instance of the object.

// // Not an immutable object declaration
public class Animal4 {

    private final List<String> favoriteFoods;

        public Animal4(List<String> favoriteFoods) {
            if (favoriteFoods == null || favoriteFoods.size() == 0)
                throw new RuntimeException("favoriteFoods is required");
            this.favoriteFoods = favoriteFoods;
        }
    
        public int getFavoriteFoodsCount() {
            return favoriteFoods.size();
        }
    
        public String getFavoriteFoodsItem(int index) {
            return favoriteFoods.get(index);
        }
    }

an exception if it is not provided. So is this immutable? Not quite! A malicious caller might be tricky and keep their
own secret reference to our favoriteFoods object, which they can modify directly.

    var favorites = new ArrayList<String>();
    favorites.add("Apples");

    var zebra = new Animal4(favorites);  // Caller still has access to favorites
    System.out.println(zebra.getFavoriteFoodsItem(0)); // [Apples]

    favorites.clear();
    favorites.add("Chocolate Chip Cookies");
    System.out.println(zebra.getFavoriteFoodsItem(0)); // [Chocolate Chip Cookies]

It seems like Animal is not immutable anymore, since its contents can change after it is created. The solution is to
make a copy of the list object containing the same elements.

        public Animal5(List<String> favoriteFoods) {
        if (favoriteFoods == null || favoriteFoods.size() == 0)
            throw new RuntimeException("favoriteFoods is required");
        //this.favoriteFoods = favoriteFoods;
        this.favoriteFoods = new ArrayList<String>(favoriteFoods);

    }

The copy operation is called a defensive copy because the copy is being made in case other code does something
unexpected. It’s the same idea as defensive driving: prevent a problem before it exists.