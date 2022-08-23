# Exam Essentials

**Create module-info.java files.**

Place the module-info.java file in the root directory of the module. Know how to code exports, requires, provides, and
uses directives. Additionally, be familiar with the opens directive.

**Use command-line operations with modules.**

The java command can describe a module, list available modules, or show the module resolution. The jar command can
describe a module similar to how the java command does. The jdeps command prints details about a module and packages.
The jmod command provides various modes for working with JMOD files rather than JAR files. The jlink command creates
custom Java images.

**Identify the three types of modules.**

Named modules are JARs that have been modularized. Unnamed modules have not been modularized. Automatic modules are in
between. They are on the module path but do not have a module-info.java file.

**List built-in JDK modules.**

The java.base module is available to all modules. There are about 20 other modules provided by the JDK that begin with
java.* and about 30 that begin with jdk.*.

**Explain top-down and bottom-up migration.**

A top-down migration places all JARs on the module path, making them automatic modules while migrating from top to
bottom. A bottom-up migration leaves all JARs on the classpath, making them unnamed modules while migrating from bottom
to top.

**Differentiate the four main parts of a service.**

A service provider interface declares the interface that a service must implement. The service locator looks up the
service, and a consumer calls the service. Finally, a service provider implements the service.

