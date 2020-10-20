/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author julya
 */
public class ConsultaSolicitacao {
    private int idsolicitacao;    
    private String datacoleta;
    private String descricao;
    private String rastreamento;
    private String tiporesiduo;    
    private int quantidade;
    private int idusuario;
    private String Status;

    public int getIdsolicitacao() {
        return idsolicitacao;
    }

    public void setIdsolicitacao(int idsolicitacao) {
        this.idsolicitacao = idsolicitacao;
    }
     public String getrastreamento() {
        return rastreamento;
    }

    public void rastreamento(String rastreamento) {
        this.rastreamento = rastreamento;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getDatacoleta() {
        return datacoleta;
    }

    public void setDatacoleta(String datacoleta) {
        this.datacoleta = datacoleta;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTiporesiduo() {
        return tiporesiduo;
    }

    public void setTiporesiduo(String tiporesiduo) {
        this.tiporesiduo = tiporesiduo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
}
