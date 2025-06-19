package strings;

public class VowelsConsonants {

	public static void main(String[] args) {
		String S1 = "Hello World";
		
		int vowelcount = 0;
		int consonantscount = 0;
		
		S1 = S1.toLowerCase();
		
		for (int i=0; i<S1.length(); i++)
		{
			char ch = S1.charAt(i);
			if (ch >= 'a' && ch <='z')
			{
			if( ch  == 'a' || ch =='e' || ch =='i' || ch =='o'|| ch =='u')
			{
				vowelcount++;
			}
			else 
			{
				consonantscount++;
			}
			
			}
		}
		System.out.println(S1);
		System.out.println("Count of Volwels:" +vowelcount);
		System.out.println("Count of consonants:" +consonantscount);
		}
	
		}

	


