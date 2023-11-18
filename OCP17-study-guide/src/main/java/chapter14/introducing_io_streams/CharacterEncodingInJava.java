package chapter14.introducing_io_streams;

import java.nio.charset.Charset;

public class CharacterEncodingInJava {

    public static void main(String[] args) {

        Charset usAsciiCharset = Charset.forName("US-ASCII");
        Charset utf8Charset = Charset.forName("UTF-8");
        Charset utf16Charset = Charset.forName("UTF-16");

        System.out.println(usAsciiCharset);
        System.out.println(utf8Charset);
        System.out.println(utf16Charset);
    }
}
