/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author julya
 */
@Entity
@Table(name = "coleta_tb_solicitacao", catalog = "coletaseletiva", schema = "")
@NamedQueries({
    @NamedQuery(name = "ColetaTbSolicitacao.findAll", query = "SELECT c FROM ColetaTbSolicitacao c")
    , @NamedQuery(name = "ColetaTbSolicitacao.findBySolicitacaoId", query = "SELECT c FROM ColetaTbSolicitacao c WHERE c.solicitacaoId = :solicitacaoId")
    , @NamedQuery(name = "ColetaTbSolicitacao.findBySolicitacaoData", query = "SELECT c FROM ColetaTbSolicitacao c WHERE c.solicitacaoData = :solicitacaoData")
    , @NamedQuery(name = "ColetaTbSolicitacao.findBySolicitacaoDescricao", query = "SELECT c FROM ColetaTbSolicitacao c WHERE c.solicitacaoDescricao = :solicitacaoDescricao")
    , @NamedQuery(name = "ColetaTbSolicitacao.findBySolicitacaoRastreamento", query = "SELECT c FROM ColetaTbSolicitacao c WHERE c.solicitacaoRastreamento = :solicitacaoRastreamento")
    , @NamedQuery(name = "ColetaTbSolicitacao.findBySolicitacaoTiporesiduo", query = "SELECT c FROM ColetaTbSolicitacao c WHERE c.solicitacaoTiporesiduo = :solicitacaoTiporesiduo")
    , @NamedQuery(name = "ColetaTbSolicitacao.findBySolicitacaoQuantidade", query = "SELECT c FROM ColetaTbSolicitacao c WHERE c.solicitacaoQuantidade = :solicitacaoQuantidade")
    , @NamedQuery(name = "ColetaTbSolicitacao.findByUsuarioId", query = "SELECT c FROM ColetaTbSolicitacao c WHERE c.usuarioId = :usuarioId")})
public class ColetaTbSolicitacao implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "solicitacao_id")
    private Integer solicitacaoId;
    @Basic(optional = false)
    @Column(name = "solicitacao_data")
    @Temporal(TemporalType.DATE)
    private Date solicitacaoData;
    @Basic(optional = false)
    @Column(name = "solicitacao_descricao")
    private String solicitacaoDescricao;
    @Column(name = "solicitacao_rastreamento")
    private String solicitacaoRastreamento;
    @Column(name = "solicitacao_tiporesiduo")
    private String solicitacaoTiporesiduo;
    @Column(name = "solicitacao_quantidade")
    private Integer solicitacaoQuantidade;
    @Basic(optional = false)
    @Column(name = "usuario_id")
    private int usuarioId;

    public ColetaTbSolicitacao() {
    }

    public ColetaTbSolicitacao(Integer solicitacaoId) {
        this.solicitacaoId = solicitacaoId;
    }

    public ColetaTbSolicitacao(Integer solicitacaoId, Date solicitacaoData, String solicitacaoDescricao, int usuarioId) {
        this.solicitacaoId = solicitacaoId;
        this.solicitacaoData = solicitacaoData;
        this.solicitacaoDescricao = solicitacaoDescricao;
        this.usuarioId = usuarioId;
    }

    public Integer getSolicitacaoId() {
        return solicitacaoId;
    }

    public void setSolicitacaoId(Integer solicitacaoId) {
        Integer oldSolicitacaoId = this.solicitacaoId;
        this.solicitacaoId = solicitacaoId;
        changeSupport.firePropertyChange("solicitacaoId", oldSolicitacaoId, solicitacaoId);
    }

    public Date getSolicitacaoData() {
        return solicitacaoData;
    }

    public void setSolicitacaoData(Date solicitacaoData) {
        Date oldSolicitacaoData = this.solicitacaoData;
        this.solicitacaoData = solicitacaoData;
        changeSupport.firePropertyChange("solicitacaoData", oldSolicitacaoData, solicitacaoData);
    }

    public String getSolicitacaoDescricao() {
        return solicitacaoDescricao;
    }

    public void setSolicitacaoDescricao(String solicitacaoDescricao) {
        String oldSolicitacaoDescricao = this.solicitacaoDescricao;
        this.solicitacaoDescricao = solicitacaoDescricao;
        changeSupport.firePropertyChange("solicitacaoDescricao", oldSolicitacaoDescricao, solicitacaoDescricao);
    }

    public String getSolicitacaoRastreamento() {
        return solicitacaoRastreamento;
    }

    public void setSolicitacaoRastreamento(String solicitacaoRastreamento) {
        String oldSolicitacaoRastreamento = this.solicitacaoRastreamento;
        this.solicitacaoRastreamento = solicitacaoRastreamento;
        changeSupport.firePropertyChange("solicitacaoRastreamento", oldSolicitacaoRastreamento, solicitacaoRastreamento);
    }

    public String getSolicitacaoTiporesiduo() {
        return solicitacaoTiporesiduo;
    }

    public void setSolicitacaoTiporesiduo(String solicitacaoTiporesiduo) {
        String oldSolicitacaoTiporesiduo = this.solicitacaoTiporesiduo;
        this.solicitacaoTiporesiduo = solicitacaoTiporesiduo;
        changeSupport.firePropertyChange("solicitacaoTiporesiduo", oldSolicitacaoTiporesiduo, solicitacaoTiporesiduo);
    }

    public Integer getSolicitacaoQuantidade() {
        return solicitacaoQuantidade;
    }

    public void setSolicitacaoQuantidade(Integer solicitacaoQuantidade) {
        Integer oldSolicitacaoQuantidade = this.solicitacaoQuantidade;
        this.solicitacaoQuantidade = solicitacaoQuantidade;
        changeSupport.firePropertyChange("solicitacaoQuantidade", oldSolicitacaoQuantidade, solicitacaoQuantidade);
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        int oldUsuarioId = this.usuarioId;
        this.usuarioId = usuarioId;
        changeSupport.firePropertyChange("usuarioId", oldUsuarioId, usuarioId);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (solicitacaoId != null ? solicitacaoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ColetaTbSolicitacao)) {
            return false;
        }
        ColetaTbSolicitacao other = (ColetaTbSolicitacao) object;
        if ((this.solicitacaoId == null && other.solicitacaoId != null) || (this.solicitacaoId != null && !this.solicitacaoId.equals(other.solicitacaoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Views.ColetaTbSolicitacao[ solicitacaoId=" + solicitacaoId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
