# Loading Properties with Resource Bundles

Up until now, we’ve kept all of the text strings displayed to our users as part of the program inside the classes that
use them. Localization requires externalizing them to elsewhere.

A resource bundle contains the locale-specific objects to be used by a program. It is like a map with keys and values.
The resource bundle is commonly stored in a properties file. A properties file is a text file in a specific format with
key/value pairs.

## Creating a Resource Bundle

For now, we need English and French properties files for our Zoo resource bundle. First, create two properties files.

**Zoo_en.properties**

    hello=Hello
    open=The zoo is open

**Zoo_fr.properties**

    hello=Bonjour
    open=Le zoo est ouvert

The filenames match the name of our resource bundle, Zoo. They are then followed by an underscore (_), target locale,
and .properties file extension. We can write our very first program that uses a resource bundle to print this
information.

    public static void printWelcomeMessage(Locale locale) {
        var rb = ResourceBundle.getBundle("Zoo", locale);
        System.out.println(rb.getString("hello") + ", " + rb.getString("open"));
    }

    public static void main(String[] args) {
        var us = new Locale("en", "US");
        var france = new Locale("fr", "FR");
        printWelcomeMessage(us); // Hello, The zoo is open
        printWelcomeMessage(france); // Bonjour, Le zoo est ouvert

    }

Since a resource bundle contains key/value pairs, you can even loop through them to list all of the pairs. The
ResourceBundle class provides a keySet() method to get a set of all keys.

    public static void main(String[] args) {
        var us = new Locale("en", "US");
        ResourceBundle rb = ResourceBundle.getBundle("Zoo", us);
        rb.keySet().stream()
                .map(k -> k + ": " + rb.getString(k)).forEach(System.out::println);

    }

**Loading Resource Bundle Files at Runtime**

For the exam, you don’t need to know where the properties files for the resource bundles are stored. If the exam
provides a properties file, it is safe to assume that it exists and is loaded at runtime.

In your own applications, though, the resource bundles can be stored in a variety of places. While they can be stored
inside the JAR that uses them, doing so is not recommended.This approach forces you to rebuild the application JAR any
time some text changes. One of the benefits of using resource bundles is to decouple the application code from the
locale-specific text data.

Another approach is to have all of the properties files in a separate properties JAR or folder and load them in the
classpath at runtime. In this manner, a new language can be added without changing the application JAR.

## Picking a Resource Bundle

There are two methods for obtaining a resource bundle that you should be familiar with for the exam.

    ResourceBundle.getBundle("name");
    ResourceBundle.getBundle("name", locale);

The first uses the default locale. You are likely to use this one in programs that you write. Either the exam tells you
what to assume as the default locale, or it uses the second approach.

Java handles the logic of picking the best available resource bundle for a given key. It tries to find the most specific
value.

![](loadingpropertieswithresourcebundles/Picing-a-resource-bundle-for-FrenchFrance-with-default-locale-EnglishUS.png)

- Look for the resource bundle for the requested locale, followed by the one for the default locale.
- For each locale, check the language/country, followed by just the language.
- Use the default resource bundle if no matching locale can be found.

As we mentioned earlier, Java supports resource bundles from Java classes and properties alike. When Java is searching
for a matching resource bundle, it will first check for a resource bundle file with the matching class name. For the
exam, you just need to know how to work with properties files.

Java would need to consider in order to find the appropriate resource bundle with the following code?

    Locale.setDefault(new Locale("hi"));
    ResourceBundle rb = ResourceBundle.getBundle("Zoo", new Locale("en"));

The answer is three. They are listed here:

- Zoo_en.properties
- Zoo_hi.properties
- Zoo.properties

## Selecting Resource Bundle Values

Java isn’t required to get all of the keys from the same resource bundle. It can get them from any parent of the
matching resource bundle. A parent resource bundle in the hierarchy just removes components of the name until it gets to
the top.

![](loadingpropertieswithresourcebundles/Selecting-resource-bundle-properties.png)

Once a resource bundle has been selected, only properties along a single hierarchy will be used. Contrast this behavior
with Table 11.11, in which the default en_US resource bundle is used if no other resource bundles are available.

What does this mean, exactly? Assume the requested locale is fr_FR and the default is en_US. The JVM will provide data
from en_US only if there is no matching fr_FR or fr resource bundle. If it finds a fr_FR or fr resource bundle, then
only those bundles, along with the default bundle, will be used.

**Zoo.properties**

    name=Vancouver Zoo

**Zoo_en.properties**

    hello=Hello open=is open

**Zoo_en_US.properties**

    name=The Zoo

**Zoo_en_CA.properties**

    visitors=Canada visitors


    Locale.setDefault(new Locale("en", "US"));
    Locale locale = new Locale("en", "CA");
    ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);

    System.out.print(rb.getString("hello"));
    System.out.print(". ");
    System.out.print(rb.getString("name"));
    System.out.print(" ");
    System.out.print(rb.getString("open"));
    System.out.print(" ");
    System.out.print(rb.getString("visitors"));

What if a property is not found in any resource bundle? Then an exception is thrown. For example, attempting to call
rb.getString("close") in the previous program results in a MissingResourceException at runtime.

## Formatting Messages

Often we just want to output the text data from a resource bundle, but sometimes you want to format that data with
parameters. In real programs, it is common to substitute variables in the middle of a resource bundle string. The
convention is to use a number inside braces such as {0}, {1}, etc. The number indicates the order in which the
parameters will be passed. Although resource bundles don’t support this directly, the MessageFormat class does.

    helloByName=Hello, {0} and {1}

Suppose we have a resource bundle rb:

    String format = rb.getString("helloByName");
    System.out.print(MessageFormat.format(format, "Tammy", "Henry"));

## Using the Properties Class

When working with the ResourceBundle class, you may also come across the Properties class. It functions like the HashMap
class.

    public class ZooOptions {
    
        public static void main(String[] args) {
            var props = new Properties();
            props.setProperty("name", "Our zoo");
            props.setProperty("open", "10am");
        }
    }

The Properties class is commonly used in handling values that may not exist.

    System.out.println(props.getProperty("camel")); // null
    System.out.println(props.getProperty("camel", "Bob")); // Bob

The Properties class also includes a get() method, but only getProperty() allows for a default value. For example, the
following call is invalid since get() takes only a single parameter:

    props.get("open"); // 10am 
    props.get("open", "The zoo will be open soon"); // DOES NOT COMPILE