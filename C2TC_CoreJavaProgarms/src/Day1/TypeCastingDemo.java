package Day1;

public class TypeCastingDemo {
	public static void main(String[] args) {
		// widening / implicit type casting 
		
		byte b = 10; // 1 byte
		int i = b; //4 bytes
		System.out.println("Byte to Int : " +i);
		
		float f = 22.14f;	// 4 bytes
		double d = f;		// 8 bytes
		System.out.println("Float to Double : " +d);
		
		char ch = 'A';	// 2 bytes
		int i3 = ch;	// 4 bytes
		System.out.println("Char to Int : " +i3);
		
		char var1 = '\u00A7';
		int i4 = var1;
		System.out.println("Char to Int : " +i4);
		
		// narrowing/explicit type casting

		double f1 = 10.52f;	
		long l = (long) f1; 
		System.out.println("Double to Long : " +l);

		long l1 = 923372036854775806l; // 8 bytes
		int i2 = (int) l1; // 4 bytes
		System.out.println("Long to Int : " +i2);

		float f2 = 34.56f;
		int i1 = (int) f2;
		System.out.println("Float to Int : " +i1);

		byte b1 = 90;
		char ch1 = (char) b1;
		System.out.println("Byte to Boolean : " +ch1);
	}
}
