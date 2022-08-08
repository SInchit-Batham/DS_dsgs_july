import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
 
class Jdbc_connect {
    public static void main(String[] args) throws Exception
    {
        String url
            = "jdbc:mysql://localhost:3306/mysql?allowPublicKeyRetrieval=true&useSSL=false";
        String username = "root"; // 
        String password = "9956213345";
        String query
            = "select *from student"; 
        Class.forName(
            "com.mysql.cj.jdbc.Driver"); 
        Connection con = DriverManager.getConnection(
            url, username, password);
        System.out.println(
            "Connection Established successfully");
        Statement st = con.createStatement();
        ResultSet rs
            = st.executeQuery(query);
        rs.next();
        String studname
            = rs.getString("studname"); 
 
        System.out.println(studname);
        st.close(); 
        con.close(); 
        System.out.println("Connection Closed....");
    }
}