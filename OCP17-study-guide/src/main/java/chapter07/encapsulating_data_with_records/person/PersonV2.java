package chapter07.encapsulating_data_with_records.person;

record PersonV2(String firstname, String lastname) {

    // Below is an example of a non-canonical constructor (PersonV2(String firstname))
    // calling a canonical constructor (PersonV2(String firstname, String lastname)) using this().
    PersonV2(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    PersonV2(String firstname) {
        // this.firstname = firstname;
        // lastname = "dummy";
        this(firstname, null);
    }

    /*
    Non-canonical record constructor must delegate to another constructor error message.
    As the error states, we need to call a constructor that is canonical.
     */
}