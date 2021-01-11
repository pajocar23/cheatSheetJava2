/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import Constants.Operation;
import forms.ServerForm;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import transfer.ClientRequest;
import transfer.ServerResponse;

/**
 *
 * @author Mr OLOGIZ
 */
public class ClientRequestProcessing extends Thread{
    Socket s;
    ServerForm sf;
    boolean kraj=false;
    ObjectOutputStream oos;
    ObjectInputStream ois;

    public ClientRequestProcessing(Socket s, ServerForm sf) {
        this.s = s;
        this.sf = sf;
    }

    @Override
    public void run() {
       while(!kraj){
           ClientRequest cr=aceptClientRequest();
           ServerResponse sr=new ServerResponse();
           switch(cr.getOperacija()){
               case Operation.LOGIN:
                   //proveri da li postoji preko Controllera i cr.getUsername i cr.getPassword
                   //setuj sr
                   break;
               case Operation.URADINESTO:
                   //zavisno od zahteva
                   //setuj sr
                   break;
               case Operation.PRAZANZAHTEV:
                   //setuj sr
                   break;
           }
           sendServerResponse(sr, s); //ako treba vise klijenata da bude, uzmi iz kontorllera listu socketa i salji svima
       }
    }
    
    public ClientRequest aceptClientRequest(){
        ClientRequest cr=new ClientRequest();
        try {
            ois=new ObjectInputStream(s.getInputStream());
            cr=(ClientRequest) ois.readObject();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return cr;
    }
    
    public void sendServerResponse(ServerResponse sr,Socket socket){
        try {
            oos=new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(sr);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    
}
