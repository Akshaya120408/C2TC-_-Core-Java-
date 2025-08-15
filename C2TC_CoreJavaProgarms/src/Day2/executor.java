package Day2;

public class executor {
	public static void main(String[] args) {
		person p = new person() ;
		p.setId(101);
		p.setName("Akshaya");
		p.setAge(18);
		p.setCity("Puducherry");
		System.out.println(p.toString());
		System.out.println(p);
	}
}
