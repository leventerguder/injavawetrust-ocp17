package chapter07.encapsulating_data_with_records.person;

record PersonV3(String firstname, String lastname) {

    PersonV3(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        System.out.println("canonical constructor");
    }

    // Calling a method before setting the canonical constructor
    PersonV3(String firstname) {
        this(firstname, reverseString(firstname));
        System.out.println("constructor-string parameter");
    }

    private static String reverseString(CharSequence value) {
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder
                .append(value)
                .reverse()
                .toString();
    }
}
