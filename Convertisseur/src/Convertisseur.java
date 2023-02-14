import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Convertisseur extends JFrame implements ActionListener 
{
	private JButton btEuros = new JButton("Euros");
	private JButton btDevise = new JButton("Devise");
	private JButton btAC = new JButton("AC");
	private JButton btTaux = new JButton("Taux");
	private JButton btApropos = new JButton("Apropos");
	private JButton btQuitter = new JButton("Quitter");
	
	private JTextField txtMontant = new JTextField();
	
	private float taux;
	private String devise;
	
	//les objets de menu
	private JMenuBar uneBarre = new JMenuBar();
	private JMenu mnFichier = new JMenu("Fichier");
	private JMenu mnOperations = new JMenu("Operations");
	private JMenu mnApropos = new JMenu("Apropos");
	
	private JMenuItem itemQuitter = new JMenuItem("Quitter");
	private JMenuItem itemEuros = new JMenuItem("Euros");
	private JMenuItem itemDevise = new JMenuItem("Devise");
	private JMenuItem itemAC = new JMenuItem("AC");
	private JMenuItem itemTaux = new JMenuItem("Taux");
	private JMenuItem itemApropos = new JMenuItem("A propos");
	
	//constructeur de la classe
	public Convertisseur()
	{
		//changer le titre de la fenêtre 
		this.setTitle("Mon Convertisseur 2023");
		//fixer les dimensions de la fenetre
		this.setBounds(100, 100, 560, 300);
		//donner une couleur de fonds
		this.getContentPane().setBackground(Color.BLUE);//new Color (123, 89, 67)
		//annuler le redimensionnement de la fenetre
		this.setResizable(false);
		//fermeture de l'application sur click de la croix
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//supprimer la feuille de style par défault
		this.setLayout(null);
		
		//placement des objets graphiques
		this.btEuros.setBounds(20, 40, 80, 40);
		this.add(this.btEuros);
		this.txtMontant.setBounds(120, 40, 120, 40);
		this.add(this.txtMontant);
		this.btDevise.setBounds(260, 40, 100, 40);
		this.add(this.btDevise);
		
		this.btTaux.setBounds(20, 120, 80, 40);
		this.add(this.btTaux);
		this.btAC.setBounds(120, 120, 120, 40);
		this.add(this.btAC);
		this.btApropos.setBounds(260, 120, 100, 40);
		this.add(this.btApropos);
		
		this.btQuitter.setBounds(20, 200, 320, 40);
		this.add(this.btQuitter);
		
		//rendre les boutons écoutables / cliquables
		this.btAC.addActionListener(this);
		this.btApropos.addActionListener(this);
		this.btQuitter.addActionListener(this);
		this.btEuros.addActionListener(this);
		this.btDevise.addActionListener(this);
		this.btTaux.addActionListener(this);

		//initialisation des deux attributs
		this.taux = (float)6.56;
		this.devise = "Francs";
		this.btDevise.setText(this.devise);
		
		//ajout d'une image
		ImageIcon uneImage = new ImageIcon("src/monnaie.jpeg");
		JLabel monnaie = new JLabel(uneImage);
		monnaie.setBounds(370, 40, 170, 190);
		this.add(monnaie);
		
		//construction des menus
		this.mnFichier.add(this.itemQuitter);
		this.mnOperations.add(this.itemEuros);
		this.mnOperations.add(this.itemDevise);
		this.mnOperations.add(this.itemTaux);
		this.mnOperations.add(this.itemAC);
		this.mnApropos.add(this.itemApropos);
		
		//Ajout des menus à la barre
		this.uneBarre.add((this.mnFichier));
		this.uneBarre.add(this.mnOperations);
		this.uneBarre.add(this.mnApropos);
		
		//ajout de la barre dans la fenetre
		this.setJMenuBar(this.uneBarre);
		
		//rendre les items ecoutables
		this.itemAC.addActionListener(this);
		this.itemQuitter.addActionListener(this);
		this.itemApropos.addActionListener(this);
		this.itemEuros.addActionListener(this);
		this.itemDevise.addActionListener(this);
		this.itemTaux.addActionListener(this);
		
		//rendre la fenetre visible
		this.setVisible(true);
	}
	public static void main(String[] args) {
		//instanciation de la classe
		Convertisseur unConvertisseur = new Convertisseur();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.btAC || e.getSource() == this.itemAC) {
			this.txtMontant.setText("");
		}
		else if (e.getSource() == this.btApropos|| e.getSource() == this.itemApropos)
		{
			JOptionPane.showMessageDialog(this, 
					"Convertisseur 2023 \n" 
			+ "Réalisé par la classe 2 LM\n" 
			+ "En cours de Java Swing\n" 
			+ "Tous droits réservés Ecole Iris");
		}
		else if (e.getSource() == this.btQuitter|| e.getSource() == this.itemQuitter)
		{
			int retour = JOptionPane.showConfirmDialog(this, "Voulez-vous quitter l'application ?", "Quitter l'application", JOptionPane.YES_NO_OPTION);
			if(retour == 0)
			{
				this.dispose();//détruire l'application
			}
		}
		else if (e.getSource() == this.btEuros|| e.getSource() == this.itemEuros)
		{
			float mt = 0;
			try {
				mt = Float.parseFloat(this.txtMontant.getText());
				mt = mt / this.taux;
				this.txtMontant.setText(mt + "");
			}catch(NumberFormatException exp) {
				JOptionPane.showMessageDialog(this, "Erreur de saisie de la somme");
				this.txtMontant.setText("");
			}
		}
		else if (e.getSource() == this.btDevise|| e.getSource() == this.itemDevise)
		{
			float mt = 0;
			try {
				mt = Float.parseFloat(this.txtMontant.getText());
				mt = mt * this.taux;
				this.txtMontant.setText(mt + "");
			}catch(NumberFormatException exp) {
				JOptionPane.showMessageDialog(this, "Erreur de saisie de la somme");
				this.txtMontant.setText("");
			}
		}
		else if (e.getSource() == this.btTaux|| e.getSource() == this.itemTaux)
		{
			try {
				this.devise = JOptionPane.showInputDialog("Donner la nouvelle devise :");
				this.taux = Float.parseFloat(JOptionPane.showInputDialog("Son taux d'échange :"));
				this.btDevise.setText(this.devise);
			}
			catch (NumberFormatException exp){
				JOptionPane.showMessageDialog(this, "Erreur de saisie de la somme");
				this.taux = (float)6.56;
				this.devise  = "Francs";
				this.btDevise.setText(this.devise);
			}
		}
	}

}
