/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

/**
 *
 * @author acol
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observer;
import java.util.Observable;
import javax.swing.GroupLayout;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

class InterphaceGraphique extends JFrame implements Observer {
    Modele modele;
    
    TradingActionsZone tradeStock;

    JButton Market = new JButton("StockMarket");
    JButton Portofolio = new JButton("Portofolio");

    InterphaceGraphique(Modele modele) {
	this.modele = modele;
        setTitle("TradeSachs");
	JPanel lesBoutons = new JPanel();
	modele.addObserver(this);
        
        
        //Addicher la zone des TradesActions
        tradeStock = new TradingActionsZone();
        JInternalFrame ZoneActions = new JInternalFrame();
        ZoneActions.setContentPane(tradeStock);
        ZoneActions.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ZoneActions.setMaximumSize(new Dimension(100, 200));
        ZoneActions.setPreferredSize(new Dimension(200, 400));
        ZoneActions.setTitle("Trade In actions");
        ZoneActions.setVisible(true);

        
       GroupLayout fw = new GroupLayout(ZoneActions.getContentPane());
       ZoneActions.getContentPane().setLayout(fw);
       fw.setHorizontalGroup(
            fw.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 294, Short.MAX_VALUE)
        );
        fw.setVerticalGroup(
            fw.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        
        
//	lesBoutons.add(Market);
//	lesBoutons.add(Portofolio);
//	add(lesBoutons, BorderLayout.WEST);
//	add(ardoise, BorderLayout.CENTER);
 
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLocation(500,500);
	pack();
	setVisible(true);
    }
	
//    public void update(Observable o, Object arg) {
//	ardoise.setPossedeDisque(modele.getExiste());
//	ardoise.repaint();
//    }

    @Override
    public void update(Observable o, Object o1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

class Modele extends Observable {
    private boolean existe;

    void setExiste(boolean existe) {
	this.existe = existe;
	setChanged();
	notifyObservers();
    } 

    boolean getExiste() {
	return existe;
    }   
}

class  Controleur implements ActionListener { 
    Modele modele;
    InterphaceGraphique vue;
    
    Controleur(Modele modele, InterphaceGraphique vue) {
	this.modele = modele;
	this.vue = vue;
    }
    
    public void actionPerformed(ActionEvent e) {
	if (e.getSource() == vue.Market) modele.setExiste(true);
	else if (e.getSource() == vue.Portofolio)modele.setExiste(false);
    }
}
    
class EssaiBoutons5 {
    public static void main(String[] arg) {
	Modele modele = new Modele();
	InterphaceGraphique vue = new InterphaceGraphique(modele);
	Controleur controleur =  new Controleur(modele, vue);
//	vue.Portofolio.addActionListener(controleur);
//	vue.Portofolio.addActionListener(controleur);
  }
}

//Ouvre une fenetre avec deux boutons "trace" et "efface"
//situes cote a cote en bas, au milieu
//un clic sur trace :trace un disque rouge au centre
//un clic sur efface : efface

