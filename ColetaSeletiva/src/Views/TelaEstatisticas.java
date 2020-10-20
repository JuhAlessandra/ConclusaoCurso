/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Classes.Conexao;
import Classes.Solicitacao;
import java.awt.Dimension;
import java.util.ArrayList;
import java.sql.PreparedStatement;

/**
 *
 * @author julya
 */
public class TelaEstatisticas extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaEstatisticas
     */
    public TelaEstatisticas() {
        initComponents();
        carregaestatistica();
    }

    private void carregaestatistica(){
    
        for (int i=0; i<jTableEstatistica.getRowCount();i++) {
        jTableEstatistica.setValueAt("", i, 0);
        jTableEstatistica.setValueAt("", i, 1);
        jTableEstatistica.setValueAt("", i, 2);
        jTableEstatistica.setValueAt("", i, 3);
       
    }
        String sql="select * from coleta_tb_solicitacao where 1=1 ";
if (Buttondata.isSelected()){
    sql+="and solicitacao_data >= '"+jFdata1.getText()+"' and solicitacao_data <= '"+jFdata2.getText()+"' ";
      
}
 
//       sql="select * from coleta_tb_solicitacao where upper(solicitacao_tiporesiduo)=";
if (ButtonResiduo.isSelected()){
    sql+="and solicitacao_tiporesiduo = '"+jComboBoxTipoResiduo.getSelectedItem()+"' ";
}
if (ButtonIdUsuario.isSelected()){
    sql+="and usuario_id = "+jTIdusuario.getText()+" ";
}
        
        
        Conexao conexao=new Conexao();
        conexao.Conectar();
        
        ArrayList<Solicitacao> l = new ArrayList<>();
        l=conexao.busca(sql);
        for(int i = 0; i< l.size(); i++){
            Solicitacao sol=new Solicitacao();
            sol=l.get(i);
            
           jTableEstatistica.setValueAt(sol.getData(), i, 0);
           jTableEstatistica.setValueAt(sol.getId(), i, 1);
           jTableEstatistica.setValueAt(sol.getTiporesiduo(), i, 2);
           jTableEstatistica.setValueAt(sol.getQuantidade(), i, 3);
           
           
            
       }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Buttondata = new javax.swing.JRadioButton();
        ButtonIdUsuario = new javax.swing.JRadioButton();
        ButtonResiduo = new javax.swing.JRadioButton();
        jFdata1 = new javax.swing.JFormattedTextField();
        jFdata2 = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxTipoResiduo = new javax.swing.JComboBox<>();
        jTIdusuario = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jLFiltrarselecao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEstatistica = new javax.swing.JTable();
        jButtonGerarRelat = new javax.swing.JButton();
        jButtonGerarGrafico = new javax.swing.JButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel3 = new javax.swing.JPanel();
        jRadioButtondata1 = new javax.swing.JRadioButton();
        jRadioButtonIdUsuario1 = new javax.swing.JRadioButton();
        jRadioButtonresiduo1 = new javax.swing.JRadioButton();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jButtonPesquisar1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButtonImprimir1 = new javax.swing.JButton();
        jButtonGerarRelat1 = new javax.swing.JButton();
        jButtonGerarGrafico1 = new javax.swing.JButton();

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        setClosable(true);
        setTitle("Análise de Dados");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Buttondata.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        Buttondata.setText("DATA");
        Buttondata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtondataActionPerformed(evt);
            }
        });

        ButtonIdUsuario.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        ButtonIdUsuario.setText("POR CÓDIGO DE USUÁRIO");
        ButtonIdUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonIdUsuarioActionPerformed(evt);
            }
        });

        ButtonResiduo.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        ButtonResiduo.setText("POR RESÍDUO");
        ButtonResiduo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonResiduoActionPerformed(evt);
            }
        });

        try {
            jFdata1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFdata1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFdata1ActionPerformed(evt);
            }
        });

        try {
            jFdata2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFdata2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFdata2ActionPerformed(evt);
            }
        });

        jLabel2.setText("ATÉ:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel3.setText("PERÍODO DE: ");

        jComboBoxTipoResiduo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PAPEL", "PLASTICO", "METAL", "VIDRO", "HOSPITALAR", "PILHAS", "BATERIAS" }));
        jComboBoxTipoResiduo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoResiduoActionPerformed(evt);
            }
        });

        jButtonPesquisar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonPesquisar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/imagens/Estatistica_pesquisa.png"))); // NOI18N
        jButtonPesquisar.setText("PESQUISAR");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(ButtonIdUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTIdusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ButtonResiduo)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(252, 252, 252)
                        .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBoxTipoResiduo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Buttondata)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFdata1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFdata2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Buttondata)
                    .addComponent(jFdata1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jFdata2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonResiduo)
                    .addComponent(jComboBoxTipoResiduo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTIdusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonIdUsuario, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLFiltrarselecao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLFiltrarselecao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/imagens/filtro.png"))); // NOI18N
        jLFiltrarselecao.setText("FILTRAR SELEÇÃO");

        jTableEstatistica.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTableEstatistica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "DATA", "CÓDIGO USUÁRIO", "RESÍDUO", "QUANTIDADE RESIDUO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableEstatistica);

        jButtonGerarRelat.setBackground(new java.awt.Color(255, 255, 255));
        jButtonGerarRelat.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonGerarRelat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/imagens/icons8-baixar-relatório-gráfico-64.png"))); // NOI18N
        jButtonGerarRelat.setText("GERAR RELATÓRIO");
        jButtonGerarRelat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerarRelatActionPerformed(evt);
            }
        });

        jButtonGerarGrafico.setBackground(new java.awt.Color(255, 255, 255));
        jButtonGerarGrafico.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonGerarGrafico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/imagens/GRAFICO.png"))); // NOI18N
        jButtonGerarGrafico.setText("GERAR GRÁFICO");

        jInternalFrame1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jInternalFrame1.setClosable(true);
        jInternalFrame1.setTitle("Análise de Dados");

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jRadioButtondata1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jRadioButtondata1.setText("DATA");

        jRadioButtonIdUsuario1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jRadioButtonIdUsuario1.setText("POR CÓDIGO DE USUÁRIO");

        jRadioButtonresiduo1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jRadioButtonresiduo1.setText("POR RESÍDUO");

        jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("##/##/####"))));
        jFormattedTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField3ActionPerformed(evt);
            }
        });

        jFormattedTextField4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        jFormattedTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField4ActionPerformed(evt);
            }
        });

        jLabel4.setText("ATÉ:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel5.setText("PERÍODO DE: ");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PAPEL", "PLASTICO", "METAL", "VIDRO", "HOSPITALAR", "PILHAS", "BATERIAS" }));

        jButtonPesquisar1.setBackground(new java.awt.Color(51, 255, 51));
        jButtonPesquisar1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonPesquisar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/imagens/Estatistica_pesquisa.png"))); // NOI18N
        jButtonPesquisar1.setText("PESQUISAR");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jRadioButtonIdUsuario1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jRadioButtonresiduo1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(232, 232, 232)
                        .addComponent(jButtonPesquisar1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jRadioButtondata1)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtondata1)
                    .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonPesquisar1)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonresiduo1)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jRadioButtonIdUsuario1)
                                .addContainerGap())))))
        );

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("FILTRAR SELEÇÃO");

        jTable2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "DATA", "CÓDIGO USUÁRIO", "RESÍDUO", "QUANTIDADE RESIDUO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jButtonImprimir1.setBackground(new java.awt.Color(0, 255, 0));
        jButtonImprimir1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonImprimir1.setText("IMPRIMIR");

        jButtonGerarRelat1.setBackground(new java.awt.Color(0, 255, 0));
        jButtonGerarRelat1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonGerarRelat1.setText("GERAR RELATÓRIO");

        jButtonGerarGrafico1.setBackground(new java.awt.Color(0, 255, 0));
        jButtonGerarGrafico1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonGerarGrafico1.setText("GERAR GRÁFICO");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(440, 440, 440))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jButtonGerarRelat1)
                        .addGap(57, 57, 57)
                        .addComponent(jButtonImprimir1)
                        .addGap(65, 65, 65)
                        .addComponent(jButtonGerarGrafico1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGerarRelat1)
                    .addComponent(jButtonImprimir1)
                    .addComponent(jButtonGerarGrafico1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButtonGerarRelat)
                        .addGap(257, 257, 257)
                        .addComponent(jButtonGerarGrafico)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLFiltrarselecao, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(440, 440, 440))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 631, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 631, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLFiltrarselecao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGerarRelat)
                    .addComponent(jButtonGerarGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 264, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 265, Short.MAX_VALUE)))
        );

        setBounds(0, 0, 959, 557);
    }// </editor-fold>//GEN-END:initComponents

    private void jFdata1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFdata1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFdata1ActionPerformed

    private void jFdata2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFdata2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFdata2ActionPerformed

    private void jFormattedTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField3ActionPerformed

    private void jFormattedTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField4ActionPerformed

    private void jButtonGerarRelatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerarRelatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGerarRelatActionPerformed

    private void jComboBoxTipoResiduoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoResiduoActionPerformed
        // TODO add your handling code here:
        //jComboBoxTipoResiduo.getSelectedItem();
    }//GEN-LAST:event_jComboBoxTipoResiduoActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        carregaestatistica();
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void ButtondataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtondataActionPerformed
     jFdata1.setText("");
     jFdata2.setText("");
     
    }//GEN-LAST:event_ButtondataActionPerformed

    private void ButtonResiduoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonResiduoActionPerformed
      jComboBoxTipoResiduo.setToolTipText("");
    }//GEN-LAST:event_ButtonResiduoActionPerformed

    private void ButtonIdUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonIdUsuarioActionPerformed
        jTIdusuario.setText("");
    }//GEN-LAST:event_ButtonIdUsuarioActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ButtonIdUsuario;
    private javax.swing.JRadioButton ButtonResiduo;
    private javax.swing.JRadioButton Buttondata;
    private javax.swing.JButton jButtonGerarGrafico;
    private javax.swing.JButton jButtonGerarGrafico1;
    private javax.swing.JButton jButtonGerarRelat;
    private javax.swing.JButton jButtonGerarRelat1;
    private javax.swing.JButton jButtonImprimir1;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonPesquisar1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBoxTipoResiduo;
    private javax.swing.JFormattedTextField jFdata1;
    private javax.swing.JFormattedTextField jFdata2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLFiltrarselecao;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButtonIdUsuario1;
    private javax.swing.JRadioButton jRadioButtondata1;
    private javax.swing.JRadioButton jRadioButtonresiduo1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTIdusuario;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTableEstatistica;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
