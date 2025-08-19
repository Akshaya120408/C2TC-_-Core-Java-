package Day2;

public class person {

		private int id ;
		private String name ;
		private int age ;
		private String city;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		@Override
		public String toString() {
			return "person [id=" + id + ", name=" + name + ", age=" + age 
					+ "]";
		}
		public person() {
			System.out.println("Object Created !");
		}
		public person(int id, String name, int age, String city) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
			this.city = city;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		

}
