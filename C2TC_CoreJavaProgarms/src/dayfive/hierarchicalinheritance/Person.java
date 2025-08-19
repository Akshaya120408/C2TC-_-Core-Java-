package dayfive.hierarchicalinheritance;

public class Person {
	private String name;
	private String city;

	public Person() {
		System.out.println("Person class default constructor");
		name="Tharun";
		city="Pune";
	}

	public Person(String name, String city) {
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "\n[name = " + name + ", city = " + city + "]";
	}
}
