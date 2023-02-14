import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CalcWin extends JFrame implements ActionListener{
	private JTextField txtNombre = new JTextField();
	
	private JButton bt0 = new JButton("0");
	private JButton bt1 = new JButton("1");
	private JButton bt2 = new JButton("2");
	private JButton bt3 = new JButton("3");
	private JButton bt4 = new JButton("4");
	private JButton bt5 = new JButton("5");
	private JButton bt6 = new JButton("6");
	private JButton bt7 = new JButton("7");
	private JButton bt8 = new JButton("8");
	private JButton bt9 = new JButton("9");
	
	private JButton btPoint = new JButton(".");
	private JButton btPlus = new JButton("+");
	private JButton btMoins = new JButton("-");
	private JButton btMult = new JButton("*");
	private JButton btDiv = new JButton("/");
	private JButton btEgal = new JButton("=");
	private JButton btInverse = new JButton("1/x");
	private JButton btModulo = new JButton("%");
	private JButton btEffacer = new JButton("<-");
	private JButton btCE = new JButton("CE");
	private JButton btMoinsPlus = new JButton("-/+");
	private JButton btCarre = new JButton("x²");
	private JButton btRacine = new JButton("R");
	
	private boolean unPoint = false;
	private float nb1, nb2, resultat;
	private char operateur;
	

	public CalcWin()
	{
		this.setTitle("Ma Calc Win 2023");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.getContentPane().setBackground(Color.cyan);
		this.setBounds(100, 100, 360, 450);
		this.setLayout(null);
		
		this.txtNombre.setBounds(10,20,320,50);
		this.add(this.txtNombre);
		
		this.btEffacer.setBounds(10, 90, 50, 50);
		this.add(this.btEffacer);
		this.btCE.setBounds(70, 90, 50, 50);
		this.add(this.btCE);
		this.btMoinsPlus.setBounds(130, 90, 50, 50);
		this.add(this.btMoinsPlus);
		this.btCarre.setBounds(190, 90, 50, 50);
		this.add(this.btCarre);
		this.btRacine.setBounds(250, 90, 50, 50);
		this.add(this.btRacine);
		
		
		this.bt7.setBounds(10, 150, 50, 50);
		this.add(this.bt7);
		this.bt8.setBounds(70, 150, 50, 50);
		this.add(this.bt8);
		this.bt9.setBounds(130, 150, 50, 50);
		this.add(this.bt9);
		
		this.bt4.setBounds(10, 210, 50, 50);
		this.add(this.bt4);
		this.bt5.setBounds(70, 210, 50, 50);
		this.add(this.bt5);
		this.bt6.setBounds(130, 210, 50, 50);
		this.add(this.bt6);
		
		this.bt1.setBounds(10, 270, 50, 50);
		this.add(this.bt1);
		this.bt2.setBounds(70, 270, 50, 50);
		this.add(this.bt2);
		this.bt3.setBounds(130, 270, 50, 50);
		this.add(this.bt3);
		
		this.bt0.setBounds(10, 330, 110, 50);
		this.add(this.bt0);
		this.btPoint.setBounds(130, 330, 50, 50);
		this.add(this.btPoint);
		
		this.btPlus.setBounds(190, 330, 50, 50);
		this.add(this.btPlus);
		this.btMoins.setBounds(190, 270, 50, 50);
		this.add(this.btMoins);
		
		this.btMult.setBounds(190, 210, 50, 50);
		this.add(this.btMult);
		this.btDiv.setBounds(190, 150, 50, 50);
		this.add(this.btDiv);
		
		this.btEgal.setBounds(250, 270, 50, 110);
		this.add(this.btEgal);
		this.btInverse.setBounds(250, 210, 50, 50);
		this.add(this.btInverse);
		
		this.btModulo.setBounds(250, 150, 50, 50);
		this.add(this.btModulo);
		
		//rendre les boutons ecoutables
		this.bt0.addActionListener(this);
		this.bt1.addActionListener(this);
		this.bt2.addActionListener(this);
		this.bt3.addActionListener(this);
		this.bt4.addActionListener(this);
		this.bt5.addActionListener(this);
		this.bt6.addActionListener(this);
		this.bt7.addActionListener(this);
		this.bt8.addActionListener(this);
		this.bt9.addActionListener(this);
		this.btPoint.addActionListener(this);
		this.btPlus.addActionListener(this);
		this.btMoins.addActionListener(this);
		this.btMult.addActionListener(this);
		this.btDiv.addActionListener(this);
		this.btEgal.addActionListener(this);
		this.btInverse.addActionListener(this);
		this.btModulo.addActionListener(this);
		this.btEffacer.addActionListener(this);
		this.btCE.addActionListener(this);
		this.btMoinsPlus.addActionListener(this);
		this.btCarre.addActionListener(this);
		this.btRacine.addActionListener(this);


		
		this.setVisible(true);
	}
	
	public static void main (String args[])
	{
		CalcWin uneCalc = new CalcWin();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.bt0) {
			this.txtNombre.setText(this.txtNombre.getText() + "0");
		}
		else if(e.getSource() == this.bt1){
			this.txtNombre.setText(this.txtNombre.getText() + "1");
		}
		else if(e.getSource() == this.bt2){
			this.txtNombre.setText(this.txtNombre.getText() + "2");
		}
		else if(e.getSource() == this.bt3){
			this.txtNombre.setText(this.txtNombre.getText() + "3");
		}
		else if(e.getSource() == this.bt4){
			this.txtNombre.setText(this.txtNombre.getText() + "4");
		}
		else if(e.getSource() == this.bt5){
			this.txtNombre.setText(this.txtNombre.getText() + "5");
		}
		else if(e.getSource() == this.bt6){
			this.txtNombre.setText(this.txtNombre.getText() + "6");
		}
		else if(e.getSource() == this.bt7){
			this.txtNombre.setText(this.txtNombre.getText() + "7");
		}
		else if(e.getSource() == this.bt8){
			this.txtNombre.setText(this.txtNombre.getText() + "8");
		}
		else if(e.getSource() == this.bt9){
			this.txtNombre.setText(this.txtNombre.getText() + "9");
		}
		else if(e.getSource() == this.btPoint) {
			if (this.unPoint == false) {
				this.txtNombre.setText(this.txtNombre.getText() + ".");	
				this.unPoint = true;
			}	
		}
		else if(e.getSource() == this.btPlus) {
			try {
				this.nb1 = Float.parseFloat(this.txtNombre.getText());
				this.operateur = '+';
				this.txtNombre.setText("");
				this.unPoint = false;
			}catch(NumberFormatException exp) {
				JOptionPane.showMessageDialog(this, "Erreur de saisie du nombre !");
			}
		}
		else if(e.getSource() == this.btMoins) {
			try {
				this.nb1 = Float.parseFloat(this.txtNombre.getText());
				this.operateur = '-';
				this.txtNombre.setText("");
				this.unPoint = false;
			}catch(NumberFormatException exp) {
				JOptionPane.showMessageDialog(this, "Erreur de saisie du nombre !");
			}
			
		}
		else if(e.getSource() == this.btMult) {
			try {
				this.nb1 = Float.parseFloat(this.txtNombre.getText());
				this.operateur = '*';
				this.txtNombre.setText("");
				this.unPoint = false;
			}catch(NumberFormatException exp) {
				JOptionPane.showMessageDialog(this, "Erreur de saisie du nombre !");
			}
		}
		else if(e.getSource() == this.btDiv) {
			try {
				this.nb1 = Float.parseFloat(this.txtNombre.getText());
				this.operateur = '/';
				this.txtNombre.setText("");
				this.unPoint = false;
			}catch(NumberFormatException exp) {
				JOptionPane.showMessageDialog(this, "Erreur de saisie du nombre !");
			}
			
		}
		else if(e.getSource() == this.btEgal) {
			try {
				this.nb2 = Float.parseFloat(this.txtNombre.getText());
				this.unPoint = false;
				switch(this.operateur)
				{
				case '+' : this.resultat = this.nb1 + this.nb2 ;
						   this.txtNombre.setText(this.resultat + "");
						   break;
				case '-' : this.resultat = this.nb1 - this.nb2;
						   this.txtNombre.setText(this.resultat + "");
						   break;
				case '*' : this.resultat = this.nb1 * this.nb2;
				   		   this.txtNombre.setText(this.resultat + "");
				   		   break;
				case '/' : if (nb2 != 0) 
						   {
						   	this.resultat = this.nb1 / this.nb2;
						   	this.txtNombre.setText(this.resultat + "");
						   }else {
							   JOptionPane.showMessageDialog(this, "Division par zero impossible !");
							   this.txtNombre.setText("");
						   }
				   		   
				   		   break;
				}
			}catch(NumberFormatException exp) {
				JOptionPane.showMessageDialog(this, "Erreur de saisie du nombre !");
			}
		}
		else if(e.getSource() == this.btInverse) {
			float nb = 0;
			try {
				nb = Float.parseFloat(this.txtNombre.getText());
				if(nb!=0) {
				nb = 1/nb ;
				this.txtNombre.setText(nb + "");
				}else {
					JOptionPane.showMessageDialog(this, "Erreur : Division par zero impossible !");
					this.txtNombre.setText("");
				}
			}catch(NumberFormatException exp) {
				JOptionPane.showMessageDialog(this, "Erreur de saisie du nombre !");
			}
		}
		else if(e.getSource() == this.btModulo) {
			float nb = 0;
			try {
				nb = Float.parseFloat(this.txtNombre.getText());
				nb = nb/100 ;
				this.txtNombre.setText(nb + "");
				
			}catch(NumberFormatException exp) {
				JOptionPane.showMessageDialog(this, "Erreur de saisie du nombre !");
			}
		}
		else if(e.getSource() == this.btEffacer) {
			String chaine  = this.txtNombre.getText();
			this.txtNombre.setText(chaine.substring(0, chaine.length() -1));
			
		}
		else if(e.getSource() == this.btCE) {
			this.txtNombre.setText("");
			this.unPoint = false;
			
		}
		else if(e.getSource() == this.btMoinsPlus) {
			if (this.txtNombre.getText().charAt(0) !='-') {
			this.txtNombre.setText( "-"  + this.txtNombre.getText());
			}else {
				String chaine  = this.txtNombre.getText();
				this.txtNombre.setText(chaine.substring(1, chaine.length()));
			}
		}
		else if(e.getSource() == this.btCarre) {
			float nb = 0;
			try {
				nb = Float.parseFloat(this.txtNombre.getText());
				nb = nb * nb;
				this.txtNombre.setText(nb + "");
			}catch(NumberFormatException exp) {
				JOptionPane.showMessageDialog(this, "Erreur de saisie du nombre !");
			}
		}
		else if(e.getSource() == this.btRacine) {
			float nb = 0;
			try {
				nb = Float.parseFloat(this.txtNombre.getText());
				if(nb>=0) {
				nb = (float) Math.sqrt(nb);
				this.txtNombre.setText(nb + "");
				}else {
					JOptionPane.showMessageDialog(this, "Erreur : Nombre saisi négatif !");
					this.txtNombre.setText("");
				}
			}catch(NumberFormatException exp) {
				JOptionPane.showMessageDialog(this, "Erreur de saisie du nombre !");
			}
		}
	}
		
		
}

