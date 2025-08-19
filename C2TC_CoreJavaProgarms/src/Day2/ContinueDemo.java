package Day2;

public class ContinueDemo {
	public static void main(String[] args) {
		for (int k = 2; k < 20; k++)
		{
		// even numbers are skipped
		if (k%2 == 0)
		continue;
		// odd numbers are printed
		System.out.print(k + " ");
		}
	}
}
