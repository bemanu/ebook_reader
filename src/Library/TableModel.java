/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;
import EBook.EBook;
import EBook.Libreria;
import javax.swing.table.AbstractTableModel;

/**
 *<p>Title : TableModel </p> 
 * <p> Discription: un model bassato dui dettagli della mia tabella.</p>
 *<p> creo una librearia  e sovvrascrive alcuni metodi della java table. </p>
 * @author Bonsu
 */
public class TableModel extends AbstractTableModel {
 private Libreria  database ;
 public  static  String [] ColName ={ "Titolo", "Autore", "Anno","Numero Pagine","Percorso"}; 

 
 
 public TableModel(Libreria tab){
             this.database = tab;
 }

 @Override
public  int getColumnCount(){
return ColName.length;
}



    @Override
    public int getRowCount(){
    return database.getSizeLibreria();
}

    @Override
    public Object getValueAt(int row,int col){
 
    EBook LB;
        LB = (EBook) database.getElementAt(row);
    
    switch(col) {			
            case 0: return LB.getTitolo();
            case 1: return LB.getAutore();
            case 2: return LB.getAnno();
            case 3: return LB.getNumPagine();
            case 4: return LB.getPercorso();
            default: return " Errore ";
}

}

 @Override
    public String getColumnName(int colum){
        return ColName[colum];
    }
    
    
    @Override
    public void setValueAt(Object value, int row, int col) {
      EBook   LB;             
        LB = (EBook)database.getElementAt(row);
        if (col == 0)
            LB.setTitolo((String)value);
        if (col == 1)
            LB.setAutore(value.toString());
        if (col == 2)
           LB.setAnno((String) value);
        if (col == 3)
             LB.setNumPagine((String) value);
        if (col == 4)
             LB.setPercorso(value.toString());
            
        fireTableDataChanged();
    }

    

}