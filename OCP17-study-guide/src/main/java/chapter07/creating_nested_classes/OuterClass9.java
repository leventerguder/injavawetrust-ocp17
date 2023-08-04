package chapter07.creating_nested_classes;

public class OuterClass9 {

    private Integer outerInstanceVariable = 100;

    void method() {

        final int finalLocalVariable = 10;
        int effectivelyFinalLocalVariable = 20;
        int notEffectivelyFinal = 30;
        notEffectivelyFinal = 40;
        class LocalClass {
            void localInner() {
                System.out.println("local-inner" + outerInstanceVariable);

                System.out.println(finalLocalVariable);
                System.out.println(effectivelyFinalLocalVariable);
                // System.out.println(notEffectivelyFinal); // DOES NOT COMPILE
            }
        }

        LocalClass localClass = new LocalClass();

        LocalClass anonymousClass = new LocalClass() {
            @Override
            void localInner() {
                System.out.println("anonymous-inner" + outerInstanceVariable);

                System.out.println(finalLocalVariable);
                System.out.println(effectivelyFinalLocalVariable);
                // System.out.println(notEffectivelyFinal); // DOES NOT COMPILE
            }
        };

        localClass.localInner();
        anonymousClass.localInner();
    }

    public static void main(String[] args) {
        OuterClass9 outer = new OuterClass9();
        outer.method();
    }
}
