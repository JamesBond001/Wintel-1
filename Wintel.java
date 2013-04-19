import javax.swing.*;
import java.awt.*;




public class Wintel extends JFrame{
	
	private JPanel iDHaut;
	private JPanel iDEst;
	private JPanel iD;
	private JLabel Carac;
	private JLabel abonnee;
	private JLabel prenom;
        private JMenuBar menu;
	private JMenu menuFichier;
	private JMenu menuAbonnes;
	private JMenu menuAide;
	private JMenuItem iFCharger;
	private JMenuItem iFSauver;
	private JMenuItem iFQuitter;
	private JMenuItem iAAjouter;
	private JMenuItem iAModifier;
	private JMenuItem iASupprimer;
	private JMenuItem iAide;


public Wintel() {

	     super ( "Wintel" );
	     this.creerInterface();
	     this.attacherReactions();
	     this.setSize( 500, 500 );
	     this.setVisible( true );
	     this.setDefaultCloseOperation ( EXIT_ON_CLOSE );
		
	     
}

public void creerInterface(){
		

		menu = new JMenuBar();
		this.setJMenuBar(menu);
		
		menuFichier = new JMenu("Fichier");
		menu.add(menuFichier);
		iFCharger = new JMenuItem("Charger");
		iFSauver = new JMenuItem("Sauver");
		iFQuitter = new JMenuItem("Quitter");

		menuFichier.add(iFCharger);
		menuFichier.add(iFSauver);
		menuFichier.add(iFQuitter);
	
		menuAbonnes = new JMenu("Abonnes");
		menu.add(menuAbonnes);
		iAAjouter = new JMenuItem("Ajouter");
		iAModifier = new JMenuItem("Modifier");
		iASupprimer = new JMenuItem("Supprimé");
		
		menuAbonnes.add(iAAjouter);
		menuAbonnes.add(iAModifier);
		menuAbonnes.add(iASupprimer);
		
		menuAide = new JMenu("Aide");
		menu.add(menuAide);
		iAide = new JMenuItem("Aide");
		menuAide.add(iAide);

		

		
		this.iDHaut = new JPanel (new GridLayout(1,2));
		this.add(iDHaut);
		this.abonnee = new JLabel("Abonnés");
		this.Carac = new JLabel("Caractéristique");
		
		this.iDHaut.add(this.abonnee);
		this.iDHaut.add(this.Carac);
}

private void attacherReactions(){}

}
