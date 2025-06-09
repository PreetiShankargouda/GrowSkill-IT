package conditionalstatements;

public class GradeStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int math = 60;
		int science = 50;
		int english = 33;
		
		if (math < 35 || science < 35 || english < 35)
		{
			System.out.println("Failed due to low score in at least one subject");
		}
		
		double average = (math+science+english)/3.0;
		System.out.println("Average marks: " +average);
		
		String grade;
		if (average >= 90 && average <=100) 
		{
			grade = "A+";
		}
		else if (average >= 75 )
		{
		    grade = "A";
		}	
		else if (average >= 64)
		{
			grade = "B";
		}	
		else if (average >=40)
		{
			grade = "C";
		}
		else 
		{
			grade = "Fail";
		   
		}
		System.out.println("Grade: "+grade);
		
		switch(grade)
		{
		case "A+": case "A":
			System.out.println("Excellent performance");
			break;
			
		case "Fail":
			System.out.println("Please work harder next time");
			break;
			
		default:
			System.out.println("Keep improving");
		}

	}

}
