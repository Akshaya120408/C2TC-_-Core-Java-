package Day2;

public class ForEachLoopDemo {
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};	
		System.out.println("Interger Array :");	
		for(int i:a)
		{
			System.out.print(i+" ");	
		}
		System.out.println("\n");	
		
		char ch[]= {'j','a','v','a'};
		System.out.println("Character Array :");
		for(char c:ch)
		{
			System.out.print(c+" ");		
		}
		System.out.println("\n");
		
		String s1[]= {"Java","programming","learning"};
		System.out.println("String Array :");
		for(String s:s1)
		{
			System.out.print(s+" ");		
		}
	}
}
