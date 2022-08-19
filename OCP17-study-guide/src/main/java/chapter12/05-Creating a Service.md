# Creating a Service

A service is composed of an interface, any classes the interface references, and a way of looking up implementations of
the interface. The implementations are not part of the service.

![](creatingaservice/Modules-in-the-tour-application.png)

You aren’t required to have four separate modules. We do so to illustrate the concepts. For example, the service
provider interface and service locator could be in the same module.

## Declaring Service Provider Interface

First, the zoo.tours.api module defines a Java object called Souvenir. It is considered part of the service because it
will be referenced by the interface.

    // Souvenir.java
    package zoo.tours.api;

    public record Souvenir(String description) { }

Next, the module contains a Java interface type. This interface is called the service provider interface because it
specifies what behavior our service will have. In this case, it is a simple API with three methods.

    // Tour.java
    package zoo.tours.api;

    public interface Tour { 
        String name();
        int length();
        Souvenir getSouvenir();
    }

All three methods use the implicit public modifier. Since we are working with modules, we also need to create a
module-info.java file so our module definition exports the package containing the interface.

    // module-info.java

    module zoo.tours.api { 
        exports zoo.tours.api;
    }

Now that we have both files, we can compile and package this module.

    javac -d serviceProviderInterfaceModule serviceProviderInterfaceModule/zoo/tours/api/*.java serviceProviderInterfaceModule/module-info.java

    jar -cvf mods/zoo.tours.api.jar -C serviceProviderInterfaceModule/ .

## Creating a Service Locator

To complete our service, we need a service locator. A service locator can find any classes that implement a service
provider interface.

Luckily, Java provides a ServiceLoader class to help with this task. You pass the service provider interface type to its
load() method, and Java will return any implementation services it can find. The following class shows it in action:

    package zoo.tours.reservations;

    import java.util.*;
    
    import zoo.tours.api.*;
    
    public class TourFinder {
        public static Tour findSingleTour() {
        ServiceLoader<Tour> loader = ServiceLoader.load(Tour.class);
        for (Tour tour : loader) return tour;
        return null;
        }
    
        public static List<Tour> findAllTours() {
            List<Tour> tours = new ArrayList<>();
            ServiceLoader<Tour> loader = ServiceLoader.load(Tour.class);
            for (Tour tour : loader)
                tours.add(tour);
            return tours;
        }
    }

The ServiceLoader call is relatively expensive. If you are writing a real application, it is best to cache the result.

Our module definition exports the package with the lookup class TourFinder. It requires the service provider interface
package. It also has the uses directive since it will be looking up a service.

    // module-info.java
    module zoo.tours.reservations { 
        exports zoo.tours.reservations; 
        requires zoo.tours.api;
        uses zoo.tours.api.Tour;
    }

Remember that both requires and uses are needed, one for compilation and one for lookup. Finally, we compile and package
the module.

    javac -p mods -d serviceLocatorModule serviceLocatorModule/zoo/tours/reservations/*.java serviceLocatorModule/module-info.java

    jar -cvf mods/zoo.tours.reservations.jar -C serviceLocatorModule/ .

Now that we have the interface and lookup logic, we have completed our service.

**Using ServiceLoader**

There are two methods in ServiceLoader that you need to know for the exam.The decla- ration is as follows, sans the full
implementation:

    public final class ServiceLoader<S> implements Iterable<S> {
        public static <S> ServiceLoader<S> load(Class<S> service) { ... }
        public Stream<Provider<S>> stream() { ... }
        // Additional methods 
    }

As we already saw, calling ServiceLoader.load() returns an object that you can loop through normally. However,
requesting a Stream gives you a different type.The reason for this is that a Stream controls when elements are
evaluated.Therefore, a ServiceLoader returns a Stream of Provider objects.You have to call get() to retrieve the value
you wanted out of each Provider, such as in this example:

    ServiceLoader.load(Tour.class) .stream()
    .map(Provider::get) .mapToInt(Tour::length)
    .max() .ifPresent(System.out::println);
