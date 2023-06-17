# Working with Enums

In programming, it is common to have a type that can only have a finite set of values, such as days of the week, seasons
of the year, primary colors, and so on. An enumeration, or enum for short, is like a fixed set of constants.

## Creating Simple Enums

To create an enum, declare a type with the enum keyword, a name, and a list of values.

![](working_with_enums/defining-a-simple-enum.png)

We refer to an enum that only contains a list of values as a simple enum. When working with simple enums, the semicolon
at the end of the list is optional.

num values are considered constants and are commonly written using snake case. For example, an enum declaring a list of
ice cream flavors might include values like VANILLA, ROCKY_ROAD, MINT_CHOCOLATE_CHIP.

Using an enum is super easy.

    public enum Season {
        WINTER, SPRING, SUMMER, FAIL;
    }


    var s = Season.SUMMER; 
    System.out.println(Season.SUMMER); // SUMMER 
    System.out.println(s == Season.SUMMER); // true

As you can see, enums print the name of the enum when toString() is called. They can be compared using == because they
are like static final constants. In other words, you can use equals() or == to compare enums, since each enum value is
initialized only once in the Java Virtual Machine (JVM).

One thing that you can’t do is extend an enum.

    public enum ExtendedSeason extends Season {} // DOES NOT COMPILE

The values in an enum are fixed. You cannot add more by extending the enum.

**Calling the values(), name(), and ordinal() Methods**

An enum provides a values() method to get an array of all of the values. You can use this like
any normal array, including in a for-each loop:

    for(var season: Season.values()) { 
        System.out.println(season.name() + " " + season.ordinal());
    }

You can’t compare an int and an enum value directly anyway since an enum is a type, like a Java class, and not a
primitive int.

    if ( Season.SUMMER == 2) {} // DOES NOT COMPILE

**Calling the valueOf () Method**

Another useful feature is retrieving an enum value from a String using the valueOf() method. This is helpful when
working with older code or parsing user input. The String passed in must match the enum value exactly, though.

    Season s = Season.valueOf("SUMMER"); // SUMMER
    Season t = Season.valueOf("summer"); // IllegalArgumentException

The second statement encounters a problem. There is no enum value with the lowercase name summer. Java throws up its
hands in defeat and throws an IllegalArgumentException.

## Using Enums in switch Statements

Enums can be used in switch statements and expressions. Pay attention to the case values in this code

    Season summer = Season.SUMMER;
    switch (summer) {
        case WINTER:
            System.out.print("Get out the sled!");
            break;
        case SUMMER:
            System.out.print("Time for the pool!");
            break;
        default:
            System.out.print("Is it summer yet?");
    }

Java treats the enum type as implicit. In fact, if you were to type case Season.WINTER, it would not compile.

    Season summer = Season.SUMMER;
    var message = switch (summer) {
        case Season.WINTER -> "Get out the sled!"; // DOES NOT COMPILE
        case 0 -> "Time for the pool!"; // DOES NOT COMPILE
        default -> "Is it summer yet?";
    };
    System.out.print(message);

## Adding Constructors, Fields, and Methods

While a simple enum is composed of just a list of values, we can define a complex enum with additional elements.

    public enum SeasonComplex {

        WINTER("Low"), 
        SPRING("Medium"), 
        SUMMER("High"), 
        FALL("Medium");
        private final String expectedVisitors;
    
        private SeasonComplex(String expectedVisitors) {
            this.expectedVisitors = expectedVisitors;
        }
    
        public void printExpectedVisitors() {
            System.out.println(expectedVisitors);
        }
    }

The list of enum values ends with a semi-colon (;). While this is optional when our enum is composed solely of a list
of values, it is required if there is anything in the enum besides the values.

We have an instance variable, a constructor, and a method. We mark the instance variable private and final so
that our enum properties cannot be modified.

All enum constructors are implicitly private, with the modifier being optional.
This is reasonable since you can’t extend an enum and the constructors can be called only within the enum itself. In
fact, an enum constructor will not compile if it contains a public or protected modifier.

The first time we ask for any of the enum values, Java constructs all of the enum values. After that, Java just returns
the already constructed enum values.

    public enum OnlyOne {
        ONCE(true);
        private OnlyOne(boolean b) {
            System.out.print("constructing,");
        }
    }

    public class PrintTheOne {

        public static void main(String[] args) {
            System.out.print("begin,");
            OnlyOne firstCall = OnlyOne.ONCE; // Prints constructing,
            OnlyOne secondCall = OnlyOne.ONCE; // Doesn't print anything
            System.out.print("end");
        }
    }

This class prints the following:

    begin,constructing,end

Sometimes you want to define different methods for each enum. For example, our zoo has different seasonal hours. It is
cold and gets dark early in the winter. We can keep track of the hours through instance variables, or we can let each
enum value manage hours itself.

    public enum Season3 {
    
        WINTER {
            public String getHours() {
                return "10am-3pm";
            }
        },
        SPRING {
            public String getHours() {
                return "9am-5pm";
            }
        }, SUMMER {
            public String getHours() {
                return "9am-7pm";
            }
        },
        FALL {
            public String getHours() {
                return "9am-5pm";
            }
        };
    
        public abstract String getHours();
    }

The enum itself has an abstract method. This means that each and every enum value is required to implement this method.
If we forget to implement the method for one of the values, we get a compiler error.

If we don’t want each and every enum value to have a method? No problem. We can create an implementation for all values
and override it only for the special cases.

    public enum Season4 {
        WINTER {
            public String getHours() {
                return "10am-3pm";
            }
        },
        SUMMER {
            public String getHours() {
                return "9am-7pm";
            }
        },
        SPRING, FALL;
        
        public String getHours() {
            return "9am-5pm";
        }
    }

An enum can even implement an interface, as this just requires overriding the abstract methods:

    public interface Weather { int getAverageTemperature(); }

    public enum Season implements Weather {
    WINTER, SPRING, SUMMER, FALL;
        public int getAverageTemperature() { return 30; }
    }

Just because an enum can have lots of methods doesn’t mean that it should. Try to keep your enums simple. If your enum
is more than a page or two, it is probably too long. When enums get too long or too complex, they are hard to read.

You might have noticed that in each of these enum examples, the list of values came first. This was not an accident.
Whether the enum is simple or complex, the list of values always comes first.