package chapter15.questions.q05;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Q05 {

    public static void main(String[] args) throws SQLException {


        PreparedStatement ps = null;
        boolean bool = ps.execute();
        int num = ps.executeUpdate();
        ResultSet rs = ps.executeQuery();
    }
}
