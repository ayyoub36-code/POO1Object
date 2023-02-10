package fr.FmsAcademy.test;

import java.util.ArrayList;
import java.util.List;

import fr.FmsAcademy.entities.City;
import fr.FmsAcademy.entities.Person;

public class TestPerson {

	public static void main(String[] args) {
		// instances et affichage
		Person manu = new Person("Macron", "Emanuel", 43, "Elysee à Paris");
		Person poutine = new Person("Poutine", "Vlad", 68);
		Person biden = new Person("Biden", "joe");
		System.out.println("---------------------------------1.8-----------------------------");
		System.out.println(manu);
		System.out.println(poutine);
		System.out.println(biden);

		System.out.println("\n---------------------------------1.9-----------------------------");
		Person manu2 = new Person("Macron", "Emanuel", 43, "Elysee à Paris", new City("Amiens", "France"));
		Person poutine2 = new Person("Poutine", "Vlad", 68);
		Person biden2 = new Person("Biden", "joe");

		System.out.println(manu2);
		System.out.println(poutine2);
		System.out.println(biden2);

		System.out.println("---------------------------------2.0-----------------------------\n");
		// villes
		City paris = new City("Paris", "France", 1000000);
		City chateauroux = new City("Châteauroux", "France");
		City newYork = new City("New York", "Etats-unis");
		City newYork2 = new City("New York", "USA");
		City indianHills = new City("Indian Hills", "USA");
		City amiens = new City("Amiens", "France");

		// personnalitées
		Person manu3 = new Person("Macron", "Emanuel", 43, "Elysee à Paris", amiens);
		Person sarco = new Person("Sarcozy", "Nicolas", 66, "Paris", paris);
		Person boris = new Person("Boris", "Jhonson", 56, "Doning street à London", newYork);
		Person gerard = new Person("Depardieu", "Gerard", 72, "Moscou", chateauroux);
		Person kravitz = new Person("Kravitz", "Lenny", 56, "Hotel particulier à Paris", newYork2);
		Person jennifer = new Person("Lawrence", "jennifer", 30, "Lousiville aux USA", indianHills);

		System.out.println("Liste de personnalitées : ");
		System.out.println(manu3);
		System.out.println(sarco);
		System.out.println(boris);
		System.out.println(gerard);
		System.out.println(kravitz);
		System.out.println(jennifer);

		// liste filtrée né en france ou habite paris
		// city.getCountry() == France
		// person.getAdress().contains("paris")
		List<Person> persons = new ArrayList<Person>();
		persons.add(manu3);
		persons.add(sarco);
		persons.add(boris);
		persons.add(gerard);
		persons.add(kravitz);
		persons.add(jennifer);

		// liste filtrée
		System.out.println("\nliste filtrée :");
		for (Person person : persons) {
			if (person.getCityOfBirth().getCountry().equals("France")
					|| person.getAdress().toLowerCase().contains("paris"))
				System.out.println(person);

		}

	}

}
