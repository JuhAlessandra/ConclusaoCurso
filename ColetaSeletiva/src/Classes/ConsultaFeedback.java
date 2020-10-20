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
public class ConsultaFeedback {
    private int feedbackid;
    private int usuarioid;
    private String nomeusuario;
    private Date datafeed;
    private String statusfedd;
    

    public int getFeedbackid() {
        return feedbackid;
    }

    public void setFeedbackid(int feedbackid) {
        this.feedbackid = feedbackid;
    }
    
    

    public int getUsuarioid() {
        return usuarioid;
    }

    public void setUsuarioid(int usuarioid) {
        this.usuarioid = usuarioid;
    }

    public String getNomeusuario() {
        return nomeusuario;
    }

    public void setNomeusuario(String nomeusuario) {
        this.nomeusuario = nomeusuario;
    }

    public Date getDatafeed() {
        return datafeed;
    }

    public void setDatafeed(Date datafeed) {
        this.datafeed = datafeed;
    }

    public String getStatusfedd() {
        return statusfedd;
    }

    public void setStatusfedd(String statusfedd) {
        this.statusfedd = statusfedd;
    }
    
}
