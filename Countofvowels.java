package methods;

public class Countofvowels {

	public static void main(String[] args) {
		
		String S1 = "Hello how are you doing today?";
		int vowelcount = 0;
		
		S1 = S1.toLowerCase();
		
		for (int i=0; i<S1.length(); i++)
		{
			char ch = S1.charAt(i); 
			if( ch  == 'a' || ch =='e' || ch =='i' || ch =='o'|| ch =='u')
			{
				vowelcount++;
			}
			
		}
		System.out.println(S1);
		System.out.println("Count of Volwels:" +vowelcount);
		
		

	}

}
