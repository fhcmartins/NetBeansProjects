/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatrmi;

/**
 *
 * @author flavi
 */
public class Message {
    
    private Integer index;
    private Client sender;
    private Client recipient;
    private String msg;
    private boolean status;

    //Construtor
    public Message(Integer index, Client sender, Client recipient, String msg, boolean status) {
        this.index = index;
        this.sender = sender;
        this.recipient = recipient;
        this.msg = msg;
        this.status = status;
    }
    
    //Getter and Setter

    public Integer getIndex() {
        return index;
    }

    public Client getSender() {
        return sender;
    }

    public Client getRecipient() {
        return recipient;
    }

    public String getMsg() {
        return msg;
    }

    public boolean isStatus() {
        return status;
    }

    public void setSender(Client sender) {
        this.sender = sender;
    }

    public void setRecipient(Client recipient) {
        this.recipient = recipient;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Message{" + "index=" + index + ", sender=" + sender + ", recipient=" + recipient + ", msg=" + msg + ", status=" + status + '}';
    }
    
    public void write(){
        System.out.println(this.toString());
    }
    
}
