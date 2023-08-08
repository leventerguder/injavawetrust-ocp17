package chapter07.questions.q10;

import java.util.ArrayList;
import java.util.List;

interface Walk {
    private static List move() {
        return null;
    }
}

interface Run extends Walk {
    public ArrayList move();
}

class Leopard implements Walk {
    public Integer move() { // X
        return null;
    }
}

class Leopard2 implements Walk {
    public ArrayList move() { // X
        return null;
    }
}

class Leopard3 implements Walk {
    public List move() { // X
        return null;
    }
}

//class Panther implements Run {
//    public List move() { // Z // DOES NOT COMPILE
//        return null;
//    }
//
//}

class Panther2 implements Run {
    public ArrayList move() { // Z // DOES NOT COMPILE
        return null;
    }

}


