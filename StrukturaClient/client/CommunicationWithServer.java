/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import transfer.ClientRequest;
import transfer.ServerResponse;
/**
 *
 * @author Mr OLOGIZ
 */
public class CommunicationWithServer {
    
    private static CommunicationWithServer instance;
    Socket s;
    ObjectInputStream ois;
    ObjectOutputStream oos;

    public CommunicationWithServer() {
    }

    public static CommunicationWithServer getInstance() {
        if(instance==null){
            instance=new CommunicationWithServer();
        }
        return instance;
    }
    
    public boolean poveziSe(){
        try {
            s=new Socket("localhost", 9000);
            return true;
        } catch (Exception ex) {
           ex.printStackTrace();
        }
        return false;
    }
    
    public void logOut(){
        try {
            s.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public ServerResponse acceptServerResponse(){
        ServerResponse sr=new ServerResponse();
        try {
            ois=new ObjectInputStream(s.getInputStream());
            sr=(ServerResponse) ois.readObject();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return sr;
    }
    
    public void sendClientRequest(ClientRequest cr){
        try {
            oos=new ObjectOutputStream(s.getOutputStream());
            oos.writeObject(cr);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    
}
