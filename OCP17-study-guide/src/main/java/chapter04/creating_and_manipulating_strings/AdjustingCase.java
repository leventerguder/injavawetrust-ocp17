package chapter04.creating_and_manipulating_strings;

import javax.sound.midi.Soundbank;
import java.util.Locale;

public class AdjustingCase {

    public static void main(String[] args) {
        var name = "animals";
        System.out.println(name.toUpperCase()); // ANIMALS
        System.out.println("Abc123".toLowerCase()); // abc123

        System.out.println("ıişüğçö".toUpperCase(Locale.UK));
        System.out.println("ıişüğçö".toUpperCase(new Locale("tr", "TR")));

    }
}
