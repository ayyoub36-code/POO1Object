package fr.FmsAcademy.entities;

public class City {

	// attributs
	private String name;
	private String country;
	private int nbInhabitants;
	public static int counter;

	// constructor avec une forte encapsulation !
	public City(String name, String country, int nbInhabitants) {
		setName(name);
		setCountry(country);
		setNbInhabitants(nbInhabitants);
		counter++;

	}

	public City(String name, int nbInhabitants) {
		setName(name);
		this.country = "unknown";
		setNbInhabitants(nbInhabitants);
		counter++;

	}

	public City(String name, String country) {
		setName(name);
		setCountry(country);
	}

	// getter & setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		if (country.equals("unknown")) {
			this.country = "France";
		}
		return country;
	}

	public void setCountry(String country) {

		this.country = country;
	}

	public int getNbInhabitants() {
		return nbInhabitants;
	}

	public void setNbInhabitants(int nbInhabitants) {
		// mettre conditions ! nb négatif et baisse de population !
		if (nbInhabitants < 0)
			System.out.println("le nombre ne peut pas être négatif !");
		else if (nbInhabitants < this.nbInhabitants) {
			System.out.println("vous pouvez pas dissimer les toulousein !!");

		} else
			this.nbInhabitants = nbInhabitants;
	}

	// methode display()
	public void display() {
		System.out.println("ville de " + name + " en " + country + " ayant " + nbInhabitants);
	}

	@Override
	public String toString() {
		if (nbInhabitants != 0) {
			return name + " , " + country + " , population " + name + " " + nbInhabitants + " d'habitants";
		} else
			return name + " , " + country;

	}

//	@Override
//	public String toString() {
//		return "ville de " + name + " en " + country + " ayant " + nbInhabitants;
//	}

}
