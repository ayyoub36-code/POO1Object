package fr.FmsAcademy.test;

import fr.FmsAcademy.entities.City;

/**
 * test City
 * 
 * @author Mehdioui Ayyoub
 * 
 */
public class TestCity {

	public static void main(String[] args) {
		// use the Class City
		City toulouse = null, rabat = null, rome = null, paris = null;
		try {
			toulouse = new City("Toulouse", "France", 450000);
			rabat = new City("Rabat", "Maroc", 577000);
			rome = new City("Rome", "Italy", 850000);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// 1.1
		System.out.println("---------------------------1.1-------------------------------------------------\n");
		System.out.println(toulouse.toString());
		System.out.println(rabat.toString());
		System.out.println(rome.toString());

		int nbHabitants = toulouse.getNbInhabitants();
		nbHabitants += 20000;
		try {
			toulouse.setNbInhabitants(nbHabitants);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("\nToulouse après modif:" + toulouse.toString());

		// 1.2
		System.out.println("----------------------1.2------------------------------------------------------------\n");
		System.out.println("[ville: " + toulouse.getName() + "] " + "[pays : " + toulouse.getCountry() + "] "
				+ "[nombre d'habitants : " + toulouse.getNbInhabitants() + "]\n");
		try {
			toulouse.setNbInhabitants(-200);
			toulouse.setNbInhabitants(370000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("\n[ville: " + toulouse.getName() + "] " + "[pays : " + toulouse.getCountry() + "] "
				+ "[nombre d'habitants : " + toulouse.getNbInhabitants() + "]\n");
		System.out.println("----------------------1.3-------------------------------------------------------------\n");

		// 1.3
		try {
			paris = new City("Paris", 1000000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(paris.toString());
		System.out.println("[ville: " + paris.getName() + "] " + "[pays : " + paris.getCountry() + "] "
				+ "[nombre d'habitants : " + paris.getNbInhabitants() + "]\n");
		System.out.println("-----------------------1.4-------------------------------------------------------------\n");
		// 1.4
		toulouse.display();
		// 1.5
		System.out
				.println("-----------------------1.5--------------------------------------------------------------\n");
		System.out.println(toulouse);
		System.out.println(
				"on aura dans la console l'adresse mémoire ou il est stocké l 'objet ! parce qu'on a pas redéfinit la methode toString de la classe mère Objet");
		System.out.println(
				"-----------------------1.6-----------------------------------------------------------------\n");
		System.out.println(toulouse);
		System.out.println(
				"-----------------------1.7------------------------------------------------------------------\n");
		System.out.println("Le nombre de ville instancier : " + City.counter);

	}

}
