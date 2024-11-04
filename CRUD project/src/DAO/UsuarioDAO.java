package DAO;

import conexao.Conexao;

import Entity.Usuario;
import java.sql.SQLException;
import java.sql.PreparedStatement;


public class UsuarioDAO {
    
    
    @SuppressWarnings("CallToPrintStackTrace")
    public void cadastrarUsuario(Usuario usuario) {

        String sql = "INSERT INTO USER (NOME, LOGIN, SENHA, EMAIL) VALUES (?, ? , ? ,?)";

      
        
        

        try {
            PreparedStatement ps = null;
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getLogin());
            ps.setString(3, usuario.getSenha());
            ps.setString(4, usuario.getEmail());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }     
    }
}



    