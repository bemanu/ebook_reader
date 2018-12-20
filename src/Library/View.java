/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Jordan
 */
public abstract class View extends JPanel implements ActionListener {
    /**
	 * Va alla pagina precedente.
	 */
	private JButton indietro;
	/**
	 * Va alla pagina successiva.
	 */
	private JButton avanti;
	/**
	 * Va alla pagina specificata dall'utente.
	 */
	private JButton vaia;
	/**
	 * Mostra il numero della pagina corrente in rapporto al numero totale di pagine.
	 */
	private JLabel pagina;
	/**
	 * Il numero totale di pagine dell'e-book visualizzato.
	 */
	private int npag;
	/**
	 * Numero della pagina corrente. E' l'unico attributo a cui la sottoclasse puo' accedere direttamente.
	 */
	protected int indice;
	
	/**
	 * Crea un visualizzatore con i pulsanti predefiniti.
	 */
	public View() {
		setLayout(new BorderLayout());
		indice = 0;
		indietro = new JButton("Indietro");
		indietro.addActionListener(this);
		indietro.setEnabled(false);
		avanti = new JButton("Avanti");
		avanti.addActionListener(this);
		vaia = new JButton("Vai alla pagina desiderata");
		vaia.addActionListener(this);
		pagina = new JLabel();
		//this.add(pagina, BorderLayout.SOUTH);
                JPanel subPanel = new JPanel();
              //  JPanel content = new JPanel();
                subPanel.add(indietro);
                
                subPanel.add(pagina);
                subPanel.add(avanti);
              //  add(content,BorderLayout.WEST);
                add(subPanel, BorderLayout.SOUTH); 
                //add(avanti, BorderLayout.SOUTH);
                //add(vaia, BorderLayout.NORTH);
	}
	
	/**
	 * Specifica il numero totale di pagine dell'e-book visualizzato.
	 * Deve essere chiamato dal costruttore della sottoclasse.
	 * @param npag il numero totale di pagine
	 */
	public void setNpag (int npag) {
		this.npag = npag;
	}
	
	/**
	 * Mostra l'indice di pagina corrente aggiornato.
	 * Deve essere integrato e specializzato dalla sottoclasse come
	 * metodo per visualizzare una nuova pagina.
	 * Viene chiamato automaticamente ogni volta che vengono utilizzati i
	 * pulsanti per la navigazione delle pagine.
	 * Deve essere chiamato dal costruttore della sottoclasse per inizializzare
	 * la prima pagina.
	 */
	public void nuovaPagina() {
		pagina.setText((indice+1)+"/"+npag);
	}
	
	/**
	 * Abilita i pulsanti del pannello cosi' che l'utente possa sfogliare liberamente
	 * le pagine dell'e-book visualizzato. Ogni volta che la pagina cambia, chiama il
	 * metodo nuovaPagina().
	 */
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(vaia)) {
			//VaiAllaPagina vaialla = new VaiAllaPagina(indice, npag);
			//Object[] opzioni = {"Vai", "Annulla"};
			//int okay = JOptionPane.showOptionDialog(this, vaialla, "Vai alla pagina desiderata", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, opzioni, opzioni[0]);
			//if (okay == JOptionPane.OK_OPTION)
			//	indice = vaialla.getValore();
		}
		if (e.getSource().equals(indietro))
			indice--;
		if (e.getSource().equals(avanti))
			indice++;
		if (indice > 0)
			indietro.setEnabled(true);
		else
			indietro.setEnabled(false);
		if ((indice+1) < npag)
			avanti.setEnabled(true);
		else
			avanti.setEnabled(false);
		nuovaPagina();
	}
	
}
