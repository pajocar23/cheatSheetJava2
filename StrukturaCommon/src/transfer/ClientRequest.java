/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transfer;

import java.io.Serializable;

/**
 *
 * @author Mr OLOGIZ
 */
public class ClientRequest implements Serializable{
    private int operacija;
    private Object object1;
    private String object2;
    private String username;
    private String password;
    private String slovo;

    public ClientRequest() {
    }

    public ClientRequest(int operacija, Object object1, String object2, String username, String password, String slovo) {
        this.operacija = operacija;
        this.object1 = object1;
        this.object2 = object2;
        this.username = username;
        this.password = password;
        this.slovo = slovo;
    }

    public String getSlovo() {
        return slovo;
    }

    public void setSlovo(String slovo) {
        this.slovo = slovo;
    }

    public int getOperacija() {
        return operacija;
    }

    public void setOperacija(int operacija) {
        this.operacija = operacija;
    }

    public Object getObject1() {
        return object1;
    }

    public void setObject1(Object object1) {
        this.object1 = object1;
    }

    public String getObject2() {
        return object2;
    }

    public void setObject2(String object2) {
        this.object2 = object2;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
