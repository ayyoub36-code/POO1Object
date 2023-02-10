package fr.FmsAcademy.entities;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	private String adress;
	private City cityOfBirth;

	public Person(String lastName, String firstName, int age, String adress, City cityOfBirth) {
		setLastName(lastName);
		setFirstName(firstName);
		setAge(age);
		setAdress(adress);
		setCityOfBirth(cityOfBirth);
	}

	public Person(String lastName, String firstName, int age, String adress) {
		setLastName(lastName);
		setFirstName(firstName);
		setAge(age);
		setAdress(adress);

	}

	public Person(String lastName, String firstName, int age) {
		setLastName(lastName);
		setFirstName(firstName);
		setAge(age);
		setAdress("unknown");
	}

	public Person(String lastName, String firstName) {
		setLastName(lastName);
		setFirstName(firstName);
		setAge(0);
		setAdress("unknown");

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0) {
			System.out.println("l'age ne peut pas être négatif !");
		}
		this.age = age;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

//	@Override
//	public String toString() {
//		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", adress=" + adress
//				+ "]";
//	}

	public City getCityOfBirth() {
		return cityOfBirth;
	}

	@Override
	public String toString() {
		return firstName + " , " + lastName + " , " + age + "ans , habitant " + adress + ", ville de naissance : "
				+ cityOfBirth;
	}

	public void setCityOfBirth(City cityOfBirth) {
		this.cityOfBirth = cityOfBirth;
	}

}
