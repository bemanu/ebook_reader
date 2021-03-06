/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

import EBook.*;
import java.io.File;
import java.text.*;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *<p> Title  MFrame </p> 
 *<p> Discription: il frame principapale per la vissualizzazione della tabella contenete la mia libreria  </p> 
 * @author Bonsu
 */
public class MFrame extends JFrame {
    private Vector vett;
    private AddDialogBox nwPan;
    private TableModel tabModel;
    private Libreria liby;
    private RicercaDialogBox nwRicPan;
    private ModificaDettagli dett;
    private MTable table;
    private static File []file;
    private  int indx;
    private boolean mode;
    private JFileChooser SChooser;
    private String path = null;
  

    /**
     * <p>Title : MFrame </p>
     * <p> Discription : costrutore che crea del mio frame </p>
     * <p> crea un nuovo libreria assegnando il  tablemodel e tabella al frame </p>
     */
    public MFrame() {
        liby = new Libreria ();
        indx=0;
        initComponents();
        tabModel = new TableModel(liby);
        table = new MTable (tabModel,jTable1);
       this.setTitle("Gestore EBook");
       this.setSize(768, 595);
      this.setResizable(false);
      mode=true;
     // table.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        EsciBtt = new javax.swing.JButton();
        openBtt = new javax.swing.JButton();
        AggiungeBtt = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        modificBtt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        aggiungiMI = new javax.swing.JMenuItem();
        salvaMI = new javax.swing.JMenuItem();
        caricaMI = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestore Ebook");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EsciBtt.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        EsciBtt.setText("Esci");
        EsciBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EsciBttActionPerformed(evt);
            }
        });
        getContentPane().add(EsciBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, 115, 34));

        openBtt.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        openBtt.setText("Apri");
        openBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openBttActionPerformed(evt);
            }
        });
        getContentPane().add(openBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 27, 100, 31));

        AggiungeBtt.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        AggiungeBtt.setText("Aggiungi");
        AggiungeBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AggiungeBttActionPerformed(evt);
            }
        });
        getContentPane().add(AggiungeBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 27, 93, 31));

        jButton4.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jButton4.setText("Elimina");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 26, 93, 32));

        jTable1.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setGridColor(new java.awt.Color(51, 51, 51));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 740, 410));

        modificBtt.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        modificBtt.setText("Modifica");
        modificBtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificBttActionPerformed(evt);
            }
        });
        getContentPane().add(modificBtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 26, 107, 32));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library/library.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 770, 530));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Library/library.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 470));

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenuBar1.setBackground(new java.awt.Color(0, 153, 204));

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N

        aggiungiMI.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        aggiungiMI.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        aggiungiMI.setText("Aggiungi");
        aggiungiMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggiungiMIActionPerformed(evt);
            }
        });
        jMenu1.add(aggiungiMI);

        salvaMI.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        salvaMI.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        salvaMI.setText("Salva");
        salvaMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvaMIActionPerformed(evt);
            }
        });
        jMenu1.add(salvaMI);

        caricaMI.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        caricaMI.setText("Carica");
        caricaMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caricaMIActionPerformed(evt);
            }
        });
        jMenu1.add(caricaMI);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jMenuItem4.setText("Stampa");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jMenuItem5.setText("Esci");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenu2.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jMenuItem2.setText("Ricerca");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem6.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jMenuItem6.setText("Elimina");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem1.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jMenuItem1.setText("Modifica");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem7.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jMenuItem7.setText("Elimina Libreria");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AggiungeBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AggiungeBttActionPerformed
