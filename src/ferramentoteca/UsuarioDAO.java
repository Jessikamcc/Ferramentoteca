package ferramentoteca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    public Usuario autenticar(String nome, String senha) {
        String sql = "SELECT * FROM usuario WHERE nome = ? AND senha = ?";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

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

    public void inserir(Usuario usuario) throws SQLException {
        String sql = "INSERT INTO usuario (nome, senha, tipo, limiteEmprestimo) VALUES (?, ?, ?, ?)";

        try (Connection con = Conexao.conectar(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getSenha()); 
            ps.setString(3, usuario.getTipo());
            ps.setInt(4, usuario.getLimiteEmprestimo());

            ps.executeUpdate();
        }
    }

    public Usuario buscarPorNome(String nome) throws SQLException {
        String sql = "SELECT * FROM usuario WHERE nome = ?";
        try (Connection con = Conexao.conectar(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, nome);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Usuario u = new Usuario();
                u.setId(rs.getInt("id"));
                u.setNome(rs.getString("nome"));
                u.setSenha(rs.getString("senha"));
                u.setTipo(rs.getString("tipo"));
                u.setLimiteEmprestimo(rs.getInt("limiteEmprestimo"));
                return u;
            }
        }
        return null;
    }

    public void excluir(int id) throws SQLException {
        String sql = "DELETE FROM usuario WHERE id = ?";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }

    public void atualizar(Usuario usuario) throws SQLException {
        String sql = "UPDATE usuario SET nome = ?, senha = ?, tipo = ?, limiteEmprestimo = ? WHERE id = ?";

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getSenha());
            stmt.setString(3, usuario.getTipo());
            stmt.setInt(4, usuario.getLimiteEmprestimo());
            stmt.setInt(5, usuario.getId());

            stmt.executeUpdate();
        }
    }
}
