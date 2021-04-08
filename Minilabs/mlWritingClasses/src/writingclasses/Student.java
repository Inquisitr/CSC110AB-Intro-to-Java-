/* Name: Austin Newton	.	........
 * Date: 03/29/21
 * Purpose: Use classes
 */
package writingclasses;

public class Student
{
	//data
        private String name;
        private int age;
        private char gender;
        private double gpa;
        private boolean onScholarship;
        
    
    

	//constructors
	public Student() // default constructor-- no input
	{

	}

	public Student(String newName, int age, char gender, double gpa, boolean onScholarship)
	{
            name = newName;
            this.age = age;
            this.gender = gender;
            this.gpa = gpa;
            this.onScholarship = onScholarship;
            
        }
        

	//methods
	public int getAge()
	{
		return age;
	}

	public void setGPA(double gpa)
	{
		this.gpa = gpa;
	}

	public void setOnScholarship(boolean onScholarship)
	{
		this.onScholarship = onScholarship;
	}

	public boolean onProbation()
	{
            if ( onScholarship == true && gpa < 2.0) {
                return true;
            } else {
                return false;
            }
		
	}

	public String toString()
	{
		return  name + "\t" + age + "\t" + gender + "\t" + gpa + "\t" + onScholarship;
	}

	public String complain()
	{
		return "Marley's jokes stink.";
	}


}
