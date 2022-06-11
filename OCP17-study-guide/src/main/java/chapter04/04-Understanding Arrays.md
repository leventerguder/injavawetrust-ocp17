# Understanding Arrays

An array is an area of memory on the heap with space for a designated number of elements.

## Creating an Array of Primitives

The basic structure of an array

    int[] numbers = new int[3];

When you use this form to instantiate an array, all elements are set to the default value for that type.

Another way to create an array is to specify all the elements it should start out with:

    int[] moreNumbers = new int[] {42, 55, 99};

As a shortcut, Java lets you write this:

    int[] moreNumbers = {42, 55, 99};

This approach is called an anonymous array. It is anonymous because you don’t specify the type and size.

You can type the [] before or after the name, and adding a space is optional. This means that all five of these
statements do the exact same thing:

    int[] numAnimals; 
    int [] numAnimals2; 
    int []numAnimals3; 
    int numAnimals4[]; 
    int numAnimals5 [];

### Multiple “Arrays” in Declarations ###

What types of reference variables do you think the following code creates?

    int[] ids, types;

The correct answer is two variables of type int[]. This seems logical enough. After all, int a, b; created two int
variables.

    int ids[], types;

All we did was move the brackets, but it changed the behavior.This time we get one variable of type int[] and one
variable of type int.

## Creating an Array with Reference Variables

You can choose any Java type to be type of the array.

    String[] bugs = { "cricket", "beetle", "ladybug" }; 
    String[] alias = bugs;
    System.out.println(bugs.equals(alias)); // true 
    System.out.println(bugs.toString()); // [Ljava.lang.String;@160bc7c0

We can call equals() because an array is an object. It returns true because of reference equality. The equals() method
on arrays does not look at the elements of the array.

