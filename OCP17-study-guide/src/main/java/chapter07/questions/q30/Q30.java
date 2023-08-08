package chapter07.questions.q30;


sealed class Bird {
    public final class Flamingo extends Bird {
    }
}

sealed class Monkey {
}

// class EmperorTamarin extends Monkey { } // DOES NOT COMPILE

non-sealed class Mandrill extends Monkey {
}

//sealed class Friendly extends Mandrill permits Silly { } // DOES NOT COMPILE

final class Silly {
}

public class Q30 {
}
