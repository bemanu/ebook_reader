/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EBook;

import java.awt.print.PrinterJob;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import Library.MTable;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/** 
 * <p> Title: Libreria </p> 
 * <p> Description :Classe  in cui vengono creati i vettore che contera i libri </p>
 * <p> e le verie funzione per  la gestiokne del vettore : </p> 
 * 
 * @author Bonsu
 */
public class Libreria  {
    private Vector<EBook> scafali ;
    private EBook libro;
    private PrinterJob pJob;
    private MTable table;
    private int val;

 /**
  * <p> Costrutore : inizializza un vettore e crea un novo libro . </p>
  */
     public Libreria(){
        scafali  = new Vector(0);
        libro = null;
        val=0;
    }
    
     
    /**
     * <p> addPdfBook : aggiujnge un PDF . </p>
     * @param tito <p> titolo </p>
     * @param auto <p> autore </p>
     * @param anno <p> anno </p>
     * @param numP <p> numero di pagine </p>
     * @param per  <p> percorso </p>
     */ 
     public void addPdfBook(String tito, String auto, String  anno, String numP,String per){ 
        libro = new PDFEBook(tito, auto, anno , numP, per);
        scafali .add(libro);
        
     }
     /**
     * <p> addHtmlBook : aggiujnge un libro di tipo html . </p>
     * @param tito <p> titolo </p>
     * @param auto <p> autore </p>
     * @param anno <p> anno </p>
     * @param numP <p> numero di pagine </p>
     * @param per  <p> percorso </p>
     */ 
     
         public void addHtmlEBook(String tito, String auto, String anno, String numP,String per){ 
        libro = new HTMLEBook(tito, auto, anno , numP, per);
        scafali .add(libro);
     }
    /**
     * <p> addMobiEBook : aggiujnge un libro di tipo mobi . </p>
     * @param tito <p> titolo </p>
     * @param auto <p> autore </p>
     * @param anno <p> anno </p>
     * @param numP <p> numero di pagine </p>
     * @param per  <p> percorso </p>
     */ 
         
      public void addMobiEBook(String tito, String auto, String anno, String numP,String per){ 
        libro = new MobiEBook(tito, auto, anno , numP, per);
        scafali .add(libro);
     }
   /**
     * <p> addEpubBook : aggiujnge un libro di tipo Epub . </p>
     * @param tito <p> titolo </p>
     * @param auto <p> autore </p>
     * @param anno <p> anno </p>
     * @param numP <p> numero di pagine </p>
     * @param per  <p> percorso </p>
     */    
      public void addEpubBook(String tito, String auto, String anno, String numP, String per){
          libro=new EPUBBook(tito, auto,anno,numP, per);
          scafali.add(libro);
         
      }
 /**
     * <p> addDocEBook : aggiujnge un libro di tipo Documeto (word) . </p>
     * @param tito <p> titolo </p>
     * @param auto <p> autore </p>
     * @param anno <p> anno </p>
     * @param numP <p> numero di pagine </p>
     * @param per  <p> percorso </p>
     */      
      public void addDocEBook(String tito, String auto, String anno, String numP, String per){
          libro=new DOCEBook(tito, auto,anno,numP, per);
          scafali.add(libro);
      }
      /**
       * <p> getSizeLibreria : retorna la dikmenzione della libreria. </p>
       * @return un intero
       */
     public int getSizeLibreria(){
         return scafali.size();
     }
     /**
      * <p> getElementeAt : prende in ingresso ujn indice e retorna il libro nella posizione dell'indici </p>
      * @param index : un intero che rappresenta un aposione nel vectore 
      * @return  retorna l'elemento all'indice passato 
      */
     public EBook getElementAt(int index){
         return scafali.elementAt(index);
     }
     /**
      * <p> deleteElementeAt : elimina il libro nella poszione dell'intero passato come indice . </p>
      * 
     * @param index rappresente l'indice del libro da eliminare 
      */
     public void deleteElementAt(int index){
        scafali .remove(index);
     }
     /**
      * <p>Title setElementAt </p> 
      * <p> Descrption : prende in ingresso un libro ed un indice e inserisci il libro nella posizione corrispondente all'indice. </p>
      * @param indx  : indice
      * @param bk    : libro tipo ebook
      * @return      vero o falso se l'inserimento e' stato effettuato con successo
      */
     public boolean setElementAt(int indx, EBook bk){
         if(bk==null){
             System.out.println("EBook vuoto ");
            return false;
         }
          
         scafali.insertElementAt(bk,indx);
         return true;
                   
     }
     /**
      * <p> Title : setTitle </p> 
      * <p> Decrption : prende in ingresso un intero ed una string ed setta il titolo del libro all'indice con la string. </p>
      * @param x : intero da usare come indice . 
      * @param v : stringa (titolo )
      */
     public void setTitle(int x,String v){
         scafali.elementAt(x).setTitolo(v);
     }
     /**
      *  <p> Title : setAuthor </p>
      * <p> Discription : prende in ingresso un intero ed una string ed setta il  l'autore del libro all'indice con la string. </p>
      * 
      * @param x : indice
      * @param v  : stringa (nome autore )
      */
     public void setAuthor(int x,String v){
         scafali.elementAt(x).setAutore(v);
     }
     /**
      * <p>Title : setYear </p> 
      * <p> Discription : prende in ingresso un intero ed una string ed setta il  l'anno  del libro all'indice con la string. </p>
      * @param x : indice
      * @param v : anno 
      */
     public void setYear(int x,String v){
         scafali.elementAt(x).setAnno(v);
     }
     /**
      * <p> Title :setAuthor </p> 
      * <p> Discription : prende in ingresso un intero ed una string ed setta il numero di pagine del libro all'indice con la string. </p>
      * @param x : indice della libreria
      * @param v : numero di pagine
      */
     public void setPagenumb(int x,String v){
         scafali.elementAt(x).setNumPagine(v);
     }
     /**
      * <p>Title:  deleteBook </p> 
      * <p> Discription : eleminare il libro all'indice fornito. </p>
      * @param i : indice 
      */
     public void deleteBook(int i){
         scafali.remove(i);
     }
     /**
      * <p> Title : deleteLibreria </p> 
      * <p> description : eliminare in contenuto della libreria. </p>
      */
     public void deleteLibreria(){
         scafali.removeAllElements();
     }
     
