package chapter13.questions.q07;

import java.util.function.Function;

@CoolAnnotation
public class AnnotationTest {


    public AnnotationTest(@CoolAnnotation int value) {
    }

    void method() {

        @CoolAnnotation
        int number = 10;


        Object obj = 10;

        Integer i = (@CoolAnnotation Integer) obj;

        Function<String, String> f1 = (@CoolAnnotation String str) -> str.toString().toUpperCase();
    }
}

@CoolAnnotation
interface NiceInterface {

}
