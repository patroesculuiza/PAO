package BD;


import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtil {
    /*
    public static void main(String[] args) {
        System.out.println("Database connection start");
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/transport?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String username="root";
            Connection con=null;
            con=DriverManager.getConnection(url,username,"Itscoronatime19");
            if(con!=null)
            {
                System.out.println("CONNECTED");
            }
            else {
                System.out.println("not connected");
            }
        }
        catch (Exception e)
        {
            System.out.println("Exception : "+e);
        }
    }
   */
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/transport?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC\"";
    private static final String DATABASE_USER = "root";
    private static final String DATABASE_PASSWORD = "Itscoronatime19";

    public static Connection getDBConnection()  {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }


    public static void closeDBConnection(Connection connection)  {
        try {
            if(connection != null) {
                connection.close();
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    }