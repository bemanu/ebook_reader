/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EBook;

/**
 *<p> Title : </p>
 * <p> Description : Classe figlia della classe EBook che implementa il formato html .</p>
 * <p> La classe estende la maggiior parte dei metodi della classe Ebook . </p>
 * @author Bonsu
 */
public class HTMLEBook extends EBook {
     String Format;
    
    public HTMLEBook(String str, String aut, String anno, String nump, String perc){
        super(str,aut,anno,nump,perc);
        this.Format="html";
    }
    
    public void setFormta(String suffix){
        this.Format=suffix;
    }
    
    
    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Fromato"+ " " + Format);
    }
    
}
