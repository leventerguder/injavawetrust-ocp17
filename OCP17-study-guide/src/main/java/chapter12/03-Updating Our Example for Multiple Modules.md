# Updating Our Example for Multiple Modules

## Updating the Feeding Module

Since we will be having our other modules call code in the zoo.animal.feeding package, we need to declare this intent in
the module declaration.

The exports directive is used to indicate that a module intends for those packages to be used by Java code outside the
module. As you might expect, without an exports directive, the module is only available to be run from the command line
on its own. In the following example, we export one package:

    module zoo.animal.feeding { 
        exports zoo.animal.feeding;
    }

Recompiling and repackaging the module will update the module-info.class inside our zoo.animal.feeding.jar file. These
are the same javac and jar commands you ran previously:

    javac -p mods -d feeding feeding/zoo/animal/feeding/*.java feeding/module-info.java
    jar -cvf mods/zoo.animal.feeding.jar -C feeding/ .

## Creating a Care Module

The zoo.animal.care.medical package will have the classes and methods that are intended for use by other modules. The
zoo.animal.care.details package is only going to be used by this module. It will not be exported from the module. Think
of it as healthcare privacy for the animals.

![](updatingourexampleformultiplemodules/Contents of zoo.animal.care.png)