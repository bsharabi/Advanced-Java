package Program;
import java.sql.*;
import java.util.Scanner;


public class Main {
    private static Connection connect;
    public static void main(String[] args){
        ConectingToSQL ();
        select_query();
    }


    public static void select_query()
    {
        try {// PreparedStatement - takes the java code select and replace it with sql code

            PreparedStatement statement = connect.prepareStatement("select * from vehicles");
            ResultSetMetaData meta = statement.getMetaData();

            int acount = meta.getColumnCount();
            ResultSet result = statement.executeQuery();// execute the statement

            System.out.println("---------------------------------------------------------------------------------");
            while(result.next())// take the rows in the result set
            {
            for(int i=1;i<=acount;i++) {
                //getString(i) - take the col number i
                System.out.print(result.getString(i) +" | ");
            }
            System.out.println("\n");System.out.println("---------------------------------------------------------------------------------");
        }
    } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void connection()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");// connect to the driver jar file mysql connector
            System.out.println("Works");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //Create Connection to DataBase
    public static void ConectingToSQL ()
    {
        connection();
//        String host = "jdbc:mysql://localhost:3306/cars?serverTimezone=UTC";
//        String username = "root";//user name
//        String password = "";// password of the sqlworkbanch

        String host = "jdbc:mysql://us-cdbr-iron-east-02.cleardb.net/heroku_6454552e9a36ed3?serverTimezone=UTC";
        String username = "b2b2ecacb19700";//user name
        String password = "6adacfce";// password of the sqlworkbanch


        try {
            connect = (Connection) DriverManager.getConnection(host, username, password);
            System.out.println("work");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
