package Day1;

public class PrimitiveDataTypesDemo {
	public static void main(String[] args) {
		//byte takes 1 byte
		byte byteMax = 127;
		byte byteMin = -128;
		
		System.out.println("Min range of byte is" + byteMin+"\nMax range of byte is "+byteMax);
		
		//short - 2 bytes
		short shortMax = 32767;
		short shortMin = -32768;
		System.out.println("\nMin range of short is" + shortMin+"\nMax range of short is "+shortMax);
		
		//int - 4bytes
		int maxInt = 2147483647;
		int minInt = -2147483648;
		System.out.println("\nMin range of int is" + minInt+"\nMax range of int is "+maxInt);
		
		//long - 8bytes
		long maxLong = 9223372036854775807L;
		long minLong = -9223372036854775808L;
		System.out.println("\nMin range of long is" + minLong+"\nMax range of long is "+maxLong);
		
		//float - 4bytes
		float maxFloat =1.4E-45f;
		float minFloat =3.4028235E38f;
		System.out.println("\nMin range of float is" + minFloat+"\nMax range of float is "+maxFloat);
		
		//double - 8bytes
		double maxDouble =1.7976931348623157E308d;
		double minDouble =4.9E-324d;
		System.out.println("\nMin range of double is" + minDouble+"\nMax range of double is "+maxDouble);
		
		//boolean 
		boolean bool=false;
		System.out.println("\nboolean value is "+bool);
	}
}