/*
        liby.addPdfBook("prova", "tryer", "234940", "39", "c:home/try/try2/try3");
        liby.addPdfBook("aaaaaaa", "mmmmmmmm", "445 ","5543","C:\\Users\\Jordan\\Documents\\IL_VIAGGIO_NELLA_BIBBIA.doc");
        tabModel.fireTableDataChanged();
  
         liby.stampa();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(1);
        System.out.println();System.out.println();System.out.println();
         tabModel.fireTableDataChanged();
        liby.stampa();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(2);
        System.out.println();
        System.out.println();
        System.out.println();
     */ 
        
       
        
      nwPan = new AddDialogBox(this,false,tabModel,liby,file);
        nwPan.setVisible(true);
        
    }//GEN-LAST:event_AggiungeBttActionPerformed

    private void EsciBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EsciBttActionPerformed
        if(liby.getSizeLibreria()==0){
            System.exit(0);
        }else{
           int ris;
            ris = JOptionPane.showConfirmDialog(this, "vuoi salvare la libreria prima di uscire? ","" ,JOptionPane.YES_NO_CANCEL_OPTION);
                 if(ris==0){
                   liby.saveLibreria();
                         System.exit(0);
         }
          else{
                     if(ris==1){
                        System.exit(0);
                    }
                     else{
                         return;
                     }
             
         }
        }           
    }//GEN-LAST:event_EsciBttActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(liby.getSizeLibreria()== 0 ){
            JOptionPane.showMessageDialog(this, "Attenzione Libereria vuota");
           
        }
        else{
                if(jTable1.getSelectedRow()==-1){
                     JOptionPane.showMessageDialog(this, "Selezionare l'elemento da eliminare ");
                }
                else{
                        int ans= JOptionPane.showConfirmDialog(this,"vuoi eliminare l'EBook ?.","",JOptionPane.YES_NO_OPTION);
                        if(ans==0){
                            liby.deleteElementAt(jTable1.getSelectedRow());
                                tabModel.fireTableDataChanged();
                    }
                }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       if(liby.getSizeLibreria()==0){
            System.exit(0);
        }else{
           int ris=JOptionPane.showConfirmDialog(this, "vuoi salvare la ","libreria prima di uscire " ,JOptionPane.YES_NO_CANCEL_OPTION);
                 if(ris==0){
                   liby.saveLibreria();
                         System.exit(0);
         }
          else{
                     if(ris==1){
                        System.exit(0);
                    }
                     else{
                         return;
                     }
             
         }
        }           
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void aggiungiMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aggiungiMIActionPerformed
        nwPan = new AddDialogBox(this,false,tabModel,liby,file);
        nwPan.setVisible(true);
        
    }//GEN-LAST:event_aggiungiMIActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        if(liby.getSizeLibreria()== 0 ){
            JOptionPane.showMessageDialog(this, "Attenzione Libereria vuota");         
        }
        else{
                if(jTable1.getSelectedRow()==-1){
                     JOptionPane.showMessageDialog(this, "Selezionare l'elemento da eliminare ");
                }
                else{
                        int ans= JOptionPane.showConfirmDialog(this,"vuoi eliminare l'EBook","",JOptionPane.YES_NO_OPTION);
                        if(ans==0){
                            liby.deleteElementAt(jTable1.getSelectedRow());
                                tabModel.fireTableDataChanged();
                    }
                }
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed
 
    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        int ris;
        if(liby.getSizeLibreria()==0){
                     JOptionPane.showMessageDialog(this, "Libreria gia vuoto ");
                }
        else{
            ris=JOptionPane.showConfirmDialog(this, "Eliminare il contenuto della Libreria ?","",JOptionPane.YES_NO_OPTION);
                if(ris==0){
                    liby.deleteLibreria();
                        tabModel.fireTableDataChanged();
                }
        }
        
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void salvaMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvaMIActionPerformed
        if(liby.getSizeLibreria()==0){
            JOptionPane.showMessageDialog(this, "Nulla da salvare ");
            return;
        }
        if (liby.saveLibreria()){
            JOptionPane.showMessageDialog(this, "Salvataggio effettuato ");
        }
        else{
                JOptionPane.showMessageDialog(this, "File non salvato  ");
        }
      
    }//GEN-LAST:event_salvaMIActionPerformed

    private void caricaMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caricaMIActionPerformed
        if (!liby.loadLibreria()){
            JOptionPane.showMessageDialog(this, "File non caricato  ");
        }
        else{ 
            tabModel.fireTableDataChanged();
            JOptionPane.showMessageDialog(this, "File caricato ");
                
        }
      
    }//GEN-LAST:event_caricaMIActionPerformed

    private void modificBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificBttActionPerformed
       if(liby.getSizeLibreria()== 0 ){
            JOptionPane.showMessageDialog(this, "Attenzione Libereria vuota");
   }
       else{
            indx=jTable1.getSelectedRow();
            if(indx==-1){
                     JOptionPane.showMessageDialog(this, "Selezionare l'elemento da modificare ");
                }
            else{
                dett= new ModificaDettagli(this,true,liby,table,indx,tabModel);
                    dett.setVisible(true);
            }
       } 
        
    }//GEN-LAST:event_modificBttActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       if(liby.getSizeLibreria()==0){
         JOptionPane.showMessageDialog(this, "Libreria vuoto");
         return ;
        }
        nwRicPan= new RicercaDialogBox(this,true,liby);
        nwRicPan.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       if(liby.getSizeLibreria()== 0 ){
            JOptionPane.showMessageDialog(this, "Attenzione Libereria vuota");
       }
       else{
            indx=jTable1.getSelectedRow();
            if(indx==-1){
                     JOptionPane.showMessageDialog(this, "Selezionare l'elemento da modificare ");
                }
            else{
                dett= new ModificaDettagli(this,true,liby,table,indx,tabModel);
                    dett.setVisible(true);
            }
       }    
            
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void openBttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openBttActionPerformed
       String form= null;
       if(liby.getSizeLibreria()==0){
           JOptionPane.showMessageDialog(this, "Libreria vuoto");
       }
       else{
              if(jTable1.getSelectedRow()==-1){
                  JOptionPane.showMessageDialog(this, "Selezionare l'elemento da aprire ");
              }
              else{
                EBook book=liby.getElementAt(jTable1.getSelectedRow());
                path=book.getPercorso();
                    //form = path.substring(path.length() - 4);
                       // if(!form.equals(".pdf")){
                      //      form = path.substring(path.length() - 5);
                      //  }            
                    try{
                        book.apertura(path);
                        }catch (Exception e){
                            JOptionPane.showMessageDialog(this, "Errore , apertura del file falito ");
                        }
               
       
         
              }
              
              
       }    
    }//GEN-LAST:event_openBttActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        if(liby.getSizeLibreria()==0){ 
            JOptionPane.showMessageDialog(this, "Nulla da stampare ");
        }
        else{ MessageFormat header = new MessageFormat("EBook ");
    MessageFormat footer = new MessageFormat("0,numer,integer");
    try { 
        jTable1.print(JTable.PrintMode.NORMAL, header, footer);
                              
        }catch (java.awt.print.PrinterAbortException e){                                                            
                System.err.format ("Impossibile stampare ",e.getMessage());                                   
        }catch (PrinterException ex) {        
                Logger.getLogger(MFrame.class.getName()).log(Level.SEVERE, null, ex);
            }        
                  
                  }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MFrame().setVisible(true);
            }
        });
    }
   
   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AggiungeBtt;
    private javax.swing.JButton EsciBtt;
    private javax.swing.JMenuItem aggiungiMI;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuItem caricaMI;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton modificBtt;
    private javax.swing.JButton openBtt;
    private javax.swing.JMenuItem salvaMI;
    // End of variables declaration//GEN-END:variables
}
