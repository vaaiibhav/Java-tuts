import java.sql.*;
import java.sql.DriverManager;

public class datacon {
    static String JDDriver = "com.mysql.jdbc.Driver";
    static String jdb_url = "jdbc:mysql://localhost/test";
    static String username = "root";
    static String upass = "";

    public static void main(String[] args) throws SQLException {
        Connection conn = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
      
    conn = DriverManager.getConnection(jdb_url, username, upass);
    System.out.println(conn);
    
} catch (ClassNotFoundException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}

}



}