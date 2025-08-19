package dayfive.singleinheritance;

public class SLInheritanceDemo {

	public static void main(String[] args) {
		
		Citizen c = new Citizen("Akshaya", "258733456725", "Pollachi", 7708351617L);
		System.out.println(c);
		
		Student student = new Student("Kokila", "898765080", "Bangalore", 90288878787L, 10, "City College");
		System.out.println(student);
	}
}
