package modele;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import controleur.Client;

public class ModeleClient {
	//instanciation de la classe BDD
	private static Bdd uneBdd = new Bdd ("localhost","orange_LM_23","root","");
	
	public static void insertClient(Client unClient)
	{
		String requete ="insert into client values (null, '"
				+ unClient.getNom() + "', '" + unClient.getPrenom() + "', '"
				+ unClient.getEmail() + "', '" + unClient.getAdresse() + "', '"
				+ unClient.getTel() + "'); ";
		
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
	
	
	
	public static ArrayList<Client> selectAllClients ()
	{
		String requete ="select * from client ;";
		ArrayList<Client> lesClients = new ArrayList<Client>();
		try 
		{
			uneBdd.seConnecter();
			Statement unStat = uneBdd.getMaConnexion().createStatement();
			ResultSet desResultats = unStat.executeQuery(requete);
			//parcourir les résultats et construire des objets clients
			while(desResultats.next()) {
				Client unClient = new Client(
						desResultats.getInt("idclient"),
						desResultats.getString("nom"),
						desResultats.getString("prenom"),
						desResultats.getString("email"),
						desResultats.getString("adresse"),						
						desResultats.getString("tel")								
						);
				//on l'ajoute dans l'ArrayList
				lesClients.add(unClient);
						
			}
			unStat.close();
			uneBdd.seDeconnecter();
		}
		catch (SQLException exp) {
			System.out.println("Erreur d'execution :" + requete);
		}
		return lesClients;
	
	}
	public static void deleteClient(int idclient)
	{
		String requete ="delete from client where idclient = " + idclient + ";";
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
	public static void updateClient(Client unClient)
	{
		String requete ="update client set nom = '"
				+ unClient.getNom() + "', prenom ='" + unClient.getPrenom() + "', email ='"
				+ unClient.getEmail() + "',adresse= '" + unClient.getAdresse() + "', tel='"
				+ unClient.getTel() + "' where idclient = "+unClient.getIdclient()+";";
		
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
	
	public static Client selectWhereClient (int idclient)
	{
		Client unClient = null;
		String requete = "select * from client where idclient = "+idclient + ";";
		try 
		{
			uneBdd.seConnecter();
			Statement unStat = uneBdd.getMaConnexion().createStatement();
			ResultSet unResultat = unStat.executeQuery(requete);
			//parcourir les résultats et construire des objets clients
			if(unResultat.next()) {
				unClient = new Client(
						unResultat.getInt("idclient"),
						unResultat.getString("nom"),
						unResultat.getString("prenom"),
						unResultat.getString("email"),
						unResultat.getString("adresse"),						
						unResultat.getString("tel")								
						);	
			}
			unStat.close();
			uneBdd.seDeconnecter();
			
		}
			
		catch (SQLException exp) {
			System.out.println("Erreur d'execution :" + requete);
		} 
		return unClient;
	}
}
