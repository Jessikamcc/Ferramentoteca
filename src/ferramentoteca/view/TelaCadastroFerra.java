package ferramentoteca.view;

import ferramentoteca.Ferramenta;
import ferramentoteca.FerramentaDAO;
import java.awt.Color;
import javax.swing.JOptionPane;

public class TelaCadastroFerra extends javax.swing.JFrame {

    private Ferramenta ferramentaAtual;

    public TelaCadastroFerra() {
        initComponents();
        setLocationRelativeTo(null);

        // Inicialmente, desabilita o campo (caso "Disponível" seja o padrão)
        txtMotivoDesativacao.setEnabled(false);

        // Adiciona listeners aos radio buttons
        jRadioButtonDisponivel.addItemListener(e -> {
            if (jRadioButtonDisponivel.isSelected()) {
                txtMotivoDesativacao.setEnabled(false);
                txtMotivoDesativacao.setText(""); // Limpa o campo
            }
        });

        jRadioButtonDesativar.addItemListener(e -> {
            if (jRadioButtonDesativar.isSelected()) {
                txtMotivoDesativacao.setEnabled(true);
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupStatus = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelIdNome = new javax.swing.JLabel();
        txtIdNome = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        jLabelDescricao = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jLabelMarcaModeloCategoria = new javax.swing.JLabel();
        jLabelLocalizacao = new javax.swing.JLabel();
        jComboBoxLocaliza = new javax.swing.JComboBox<>();
        jLabelStatus = new javax.swing.JLabel();
        jRadioButtonDisponivel = new javax.swing.JRadioButton();
        jRadioButtonDesativar = new javax.swing.JRadioButton();
        jLabelMotivo = new javax.swing.JLabel();
        txtMotivoDesativacao = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Ferramentas");
        setSize(new java.awt.Dimension(1440, 1024));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitulo.setText("CADASTRO DE FERRAMENTAS");

        jLabelIdNome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelIdNome.setText("ID ou Nome:");

        txtIdNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtIdNome.setForeground(new java.awt.Color(0, 0, 0));
        txtIdNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdNomeActionPerformed(evt);
            }
        });

        jLabelNome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelNome.setText("Nome:");

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabelDescricao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelDescricao.setText("Descrição:");

        jLabelMarcaModeloCategoria.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabelMarcaModeloCategoria.setText("Marca, Modelo,  Categoria. ");

        jLabelLocalizacao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelLocalizacao.setText("Localização:");

        jComboBoxLocaliza.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBoxLocaliza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma opção", "Estante", "Arquivo", "Oficina", "Caixa de ferramentas" }));
        jComboBoxLocaliza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLocalizaActionPerformed(evt);
            }
        });

        jLabelStatus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelStatus.setText("Status:");

        buttonGroupStatus.add(jRadioButtonDisponivel);
        jRadioButtonDisponivel.setText("Disponível");

        buttonGroupStatus.add(jRadioButtonDesativar);
        jRadioButtonDesativar.setText("Desativar");

        jLabelMotivo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelMotivo.setText("Motivo de desativação:");

        btnLimpar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnAtualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelStatus)
                            .addComponent(jLabelMotivo))
                        .addGap(18, 18, 18)
                        .addComponent(txtMotivoDesativacao))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNome)
                            .addComponent(jLabelIdNome))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtIdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar))
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMarcaModeloCategoria)
                            .addComponent(jLabelDescricao)
                            .addComponent(jLabelLocalizacao))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioButtonDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButtonDesativar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jComboBoxLocaliza, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(btnCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAtualizar)))
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addGap(225, 225, 225))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabelTitulo)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdNome)
                    .addComponent(txtIdNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNome))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelDescricao))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxLocaliza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelLocalizacao))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonDisponivel)
                            .addComponent(jRadioButtonDesativar)
                            .addComponent(jLabelStatus)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelMarcaModeloCategoria)))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMotivoDesativacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMotivo))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtualizar)
                    .addComponent(btnCadastrar)
                    .addComponent(btnLimpar))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String nomeBusca = txtIdNome.getText().trim();

        if (nomeBusca.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite um id ou nome para buscar!", "Aviso",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            FerramentaDAO dao = new FerramentaDAO();
            ferramentaAtual = dao.buscarPorIdOuNome(nomeBusca);

            if (ferramentaAtual == null) {
                JOptionPane.showMessageDialog(this, "Ferramenta não encontrada!", "Aviso",
                        JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            // Preenche os campos com os dados encontrados
            txtNome.setText(ferramentaAtual.getNome());
            txtDescricao.setText(ferramentaAtual.getDescricao());
            jComboBoxLocaliza.setSelectedItem(ferramentaAtual.getLocalizacao());

            if (ferramentaAtual.getStatus().equals("Desativada")) {
                jRadioButtonDesativar.setSelected(true);
                txtMotivoDesativacao.setText(ferramentaAtual.getMotivoDesativacao());
                txtMotivoDesativacao.setEnabled(true);
            } else {
                jRadioButtonDisponivel.setSelected(true);
                txtMotivoDesativacao.setText("");
                txtMotivoDesativacao.setEnabled(false);
            }

            txtNome.setBackground(new Color(230, 255, 230)); // Verde claro
            txtDescricao.setBackground(new Color(230, 255, 230));
            jComboBoxLocaliza.setBackground(new Color(230, 255, 230));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro na busca: " + e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtIdNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdNomeActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        if (validarCampos()) {
            // 1. Criar objeto Ferramenta com os dados
            Ferramenta ferramenta = new Ferramenta();
            ferramenta.setNome(txtNome.getText());
            ferramenta.setDescricao(txtDescricao.getText());
            ferramenta.setLocalizacao(jComboBoxLocaliza.getSelectedItem().toString());
            ferramenta.setStatus(jRadioButtonDisponivel.isSelected() ? "Disponível" : "Desativada");

            if (jRadioButtonDesativar.isSelected()) {
                ferramenta.setMotivoDesativacao(txtMotivoDesativacao.getText());
            }

            // 2. Chamar o DAO para salvar no banco
            try {
                FerramentaDAO dao = new FerramentaDAO();
                dao.cadastrar(ferramenta);
                JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                limparCampos(); // Método opcional para resetar o formulário
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void jComboBoxLocalizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLocalizaActionPerformed
   
    }//GEN-LAST:event_jComboBoxLocalizaActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed

        if (ferramentaAtual == null) {
            JOptionPane.showMessageDialog(this, "Busque uma ferramenta primeiro!",
                    "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja atualizar esta ferramenta?",
                "Confirmar Atualização", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return; // Se o usuário clicar em "Não", aborta a operação
        }

        if (!validarCampos()) {
            return;
        }

        // Atualiza o objeto com os novos valores
        ferramentaAtual.setNome(txtNome.getText());
        ferramentaAtual.setDescricao(txtDescricao.getText());
        ferramentaAtual.setLocalizacao(jComboBoxLocaliza.getSelectedItem().toString());
        ferramentaAtual.setStatus(jRadioButtonDisponivel.isSelected() ? "Disponível" : "Desativada");

        if (jRadioButtonDesativar.isSelected()) {
            ferramentaAtual.setMotivoDesativacao(txtMotivoDesativacao.getText());
        } else {
            ferramentaAtual.setMotivoDesativacao(null);
        }

        try {
            FerramentaDAO dao = new FerramentaDAO();
            dao.atualizar(ferramentaAtual);
            JOptionPane.showMessageDialog(this, "Ferramenta atualizada com sucesso!",
                    "Sucesso", JOptionPane.INFORMATION_MESSAGE);

           
            limparCampos();
            ferramentaAtual = null;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao atualizar: " + e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    /**
     * @param args the command line arguments
     */
    private boolean validarCampos() {
      

        if (txtNome.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha o campo Nome!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (txtDescricao.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha o campo Descrição!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        
        if (jComboBoxLocaliza.getSelectedIndex() == 0) { 
            JOptionPane.showMessageDialog(this, "Selecione uma Localização!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }

       
        if (jRadioButtonDesativar.isSelected() && txtMotivoDesativacao.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha o Motivo de Desativação!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        return true; 
    }

    private void limparCampos() {
        txtIdNome.setText("");
        txtNome.setText("");
        txtDescricao.setText("");
        txtMotivoDesativacao.setText("");
        jComboBoxLocaliza.setSelectedIndex(0); // Volta para o primeiro item
        jRadioButtonDisponivel.setSelected(true); // Seleciona "Disponível" por padrão
        txtMotivoDesativacao.setEnabled(false);

        
        txtIdNome.setEditable(true);
        txtIdNome.setBackground(Color.WHITE);
        txtNome.setBackground(Color.WHITE);
        txtDescricao.setBackground(Color.WHITE);
        jComboBoxLocaliza.setBackground(Color.WHITE);
        ferramentaAtual = null;
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFerra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFerra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFerra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFerra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroFerra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.ButtonGroup buttonGroupStatus;
    private javax.swing.JComboBox<String> jComboBoxLocaliza;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelIdNome;
    private javax.swing.JLabel jLabelLocalizacao;
    private javax.swing.JLabel jLabelMarcaModeloCategoria;
    private javax.swing.JLabel jLabelMotivo;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonDesativar;
    private javax.swing.JRadioButton jRadioButtonDisponivel;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtIdNome;
    private javax.swing.JTextField txtMotivoDesativacao;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
