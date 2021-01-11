/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import forms.ServerForm;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author Mr OLOGIZ
 */
public class ServerThread extends Thread{
    ServerForm sf;
    List<String> korinsici;
    boolean kraj=false;
    ServerSocket ss;

    public ServerThread(ServerForm sf) {
        this.sf = sf;
        korinsici=new LinkedList<>(); //napuni listu korisnika kad pokrenes server
    }

    @Override
    public void run() {
        try {
            ss=new ServerSocket(9000);
            System.out.println("Server se podigao na portu: "+ss.getLocalPort());
            while(!kraj){
            System.out.println("Ceka se klijent");
            Socket s=ss.accept();
            System.out.println("Klijent konektovan");
            ClientRequestProcessing cr=new ClientRequestProcessing(s, sf);
            cr.start();
            //ako je potrebno da se konektuje 2 ili neki odredjeni broj ljudi, samo pitaj da li se u listi socketa u kontroleru nalazi odredjen broj usera
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void shutServerDown(){
        kraj=true;
        try {
            ss.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    
}
