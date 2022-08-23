# Summary

The Java Platform Module System organizes code at a higher level than packages. Each module contains one or more
packages and a module-info.java file. The java.base module is most common and is automatically supplied to all modules
as a dependency.

The process of compiling and running modules uses the --module-path, also known as -p. Running a module uses the
--module option, also known as -m. The class to run is specified in the format moduleName/className.

The module declaration file supports a number of directives. The exports directive specifies that a package should be
accessible outside the module. It can optionally restrict that export to a specific package. The requires directive is
used when a module depends on code in another module. Additionally, requires transitive can be used when all modules
that require one module should always require another. The provides and uses directives are used when sharing and
consuming a service. Finally, the opens directive is used to allow access via reflection.

Both the java and jar commands can be used to describe the contents of a module. The java command can additionally list
available modules and show module resolution. The jdeps command prints information about packages used in addition to
module-level information.

The jmod command is used when dealing with files that don’t meet the requirements for a JAR. The jlink command creates a
smaller Java runtime image.

There are three types of modules. Named modules contain a module-info.java file and are on the module path. They can
read only from the module path. Automatic modules are also on the module path but have not yet been modularized. They
might have an automatic module name set in the manifest. Unnamed modules are on the classpath.

The two most common migration strategies are top-down and bottom-up migration. Top-down migration starts migrating the
module with the most dependencies and places all other modules on the module path. Bottom-up migration starts migrating
a module with no dependencies and moves one module to the module path at a time. Both of these strategies require
ensuring that you do not have any cyclic dependencies since the Java Platform Module System will not allow cyclic
dependencies to compile.
