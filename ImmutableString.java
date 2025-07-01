package strings;

public class ImmutableString {

	public static void main(String[] args) {
		
		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String("Java");
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
			
		String s4 = "hello";
		s4 = "hello world";
		System.out.println(s4);
		
		String s5 = "hello";
		System.out.println(s5.concat(" preeti"));
		
		

	}

}
