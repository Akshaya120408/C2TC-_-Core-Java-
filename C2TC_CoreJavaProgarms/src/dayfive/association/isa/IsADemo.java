package dayfive.association.isa;

public class IsADemo {
		public static void main(String[] args) {

			Employee employee = new Employee("Akshaya", 1, "ECE");
			Manager manager = new Manager("Kavya", 2, "IT", 8);

			System.out.println(employee);
			System.out.println("---------------------------------------------------------------");
			System.out.println(manager);
		}
	
}
