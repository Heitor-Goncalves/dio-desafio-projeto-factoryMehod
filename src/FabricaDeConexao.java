import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeConexao {
    public static Connection CriaConexao() {
        String stringDeConexao = "jdbc:mysql : //localhost : 3306/database";
        String usuario = "user";
        String senha = "password";
        Connection conexao = null;
        try {
            conexao = DriverManager.getConnection(stringDeConexao, usuario,
                    senha);
        } catch (SQLException e) {
            e.printStackTrace();
            return conexao;
        }
        return conexao;
    }
}