package chapter11.automating_resource_management;

public class DeclaringResources {

    public static void main(String[] args) {


//        try (MyFileClass is = new MyFileClass(1),os=new MyFileClass(2)){
//        }
//
//        try (MyFileClass ab = new MyFileClass(1), MyFileClass cd = new MyFileClass(2)) {
//        }

//        - The first example does not compile because it is missing the data type, and it uses a comma (,) instead of a
//        semicolon (;).
//        - The second example does not compile because it also uses a comma (,) instead of a semicolon (;).
//        - Each resource must include the data type and be separated by a semicolon (;).

        try (MyFileClass ab = new MyFileClass(1); MyFileClass cd = new MyFileClass(2)) {
        }

    }
}
