/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import javax.swing.JOptionPane;
import Classes.Conexao;
import Classes.Login;
import Classes.EditarDadosCadastrais;
import java.awt.Dimension;
import java.sql.*;
import java.lang.String;


/**
 *
 * @author julya
 */
public class TelaEditarCadastro extends javax.swing.JInternalFrame {
    String Usuario;

    /**
     * Creates new form TelaEditarCadastro
     */
    public TelaEditarCadastro(String User) {
        this.Usuario=User;
        initComponents();
        
        
        carregadados();
       
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFTelfixo = new javax.swing.JFormattedTextField();
        jTSenha = new javax.swing.JTextField();
        jTLogin = new javax.swing.JTextField();
        jFCep = new javax.swing.JFormattedTextField();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabelId = new javax.swing.JLabel();
        jLCnpj = new javax.swing.JLabel();
        jLNomefantasia = new javax.swing.JLabel();
        jLInscricaoEstadual = new javax.swing.JLabel();
        jLEndereco = new javax.swing.JLabel();
        jLInscricaoMuni = new javax.swing.JLabel();
        jLCidade = new javax.swing.JLabel();
        jFInscricaoEst = new javax.swing.JFormattedTextField();
        jLBairro = new javax.swing.JLabel();
        jFInscricaoMuni = new javax.swing.JFormattedTextField();
        jLNumero = new javax.swing.JLabel();
        jFCnpj = new javax.swing.JFormattedTextField();
        jLTelfixo = new javax.swing.JLabel();
        jLTelcelular = new javax.swing.JLabel();
        jLRepresentante = new javax.swing.JLabel();
        jLEmaildiretoria = new javax.swing.JLabel();
        jLLogin = new javax.swing.JLabel();
        jLSenha = new javax.swing.JLabel();
        jLComplemento = new javax.swing.JLabel();
        jLReferencia = new javax.swing.JLabel();
        jLCep = new javax.swing.JLabel();
        jLEmailcomercial = new javax.swing.JLabel();
        jLEstado = new javax.swing.JLabel();
        jLTelempresa = new javax.swing.JLabel();
        jLRazaosocial = new javax.swing.JLabel();
        jBEditar = new javax.swing.JButton();
        jBInativar = new javax.swing.JButton();
        jBSalvar = new javax.swing.JButton();
        jTUsuarioId = new javax.swing.JTextField();
        jTRazaosocial = new javax.swing.JTextField();
        jTEndLogradouro = new javax.swing.JTextField();
        jTBairro = new javax.swing.JTextField();
        jTNumero = new javax.swing.JTextField();
        jTCidade = new javax.swing.JTextField();
        jTEstado = new javax.swing.JTextField();
        jTContato = new javax.swing.JTextField();
        jLDataCad = new javax.swing.JLabel();
        jFDataCad = new javax.swing.JFormattedTextField();
        jTEmailcomercial = new javax.swing.JTextField();
        jTNomefantasia = new javax.swing.JTextField();
        jTEmaildiretoria = new javax.swing.JTextField();
        jTComplemento = new javax.swing.JTextField();
        jTReferencia = new javax.swing.JTextField();
        jFTelcelular = new javax.swing.JFormattedTextField();
        jFTelempresa = new javax.swing.JFormattedTextField();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(910, 604));
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        try {
            jFTelfixo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFTelfixo, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 321, 115, -1));
        getContentPane().add(jTSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 464, 145, -1));
        getContentPane().add(jTLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 464, 109, -1));

        try {
            jFCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 272, 101, -1));
        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jLabelId.setText("ID ");
        getContentPane().add(jLabelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 78, 24, 23));

        jLCnpj.setText("CNPJ");
        getContentPane().add(jLCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 40, -1));

        jLNomefantasia.setText("NOME FANTASIA");
        getContentPane().add(jLNomefantasia, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 119, -1, 18));

        jLInscricaoEstadual.setText("INSCRIÇÃO ESTADUAL");
        getContentPane().add(jLInscricaoEstadual, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 371, 144, -1));

        jLEndereco.setText("ENDEREÇO");
        getContentPane().add(jLEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 80, 20));

        jLInscricaoMuni.setText("INSCRIÇÃO MUNICIPAL");
        getContentPane().add(jLInscricaoMuni, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 371, -1, -1));

        jLCidade.setText("CIDADE");
        getContentPane().add(jLCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 275, 47, -1));

        try {
            jFInscricaoEst.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFInscricaoEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 368, 140, -1));

        jLBairro.setText("BAIRRO");
        getContentPane().add(jLBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 194, 80, 20));

        try {
            jFInscricaoMuni.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("############")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFInscricaoMuni, new org.netbeans.lib.awtextra.AbsoluteConstraints(767, 368, 125, -1));

        jLNumero.setText("NÚMERO");
        getContentPane().add(jLNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 54, 30));

        try {
            jFCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 150, -1));

        jLTelfixo.setText("TELEFONE FIXO");
        getContentPane().add(jLTelfixo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 321, 100, 20));

        jLTelcelular.setText("TELEFONE CELULAR");
        getContentPane().add(jLTelcelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, -1, -1));

        jLRepresentante.setText("NOME REPRESENTANTE");
        getContentPane().add(jLRepresentante, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 153, 20));

        jLEmaildiretoria.setText("E-MAIL DIRETORIA");
        getContentPane().add(jLEmaildiretoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, 20));

        jLLogin.setText("USUÁRIO LOGIN");
        getContentPane().add(jLLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 464, 96, 20));

        jLSenha.setText("SENHA");
        getContentPane().add(jLSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(646, 464, 70, 20));

        jLComplemento.setText("COMPLEMENTO");
        getContentPane().add(jLComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 237, 95, -1));

        jLReferencia.setText("REFERÊNCIA");
        getContentPane().add(jLReferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 237, 80, -1));

        jLCep.setText("CEP");
        getContentPane().add(jLCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 272, 40, 20));

        jLEmailcomercial.setText("E-MAIL COMERCIAL");
        getContentPane().add(jLEmailcomercial, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, -1, -1));

        jLEstado.setText("ESTADO");
        getContentPane().add(jLEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 275, -1, -1));

        jLTelempresa.setText("TELEFONE EMPRESARIAL");
        getContentPane().add(jLTelempresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 321, 154, 20));

        jLRazaosocial.setText("RAZÃO SOCIAL");
        getContentPane().add(jLRazaosocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 123, 128, -1));

        jBEditar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/imagens/edit-calendar-interface-symbol.png"))); // NOI18N
        jBEditar.setText("EDITAR");
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });
        getContentPane().add(jBEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        jBInativar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBInativar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/imagens/flash-off.png"))); // NOI18N
        jBInativar.setText("INATIVAR");
        getContentPane().add(jBInativar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        jBSalvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jBSalvar.setText("SALVAR ALTERAÇÕES");
        getContentPane().add(jBSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 527, -1, -1));

        jTUsuarioId.setEditable(false);
        jTUsuarioId.setEnabled(false);
        getContentPane().add(jTUsuarioId, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 78, 90, -1));
        getContentPane().add(jTRazaosocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 156, 373, -1));
        getContentPane().add(jTEndLogradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 310, 30));
        getContentPane().add(jTBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 194, 200, 30));

        jTNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNumeroActionPerformed(evt);
            }
        });
        getContentPane().add(jTNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 64, 30));
        getContentPane().add(jTCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 272, 200, -1));
        getContentPane().add(jTEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 272, 201, -1));

        jTContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTContatoActionPerformed(evt);
            }
        });
        getContentPane().add(jTContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 120, -1));

        jLDataCad.setText("DATA DO CADASTRO");
        getContentPane().add(jLDataCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 78, 120, 23));

        jFDataCad.setEditable(false);
        try {
            jFDataCad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFDataCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFDataCadActionPerformed(evt);
            }
        });
        getContentPane().add(jFDataCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 78, 111, -1));
        getContentPane().add(jTEmailcomercial, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, 254, -1));

        jTNomefantasia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNomefantasiaActionPerformed(evt);
            }
        });
        getContentPane().add(jTNomefantasia, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 155, 360, -1));

        jTEmaildiretoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTEmaildiretoriaActionPerformed(evt);
            }
        });
        getContentPane().add(jTEmaildiretoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 230, -1));
        getContentPane().add(jTComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 234, 270, -1));
        getContentPane().add(jTReferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 234, 200, -1));

        try {
            jFTelcelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFTelcelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 320, 139, -1));

        try {
            jFTelempresa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFTelempresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 139, -1));

        setBounds(0, 0, 972, 604);
    }// </editor-fold>//GEN-END:initComponents
    private void carregadados(){
        
        EditarDadosCadastrais obj= new EditarDadosCadastrais();
        
        System.out.println("Meu usuario: "+this.Usuario);
        
        String sql = "select * from coleta_vw_cooperativa where login_nome='"+this.Usuario+"'";
        Conexao conexao=new Conexao();
        conexao.Conectar();
  
        obj=conexao.editar(sql);
       
   jTUsuarioId.setText(String.valueOf(obj.getIdusuario()));
   jFDataCad.setText(String.valueOf(obj.getDatacadastro()));
   jTRazaosocial.setText(obj.getRazaosocial());
   jTNomefantasia.setText(obj.getNomefantasia());
   jTEndLogradouro.setText(obj.getLogradouro());
   jTNumero.setText(String.valueOf(obj.getNumero()));
   jTBairro.setText(obj.getBairro());
   jTComplemento.setText(obj.getComplemento());
   jTReferencia.setText(obj.getReferencia());
   jTCidade.setText(obj.getMunicipio());
   jFCep.setText(obj.getCep());
   jTEstado.setText(obj.getUf());
   jFTelfixo.setText(obj.getTelfixo());
   jFTelempresa.setText(obj.getTelempresarial());
   jFTelcelular.setText(obj.getTelcelular());
   jFCnpj.setText(obj.getCnpj());
   jFInscricaoEst.setText(obj.getInscricaoestadual());
   jFInscricaoMuni.setText(obj.getInscricaomunicipal());
   jTEmaildiretoria.setText(obj.getEmailparticular());
   jTEmailcomercial.setText(obj.getEmailempresarial());
   jTContato.setText(obj.getRepresentante());
   jTLogin.setText(obj.getNomelogin());
   jTSenha.setText(obj.getSenha()); 
        
    }
    
    
    public void setPosicao() {
    Dimension d = this.getDesktopPane().getSize();
    this.setLocation((d.width - this.getSize().width) / 3, (d.height - this.getSize().height) / 3); }

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
       String sql = "select * from coleta_vw_cooperativa where login_nome='"+this.Usuario+"'";
           // TODO add your handling code here:
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jTNomefantasiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNomefantasiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNomefantasiaActionPerformed

    private void jTEmaildiretoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTEmaildiretoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTEmaildiretoriaActionPerformed

    private void jFDataCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFDataCadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFDataCadActionPerformed

    private void jTContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTContatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTContatoActionPerformed

    private void jTNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNumeroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBInativar;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JFormattedTextField jFCep;
    private javax.swing.JFormattedTextField jFCnpj;
    private javax.swing.JFormattedTextField jFDataCad;
    private javax.swing.JFormattedTextField jFInscricaoEst;
    private javax.swing.JFormattedTextField jFInscricaoMuni;
    private javax.swing.JFormattedTextField jFTelcelular;
    private javax.swing.JFormattedTextField jFTelempresa;
    private javax.swing.JFormattedTextField jFTelfixo;
    private javax.swing.JLabel jLBairro;
    private javax.swing.JLabel jLCep;
    private javax.swing.JLabel jLCidade;
    private javax.swing.JLabel jLCnpj;
    private javax.swing.JLabel jLComplemento;
    private javax.swing.JLabel jLDataCad;
    private javax.swing.JLabel jLEmailcomercial;
    private javax.swing.JLabel jLEmaildiretoria;
    private javax.swing.JLabel jLEndereco;
    private javax.swing.JLabel jLEstado;
    private javax.swing.JLabel jLInscricaoEstadual;
    private javax.swing.JLabel jLInscricaoMuni;
    private javax.swing.JLabel jLLogin;
    private javax.swing.JLabel jLNomefantasia;
    private javax.swing.JLabel jLNumero;
    private javax.swing.JLabel jLRazaosocial;
    private javax.swing.JLabel jLReferencia;
    private javax.swing.JLabel jLRepresentante;
    private javax.swing.JLabel jLSenha;
    private javax.swing.JLabel jLTelcelular;
    private javax.swing.JLabel jLTelempresa;
    private javax.swing.JLabel jLTelfixo;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JTextField jTBairro;
    private javax.swing.JTextField jTCidade;
    private javax.swing.JTextField jTComplemento;
    private javax.swing.JTextField jTContato;
    private javax.swing.JTextField jTEmailcomercial;
    private javax.swing.JTextField jTEmaildiretoria;
    private javax.swing.JTextField jTEndLogradouro;
    private javax.swing.JTextField jTEstado;
    private javax.swing.JTextField jTLogin;
    private javax.swing.JTextField jTNomefantasia;
    private javax.swing.JTextField jTNumero;
    private javax.swing.JTextField jTRazaosocial;
    private javax.swing.JTextField jTReferencia;
    private javax.swing.JTextField jTSenha;
    private javax.swing.JTextField jTUsuarioId;
    // End of variables declaration//GEN-END:variables
}
