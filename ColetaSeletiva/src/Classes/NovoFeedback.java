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
public class NovoFeedback {
    private int feedbackid;
    private int feedbackqualifica;
    private Date feedbackdata;
    private String feedbackcritica;
    private int idusuario;
    private String nomeusuario;
    private String feedback_status;
    private String feedback_resposta;
    private String feedback_email;

    public String getFeedback_email() {
        return feedback_email;
    }

    public void setFeedback_email(String feedback_email) {
        this.feedback_email = feedback_email;
    }
    

    public String getFeedback_status() {
        return feedback_status;
    }

    public void setFeedback_status(String feedback_status) {
        this.feedback_status = feedback_status;
    }

    public String getFeedback_resposta() {
        return feedback_resposta;
    }

    public void setFeedback_resposta(String feedback_resposta) {
        this.feedback_resposta = feedback_resposta;
    }
    

    public int getFeedbackid() {
        return feedbackid;
    }

    public void setFeedbackid(int feedbackid) {
        this.feedbackid = feedbackid;
    }

    public int getFeedbackqualifica() {
        return feedbackqualifica;
    }

    public void setFeedbackqualifica(int feedbackqualifica) {
        this.feedbackqualifica = feedbackqualifica;
    }

    public Date getFeedbackdata() {
        return feedbackdata;
    }

    public void setFeedbackdata(Date feedbackdata) {
        this.feedbackdata = feedbackdata;
    }

    public String getFeedbackcritica() {
        return feedbackcritica;
    }

    public void setFeedbackcritica(String feedbackcritica) {
        this.feedbackcritica = feedbackcritica;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNomeusuario() {
        return nomeusuario;
    }

    public void setNomeusuario(String nomeusuario) {
        this.nomeusuario = nomeusuario;
    }

    
    
    
    
}
