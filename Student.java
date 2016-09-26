import java.util.Scanner;
 
public class Student {
	String name;
	int phyMarks, mathsMarks, chemMarks;
	Scanner sc=new Scanner(System.in);
	public Student()
	{
		// non parameterized constructor taking student details as input
		System.out.print("Enter Student's name: ");
		name=sc.next();
		System.out.println("Enter Marks in Maths ");
		mathsMarks=sc.nextInt();
		System.out.println("Enter Marks in Physics: ");
		phyMarks=sc.nextInt();
		System.out.println("Enter Marks in Chemestry: ");
		chemMarks=sc.nextInt();
		
				
	}
	
	//result processing system
	public void resultProcessing()
	{
		// calculating grade and printing
		float avg;
		char grade;
		avg=(this.mathsMarks+this.phyMarks+this.chemMarks)/3;
		if(avg>=60)
		{
			grade='A';
		}
		else if(avg>=35)
		{
			grade='B';
		}
		else
		{
			grade='C';
		}
		System.out.println(this.name+" has got grade "+grade);
		sc.close();
	}

	
	public static void main(String[] args) 
	{
	//creating object of student class and calling result processing method to calculate and print result	
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		s1.resultProcessing();
		s2.resultProcessing();
		s3.resultProcessing();
		
	}

}
