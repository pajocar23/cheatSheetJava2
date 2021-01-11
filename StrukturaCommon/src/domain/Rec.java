/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Objects;

/**
 *
 * @author Mr OLOGIZ
 */
public class Rec {
    private String znacenje1;
    private String znacenje2;

    public Rec() {
    }

    public Rec(String znacenje1, String znacenje2) {
        this.znacenje1 = znacenje1;
        this.znacenje2 = znacenje2;
    }

    public String getZnacenje2() {
        return znacenje2;
    }

    public void setZnacenje2(String znacenje2) {
        this.znacenje2 = znacenje2;
    }

    public String getZnacenje1() {
        return znacenje1;
    }

    public void setZnacenje1(String znacenje1) {
        this.znacenje1 = znacenje1;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.znacenje1);
        hash = 43 * hash + Objects.hashCode(this.znacenje2);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Rec other = (Rec) obj;
        return true;
    }
    
    
    
}