     /**
      * <p> Title : stampa  </p> 
      * <p> Discription: stampa i dettagli dei libri cokntenuto nella libreria. </p>
      */
     public void stampa(){
         for(int i=0; i<scafali.size(); i++)
             scafali.elementAt(i).getInfo();   
     }
     
    
        /**
         * <p>  Title : loadLibreria </p> 
         * <p> Discription : carica una libreria gia salvato  attravero un jfilechooser . </p>
         * @return <p> retrun vero o falso </p> 
         */
     public boolean loadLibreria() {
         Vector<EBook> data1;
         JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Caricamento");   
        FileFilter fil = new FileNameExtensionFilter(".dat","Ebook");
        FileFilter fil1 = new FileNameExtensionFilter(".bin","Ebook");
        chooser.addChoosableFileFilter(fil);
        chooser.addChoosableFileFilter(fil1);
 
       int risp = chooser.showOpenDialog(null);
 
               
        if (risp == JFileChooser.APPROVE_OPTION) {
                File fs = chooser.getSelectedFile();
                try{
                    ObjectInputStream is;
                    is = new ObjectInputStream((new FileInputStream(fs.getPath())));
                                 data1 = (Vector<EBook>)is.readObject();
                             this.scafali=data1;
                             is.close();
                                 
           }  catch (ClassNotFoundException | IOException ex) {
                 Logger.getLogger(Libreria.class.getName()).log(Level.SEVERE, null, ex);
                 return false;
             }
            
        } 
        else{
            JOptionPane.showMessageDialog(null, "Nessun file selzionato");
            return false;
        }
      return true; 
}
     
     
     
     
/**
      * <p> Title :   saveLibreria  </p> 
      * <p> Descrption: attraverso un jfilechooser salve la libreria nel documento specificato dall'utente.</p> 
      * <p> In di un file gia salvato con lostesso nome chiede all'utente se vuole sovrascrivere il file gia esistente 
      *    altrimenti salva il file con lo stesso nome aggiungendo un numero  per differenzialo. </p>
      * @return  vero o falso se e' stato possibile 
      */
 
      public boolean saveLibreria() {
          int anw;
       
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Salvataggio");   
        int risp = chooser.showSaveDialog(null);
        File fs = chooser.getSelectedFile(); 
        
      //  String path=null;// new String();
       // path=new String(fs.getPath()); 
        
        
        
        ObjectOutputStream os;
        
        if (risp == JFileChooser.APPROVE_OPTION ){
             File  filename = new File(fs.getPath()+".dat");
               if(filename.exists()){
                   anw= JOptionPane.showConfirmDialog(null, "Vuoi sovvrascriver", "file eistente", JOptionPane.YES_NO_OPTION);
                        if(anw== JOptionPane.YES_OPTION){
                              try {
                                        os = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream (fs.getPath()+ ".dat" )));
                                        os.writeObject(scafali);
                                        os.close();
                                     } catch (FileNotFoundException ex) {
                                            Logger.getLogger(Libreria.class.getName()).log(Level.SEVERE, null, ex);
                                        } catch (IOException ex) {
                                            Logger.getLogger(Libreria.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                        
                        }else{
                            try{
                                os = new ObjectOutputStream( new BufferedOutputStream( new FileOutputStream (fs.getPath()+"("+ val +")"+ ".dat")));
                                 os.writeObject(this.scafali);
                                    os.close();
                            } catch (FileNotFoundException ex) {
                                     Logger.getLogger(Libreria.class.getName()).log(Level.SEVERE, null, ex);
                                    return false;
                                } catch (IOException ex) {
                                    Logger.getLogger(Libreria.class.getName()).log(Level.SEVERE, null, ex);
                                     return false;
                                    }
                            val++;    
                        }
                }            
                
               else{
                    try{
                        os = new ObjectOutputStream( new BufferedOutputStream( new FileOutputStream (fs.getPath()+".dat")));
                        os.writeObject(this.scafali);
                        os.close();
                        
                    } catch (FileNotFoundException ex) {
                                Logger.getLogger(Libreria.class.getName()).log(Level.SEVERE, null, ex);
                                return false;
                         } catch (IOException ex) {
                            Logger.getLogger(Libreria.class.getName()).log(Level.SEVERE, null, ex);
                            return false;
                        }
                    }
                    
            
        }
        else{
           // if(path.isEmpty())
            JOptionPane.showMessageDialog(null, "Salvataggio del file annullato ");
            //System.out.println("salvatagigo annulato , nussun fiel selezionato");
            return false;  
        }
               
           
        return true;
      
}
      
               
}