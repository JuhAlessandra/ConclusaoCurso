/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Classes.Conexao;
import Classes.ConsultaIndividual;
import Classes.Solicitacao;
import Classes.Formularios;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author julya
 */
public class TelaPedidoIndividual extends javax.swing.JInternalFrame {
    
    Conexao conexao=new Conexao();
    String sql;
    Formularios form = new Formularios();

    /**
     * Creates new form TelaPedido
     */
    public TelaPedidoIndividual(String id) {
        initComponents();
        ConsultaIndividual obj= new ConsultaIndividual();
        
        sql = "SELECT * FROM coletaseletiva.solicitacao_vw_sol where solicitacao_id="+id+";";
        Conexao conexao=new Conexao();
        conexao.Conectar();
  
        obj=conexao.buscaIndividual(sql);
       
   jTIdSolicitacao.setText(String.valueOf(obj.getIdsolicitacao()));
   jTusuario_id.setText(String.valueOf(obj.getIdusuario()));
   jFColeta_data.setText(String.valueOf(obj.getDatacoleta()));
   jTusuario_nome.setText(obj.getNomeusuario());
   jFTelefoneCelular.setText(obj.getTelefoneUsuario());
   jTenderecoLogradouro.setText(obj.getEnderecoRua());
   jTenderecoNumero.setText(String.valueOf(obj.getEndereconumero()));
   jTBairro.setText(obj.getBairro());
   jTenderecoCidade.setText(obj.getCidade());
   jTCep.setText(obj.getEnderecoCep());
   jTsolicitacao_descricao.setText(obj.getDescricaoSolicitacao());
   jTTiporesiduo.setText(obj.getTiporesiduo());
   
   
   
    }
public void setPosicao() {
    Dimension d = this.getDesktopPane().getSize();
    this.setLocation((d.width - this.getSize().width) / 3, (d.height - this.getSize().height) / 3); }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLDescricao = new javax.swing.JLabel();
        jLTipoResiduo = new javax.swing.JLabel();
        jFColeta_data = new javax.swing.JFormattedTextField();
        jLIdusuario = new javax.swing.JLabel();
        jLDataColeta = new javax.swing.JLabel();
        jLNomeusuario = new javax.swing.JLabel();
        jLEnderecoRua = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTsolicitacao_descricao = new javax.swing.JTextArea();
        jTusuario_nome = new javax.swing.JTextField();
        jTenderecoCidade = new javax.swing.JTextField();
        jTusuario_id = new javax.swing.JTextField();
        jTTiporesiduo = new javax.swing.JTextField();
        jTenderecoNumero = new javax.swing.JTextField();
        jLEnderecoNumero = new javax.swing.JLabel();
        jTenderecoLogradouro = new javax.swing.JTextField();
        jLEnderecoCep = new javax.swing.JLabel();
        jLCidade = new javax.swing.JLabel();
        jTCep = new javax.swing.JTextField();
        jLTelefone = new javax.swing.JLabel();
        jFTelefoneCelular = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jTIdSolicitacao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTBairro = new javax.swing.JTextField();
        jBImprimePedido = new javax.swing.JButton();

        setClosable(true);
        setTitle("CONSULTA SOLICITAÇÂO");
        setToolTipText("");
        setVisible(true);

        jLDescricao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLDescricao.setForeground(new java.awt.Color(51, 51, 51));
        jLDescricao.setText("DESCRIÇÃO DA SOLICITAÇÃO ");

        jLTipoResiduo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLTipoResiduo.setForeground(new java.awt.Color(51, 51, 51));
        jLTipoResiduo.setText("TIPO DE RESÍDUO");

