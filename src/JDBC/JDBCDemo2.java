package JDBC;

import java.sql.*;


public class JDBCDemo2 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String username ="root";
        String password = "root";
        String url ="jdbc:mysql://localhost:3306/ganesh";

        Connection con = DriverManager.getConnection(url,username,password);

        Statement st  = con.createStatement();

//        String  sql ="insert into student values (7,'xyz','IT',78)";
//        String  sql ="delete from student where id =2";
        String  sql ="select * from student";

        ResultSet rs = st.executeQuery(sql);

        while(rs.next())
        {
            System.out.print(rs.getInt("id")+"\t\t");
            System.out.print(rs.getString("name")+"\t\t");
            System.out.print(rs.getString("branch")+"\t\t");
            System.out.println(rs.getInt("marks"));
        }

    }
}
