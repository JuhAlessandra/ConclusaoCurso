/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Classes.Conexao;
import Classes.EnvioEmail;
import Classes.NovoFeedback;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.internet.AddressException;
import javax.swing.JOptionPane;
import static org.hibernate.criterion.Expression.sql;

/**
 *
 * @author julya
 */
public class TelaFeedback extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaFeedback
     */
    public TelaFeedback() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTComentarioRecebido = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTResponderComentario = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTListaFeedback = new javax.swing.JTable();
        jBEnviarResposta = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jBListar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TextEmailFeed = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("FEEDBACK");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(795, 547));
        getContentPane().setLayout(null);

        jTComentarioRecebido.setColumns(20);
        jTComentarioRecebido.setRows(5);
        jScrollPane2.setViewportView(jTComentarioRecebido);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(800, 80, 370, 161);

        jTResponderComentario.setColumns(20);
        jTResponderComentario.setRows(5);
        jScrollPane4.setViewportView(jTResponderComentario);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(800, 350, 370, 161);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/imagens/responderfeedback.png"))); // NOI18N
        jLabel1.setText("RESPONDER COMENTÁRIO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(810, 310, 250, 30);

        jTListaFeedback.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID FEEDBACK", "ID DO USUÁRIO", "NOME DO USUÁRIO", "DATA FEEDBACK", "QUALIFICAÇÃO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTListaFeedback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTListaFeedbackMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTListaFeedback);
        if (jTListaFeedback.getColumnModel().getColumnCount() > 0) {
            jTListaFeedback.getColumnModel().getColumn(0).setMinWidth(100);
            jTListaFeedback.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTListaFeedback.getColumnModel().getColumn(1).setMinWidth(100);
            jTListaFeedback.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTListaFeedback.getColumnModel().getColumn(2).setMinWidth(150);
            jTListaFeedback.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTListaFeedback.getColumnModel().getColumn(3).setMinWidth(100);
            jTListaFeedback.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 80, 740, 250);

        jBEnviarResposta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBEnviarResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/imagens/enviofeedback.png"))); // NOI18N
        jBEnviarResposta.setText("ENVIAR RESPOSTA");
        jBEnviarResposta.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jBEnviarResposta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBEnviarRespostaMouseClicked(evt);
            }
        });
        jBEnviarResposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEnviarRespostaActionPerformed(evt);
            }
        });
        getContentPane().add(jBEnviarResposta);
        jBEnviarResposta.setBounds(970, 520, 200, 40);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/imagens/mensagemrecebida_feedback.png"))); // NOI18N
        jLabel3.setText("MENSAGEM RECEBIDA");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(810, 30, 230, 40);

        jBListar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/imagens/pesquisa_feedback.png"))); // NOI18N
        jBListar.setText("LISTAR COMENTÁRIO");
        jBListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBListarActionPerformed(evt);
            }
        });
        getContentPane().add(jBListar);
        jBListar.setBounds(10, 20, 220, 40);

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("E-mail do Solicitante");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(280, 430, 150, 30);
        getContentPane().add(TextEmailFeed);
        TextEmailFeed.setBounds(440, 430, 330, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/imagens/email_icon8.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(220, 420, 50, 50);

        setSize(new java.awt.Dimension(1208, 612));
    }// </editor-fold>//GEN-END:initComponents

    private void jBEnviarRespostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEnviarRespostaActionPerformed
        String id_feedback=String.valueOf(jTListaFeedback.getValueAt(jTListaFeedback.getSelectedRow(),0));
        String sql = "update coleta_tb_feedback set feedback_status='Respondido', feedback_resposta='"+jTResponderComentario.getText()+"' where feedback_id="+id_feedback;
        
     jTResponderComentario.setText("");
        
        
       
        
        Conexao conexao=new Conexao();
        conexao.Conectar();
        conexao.comando(sql);
        
        
        EnvioEmail email = new EnvioEmail();
        email.setDestino(TextEmailFeed.getText());
        email.setAssunto("Retorno de Feedback");
        email.setMsg(jTResponderComentario.getText());
        
        try {
            email.enviar();
            JOptionPane.showMessageDialog(null,"Mensagem Enviada com Sucesso !");
        }catch (AddressException e){
            JOptionPane.showMessageDialog(null,"Não foi possível enviar a mensagem, favor verificar o e-mail cadastrado !\n"+e.getMessage());
           
        }
          
    }//GEN-LAST:event_jBEnviarRespostaActionPerformed

    
    
    private void jBListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListarActionPerformed
    String sql="select feedback_id, usuario_id, usuario_nome, feedback_data , feedback_qualificacao from coleta_vw_feedback where feedback_status='Enviado'";
        Conexao conexao=new Conexao();
        conexao.Conectar();
        ArrayList<NovoFeedback> l = new ArrayList<>();
        l=conexao.buscafeedback(sql);
        for(int i = 0; i< l.size(); i++){
            NovoFeedback fed=new NovoFeedback();
            fed=l.get(i);
            
            jTListaFeedback.setValueAt(fed.getFeedbackid(), i, 0);
            jTListaFeedback.setValueAt(fed.getIdusuario(), i, 1);
            jTListaFeedback.setValueAt(fed.getNomeusuario(), i, 2);
            jTListaFeedback.setValueAt(fed.getFeedbackdata(), i, 3);
            jTListaFeedback.setValueAt(fed.getFeedbackqualifica(), i, 4);
             
            
        }
    }//GEN-LAST:event_jBListarActionPerformed

    private void jTListaFeedbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTListaFeedbackMouseClicked
      String id_feedback=String.valueOf(jTListaFeedback.getValueAt(jTListaFeedback.getSelectedRow(),0));
      String sql="select * from coleta_vw_feedback where feedback_id="+id_feedback;
      
        Conexao conexao=new Conexao();
        conexao.Conectar();
        ResultSet rstemp= conexao.buscaRelatorio(sql);
        try {
            rstemp.first();
            jTComentarioRecebido.setText(rstemp.getString("feedback_critica"));
            TextEmailFeed.setText(rstemp.getString("email_particular"));
        } catch (SQLException ex) {
            Logger.getLogger(TelaFeedback.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
            
    }//GEN-LAST:event_jTListaFeedbackMouseClicked

    private void jBEnviarRespostaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEnviarRespostaMouseClicked
        
        
    }//GEN-LAST:event_jBEnviarRespostaMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextEmailFeed;
    private javax.swing.JButton jBEnviarResposta;
    private javax.swing.JButton jBListar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTComentarioRecebido;
    private javax.swing.JTable jTListaFeedback;
    private javax.swing.JTextArea jTResponderComentario;
    // End of variables declaration//GEN-END:variables
}