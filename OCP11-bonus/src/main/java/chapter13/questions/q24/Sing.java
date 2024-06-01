package chapter13.questions.q24;

public class Sing {

    @Dance(77)
    String album;

    // @Dance(33, 10) String album2; // DOES NOT COMPILE

    // @Dance(value=5, rhythm=2, fast=false) String album3; // DOES NOT COMPILE

    // @Dance(5, rhythm=9) String album4; // DOES NOT COMPILE

    @Dance(value = 5, rhythm = 2, track = "Samba")
    String album5;

    // @Dance(); String album6;// DOES NOT COMPILE
}
