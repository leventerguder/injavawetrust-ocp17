package chapter07.sealing_classes;

public class ReflectionPermittedSubclasses {

    public static void main(String[] args) {

        Bear bear = new Bear();

        Class<? extends Bear> cz = bear.getClass();
        Class<?>[] permittedSubclasses = cz.getPermittedSubclasses();
        for (Class<?> sc : permittedSubclasses) {
            System.out.println(sc.getName() + " " + sc.isSealed());
        }

        System.out.println(cz.isSealed());
    }
}
