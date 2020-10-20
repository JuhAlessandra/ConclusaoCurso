/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;


import java.util.Properties;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.mail.internet.AddressException;

public class EnvioEmail {
    private String sender= "coletaeureciclo@gmail.com";
    private String pwd="coleta123*";
    private String destino = "coletaeureciclo@gmail.com";
    private String assunto;
    private String msg;
    private final Properties props = new Properties();

    
    
    
    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    public void enviar() throws AddressException {
        props.put("mail.smtp.host","smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth","true");
        props.put("mail.smtp.port","465");
        Session session =Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication(){
                    return new PasswordAuthentication(getSender(), getPwd());
                }
                
                });
        
     session.setDebug(true);
     
     try {
         Message message = new MimeMessage(session);
         Address[] toUser = InternetAddress.parse(destino);
         message.setRecipients(Message.RecipientType.TO, toUser);
         message.setSubject(assunto);
         message.setContent(msg,"text/html");
         
         Transport.send(message);
      
     }catch (MessagingException e) {
         JOptionPane.showMessageDialog(null,"Erro ao enviar e-mail" +e.getCause());
     }
    }

//    private static class EmailException extends Exception {
//
//        public EmailException() {
//        }
//    }
}
