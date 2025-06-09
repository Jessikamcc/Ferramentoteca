package ferramentoteca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class EmprestimoDAO {

    public void registrarEmprestimo(Emprestimo emprestimo) throws SQLException {
        Connection con = Conexao.conectar();

        String sql = "INSERT INTO emprestimo (usuarioId, ferramentaId, professor_nome, dataEmprestimo, dataDevolucao, status) "
                + "VALUES (?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, emprestimo.getUsuarioId());          
            ps.setInt(2, emprestimo.getFerramentaId());       
            ps.setString(3, emprestimo.getProfessorNome());    
            ps.setDate(4, new java.sql.Date(emprestimo.getDataEmprestimo().getTime()));  
            ps.setDate(5, new java.sql.Date(emprestimo.getDataDevolucao().getTime()));   
            ps.setString(6, emprestimo.getStatus());          

            ps.executeUpdate();
            System.out.println("Empréstimo registrado com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao registrar empréstimo: " + e);
            throw e;  
        } finally {
            Conexao.desconectar(con);
        }
    }

    public Emprestimo buscarEmprestimoAtivoPorFerramenta(int ferramentaId) throws SQLException {
        String sql = "SELECT * FROM emprestimo WHERE ferramentaId = ? AND status = 'Emprestado' LIMIT 1";

        Connection con = Conexao.conectar();

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, ferramentaId);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Emprestimo e = new Emprestimo();
                    e.setId(rs.getInt("id"));
                    e.setFerramentaId(rs.getInt("ferramentaId"));
                    e.setUsuarioId(rs.getInt("usuarioId"));
                    e.setProfessorNome(rs.getString("professor_nome")); 
                    e.setDataEmprestimo(rs.getDate("dataEmprestimo"));
                    e.setDataDevolucao(rs.getDate("dataDevolucao"));
                    e.setStatus(rs.getString("status"));
                    // preencha outros campos se precisar
                    return e;
                }
            }
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }

        return null; 
    }

}
