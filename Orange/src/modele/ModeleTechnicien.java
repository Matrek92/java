package modele;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import controleur.Technicien;

public class ModeleTechnicien {
	//instanciation de la classe BDD
		private static Bdd uneBdd = new Bdd ("localhost","orange_LM_23","root","");
		
		public static void insertTechnicien(Technicien unTechnicien)
		{
			String requete ="insert into technicien values (null, '"
					+ unTechnicien.getNom() + "', '" + unTechnicien.getPrenom() + "', '"
					+ unTechnicien.getEmail() + "', '" + unTechnicien.getQualification() + "', '"
					+ unTechnicien.getTel() + "'); ";
			
		try {    
			uneBdd.seConnecter();
			Statement unStat = uneBdd.getMaConnexion().createStatement();
			unStat.execute(requete);
			unStat.close();
			uneBdd.seDeconnecter();
		}
		catch(SQLException exp){
			System.out.println("Erreur d'execution : " + requete);
		}

			
		}
		
		
		
		public static ArrayList<Technicien> selectAllTechniciens ()
		{
			String requete ="select * from technicien ;";
			ArrayList<Technicien> lesTechniciens = new ArrayList<Technicien>();
			try 
			{
				uneBdd.seConnecter();
				Statement unStat = uneBdd.getMaConnexion().createStatement();
				ResultSet desResultats = unStat.executeQuery(requete);
				//parcourir les résultats et construire des objets Techniciens
				while(desResultats.next()) {
					Technicien unTechnicien = new Technicien(
							desResultats.getInt("idTechnicien"),
							desResultats.getString("nom"),
							desResultats.getString("prenom"),
							desResultats.getString("email"),
							desResultats.getString("qualification"),						
							desResultats.getString("tel")								
							);
					//on l'ajoute dans l'ArrayList
					lesTechniciens.add(unTechnicien);
							
				}
				unStat.close();
				uneBdd.seDeconnecter();
			}
			catch (SQLException exp) {
				System.out.println("Erreur d'execution :" + requete);
			}
			return lesTechniciens;
		
		}
		public static void deleteTechnicien(int idtechnicien)
		{
			String requete ="delete from technicien where idtechnicien = " + idtechnicien + ";";
			try {
			uneBdd.seConnecter();
			Statement unStat = uneBdd.getMaConnexion().createStatement();
			unStat.execute(requete);
			unStat.close();
			uneBdd.seDeconnecter();
		}
		catch(SQLException exp){
			System.out.println("Erreur d'execution : " + requete);
		}

			
		}
		public static void updateTechnicien(Technicien unTechnicien)
		{
			String requete ="update technicien set nom = '"
					+ unTechnicien.getNom() + "', prenom ='" + unTechnicien.getPrenom() + "', email ='"
					+ unTechnicien.getEmail() + "',qualification= '" + unTechnicien.getQualification() + "', tel='"
					+ unTechnicien.getTel() + "' where idtechnicien = "+unTechnicien.getIdtechnicien()+";";
			
				try {
					uneBdd.seConnecter();
					Statement unStat = uneBdd.getMaConnexion().createStatement();
					unStat.execute(requete);
					unStat.close();
					uneBdd.seDeconnecter();
				}
				catch(SQLException exp){
					System.out.println("Erreur d'execution : " + requete);
				}
		}
		
		public static Technicien selectWhereTechnicien (int idtechnicien)
		{
			Technicien unTechnicien = null;
			String requete = "select * from technicien where idtechnicien = "+idtechnicien + ";";
			try 
			{
				uneBdd.seConnecter();
				Statement unStat = uneBdd.getMaConnexion().createStatement();
				ResultSet unResultat = unStat.executeQuery(requete);
				//parcourir les résultats et construire des objets Techniciens
				if(unResultat.next()) {
					unTechnicien = new Technicien(
							unResultat.getInt("idTechnicien"),
							unResultat.getString("nom"),
							unResultat.getString("prenom"),
							unResultat.getString("email"),
							unResultat.getString("qualification"),						
							unResultat.getString("tel")								
							);	
				}
				unStat.close();
				uneBdd.seDeconnecter();
				
			}
				
			catch (SQLException exp) {
				System.out.println("Erreur d'execution :" + requete);
			} 
			return unTechnicien;
		}
}
