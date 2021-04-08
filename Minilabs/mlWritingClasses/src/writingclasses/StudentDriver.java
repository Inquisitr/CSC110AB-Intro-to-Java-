package writingclasses;//	.	........

// This will be the "driver" class for the Student class created in
// MinilabWritingClasses (It looks very complicated because of all
// the comments, but it really just creates instances of Student and
// tells them to do things...)

public class StudentDriver
{
	public static void main(String[ ] args)
	{
		//create an instance of Student
		System.out.println("***** Creating a Student, calling the default constructor");
		Student stud1 = new Student();

		//print it so we can see what the default values were for the class data
		//note that its toString() will be called automatically
		System.out.println("\n***** printing it - notice the default values (set by Java)");
		System.out.println(stud1);

		//create another instance of a Student, passing in initial values to its constructor
		System.out.println("\n***** Creating another Student, passing initial values to its constructor");
		Student msBoss = new Student("Bill Gates", 57, 'm', 3.2, true);

		//tell it to return its age
		System.out.println("\n***** telling it to return its age.");
		int theAge = msBoss.getAge();
		System.out.println("Its age is: " + theAge);

		//print it - note that its toString() will be called automatically;
		System.out.println("\n***** printing it - see if values are correct");
		System.out.println(msBoss);

		//ask it if it is on probation
		System.out.println("\n***** asking it if it is on probation (check answer)");
		System.out.println("onProbation() returned: " + msBoss.onProbation());

		//tell it to change its gpa to 1.3
		System.out.println("\n***** telling it to change its gpa to 1.3");
		msBoss.setGPA(1.3);

		//print it now
		System.out.println("\n***** printing it - see if the values are correct");
		System.out.println(msBoss);

		//ask it if it is on probation now
		System.out.println("\n***** asking it if it is on probation (check answer)");
		System.out.println("onProbation() returned: " + msBoss.onProbation());

		//tell it to complain
		System.out.println("\n***** telling it to complain");
		System.out.println("complain() returned: " + msBoss.complain());

		//tell it to change its onScholarship field to false
		System.out.println("\n***** telling it to change its onScholarship field to false");
		msBoss.setOnScholarship(false);

		//print it now
		System.out.println("\n***** printing it - see if the values are correct");
		System.out.println(msBoss);

		//ask it if it is on probation now
		System.out.println("\n***** asking it if it is on probation (check answer)");
		System.out.println("onProbation() returned: " + msBoss.onProbation());

		//create a different student, tell it to have some different values, and tell it to print itself
		System.out.println("\n***** creating a different Student, passing initial values to its constructor");
		Student stud2;
		stud2 = new Student("Hillary Clinton", 59, 'f', 2.0, true);   		//notice-can define variable and create it in 2 steps

		//print it
		System.out.println("\n***** printing it - see if the values are correct");
		System.out.println(stud2);

		//ask it if it is on probation now
		System.out.println("\n***** asking it if it is on probation (check answer)");
		System.out.println("onProbation() returned: " + stud2.onProbation());
	}
}
