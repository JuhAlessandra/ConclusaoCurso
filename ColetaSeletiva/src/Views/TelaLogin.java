 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Classes.Conexao;
import Classes.Login;
import javax.swing.JOptionPane;

/**
 *
 * @author julya
 */
public class TelaLogin extends javax.swing.JFrame {
  
    
    /**
     * Creates new form Login
     */
    public TelaLogin() {
        initComponents();
        jTUsuario.setText("Juliana");
        jPSenha.setText("123");
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbLogin = new javax.swing.JButton();
        jTUsuario = new javax.swing.JTextField();
        jPSenha = new javax.swing.JPasswordField();
        jLUsuario = new javax.swing.JLabel();
        jLSenha = new javax.swing.JLabel();
        jLLogin = new javax.swing.JLabel();
        jLImagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acesso");

        jbLogin.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jbLogin.setText("Login");
        jbLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLoginActionPerformed(evt);
            }
        });
        jbLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbLoginKeyPressed(evt);
            }
        });

        jTUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jPSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLUsuario.setBackground(new java.awt.Color(51, 51, 51));
        jLUsuario.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        jLUsuario.setText("USUÁRIO");

        jLSenha.setBackground(new java.awt.Color(51, 51, 51));
        jLSenha.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        jLSenha.setText("SENHA");

        jLLogin.setBackground(new java.awt.Color(0, 0, 0));
        jLLogin.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLLogin.setForeground(new java.awt.Color(51, 0, 0));
        jLLogin.setText("LOGIN");

        jLImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/imagens/imagem.png"))); // NOI18N
        jLImagem.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLImagem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLImagem.setNextFocusableComponent(jLImagem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(jLLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(jLUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jTUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(jLSenha))
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jPSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jbLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLImagem)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jLLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLUsuario)
                .addGap(5, 5, 5)
                .addComponent(jTUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLSenha)
                .addGap(5, 5, 5)
                .addComponent(jPSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jbLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(832, 498));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLoginActionPerformed
        String sql = "SELECT login_nome, login_senha from coleta_tb_login  where login_nome='"+jTUsuario.getText()+"' and login_senha=('"+jPSenha.getText()+"');";
        Login log = new Login();
        Conexao con = new Conexao();
        con.Conectar();
        log=con.busca_login(sql);
        if(log.getUsuario().equals(jTUsuario.getText()) && log.getSenha().equals(jPSenha.getText())){
            MenuPrincipal tela = new MenuPrincipal(jTUsuario.getText());
            this.dispose();
            tela.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Usuario e senha inválidos");
        }
        
        
        
    }//GEN-LAST:event_jbLoginActionPerformed

    private void jbLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbLoginKeyPressed
       
    }//GEN-LAST:event_jbLoginKeyPressed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLImagem;
    private javax.swing.JLabel jLLogin;
    private javax.swing.JLabel jLSenha;
    private javax.swing.JLabel jLUsuario;
    private javax.swing.JPasswordField jPSenha;
    private javax.swing.JTextField jTUsuario;
    private javax.swing.JButton jbLogin;
    // End of variables declaration//GEN-END:variables

   
   
   
}
