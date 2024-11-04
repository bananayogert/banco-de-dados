package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
    
    private static final String BD_URL ="jdbc:mysql://localhost:3306/crusjavabd";
    private static final String BD_USUARIO = ("root");
    private static final String BD_PASSWORD = "ngn9u3tph -u9 [m[080b5eve]]"; 
    

    private static Connection conn;

   
    @SuppressWarnings("CallToPrintStackTrace")
    public static Connection getConexao() {
        try {
            if(conn == null) {

                  conn = DriverManager.getConnection(BD_URL, BD_USUARIO, BD_PASSWORD);
                  return null;
            }else{
                return null;

          }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

}