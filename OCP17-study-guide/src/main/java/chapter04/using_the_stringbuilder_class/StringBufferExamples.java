package chapter04.using_the_stringbuilder_class;

public class StringBufferExamples {

    public static void main(String[] args) {

        StringBuffer stringBuffer1 = new StringBuffer("hello");
        StringBuffer stringBuffer2 = new StringBuffer("hello");

        System.out.println(stringBuffer1.equals(stringBuffer2));

        StringBuffer stringBuffer3 = new StringBuffer("msg1");
        stringBuffer3.append(" msg2");

        System.out.println(stringBuffer3);
    }
}
