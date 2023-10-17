package chapter12.questions.q16;

public class Q16 {

    // Suppose you have separate modules for a service provider interface, service provider,
    // service locator, and consumer. If you add a second service provider module,
    // how many of these modules do you need to recompile?

    // A. Zero

    // The service locator will see the new service
    // provider simply by having that new service provider on the module path
}
