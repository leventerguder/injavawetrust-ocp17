module zoo.animal.care {

  exports zoo.animal.care.medical to zoo.staff;

  requires transitive zoo.animal.feeding;
}
