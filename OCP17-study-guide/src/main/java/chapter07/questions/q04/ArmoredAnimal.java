//package chapter07.questions.q04;
//
//public sealed class ArmoredAnimal permits Armadillo {
//    public ArmoredAnimal(int size) {
//    }
//
//    @Override
//    public String toString() {
//        return "Strong";
//    }
//
//    public static void main(String[] a) {
//        var c = new Armadillo(10, null);
//        System.out.println(c);
//    }
//}
//
//// sealed, non-sealed or final modifiers expected
//class Armadillo extends ArmoredAnimal { // DOES NOT COMPILE
//    @Override
//    public String toString() {
//        return "Cute";
//    }
//
//    public Armadillo(int size, String name) {
//        super(size);
//    }
//}
