/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Classes.CarregaEmail;
import Classes.Conexao;
import Classes.Solicitacao;
import java.awt.Dimension;
import java.util.ArrayList;
import Classes.EnvioEmail;
import Classes.Formularios;
import javax.mail.internet.AddressException;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import Views.MenuPrincipal;
import javax.swing.JOptionPane;


public class TelaEnvioEmail extends javax.swing.JInternalFrame {
    Conexao conexao=new Conexao();
    String sql;
    
  

   public void setPosicao() {
    Dimension d = this.getDesktopPane().getSize();
    this.setLocation((d.width - this.getSize().width) / 4, (d.height - this.getSize().height) / 4); }


 
   
    public TelaEnvioEmail(String id) {
        initComponents();
        CarregaEmail obj= new CarregaEmail();
        
        
        
        
       
         sql = "SELECT * FROM coletaseletiva.solicitacao_vw_email where solicitacao_id="+id+";";
      
        Conexao conexao=new Conexao();
        conexao.Conectar();
        
        obj=conexao.EnvioIndividual(sql);
        
       jTidusuario.setText(String.valueOf(obj.getIdusuario()));
       jTidsolicit.setText(String.valueOf(obj.getIdsolicitacao()));
       jTNomeusu.setText(String.valueOf(obj.getNomeusuario()));
       jTEmailCliente.setText(String.valueOf(obj.getEmailusuario()));
                 
            
           
            
    }

    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBenvioemail = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBConfirma = new javax.swing.JButton();
        jLIdusuario = new javax.swing.JLabel();
        jLIdsolic = new javax.swing.JLabel();
        jLNomeusu = new javax.swing.JLabel();
        jLEmailusu = new javax.swing.JLabel();
        jTidusuario = new javax.swing.JTextField();
        jTidsolicit = new javax.swing.JTextField();
        jTNomeusu = new javax.swing.JTextField();
        jTEmailCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        setClosable(true);
        setTitle("Envia Email");

        jBenvioemail.setBackground(new java.awt.Color(204, 204, 204));
        jBenvioemail.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBenvioemail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/imagens/email-envelope-with-arroba-sign (1).png"))); // NOI18N
        jBenvioemail.setText("ENVIAR E-MAIL");
        jBenvioemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBenvioemailActionPerformed(evt);
            }
        });

        jLabel1.setBackground(java.awt.SystemColor.infoText);
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/imagens/icons8-tarefa-concluída-48.png"))); // NOI18N
        jLabel1.setText("Alterar Status Pedido para Aguardando");

        jBConfirma.setBackground(new java.awt.Color(255, 255, 255));
        jBConfirma.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBConfirma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/imagens/confirm.png"))); // NOI18N
        jBConfirma.setText("CONFIRMA");
        jBConfirma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51)));
        jBConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConfirmaActionPerformed(evt);
            }
        });

        jLIdusuario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLIdusuario.setText("ID USUARIO");

        jLIdsolic.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLIdsolic.setText("ID SOLICITAÇÃO");

        jLNomeusu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLNomeusu.setText("NOME USUARIO");

        jLEmailusu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLEmailusu.setText("E-MAIL PRINCIPAL");

        jTidusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTidusuarioMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/imagens/lixeira.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLIdusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTidusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLIdsolic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTidsolicit, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTNomeusu, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLNomeusu, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLEmailusu, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(233, 233, 233))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addComponent(jBenvioemail, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLIdusuario)
                    .addComponent(jLIdsolic)
                    .addComponent(jLNomeusu)
                    .addComponent(jLEmailusu))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTidusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTidsolicit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTNomeusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBenvioemail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBConfirma)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleParent(this);

        setBounds(0, 0, 877, 295);
    }// </editor-fold>//GEN-END:initComponents

    private void jBenvioemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBenvioemailActionPerformed
        EnvioEmail email = new EnvioEmail();
        email.setDestino(jTEmailCliente.getText());
        email.setAssunto("Coleta Programada");
        email.setMsg("Recebemos sua solicitação e a coleta será feita na data agendada! ");
        
        try {
            email.enviar();
            JOptionPane.showMessageDialog(null,"Mensagem Enviada com Sucesso !");
        }catch (AddressException e){
            JOptionPane.showMessageDialog(null,"Não foi possível enviar a mensagem, favor verificar o e-mail cadastrado !\n"+e.getMessage());
        }
    }//GEN-LAST:event_jBenvioemailActionPerformed

    private void jTidusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTidusuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTidusuarioMouseClicked

    private void jBConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfirmaActionPerformed
    
         int confirma = JOptionPane.showConfirmDialog(null,"Deseja Alterar o Status dessa Solicitação?", "Atenção", JOptionPane.YES_NO_OPTION);
         if (confirma == JOptionPane.YES_OPTION){
             
         try {
            String text=String.valueOf(jTidsolicit.getText());
        String sql = "update coleta_tb_solicitacao set solicitacao_rastreamento='Aguardando' where solicitacao_id="+text;
        Conexao conexao=new Conexao();
        conexao.Conectar();
        conexao.comando(sql);
            
         
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e); 
            conexao.Desconecta();
        }     
    }//GEN-LAST:event_jBConfirmaActionPerformed
   
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConfirma;
    private javax.swing.JButton jBenvioemail;
    private javax.swing.JLabel jLEmailusu;
    private javax.swing.JLabel jLIdsolic;
    private javax.swing.JLabel jLIdusuario;
    private javax.swing.JLabel jLNomeusu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTEmailCliente;
    private javax.swing.JTextField jTNomeusu;
    private javax.swing.JTextField jTidsolicit;
    private javax.swing.JTextField jTidusuario;
    // End of variables declaration//GEN-END:variables
}
