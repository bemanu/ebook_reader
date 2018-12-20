/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EBook;

import javax.swing.JFrame;
import javax.swing.JPanel;
import org.icepdf.ri.common.ComponentKeyBinding;
import org.icepdf.ri.common.SwingController;
import org.icepdf.ri.common.SwingViewBuilder;

        

/**<p> Title . PDFBook </p>
 * <p> Description : Classe figlia della classe EBook che implementa il formato pdf.</p>
 * <p> La classe estende la maggiior parte dei metodi della classe Ebook, 
 * redefinenedo il metodo di apetura dalla classe padre . </p>
 *
 * @author Bonsu
 */
public class PDFEBook extends EBook {
    String Format;
    
    PDFEBook(String title, String author, String yrs,String pages,String path){
        super(title,author,yrs,pages,path);
        this.Format="PDF";
    }
   
    public String getFormat(){
        return Format;
    }
    
    public void setFormat(String suffix){
        this.Format=suffix;
    }
    
   
    /**
     * <p> Title : apertura </p>
     * <p> Description : un metodo che attravero una libreria esterna (icepdf), uso per aprire un pdf . </p>
     * @param path
     */
     @Override
    public void apertura(String path) {
    
        
  // build a controller
          SwingController controller = new SwingController();

   // Build a SwingViewFactory configured with the controller
           SwingViewBuilder factory = new SwingViewBuilder(controller);
         JPanel viewerComponentPanel = factory.buildViewerPanel();

   // add copy keyboard command

          ComponentKeyBinding.install(controller, viewerComponentPanel);

          // add interactive mouse link annotation support via callback
           controller.getDocumentViewController().setAnnotationCallback(
                   new org.icepdf.ri.common.MyAnnotationCallback(
                  controller.getDocumentViewController()));
          JFrame window;
        
//  String title=tab.getSelectedRow()
         window = new JFrame(this.Titolo);
         window.getContentPane().add(viewerComponentPanel);
         window.pack();
         window.setVisible(true);
           controller.openDocument(path);

            

    }       
      
    
   

   
}

 