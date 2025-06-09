package ferramentoteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String URL = "jdbc:mysql://localhost/ferramentoteca";
    private static final String USUARIO = "root";
    private static final String SENHA = "1234";

    // Método para conectar e retornar a conexão
    public static Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            System.out.println("SUCESSO DE CONEXÃO!");
            return conexao;
        } catch (ClassNotFoundException cn) {
            System.out.println("Falha ao conectar com o banco: " + cn);
            return null;
        } catch (SQLException sql) {
            System.out.println("Erro de SQL: " + sql);
            return null;
        }
    }

    // Método para desconectar o banco
    public static void desconectar(Connection conexao) {
        if (conexao != null) {
            try {
                conexao.close();
                System.out.println("DESCONECTADO!");
            } catch (SQLException se) {
                System.out.println("Problema ao desconectar do banco: " + se);
            }
        }
    }
}
