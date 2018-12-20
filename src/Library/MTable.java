/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

import static java.awt.Color.*;
import static java.awt.Color.green;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableCellRenderer;

/**
 *  <p>Title: MTable</p>
 * <p>Questa classe rappresenta la tabella che visualizzera il contenuto del
 * Libreria di EBook, mostrando 
 * </p>
 * @author Bonsu
 */
public class MTable extends JTable {
    private TableModel mod = null;
    private JTable tab;
   // private int index;
   // private int indexI;
   // private String search;
    
    
/**
<p>Il Metodo costruttore che permette la creazione di una nuova tabella prende in ingresso due paramentri.</p>
* 
* 
     * @param model <p> Table model </p>
     * @param tbl  <p> tabella
*/

public MTable(TableModel model, JTable tbl){
     super(model);
     this.mod = model;                    
     this.tab = tbl;
     tab.setModel(mod);
     this.setAutoResizeMode(AUTO_RESIZE_LAST_COLUMN);                    
     this.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);                                
     this.setVisible(true);
/*
for (int i=0; i<TableModel.ColName.length; i++)	{        
        this.getColumnModel().getColumn(i).setHeaderValue(TableModel.ColName[i]);
*/


}

    @Override
    public Component prepareRenderer(TableCellRenderer renderer, int row, int column){
        Component comp = super.prepareRenderer(renderer, row, column);
         int modRow = convertRowIndexToModel(row);
          if (isRowSelected(modRow));
                comp.setBackground(green);
    if (row % 2 == 0) {

    comp.setBackground(blue);

} else {

    comp.setBackground(green);

}

        
        return comp;
    

    }
    

}