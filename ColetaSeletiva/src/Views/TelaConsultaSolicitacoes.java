/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.sql.*;
import Classes.Conexao;
import Classes.Solicitacao;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author 6317059
 */
public class TelaConsultaSolicitacoes extends javax.swing.JInternalFrame {
//    Connection con = null;
    Conexao conexao=new Conexao();
    /**
     * Creates new form TelaStatusSolicitacao
     */
    public TelaConsultaSolicitacoes() {
        initComponents();
        
        carregatabela();
    }

    private void carregatabela(){
    for (int i=0; i<jTableConsultaSolicitacao.getRowCount();i++) {
        jTableConsultaSolicitacao.setValueAt("", i, 0);
        jTableConsultaSolicitacao.setValueAt("", i, 1);
        jTableConsultaSolicitacao.setValueAt("", i, 2);
        jTableConsultaSolicitacao.setValueAt("", i, 3);
        jTableConsultaSolicitacao.setValueAt("", i, 4);
        jTableConsultaSolicitacao.setValueAt("", i, 5);
        jTableConsultaSolicitacao.setValueAt("", i, 6);
    }   
String sql="select * from coleta_tb_solicitacao where 1=1 ";
if (jRadioButtonData.isSelected()){
    sql+="and solicitacao_data >= '"+jFdatainicio.getText()+"' and solicitacao_data <= '"+jFDatafinal.getText()+"' ";
      
}
 
if (jRIdUsuario.isSelected()){
    sql+="and usuario_id = "+jTIDusuario.getText()+" ";
}
if (jRBIdSolicitacao.isSelected()){
    sql+="and solicitacao_id = "+jTIDsol.getText()+" ";
}
      

        Conexao conexao=new Conexao();
        conexao.Conectar();
        ArrayList<Solicitacao> l = new ArrayList<>();
        l=conexao.busca(sql);
        
        for(int i = 0; i< l.size(); i++){
            Solicitacao sol=new Solicitacao();
            sol=l.get(i);
            jTableConsultaSolicitacao.setValueAt(sol.getUsuario(), i, 6);
            jTableConsultaSolicitacao.setValueAt(sol.getId(), i, 0);
            jTableConsultaSolicitacao.setValueAt(sol.getData(), i, 1);
            jTableConsultaSolicitacao.setValueAt(sol.getTiporesiduo(), i, 4);
            jTableConsultaSolicitacao.setValueAt(sol.getDescricao(), i, 2);
            jTableConsultaSolicitacao.setValueAt(sol.getQuantidade(), i, 5);
            jTableConsultaSolicitacao.setValueAt(sol.getRastreamento(), i, 3);
        }
                    
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConsultaSolicitacao = new javax.swing.JTable();
        jBVisualizarStatus = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jFdatainicio = new javax.swing.JFormattedTextField();
        jRadioButtonData = new javax.swing.JRadioButton();
        jFDatafinal = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRIdUsuario = new javax.swing.JRadioButton();
        jTIDusuario = new javax.swing.JTextField();
        jRBIdSolicitacao = new javax.swing.JRadioButton();
        jTIDsol = new javax.swing.JTextField();
        jButtonListar = new javax.swing.JButton();

        setClosable(true);
        setTitle("CONSULTA SOLICITAÇÃO");

        jTableConsultaSolicitacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID DA SOLICITAÇÃO", "DATA DA COLETA", "DESCRIÇÃO", "RASTREAMENTO", "TIPO RESÍDUO", "QUANTIDADE", "ID USUÁRIO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableConsultaSolicitacao.setColumnSelectionAllowed(true);
        jTableConsultaSolicitacao.setDropMode(javax.swing.DropMode.ON_OR_INSERT);
        jScrollPane1.setViewportView(jTableConsultaSolicitacao);
        jTableConsultaSolicitacao.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jTableConsultaSolicitacao.getAccessibleContext().setAccessibleParent(jTableConsultaSolicitacao);

        jBVisualizarStatus.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBVisualizarStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/imagens/visualizarpedido2.png"))); // NOI18N
        jBVisualizarStatus.setText("VISUALIZAR SOLICITAÇÃO");
        jBVisualizarStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVisualizarStatusActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/imagens/filtro.png"))); // NOI18N
        jLabel4.setText("SELECIONE O FILTRO DESEJADO");

        try {
            jFdatainicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jRadioButtonData.setText("DATA");
        jRadioButtonData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonDataActionPerformed(evt);
            }
        });

        try {
            jFDatafinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel1.setText("PERÍODO DE");

        jLabel2.setText("ATÉ");

        jRIdUsuario.setText("ID USUÁRIO");
        jRIdUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRIdUsuarioActionPerformed(evt);
            }
        });

        jRBIdSolicitacao.setText("ID SOLICITAÇÃO");
        jRBIdSolicitacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBIdSolicitacaoActionPerformed(evt);
            }
        });

        jButtonListar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonListar.setText("LISTAR");
        jButtonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarActionPerformed(evt);
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1039, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRBIdSolicitacao)
                                .addGap(23, 23, 23)
                                .addComponent(jTIDsol, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonListar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRIdUsuario)
                                        .addGap(47, 47, 47)
                                        .addComponent(jTIDusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButtonData, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jFdatainicio, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFDatafinal, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 353, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBVisualizarStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFdatainicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonData)
                    .addComponent(jFDatafinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRIdUsuario)
                    .addComponent(jTIDusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTIDsol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRBIdSolicitacao)
                    .addComponent(jButtonListar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jBVisualizarStatus)
                .addGap(25, 25, 25))
        );

        jScrollPane1.getAccessibleContext().setAccessibleParent(jScrollPane1);

        setBounds(0, 0, 1088, 561);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarActionPerformed
        carregatabela();
    }//GEN-LAST:event_jButtonListarActionPerformed

    private void jBVisualizarStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVisualizarStatusActionPerformed
String text=String.valueOf(jTableConsultaSolicitacao.getValueAt(jTableConsultaSolicitacao.getSelectedRow(), jTableConsultaSolicitacao.getSelectedColumn()));
TelaPedidoIndividual tela = new TelaPedidoIndividual(text);
getParent().add(tela);
tela.setVisible(true);
tela.toFront();
tela.setPosicao();
    }//GEN-LAST:event_jBVisualizarStatusActionPerformed

    private void jRadioButtonDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonDataActionPerformed
       jFdatainicio.setText("");
       jFDatafinal.setText("");
    }//GEN-LAST:event_jRadioButtonDataActionPerformed

    private void jRIdUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRIdUsuarioActionPerformed
      jTIDusuario.setText("");
    }//GEN-LAST:event_jRIdUsuarioActionPerformed

    private void jRBIdSolicitacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBIdSolicitacaoActionPerformed
     jTIDsol.setText("");
    }//GEN-LAST:event_jRBIdSolicitacaoActionPerformed
      
 
             


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBVisualizarStatus;
    private javax.swing.JButton jButtonListar;
    private javax.swing.JFormattedTextField jFDatafinal;
    private javax.swing.JFormattedTextField jFdatainicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRBIdSolicitacao;
    private javax.swing.JRadioButton jRIdUsuario;
    private javax.swing.JRadioButton jRadioButtonData;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTIDsol;
    private javax.swing.JTextField jTIDusuario;
    private javax.swing.JTable jTableConsultaSolicitacao;
    // End of variables declaration//GEN-END:variables

   
}
