package cn.xiaoyes.note.day1118;

import java.sql.*;

public class Demo01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/studentzk?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&useSSL=true&serverTimezone=GMT%2B8";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, "root", "helloworld");
        Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery("select * from sys_order");
        while (result.next()){
            System.out.println(result.getString(1) + " " + result.getString(2));
        }
        conn.close();
    }
}
