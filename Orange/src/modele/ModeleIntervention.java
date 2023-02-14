package modele;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import controleur.Intervention;

public class ModeleIntervention {
	//instanciation de la classe BDD
			private static Bdd uneBdd = new Bdd ("localhost","orange_LM_23","root","");
			
			public static void insertIntervention(Intervention uneIntervention)
			{
				String requete ="insert into intervention values (null, '"
						+ uneIntervention.getDescription() + "', '" + uneIntervention.getDateinter() + "', '"
						+ uneIntervention.getPrix() + "', '" + uneIntervention.getIdclient() + "', '"
						+ uneIntervention.getIdtechnicien() + "'); ";
				
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
			
			
			
			public static ArrayList<Intervention> selectAllInterventions ()
			{
				String requete ="select * from intervention ;";
				ArrayList<Intervention> lesInterventions = new ArrayList<Intervention>();
				try 
				{
					uneBdd.seConnecter();
					Statement unStat = uneBdd.getMaConnexion().createStatement();
					ResultSet desResultats = unStat.executeQuery(requete);
					//parcourir les résultats et construire des objets Interventions
					while(desResultats.next()) {
						Intervention uneIntervention = new Intervention(
								desResultats.getInt("idinter"),
								desResultats.getString("description"),
								desResultats.getString("dateinter"),
								desResultats.getFloat("prix"),
								desResultats.getInt("idclient"),						
								desResultats.getInt("idtechnicien")								
								);
						//on l'ajoute dans l'ArrayList
						lesInterventions.add(uneIntervention);
								
					}
					unStat.close();
					uneBdd.seDeconnecter();
				}
				catch (SQLException exp) {
					System.out.println("Erreur d'execution :" + requete);
				}
				return lesInterventions;
			
			}
			public static void deleteIntervention(int idIntervention)
			{
				String requete ="delete from intervention where idinter = " + idIntervention + ";";
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
			public static void updateIntervention(Intervention uneIntervention)
			{
				String requete ="update Intervention set nom = '"
						+ uneIntervention.getDescription() + "', dateinter = '" + uneIntervention.getDateinter() + "', prix = '"
						+ uneIntervention.getPrix() + "', idclient = '" + uneIntervention.getIdclient() + "', idtechnicien = '"
						+ uneIntervention.getIdtechnicien() + "' where idinter = " + uneIntervention.getIdinter()+"; ";
				
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
			
			public static Intervention selectWhereIntervention (int idIntervention)
			{
				Intervention uneIntervention = null;
				String requete = "select * from intervention where idinter = "+idIntervention + ";";
				try 
				{
					uneBdd.seConnecter();
					Statement unStat = uneBdd.getMaConnexion().createStatement();
					ResultSet unResultat = unStat.executeQuery(requete);
					//parcourir les résultats et construire des objets Interventions
					if(unResultat.next()) {
						uneIntervention = new Intervention(
								unResultat.getInt("idinter"),
								unResultat.getString("description"),
								unResultat.getString("dateinter"),
								unResultat.getFloat("prix"),
								unResultat.getInt("idclient"),						
								unResultat.getInt("idtechnicien")								
								);	
					}
					unStat.close();
					uneBdd.seDeconnecter();
					
				}
					
				catch (SQLException exp) {
					System.out.println("Erreur d'execution :" + requete);
				} 
				return uneIntervention;
			}
}
