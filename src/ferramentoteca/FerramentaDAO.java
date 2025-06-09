package ferramentoteca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FerramentaDAO {

    public void cadastrar(Ferramenta ferramenta) {
        Connection con = Conexao.conectar();

        String sql = "INSERT INTO ferramenta (nome, descricao, localizacao, status, motivoDesativacao) VALUES (?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, ferramenta.getNome());
            ps.setString(2, ferramenta.getDescricao());
            ps.setString(3, ferramenta.getLocalizacao());
            ps.setString(4, ferramenta.getStatus());
            ps.setString(5, ferramenta.getMotivoDesativacao());

            ps.executeUpdate();
            System.out.println("Ferramenta adicionada com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao adicionar ferramenta: " + e);
        } finally {
            Conexao.desconectar(con);
        }
    }

    public Ferramenta buscarPorIdOuNome(String criterio) {
        Connection con = Conexao.conectar();
        String sql = "SELECT * FROM ferramenta WHERE id = ? OR nome LIKE ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            
            try {
                int id = Integer.parseInt(criterio);
                ps.setInt(1, id);
            } catch (NumberFormatException e) {
                ps.setInt(1, -1); 
            }

            ps.setString(2, "%" + criterio + "%"); 

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Ferramenta f = new Ferramenta();
                f.setId(rs.getInt("id"));
                f.setNome(rs.getString("nome"));
                f.setDescricao(rs.getString("descricao"));
                f.setLocalizacao(rs.getString("localizacao"));
                f.setStatus(rs.getString("status"));
                f.setMotivoDesativacao(rs.getString("motivoDesativacao"));
                return f;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar ferramenta: " + e);
        } finally {
            Conexao.desconectar(con);
        }
        return null;
    }

    public void atualizar(Ferramenta ferramenta) {
        Connection con = Conexao.conectar();

        String sql = "UPDATE ferramenta SET nome = ?, descricao = ?, localizacao = ?, "
                + "status = ?, motivoDesativacao = ? WHERE id = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, ferramenta.getNome());
            ps.setString(2, ferramenta.getDescricao());
            ps.setString(3, ferramenta.getLocalizacao());
            ps.setString(4, ferramenta.getStatus());
            ps.setString(5, ferramenta.getMotivoDesativacao());
            ps.setInt(6, ferramenta.getId());

            ps.executeUpdate();
            System.out.println("Ferramenta atualizada com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar ferramenta: " + e);
        } finally {
            Conexao.desconectar(con);
        }
    }

    public Ferramenta buscarParaEmprestimo(String criterio) {
        Connection con = Conexao.conectar();
        String sql = "SELECT * FROM ferramenta WHERE (id = ? OR nome LIKE ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

        
            try {
                int id = Integer.parseInt(criterio);
                ps.setInt(1, id);
            } catch (NumberFormatException e) {
                ps.setInt(1, -1); 
            }

            ps.setString(2, "%" + criterio + "%");
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Ferramenta f = new Ferramenta();
                f.setId(rs.getInt("id"));
                f.setNome(rs.getString("nome"));
                f.setDescricao(rs.getString("descricao"));
                f.setLocalizacao(rs.getString("localizacao"));
                f.setStatus(rs.getString("status"));
                return f;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar ferramenta para empréstimo: " + e);
        } finally {
            Conexao.desconectar(con);
        }
        return null;
    }

    public List<Ferramenta> listarTodos() throws SQLException {
        List<Ferramenta> lista = new ArrayList<>();
        String sql = "SELECT * FROM ferramenta";

       
        Connection con = Conexao.conectar();

        try (PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Ferramenta f = new Ferramenta();
                f.setId(rs.getInt("id"));
                f.setNome(rs.getString("nome"));
                f.setStatus(rs.getString("status"));
                f.setLocalizacao(rs.getString("localizacao"));
                f.setMotivoDesativacao(rs.getString("motivoDesativacao"));
                lista.add(f);
            }

        } catch (SQLException e) {
            throw e; 
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }

        return lista;
    }

}
