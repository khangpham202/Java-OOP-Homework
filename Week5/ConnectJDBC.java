
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectJDBC {
    private String username = "root";
    private String password = "1";

    private String connectionURL = "jdbc:mysql://127.0.0.1:3306/ebookshop";

    public Connection connect() {
        // Tạo đối tượng Connection
        Connection conn = null;

        try {

            conn = DriverManager.getConnection(connectionURL, username, password);
            System.out.println("Kết nối thành công");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }
}
