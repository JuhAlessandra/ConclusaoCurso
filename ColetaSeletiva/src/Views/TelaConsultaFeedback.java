/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Classes.Conexao;
import Classes.ConsultaFeedback;
import java.awt.Dimension;
import java.util.ArrayList;
import java.text.DateFormat;

/**
 *
 * @author 6317059
 */
public class TelaConsultaFeedback extends javax.swing.JInternalFrame {

   

    /**
     * Creates new form TelaStatusSolicitacao
     */
    public TelaConsultaFeedback() {
        initComponents();
        carregafeedback();
    }

    private void carregafeedback(){
        for (int i=0; i<jTableConsultaFeedback.getRowCount();i++) {
        jTableConsultaFeedback.setValueAt("", i, 0);
        jTableConsultaFeedback.setValueAt("", i, 1);
        jTableConsultaFeedback.setValueAt("", i, 2);
        jTableConsultaFeedback.setValueAt("", i, 3);
        jTableConsultaFeedback.setValueAt("", i, 4);
        
        
    }   
        
        String sql="select feedback_id, usuario_id, usuario_nome, feedback_data, feedback_status from feedback_vw where 1=1 ";
        
        
if (jRadioBIdfeedback.isSelected()){
    sql+="and feedback_id = "+jTIdfeedback.getText()+" ";
      
}
if (jRadioBIdusuario.isSelected()){
    sql+="and usuario_id = "+jTIdusuario.getText()+" ";
}
if (jRadioBDatafeed.isSelected()){
  sql+="and feedback_data >= '"+jFdatafeed1.getText()+"' and feedback_data <= '"+jFdatafeed2.getText()+"' ";
    
   
}
        Conexao conexao=new Conexao();
        conexao.Conectar();
        ArrayList<ConsultaFeedback> l = new ArrayList<>();
        l=conexao.consultafed(sql);
        
        for(int i = 0; i< l.size(); i++){
            ConsultaFeedback confed=new ConsultaFeedback();
            confed=l.get(i);
       
            jTableConsultaFeedback.setValueAt(confed.getFeedbackid(),i,0);
            jTableConsultaFeedback.setValueAt(confed.getUsuarioid(),i,1);
            jTableConsultaFeedback.setValueAt(confed.getNomeusuario(),i,2);
            jTableConsultaFeedback.setValueAt(confed.getDatafeed(),i,3);
            jTableConsultaFeedback.setValueAt(confed.getStatusfedd(),i,4);
            
       }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConsultaFeedback = new javax.swing.JTable();
        jBVisualizarFeedback = new javax.swing.JButton();
        jLFiltro = new javax.swing.JLabel();
        jRadioBIdfeedback = new javax.swing.JRadioButton();
        jRadioBIdusuario = new javax.swing.JRadioButton();
        jRadioBDatafeed = new javax.swing.JRadioButton();
        jTIdfeedback = new javax.swing.JTextField();
        jTIdusuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jFdatafeed1 = new javax.swing.JFormattedTextField();
        jFdatafeed2 = new javax.swing.JFormattedTextField();
        jBListafeed = new javax.swing.JButton();

        setClosable(true);
        setTitle("CONSULTA FEEDBACK");

        jTableConsultaFeedback.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null}
            },
            new String [] {
                "ID FEEDBACK", "ID USUÁRIO", "NOME DO USUÁRIO", "DATA COMENTÁRIO", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableConsultaFeedback.setColumnSelectionAllowed(true);
        jTableConsultaFeedback.setDropMode(javax.swing.DropMode.ON_OR_INSERT);
        jScrollPane1.setViewportView(jTableConsultaFeedback);
        jTableConsultaFeedback.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jTableConsultaFeedback.getAccessibleContext().setAccessibleParent(jTableConsultaFeedback);

        jBVisualizarFeedback.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBVisualizarFeedback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/imagens/visualizarpedido2.png"))); // NOI18N
        jBVisualizarFeedback.setText("VISUALIZAR FEEDBACK");
        jBVisualizarFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVisualizarFeedbackActionPerformed(evt);
            }
        });

        jLFiltro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/imagens/filtro.png"))); // NOI18N
        jLFiltro.setText("SELECIONE O FILTRO DESEJADO");

        jRadioBIdfeedback.setText("ID FEEDBACK");
        jRadioBIdfeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBIdfeedbackActionPerformed(evt);
            }
        });

        jRadioBIdusuario.setText("ID USUARIO");
        jRadioBIdusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBIdusuarioActionPerformed(evt);
            }
        });

        jRadioBDatafeed.setText("DATA FEEDBACK");
        jRadioBDatafeed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBDatafeedActionPerformed(evt);
            }
        });

        jTIdfeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTIdfeedbackActionPerformed(evt);
            }
        });

        jTIdusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTIdusuarioActionPerformed(evt);
            }
        });

        jLabel1.setText("ATÉ");

        try {
            jFdatafeed1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFdatafeed2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jBListafeed.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBListafeed.setText("LISTAR");
        jBListafeed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBListafeedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBVisualizarFeedback)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioBIdusuario)
                            .addComponent(jRadioBIdfeedback)
                            .addComponent(jRadioBDatafeed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBListafeed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jFdatafeed1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFdatafeed2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTIdusuario, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                .addComponent(jTIdfeedback)))))
                .addContainerGap(307, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 886, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioBIdfeedback)
                            .addComponent(jTIdfeedback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioBIdusuario)
                            .addComponent(jTIdusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioBDatafeed)
                            .addComponent(jLabel1)
                            .addComponent(jFdatafeed1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFdatafeed2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBListafeed, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBVisualizarFeedback)
                .addContainerGap())
        );

        jScrollPane1.getAccessibleContext().setAccessibleParent(jScrollPane1);

        setBounds(0, 0, 1005, 546);
    }// </editor-fold>//GEN-END:initComponents

    private void jTIdfeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTIdfeedbackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTIdfeedbackActionPerformed

    private void jTIdusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTIdusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTIdusuarioActionPerformed

    private void jBListafeedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListafeedActionPerformed
        carregafeedback();
    }//GEN-LAST:event_jBListafeedActionPerformed

    private void jRadioBIdfeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBIdfeedbackActionPerformed
        jTIdfeedback.setText("");
    }//GEN-LAST:event_jRadioBIdfeedbackActionPerformed

    private void jRadioBIdusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBIdusuarioActionPerformed
       jTIdusuario.setText("");
    }//GEN-LAST:event_jRadioBIdusuarioActionPerformed

    private void jRadioBDatafeedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBDatafeedActionPerformed
       jFdatafeed1.setText("");
       jFdatafeed2.setText("");
    }//GEN-LAST:event_jRadioBDatafeedActionPerformed

    private void jBVisualizarFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVisualizarFeedbackActionPerformed
      String text=String.valueOf(jTableConsultaFeedback.getValueAt(jTableConsultaFeedback.getSelectedRow(), jTableConsultaFeedback.getSelectedColumn()));
TelaConsultaFeed tela = new TelaConsultaFeed(text);
getParent().add(tela);
tela.setVisible(true);
tela.toFront();
tela.setPosicao();
    }//GEN-LAST:event_jBVisualizarFeedbackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBListafeed;
    private javax.swing.JButton jBVisualizarFeedback;
    private javax.swing.JFormattedTextField jFdatafeed1;
    private javax.swing.JFormattedTextField jFdatafeed2;
    private javax.swing.JLabel jLFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioBDatafeed;
    private javax.swing.JRadioButton jRadioBIdfeedback;
    private javax.swing.JRadioButton jRadioBIdusuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTIdfeedback;
    private javax.swing.JTextField jTIdusuario;
    private javax.swing.JTable jTableConsultaFeedback;
    // End of variables declaration//GEN-END:variables
}
