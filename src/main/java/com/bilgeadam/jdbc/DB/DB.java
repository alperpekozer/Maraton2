package com.bilgeadam.jdbc.DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {

    private final String mysqldriver = "com.mysql.cj.jdbc.Driver";

    private final String url = "jdbc:mysql://localhost:3306/maraton_jdbc?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey&useSSL=false";

    private final String userName = "root";
    private final String userPass = "1234";

    public Connection connection = null;

    public DB(){
        try{
            Class.forName(mysqldriver);
            connection = DriverManager.getConnection(url,userName,userPass);
            if (!connection.isClosed()){
                System.out.println("Connection Success");
            }

        } catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();

        }
    }
}
