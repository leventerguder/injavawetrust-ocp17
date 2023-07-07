package chapter02.questions.q17;

public class Q17 {

    public static void main(String[] args) {

        int ticketsTaken = 1;
        int ticketsSold = 3;
        ticketsSold += 1 + ticketsTaken++;

//        System.out.println(ticketsSold); //5
//        System.out.println(ticketsTaken);//2
        // the post-increment operator was used, the value of ticketsTaken++ returns 1
        ticketsTaken *= 2;
        ticketsSold += (long) 1;


        System.out.println(ticketsSold); // 6
        System.out.println(ticketsTaken); // 4
    }
}
