package ferramentoteca;

import ferramentoteca.view.TelaLogin;
import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
        try {
            Connection conexao = Conexao.conectar();

            if (conexao != null) {
                System.out.println("Conexão bem-sucedida! Abrindo tela de login...");

                // Fecha a conexão após o teste
                conexao.close();

                // Abrir a tela de login com segurança na thread de interface
                java.awt.EventQueue.invokeLater(() -> {
                TelaLogin tela = new TelaLogin();
                tela.setVisible(true);
            });
                
                
            } else {
                System.out.println("Falha na conexão. A aplicação será encerrada.");
            }

        } catch (Exception e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }

    }
}
