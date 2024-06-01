package chapter13.questions.q23;

import java.lang.reflect.Field;

public class Team {

    @Plumber("")
    private String foreman = "Mario";
    @Plumber
    private String worker = "Kelly";
    @Plumber("Kelly")
    private String trainee;

    public static void main(String[] args) {
        var t = new Team();
        var fields = t.getClass().getDeclaredFields();

        for (Field field : fields)
            if (field.isAnnotationPresent(Plumber.class))
                System.out.print(field.getAnnotation(Plumber.class)
                        .value());
    }
}

