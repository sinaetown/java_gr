package Spring;

import java.sql.*;

public class DatabaseConnect {
    public static void main(String[] args) {
//        db의 url : localhost:3306
        String url = "jdbc:mysql://localhost:3306/board1";
        String userName = "root";
        String pw = "1234";

        try {
            Connection conn = DriverManager.getConnection(url, userName, pw);
            System.out.println("Success");
//            Statement : 쿼리를 담아서 db로 보낼 수 있는 객체
            Statement st = conn.createStatement();
            String myQuery = "select * from author";
            ResultSet rs = st.executeQuery(myQuery);
//            st.executeQuery(myQuery);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println("id: " + id + " " + "name: " + name);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
