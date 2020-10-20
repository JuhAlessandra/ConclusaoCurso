/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.text.DateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author julya
 */
public class Conexao {
    Connection con = null;
    String url = "jdbc:mysql://localhost:3306/coletaseletiva"
     + "?useTimezone=true&serverTimezone=UTC";
    String usuario = "root";
    String senha = "";
        
    
    public ResultSet rs;
    
    public void Conectar(){
        try {
            con = DriverManager.getConnection(url, usuario, senha);
            System.out.println("conectado");
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public boolean comando(String sql){
        boolean resultado=false;
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.execute();
            resultado=true;
                     
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
          
        }
        return resultado;            
    }
    
    public void Desconecta(){
        
        try {
            con.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao desconectar !\n"+e.getMessage());
        }
    }
    
    public Login busca_login(String busca){
        Login l= new Login ();
        try {
            PreparedStatement stmt = this.con.prepareStatement(busca);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                l.setUsuario(rs.getString("login_nome"));
                l.setSenha(rs.getString("login_senha"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return l;
        
    }
    
    public ArrayList<Solicitacao> busca(String sql){
        ArrayList<Solicitacao> lista = new ArrayList<>();
        try {
            PreparedStatement stmt = this.con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Solicitacao sol= new Solicitacao();
                sol.setId(rs.getInt("solicitacao_id"));
                sol.setDescricao(rs.getString("solicitacao_descricao"));
                sol.setData(rs.getDate("solicitacao_data"));
                sol.setQuantidade(rs.getInt("solicitacao_quantidade"));
                sol.setRastreamento(rs.getString("solicitacao_rastreamento"));
                sol.setTiporesiduo(rs.getString("solicitacao_tiporesiduo"));
                sol.setUsuario(rs.getInt("usuario_id"));
                
                lista.add(sol);
            }
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return lista;
    }
    
    public ResultSet buscaRelatorio(String sql){
        ResultSet rstemp=null;
        try {
            PreparedStatement stmt = this.con.prepareStatement(sql);
            rstemp = stmt.executeQuery();
                    } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return rstemp;
    }
    
    
    public ConsultaIndividual buscaIndividual(String sql){
        ConsultaIndividual obj= new ConsultaIndividual();
        try {
            PreparedStatement stmt = this.con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                obj.setIdusuario(rs.getInt("usuario_id"));
                obj.setIdsolicitacao(rs.getInt("solicitacao_id"));
                obj.setDatacoleta(rs.getDate("solicitacao_data"));
                obj.setNomeusuario(rs.getString("usuario_nome"));
                obj.setTelefoneUsuario(rs.getString("telefone_celular"));
                obj.setEnderecoRua(rs.getString("endereco_logradouro"));
                obj.setEndereconumero(rs.getInt("endereco_numero"));
                obj.setBairro(rs.getString("endereco_bairro"));
                obj.setCidade(rs.getString("endereco_municipio"));
                obj.setEnderecoCep(rs.getString("endereco_cep"));
                obj.setDescricaoSolicitacao(rs.getString("solicitacao_descricao"));
                obj.setTiporesiduo(rs.getString("solicitacao_tiporesiduo"));
                
                
            }
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return obj;
    }
        
        public CarregaEmail EnvioIndividual (String sql){
        CarregaEmail obj= new CarregaEmail();
        try {
            PreparedStatement stmt = this.con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                obj.setIdusuario(rs.getInt("usuario_id"));
                obj.setIdsolicitacao(rs.getInt("solicitacao_id"));
                obj.setNomeusuario(rs.getString("usuario_nome"));
                obj.setEmailusuario(rs.getString("email_particular"));
                
            }
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return obj;
        
        
    }
    
    public ArrayList<NovoFeedback> buscafeedback(String sql){
        ArrayList<NovoFeedback> lista = new ArrayList<>();
        try {
            PreparedStatement stmt = this.con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                NovoFeedback fed= new NovoFeedback();
                
                fed.setFeedbackid(rs.getInt("feedback_id"));
                fed.setIdusuario(rs.getInt("usuario_id"));
                fed.setNomeusuario(rs.getString("usuario_nome"));
                fed.setFeedbackdata(rs.getDate("feedback_data"));
                fed.setFeedbackqualifica(rs.getInt("feedback_qualificacao"));
               
                
                  lista.add(fed);
            }
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return lista;
    }
    public ArrayList<ConsultaFeedback>consultafed(String sql){
        ArrayList<ConsultaFeedback> lista = new ArrayList<>();
        try {
            PreparedStatement stmt = this.con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                ConsultaFeedback confed= new ConsultaFeedback();
                
                confed.setFeedbackid(rs.getInt("feedback_id"));
                confed.setUsuarioid(rs.getInt("usuario_id"));
                confed.setNomeusuario(rs.getString("usuario_nome"));
                confed.setDatafeed(rs.getDate("feedback_data"));
                confed.setStatusfedd(rs.getString("feedback_status"));

                  lista.add(confed);
            }
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return lista;     
}
    
    public NovoFeedback buscaFeedindividual(String sql){
        NovoFeedback obj= new NovoFeedback();
        try {
            PreparedStatement stmt = this.con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                obj.setFeedback_status(rs.getString("feedback_status"));
                obj.setFeedbackid(rs.getInt("feedback_id"));
                obj.setIdusuario(rs.getInt("usuario_id"));
                obj.setNomeusuario(rs.getString("usuario_nome"));
                obj.setFeedback_email(rs.getString("email_particular"));
                obj.setFeedbackdata(rs.getDate("feedback_data"));
                obj.setFeedbackqualifica(rs.getInt("feedback_qualificacao"));
                obj.setFeedbackcritica(rs.getString("feedback_critica"));
                obj.setFeedback_resposta(rs.getString("feedback_resposta"));          
                                               
            }
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return obj;
    }
     public EditarDadosCadastrais editar(String sql){
        EditarDadosCadastrais obj= new EditarDadosCadastrais();
        try {
            PreparedStatement stmt = this.con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                obj.setIdusuario(rs.getInt("usuario_id"));
                obj.setNomefantasia(rs.getString("usuario_nomefantasia"));
                obj.setRazaosocial(rs.getString("usuario_razaosocial"));
                obj.setInscricaoestadual(rs.getString("usuario_inscricaoestadual"));
                obj.setInscricaomunicipal(rs.getString("usuario_inscricaomunicipal"));
                obj.setRepresentante(rs.getString("usuario_representanteempresa"));
                obj.setCnpj(rs.getString("usuario_cnpj"));
                obj.setDatacadastro(rs.getDate("usuario_datacadastro"));
                obj.setNomelogin(rs.getString("login_nome"));
                obj.setSenha(rs.getString("login_senha"));
                obj.setCep(rs.getString("endereco_cep"));
                obj.setLogradouro(rs.getString("endereco_logradouro"));
                obj.setNumero(rs.getInt("endereco_numero"));
                obj.setComplemento(rs.getString("endereco_complemento"));
                obj.setMunicipio(rs.getString("endereco_municipio"));
                obj.setUf(rs.getString("endereco_uf"));
                obj.setReferencia(rs.getString("endereco_referencia"));
                obj.setBairro(rs.getString("endereco_bairro"));
                obj.setTelcelular(rs.getString("telefone_celular"));
                obj.setTelfixo(rs.getString("telefone_fixo"));
                obj.setTelempresarial(rs.getString("telefone_empresarial"));
                obj.setEmailparticular(rs.getString("email_particular"));
                obj.setEmailempresarial(rs.getString("email_empresarial"));
                }
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return obj;
            }
}

