import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zoo", "root", "");
            PreparedStatement statement = con.prepareStatement("INSERT INTO aminals VALUES (NULL,?,?)");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