        jFColeta_data.setForeground(new java.awt.Color(102, 51, 0));
        try {
            jFColeta_data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFColeta_data.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jFColeta_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFColeta_dataActionPerformed(evt);
            }
        });

        jLIdusuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLIdusuario.setForeground(new java.awt.Color(51, 51, 51));
        jLIdusuario.setText("ID DO USUÁRIO");

        jLDataColeta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLDataColeta.setForeground(new java.awt.Color(51, 51, 51));
        jLDataColeta.setText("DATA DA COLETA");

        jLNomeusuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLNomeusuario.setForeground(new java.awt.Color(51, 51, 51));
        jLNomeusuario.setText("NOME DO USUÁRIO");

        jLEnderecoRua.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLEnderecoRua.setForeground(new java.awt.Color(51, 51, 51));
        jLEnderecoRua.setText("ENDEREÇO DE COLETA NOME RUA ");

        jTsolicitacao_descricao.setColumns(20);
        jTsolicitacao_descricao.setRows(5);
        jScrollPane1.setViewportView(jTsolicitacao_descricao);

        jTusuario_nome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTenderecoCidade.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTusuario_id.setEditable(false);
        jTusuario_id.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTusuario_id.setEnabled(false);
        jTusuario_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTusuario_idActionPerformed(evt);
            }
        });

        jTenderecoNumero.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLEnderecoNumero.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLEnderecoNumero.setForeground(new java.awt.Color(51, 51, 51));
        jLEnderecoNumero.setText("ENDEREÇO DE COLETA Nº");

        jTenderecoLogradouro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLEnderecoCep.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLEnderecoCep.setForeground(new java.awt.Color(51, 51, 51));
        jLEnderecoCep.setText("ENDEREÇO CEP");

        jLCidade.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLCidade.setText("CIDADE");

        jTCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCepActionPerformed(evt);
            }
        });

        jLTelefone.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLTelefone.setText("TELEFONE ");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("ID DA SOLICITACAO");

        jTIdSolicitacao.setEditable(false);
        jTIdSolicitacao.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("BAIRRO");

        jBImprimePedido.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBImprimePedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/imagens/icons8-impressão-48.png"))); // NOI18N
        jBImprimePedido.setText("IMPRIMIR PEDIDO");
        jBImprimePedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImprimePedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(247, 247, 247)
                        .addComponent(jBImprimePedido))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(113, 113, 113)
                                .addComponent(jLTipoResiduo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLDataColeta, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jFColeta_data, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addComponent(jTTiporesiduo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLIdusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTusuario_id)
                            .addComponent(jTIdSolicitacao, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLNomeusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jTusuario_nome))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLEnderecoRua)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTenderecoLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jFTelefoneCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLEnderecoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTenderecoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTenderecoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLEnderecoCep, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTCep, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(277, 277, 277))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTIdSolicitacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTusuario_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLIdusuario)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLNomeusuario))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTusuario_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLTelefone)
                        .addComponent(jFTelefoneCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLEnderecoNumero)
                        .addComponent(jTenderecoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTenderecoLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLEnderecoRua)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCidade)
                    .addComponent(jTenderecoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLEnderecoCep)
                    .addComponent(jTCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLDataColeta))
                    .addComponent(jFColeta_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTTiporesiduo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLDescricao)
                            .addComponent(jLTipoResiduo))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(jBImprimePedido, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );

        setBounds(0, 0, 963, 556);
    }// </editor-fold>//GEN-END:initComponents
    
   private void imprime_individual(){
       
       try {
           
            HashMap filtro = new HashMap();
            filtro.put("Solicitacao_id", Integer.parseInt(jTIdSolicitacao.getText()));
            ResultSet RStemp=conexao.buscaRelatorio("Select * from solicitacao_vw_sol ");
            JRResultSetDataSource relatResul = new JRResultSetDataSource(RStemp);
           
            RStemp.first();
            JasperPrint jpPrint = JasperFillManager.fillReport("C:/Users/julya/OneDrive/Documentos/NetBeansProjects/ColetaSeletiva/reports/RelatorioIndividual.jasper",new HashMap(), relatResul);
            JasperViewer jv = new JasperViewer(jpPrint,false);
            jv.setVisible(true);
            } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao chamar o relatorio!\nErro:"+e);
            
            }
   }
    private void jFColeta_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFColeta_dataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFColeta_dataActionPerformed

    private void jTusuario_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTusuario_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTusuario_idActionPerformed

    private void jTCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCepActionPerformed

    private void jBImprimePedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImprimePedidoActionPerformed
      imprime_individual();
    }//GEN-LAST:event_jBImprimePedidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBImprimePedido;
    private javax.swing.JFormattedTextField jFColeta_data;
    private javax.swing.JFormattedTextField jFTelefoneCelular;
    private javax.swing.JLabel jLCidade;
    private javax.swing.JLabel jLDataColeta;
    private javax.swing.JLabel jLDescricao;
    private javax.swing.JLabel jLEnderecoCep;
    private javax.swing.JLabel jLEnderecoNumero;
    private javax.swing.JLabel jLEnderecoRua;
    private javax.swing.JLabel jLIdusuario;
    private javax.swing.JLabel jLNomeusuario;
    private javax.swing.JLabel jLTelefone;
    private javax.swing.JLabel jLTipoResiduo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTBairro;
    private javax.swing.JTextField jTCep;
    private javax.swing.JTextField jTIdSolicitacao;
    private javax.swing.JTextField jTTiporesiduo;
    private javax.swing.JTextField jTenderecoCidade;
    private javax.swing.JTextField jTenderecoLogradouro;
    private javax.swing.JTextField jTenderecoNumero;
    private javax.swing.JTextArea jTsolicitacao_descricao;
    private javax.swing.JTextField jTusuario_id;
    private javax.swing.JTextField jTusuario_nome;
    // End of variables declaration//GEN-END:variables
}
