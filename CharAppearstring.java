package strings;

public class CharAppearstring {

	public static void main(String[] args) {
		String str = "banana";
		int A = 0;
		
		for (int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if(ch == 'a')
			{
				A++;
			
			}
		}
		System.out.println("String name : " + str);
		System.out.println("char a  appears: " + A);
		
		

	}

}
