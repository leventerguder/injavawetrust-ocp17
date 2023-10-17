package chapter12.questions.q13;

import java.util.ArrayList;
import java.util.ServiceLoader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ServiceLoader.Provider;

public class Q13 {

//    Which of the following compiles and is equivalent to this loop?

    void method() {
        List<Unicorn> all = new ArrayList<>();
        for (Unicorn current : ServiceLoader.load(Unicorn.class))
            all.add(current);

    }

    void optionD() {
        List<Unicorn> all = ServiceLoader.load(Unicorn.class).stream()
                .map(Provider::get)
                .collect(Collectors.toList());
    }

}
