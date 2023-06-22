package chapter01.initializing_variables;

public class DefiningInstanceAndClassVariables {

    public static void main(String[] args) {

        Person person1 = new Person("sample-name-1", "sample-surname-1");
        Person person2 = new Person("sample-name-2", "sample-surname-2");


    }
}


class Person {

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
