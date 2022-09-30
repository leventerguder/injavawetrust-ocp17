package chapter03.creating_decision_making_statements;

public class StatementsAndBlocks {

    public static void main(String[] args) {

        int patrons = 0;

        // single statement
        patrons++;

        // statement inside a block
        {
            patrons++;
        }


        int ticketsTaken = 5;
        // Single statement
        if (ticketsTaken > 1)
            patrons++;
        // Statement inside a block
        if (ticketsTaken > 1) {
            patrons++;
        }

    }
}
