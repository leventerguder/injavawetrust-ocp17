package zoo.staff;

public class Jobs {
    public static void main(String[] args) throws Exception {

        System.out.println("Jobs#main method!");
        Object object = Class.forName("zoo.animal.talks.media.Signage").newInstance();

    }
}