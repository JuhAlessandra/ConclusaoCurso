/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Date;

/**
 *
 * @author julya
 */
public class ConsultaIndividual {
    private int idsolicitacao;
    private int idusuario;
    private String Nomeusuario;
    private String TelefoneUsuario;
    private String EnderecoRua;
    private int Endereconumero;
    private String Bairro;
    private String Cidade;
    private String EnderecoCep;
    private Date datacoleta;
    private String DescricaoSolicitacao;
    private String tiporesiduo;
    private int quantidaderesi;

    public int getIdsolicitacao() {
        return idsolicitacao;
    }

    public void setIdsolicitacao(int idsolicitacao) {
        this.idsolicitacao = idsolicitacao;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNomeusuario() {
        return Nomeusuario;
    }

    public void setNomeusuario(String Nomeusuario) {
        this.Nomeusuario = Nomeusuario;
    }

    public String getTelefoneUsuario() {
        return TelefoneUsuario;
    }

    public void setTelefoneUsuario(String TelefoneUsuario) {
        this.TelefoneUsuario = TelefoneUsuario;
    }

    public String getEnderecoRua() {
        return EnderecoRua;
    }

    public void setEnderecoRua(String EnderecoRua) {
        this.EnderecoRua = EnderecoRua;
    }

    public int getEndereconumero() {
        return Endereconumero;
    }

    public void setEndereconumero(int Endereconumero) {
        this.Endereconumero = Endereconumero;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getEnderecoCep() {
        return EnderecoCep;
    }

    public void setEnderecoCep(String EnderecoCep) {
        this.EnderecoCep = EnderecoCep;
    }

    public Date getDatacoleta() {
        return datacoleta;
    }

    public void setDatacoleta(Date datacoleta) {
        this.datacoleta = datacoleta;
    }

    public String getDescricaoSolicitacao() {
        return DescricaoSolicitacao;
    }

    public void setDescricaoSolicitacao(String DescricaoSolicitacao) {
        this.DescricaoSolicitacao = DescricaoSolicitacao;
    }

    public String getTiporesiduo() {
        return tiporesiduo;
    }

    public void setTiporesiduo(String tiporesiduo) {
        this.tiporesiduo = tiporesiduo;
    }

    public int getQuantidaderesi() {
        return quantidaderesi;
    }

    public void setQuantidaderesi(int quantidaderesi) {
        this.quantidaderesi = quantidaderesi;
    }
    
    
    
}
