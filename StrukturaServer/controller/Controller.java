/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.Socket;
import java.util.List;

/**
 *
 * @author Mr OLOGIZ
 */
public class Controller {
    private static Controller instance;
    private List<Socket> listaKorisnickihSocketa;
    private List<String> listaKorisnika; //promeni tip na Korisnik ili zeljeni domenski objekat
    //jos atributa

    public static Controller getInstance() {
        if(instance==null){
            instance=new Controller();
        }
        return instance;
    }

    private Controller() {
    }

    public List<Socket> getListaKorisnickihSocketa() {
        return listaKorisnickihSocketa;
    }

    public void setListaKorisnickihSocketa(List<Socket> listaKorisnickihSocketa) {
        this.listaKorisnickihSocketa = listaKorisnickihSocketa;
    }

    public List<String> getListaKorisnika() {
        return listaKorisnika;
    }

    public void setListaKorisnika(List<String> listaKorisnika) {
        this.listaKorisnika = listaKorisnika;
    }
    
    public void dodajSocketUListuUlogovanihKorisnika(Socket s){
        listaKorisnickihSocketa.add(s);
    }
    
    
    
}
