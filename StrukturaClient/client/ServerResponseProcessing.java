/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import forms.ClientMainForm;
import transfer.ServerResponse;

/**
 *
 * @author Mr OLOGIZ
 */
public class ServerResponseProcessing extends Thread{
    ClientMainForm cmf;
    private boolean kraj=false;

    public ServerResponseProcessing(ClientMainForm cmf) {
        this.cmf=cmf;
    }

    @Override
    public void run() {
        while(!kraj){
            ServerResponse sr=CommunicationWithServer.getInstance().acceptServerResponse();
            if(!sr.isKraj()){ //neki uslov
                //radi nesto
            }
        }
    }

    public ClientMainForm getCmf() {
        return cmf;
    }

    public boolean isKraj() {
        return kraj;
    }

    public void setKraj(boolean kraj) {
        this.kraj = kraj;
    }
    
    
    
    
    
}
