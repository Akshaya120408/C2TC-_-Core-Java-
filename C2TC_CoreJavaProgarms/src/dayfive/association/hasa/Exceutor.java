package dayfive.association.hasa;

public class Exceutor {
	public static void main(String[] args) {
		Address address = new Address("12 Mohan Nagar", "Nashik", "Pondicherry", "422003");
		Person person = new Person("Akshaya Nallasamy", address);
		person.displayInfo();
	}
}
