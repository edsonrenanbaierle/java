package view;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.*;

/**
 *
 * @author supti
 */
public class FrmAtendimento extends javax.swing.JFrame {

    private Auxiliar aux = null;

    /**
     * Creates new form FrmAtendimento
     */
    public FrmAtendimento() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbCliente = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbAtendente = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAtendimentos = new javax.swing.JTable();
        btnGravar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registros de atendimento");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        cmbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClienteActionPerformed(evt);
            }
        });

        jLabel1.setText("Cliente:");

        jLabel2.setText("Atendente:");

        jLabel3.setText("Descrição do atendimento:");

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane2.setViewportView(txtDescricao);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Atendimentos anteriores deste cliente"));

        tblAtendimentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Atendente", "Descrição do atendimento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAtendimentos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
        );

        btnGravar.setMnemonic('G');
        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbAtendente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbAtendente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGravar)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            //evento que ocorre ao abrir o formulário
            
            //instanciaro objeto que vou usar para acessar o BD
            aux = new Auxiliar();

            //carregar as combos e deixar nenhum selecionado                                    
            carregaCombo(cmbAtendente, aux.retornaAtendentes());
            carregaCombo(cmbCliente, aux.retornaClientes());
            cmbAtendente.setSelectedIndex(-1);
            cmbCliente.setSelectedIndex(-1);

        } catch (ClassNotFoundException | SQLException ex) {
            //exibir uma mensagem de erro e também registrar o log
            JOptionPane.showMessageDialog(this, ex.toString(), "ERRO", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(FrmAtendimento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void cmbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClienteActionPerformed
        try {
            //quando um cliente for selecionado na combo, vou recarregar a jTable
            carregaTabela();
        } catch (ClassNotFoundException | SQLException ex) {
            //exibir uma mensagem de erro e também registrar o log
            JOptionPane.showMessageDialog(this, ex.toString(), "ERRO", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(FrmAtendimento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbClienteActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        try {
            //Validações-------
            if (txtDescricao.getText().length() == 0) {
                JOptionPane.showMessageDialog(this, "Favor informar uma descrição", "VALIDAÇÃO", JOptionPane.WARNING_MESSAGE);
                txtDescricao.requestFocus();
                return;
            }
            Cliente cliente = (Cliente) cmbCliente.getSelectedItem();
            if (cliente == null) {
                JOptionPane.showMessageDialog(this, "Favor informar o cliente", "VALIDAÇÃO", JOptionPane.WARNING_MESSAGE);
                cmbCliente.requestFocus();
                return;
            }
            Atendente atendente = (Atendente) cmbAtendente.getSelectedItem();
            if (atendente == null) {
                JOptionPane.showMessageDialog(this, "Favor informar o atendente", "VALIDAÇÃO", JOptionPane.WARNING_MESSAGE);
                cmbAtendente.requestFocus();
                return;
            }
            //---Fim das validações---------

            

            aux.inserirAtendimento(atendente, cliente, txtDescricao.getText());
            //se foi tudo certo, então mostro mensagem e limpo os campos
            JOptionPane.showMessageDialog(this, "Atendimento salvo com sucesso!", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
            txtDescricao.setText("");
            cmbAtendente.setSelectedIndex(-1);
            cmbCliente.setSelectedIndex(-1);
            carregaTabela();

        } catch (ClassNotFoundException | SQLException ex) {
            //exibir uma mensagem de erro e também registrar o log
            JOptionPane.showMessageDialog(this, ex.toString(), "ERRO", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(FrmAtendimento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGravarActionPerformed

    //método para carregar a combo passada por parâmetro com a lista
    //assim posso utilizar para carregar ambas as combos
    private void carregaCombo(JComboBox cmb, ArrayList lst) {
        cmb.removeAllItems();
        for (int i = 0; i < lst.size(); i++) {
            cmb.addItem(lst.get(i));
        }
    }

    //método para carregar a tabela com o cliente da combo
    private void carregaTabela() throws ClassNotFoundException, SQLException {
        DefaultTableModel model = (DefaultTableModel) tblAtendimentos.getModel();
        model.setRowCount(0);//limpar as linhas antigas da jTable

        Pessoa c = (Pessoa) cmbCliente.getSelectedItem();
        if (c != null) {//se tenho um cliente escolhido na combo então...
            //Peço para a camada de acesso aos dados a lista de atendimentos
            //deste cliente
            ArrayList<Atendimento> lst = aux.retornaAtendimentosCliente(c.getId());

            for (int i = 0; i < lst.size(); i++) {
                //adicionar cada atendimento no JTable
                Object[] obj = new Object[2];//vetor para as 2 colunas
                obj[0] = lst.get(i).getNomeAtendente();
                obj[1] = lst.get(i).getDescricao();

                model.addRow(obj);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrmAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAtendimento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGravar;
    private javax.swing.JComboBox<Pessoa> cmbAtendente;
    private javax.swing.JComboBox<Pessoa> cmbCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblAtendimentos;
    private javax.swing.JTextArea txtDescricao;
    // End of variables declaration//GEN-END:variables
}
