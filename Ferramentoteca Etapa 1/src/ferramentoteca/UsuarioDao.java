package ferramentoteca;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDao {

    public Usuario autenticar(String nome, String senha) {
        String sql = "SELECT * FROM usuario WHERE nome = ? AND senha = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nome);
            stmt.setString(2, senha);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setTipo(rs.getString("tipo"));
                usuario.setLimiteEmprestimo(rs.getInt("limiteEmprestimo"));

                return usuario;
            }
        } catch (SQLException e) {
            System.out.println("Erro na autenticação: " + e.getMessage());
        }

        return null;  
 }
}