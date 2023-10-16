import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println ("Abrindo conexao ... ") ;
            Connection conexao = FabricaDeConexao.CriaConexao();
            String textoDoComando = "SELECT * FROM tabela; ";
            PreparedStatement comando = conexao.prepareStatement (
            textoDoComando) ;
            System.out.println ("Executando comando ... ") ;
            ResultSet resultado = comando.executeQuery();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
