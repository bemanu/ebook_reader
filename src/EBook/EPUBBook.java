/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EBook;

import Library.EpubViewer;

import java.awt.GraphicsConfiguration;
import java.awt.LayoutManager;
import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import nl.siegmann.epublib.domain.Book;
import nl.siegmann.epublib.epub.EpubReader;
import nl.siegmann.epublib.viewer.Viewer;

/**
 * <p> Title : EpubBook </p>
 * <p> Descrption : Classe figlia della classe EBook che implementa il formato epub.</p>
 * <p> La classe estende la maggiior parte dei metodi della classe Ebook . </p>
 *
 * @author Bonsu
 */
public class EPUBBook extends EBook {
   private  String Format;
    
    public EPUBBook(String str, String aut, String anno, String nump, String perc){
        super(str,aut,anno,nump,perc);
        this.Format="epub";
    }
    
    
    public void setFormta(String suffix){
        this.Format=suffix;
    }
    
    public String getFormato(){
        return Format;
    }
   
    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Fromato"+ " " + Format);
        
    }
    

        
        
  
  
   @Override
     public void apertura(String path){
      
         Viewer V = null;
         JFrame panel = new JFrame();
         EpubReader epubReader = new EpubReader(); 
        
		try {
                    Book librovisual = epubReader.readEpub(new FileInputStream(path));
                      //  System.out.println("LLLLIIIINNNNKKK" + d.getElementAt(idx).getPercorso());
			EpubViewer epubvisual = new EpubViewer(librovisual);
			JFrame finestra = new JFrame(getTitolo());
			finestra.add(epubvisual);
			finestra.pack();
			finestra.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			finestra.setVisible(true);
                   //     nl.siegmann.epublib.domain.Book bk = epubReader.readEpub(new FileInputStream(path));
              //EpubViewer VW =new EpubViewer (bk);
                
                        
                       
                        
		} catch (IOException e) {
                    System.out.println("Apertura del file fallito ");
			
		}
		
	}
                
    }
