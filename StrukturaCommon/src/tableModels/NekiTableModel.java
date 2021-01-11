/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableModels;

import domain.Rec;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Mr OLOGIZ
 */
public class NekiTableModel extends AbstractTableModel{

    List<Rec> reci;

    public NekiTableModel() {
        reci=new ArrayList<>();
    }
      
    @Override
    public int getRowCount() {
        return reci.size();
    }

    @Override
    public int getColumnCount() {
       return 2; //hardkoduj na to koliko ti reba kolona
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Rec r=reci.get(rowIndex);
       switch(columnIndex){
           case 0:
               return r.getZnacenje1();
           case 1:
               return r.getZnacenje2();
           default:
               return "n/a";
       }
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0:
                return "SRB";
            case 1:
                return "ENG";
            default:
                return "n/a";
        }
    }
    
     public void refreshTable(){
        fireTableDataChanged();
    }
    
    public void dodajRec(Rec r){
        reci.add(r);
        fireTableDataChanged();

    }
    
    
    
}