[L means it is an array, java.lang.String is the reference type, and 160bc7c0 is the hash code.

Remember casting from the previous chapter when you wanted to force a bigger type into
a smaller type? You can do that with arrays too:

    String[] strings = { "stringValue" };
    Object[] objects = strings;
    String[] againStrings = (String[]) objects;
    againStrings[0] = new StringBuilder(); // DOES NOT COMPILE
    objects[0] = new StringBuilder(); // Careful! The code throws an ArrayStoreException.

## Using an Array

Let's try accessing one :

    String[] mammals = {"monkey", "chimp", "donkey"};
    System.out.println(mammals.length);
    System.out.println(mammals[0]);
    System.out.println(mammals[1]);
    System.out.println(mammals[2]);

Notice that elements are indexed starting with 0.

    String[] mammals = {"monkey", "chimp", "donkey"};
    System.out.println(mammals.length()); // DOES NOT COMPILE

    var birds = new String[6];
    System.out.println(birds.length); //6

Even though all six elements of the array are null, there are still six of them. The length attribute does not consider
what is in the array; it only considers how many slots have been allocated.

    var numbers = new int[10];
    for (int i = 0; i < numbers.length; i++)
        numbers[i] = i + 5;

    numbers[10] = 3; // ArrayIndexOutOfBoundsException

## Sorting

Java makes it easy to sort an array by providing a sort method, Arrays.sort().

    import java.util.*; // import whole package including Arrays 
    import java.util.Arrays; // import just Arrays

This simple example sorts three numbers;

    int[] numbers = {6, 9, 1};
    Arrays.sort(numbers);
    for (int i = 0; i < numbers.length; i++)
        System.out.print(numbers[i] + " ");

    ...
    System.out.println(Arrays.toString(numbers));

Try this again with String types:

    String[] strings = {"10", "9", "100"};
    Arrays.sort(strings);
    for (String s : strings)
        System.out.print(s + " ");

This time the result might not be what you expect. This code outputs 10 100 9. The problem is that String sorts in
alphabetic order, and 1 sorts before 9. (Numbers sort before letters, and uppercase sorts before lowercase.)

## Searching

Java also provides a convenient way to search, but only if the array is already sorted.

| Scenario                                 | Description                                                                                                                         |
|------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------|
| Target element found in sorted array     | Index of match                                                                                                                      | 
| Target element not found in sorted array | Negative value showing one smaller than the negative of the index, <br/>where a match needs to be inserted to preserve sorted order | 
| Unsorted array                           | A surprise; this result is undefined                                                                                                | 

Let's try these rules with an example:

    int[] numbers = {2,4,6,8};
    System.out.println(Arrays.binarySearch(numbers, 2)); // 0
    System.out.println(Arrays.binarySearch(numbers, 4)); // 1
    System.out.println(Arrays.binarySearch(numbers, 1)); // -1
    System.out.println(Arrays.binarySearch(numbers, 3)); // -2
    System.out.println(Arrays.binarySearch(numbers, 9)); // -5

What do you think happens in this example?

    int[] numbers = new int[] {3,2,1};

    System.out.println(Arrays.binarySearch(numbers, 2));
    System.out.println(Arrays.binarySearch(numbers, 3));

The array isn’t sorted. This means the output will not be defined.

## Comparing

Java alsop provides methods to compare two arrays to determine which is "smaller".

### Using compare()

There are a bunch of rules you need to know before calling compare().

First you need to learn what the return value means.

- A negative number means the first array is smaller than the second.
- A zero means the arrays are equal.
- A positive number means the first array is larger than the second.

Let’s look at how to compare arrays of different lengths:

- If both arrays are the same length and have the same values in each spot in the same order, return zero.
- If all the elements are the same but the second array has extra elements at the end, return a negative number.
- If all the elements are the same, but the first array has extra elements at the end, return a positive number.
- If the first element that differs is smaller in the first array, return a negative number.
- If the first element that differs is larger in the first array return a positive number.

Finally, what does smaller mean? Here are some more rules that apply here :

- null is smaller than any other value.
- For numbers, normal numeric order applies.
- For strings, one is smaller if it is a prefix of another.
- For strings/characters, numbers are smaller than letters.
- For strings/characters, uppercase is smaller than lowercase.

### Using mismatch()

If the arrays are equal, mismatch() returns -1. Otherwise, it returns the first index where they differ.

    System.out.println(Arrays.mismatch(new int[]{1}, new int[]{1}));  // -1
    System.out.println(Arrays.mismatch(new String[]{"a"}, new String[]{"A"})); //0
    System.out.println(Arrays.mismatch(new int[]{1, 2}, new int[]{1})); //1

| Method     | when array contain the same data | when arrays are different   |
|------------|----------------------------------|-----------------------------|
| equals()   | true                             | false                       | 
| compare()  | 0                                | positive or negative number | 
| mismatch() | -1                               | zero or positive index      | 

## Using Methods with Varargs

Here are three examples with a main() method:

    public static void main(String[] args)
    public static void main(String args[])
    public static void main(String... args) // varargs

## Working with Multidimensional Arrays

Arrays are objects, and of course, array components can be objects.

### Creating a Multidimensional Array

Multiple array separators are all it takes to declare arrays with multiple dimensions.

    int[][] vars1;
    int vars2 [][];
    int[] vars3[];
    int[] vars4 [], space [][]; // a 2D AND a 3D array

You can specify the size of your multidimensional array in the declaration if you like:

    String [][] rectangle = new String[3][2];

While that array happens to be rectangular in shape, an array doesn’t need to be. Consider this one:

    int[][] differentSizes = {{1, 4}, {3}, {9,8,7}};

Another way to create an asymmetric array is to initialize just an array’s first dimension and define the size of each
array component in a separate statement:

    int [][] args = new int[4][]; 
    args[0] = new int[5];
    args[1] = new int[3];

### Using a Multidimensional Array

The most common operation on a multidimensional array is to loop through it.

    for (int i = 0; i < twoD.length; i++) {
        for (int j = 0; j < twoD[i].length; j++)
            System.out.print(twoD[i][j] + " "); // print element
        System.out.println(); // time for a new row
    }

    System.out.println();

    for (int[] inner : twoD) {
        for (int num : inner)
            System.out.print(num + " ");
        System.out.println();
    }