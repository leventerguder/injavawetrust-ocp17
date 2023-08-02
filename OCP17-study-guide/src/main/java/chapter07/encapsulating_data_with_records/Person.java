package chapter07.encapsulating_data_with_records;

record Person(String firstname, String lastname) {

    Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    Person(String firstname) {
        this(firstname, null);
    }
}
