package chapter13.creating_custom_annotations.example05;

public @interface BadAnnotation {

    // String name() default new String(""); // DOES NOT COMPILE

    String address() default "";

    // String title() default null; // DOES NOT COMPILE

    String DEFAULT_CITY = "Istanbul";

    String city() default DEFAULT_CITY;

    String country() default Country.DEFAULT_COUNTRY_CODE;

}

class Country {

    public static final String DEFAULT_COUNTRY_CODE = "TR";
}