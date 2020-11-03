package JDBC;

import java.sql.*;


public class JDBCDemo1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String username ="root";
        String password = "root";
        String url ="jdbc:mysql://localhost:3306/ganesh";

        Connection con = DriverManager.getConnection(url,username,password);

        Statement st  = con.createStatement();

//        String  sql ="insert into student values (7,'xyz','IT',78)";
//        String  sql ="delete from student where id =2";
        String  sql ="update student set marks=100 where id=3";

        st.executeUpdate(sql);

    }
}
