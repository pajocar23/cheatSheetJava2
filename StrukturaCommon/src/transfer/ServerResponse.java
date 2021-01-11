/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transfer;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Mr OLOGIZ
 */
public class ServerResponse implements Serializable{
    private boolean uspesnoLogovanje;
    private boolean kraj;
    private boolean mozeDaPocne;
    private String message;
    private List<String> listaKorisnika; //koristi LinkedList svuda

    public ServerResponse() {
        listaKorisnika=new LinkedList<>();
    }

    public ServerResponse(boolean uspesnoLogovanje, boolean kraj, boolean mozeDaPocne, String message, List<String> listaKorisnika) {
        this.uspesnoLogovanje = uspesnoLogovanje;
        this.kraj = kraj;
        this.mozeDaPocne = mozeDaPocne;
        this.message = message;
        this.listaKorisnika = listaKorisnika;
    }

    public List<String> getListaKorisnika() {
        return listaKorisnika;
    }

    public void setListaKorisnika(List<String> listaKorisnika) {
        this.listaKorisnika = listaKorisnika;
    }

    public boolean isUspesnoLogovanje() {
        return uspesnoLogovanje;
    }

    public void setUspesnoLogovanje(boolean uspesnoLogovanje) {
        this.uspesnoLogovanje = uspesnoLogovanje;
    }

    public boolean isKraj() {
        return kraj;
    }

    public void setKraj(boolean kraj) {
        this.kraj = kraj;
    }

    public boolean isMozeDaPocne() {
        return mozeDaPocne;
    }

    public void setMozeDaPocne(boolean mozeDaPocne) {
        this.mozeDaPocne = mozeDaPocne;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
    
}
