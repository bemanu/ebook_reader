/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EBook;

/**
 *<p> Title: DOCEBOOK </p>
 * <p> Description: classe che definisce un libro di formato documento .</p>
 * <p>estende dalla classe ebook sovvrascrivendo alcuni metodi.</p>
 * @author Bonsu
 */
public class DOCEBook extends EBook{
    String Format;
    
    DOCEBook(String title, String author, String yrs,String pages,String path){
        super(title,author,yrs,pages,path);
        this.Format="doc";
    }
   
    public String getFormat(){
        return Format;
    }
    
    public void setFormat(String suffix){
        this.Format=suffix;
    }
    
    
     @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Formato : " + Format);
    }

    
}
