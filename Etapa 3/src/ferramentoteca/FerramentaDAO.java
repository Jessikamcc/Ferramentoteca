package ferramentoteca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FerramentaDAO {

    public void cadastrar (Ferramenta ferramenta) {
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

}
