import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;








public class Backend extends JFrame implements ActionListener{

	private JButton b1 = new JButton("");
	private JButton b2 = new JButton("");
	private JButton b3 = new JButton("");
	private JButton b4 = new JButton("");
	private JButton b5 = new JButton("");
	private JButton b6 = new JButton("");
	private JButton b7 = new JButton("");
	private JButton b8 = new JButton("");
	private JButton b9 = new JButton("");
	
	public Backend() {
		
		this.setTitle("Morpion");
		this.setLocationRelativeTo(null);
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		 this.setLayout(new GridLayout(3, 3));

		
		this.getContentPane().add(b1);
		this.getContentPane().add(b2);
		this.getContentPane().add(b3);
		this.getContentPane().add(b4);
		this.getContentPane().add(b5);
		this.getContentPane().add(b6);
		this.getContentPane().add(b7);
		this.getContentPane().add(b8);
		this.getContentPane().add(b9);
		
		//rendre les boutons écoutables
		this.b1.addActionListener(this);
		this.b2.addActionListener(this);
		this.b3.addActionListener(this);
		this.b4.addActionListener(this);
		this.b5.addActionListener(this);
		this.b6.addActionListener(this);
		this.b7.addActionListener(this);
		this.b8.addActionListener(this);
		this.b9.addActionListener(this);
		
		this.setVisible(true);
		
	}
	
	public static void main(String args[])
	 {
		 Backend unBackend = new Backend();
		 
	 }
	
	
	public void actionPerformed(ActionEvent e) {
		if((e.getSource() == this.b1) || (e.getSource() == this.b2) || (e.getSource() == this.b3) || (e.getSource() == this.b4) || (e.getSource() == this.b5) || (e.getSource() == this.b6) || (e.getSource() == this.b7) || (e.getSource() == this.b8) || (e.getSource() == this.b9))
		{
			
		}
	}
	
}
