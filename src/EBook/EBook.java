/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EBook;

import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 * <p>Title : EBook </p>
 * <p> Descrption: La classe che instanzia un generico ebook e le possibile 
 * operazione che si possono effettuare su di essa  . </p>
 * <p> ls classe e definita serializzabile . </p>
 * @author Bonsu
 * 
 */
public class EBook implements Serializable {
    String Titolo;
    String Autore;
    String Anno;
    String  NumPage;
    String Percorso;
   
    /**
     * <p> il costruttore prendi in ingresso cinque parametri che rappresnetano 
     *  i dettagli del generico libro. </p>
     * @param tit Titolo
     * @param aut Autore
     * @param ann Anno
     * @param nump Numero di pagine
     * @param perc  precorso del file sul computer
     */
    
    public EBook(String tit,String aut, String ann, String nump, String perc ){
        this.Titolo=tit;
        this.Autore=aut;
        this.Anno=ann;
        this.NumPage=nump;
        this.Percorso=perc;
        
    }
    
     
    /**
     * 
     * @return : il titolo del libro 
     */
    public String getTitolo(){
        return Titolo;
    }
    
    
    /**
     * 
     * @return : una string che e' l'autore del libro 
     */
    public String getAutore(){
        return Autore;
    }
     /**
      * 
      * @return : l'anno del libro 
      */
    public String getAnno(){
        return Anno;
    }
    /**
     * ritorna 
     * @return  :una stringa che e' il numero di pagine  del libro
    
     */
   
    public String getNumPagine(){
        return NumPage;
    }
    /**
     * 
     * @return : il percorso del file  
     */
    public String getPercorso(){
        return Percorso;
    }
    /**
     * <p> prende in ingresso una stringa e lo setta coem il titolo del libro </p>
     * @param titolo  stringa contenet il titolo
     */
    public void setTitolo(String titolo){
        this.Titolo = titolo;
    }
    
    /**
     * <p> prende in ingresso una string e lo setta coem autore del libro </p>
     * @param autore  : stringa contenete l'autore
     */
    public void setAutore(String autore){
        this.Autore = autore;
    }
    /**
     * <p> prende in ingresso una stringa e lo setta come l'anno  del libro </p>
     * @param anno string contenent l'anno
     */
    public void setAnno(String anno){
        this.Anno = anno;
    }
    /**
     * <p> prende in ingresso una stringa e lo setta come numero di pagina  del libro </p>
     * @param numPagine  stringa corrispondente al numero di pagine
     */
    public void setNumPagine(String numPagine){
        this.NumPage = numPagine;
    }
    /**
     * <p> prende in ingresso una stringa e lo setta come il percorso del libro </p>
     * @param percorso  una string che contiene il percorso del fil
     */
    public void setPercorso(String percorso){
        this.Percorso = percorso;
    }

    /**
    
     * <p> Title : apertura </p>
     * <p>Description : un metodo che prende in ingresso il path di un ebook e
     *  lo apre con il programma di apertura di default del formato del file . </p> 
     * @param path  percorso del file
     */
    public void apertura(String path) {
           
        try {
            Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler  " + path);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Errore nell'apertura del file ");
        }
    }
   
    /**
     * <p>Title : getInfo </p>
     * <p>description : questo metodo (stampa) vissualizza le oknformazioen relativo ad un libro . </p>
     * 
     */
     public void getInfo(){
     System.out.println("Titolo" +" " + Titolo );
     System.out.println("Autore" +" " + Autore ); 
     System.out.println("Anno" +" " + Anno );
     System.out.println("NUmero di pagine" +" " + NumPage );
     System.out.println("Percorso " +" " + Percorso );
  }

     

     
   
}
