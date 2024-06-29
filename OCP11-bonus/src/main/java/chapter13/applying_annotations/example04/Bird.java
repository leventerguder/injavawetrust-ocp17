package chapter13.applying_annotations.example04;

@Sleep(hours = "12", value = 12)
// @Sleep("12" , value = 12) // DOES NOT COMPILE
// @Wake("6") // DOES NOT COMPILE
@Wake(hours = "6") //
public class Bird {
}
