package loopingstatement;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1221;
		int original = num;
		int rev = 0;
		
		while(num != 0)
		{
			int digit = num%10;
			rev = rev*10 + digit;
			num= num/10;
			
		}
		
		if (original == rev)
		{
			System.out.println("It is a palindrome " + original);
		}
		else
		{
			System.out.println("Its not a palindrome");
		}
			
				
				
			
		
	}

}
