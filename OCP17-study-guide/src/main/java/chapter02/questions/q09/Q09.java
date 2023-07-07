package chapter02.questions.q09;

public class Q09 {

    public static void main(String[] args) {

        int a = 2, b = 4, c = 2;
        System.out.println(a > 2 ? --c : b++);  //4
        System.out.println(b = (a != c ? a : b++)); //5
        System.out.println(a > b ? b < c ? b : 2 : 1); //1

        //
        int x = 10;
        x = x++;
        System.out.println(x);

        int y = 10;
        y = ++y;
        System.out.println(y);
    }
}
