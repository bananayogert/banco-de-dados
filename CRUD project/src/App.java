import DAO.UsuarioDAO;
import Entity.Usuario;

public class App {
    
   public static void main(String[] args) {
       

    Usuario u = new Usuario();
    u.setNome( "Amelia");
    u.setLogin( "amelia");
    u.setSenha( "7328");
    u.setEmail( "Amelia932@gmail.com");
   

    new UsuarioDAO().cadastrarUsuario(u);
    
    
   }
}
