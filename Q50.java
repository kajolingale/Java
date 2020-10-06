/*50.	Explain the importance of toString() and equals() method of the Object class and override them on
 * class Employee(empId,name,salary).  
 * a. Create class for main method(say XYZ),and accept five employees information and store in an array. 
 * Also ensure if entered empId already exist or not (use equals method).  
 * b. Display all employee info using toString method.*/
package a1;
import java.util.Scanner;
class Employee1{
	int empId;
	String name;
	int salary;
	
	Employee1(int empId, String name, int salary){
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}

	@Override
	public String toString() {
		return empId+" "+ name +  " "+salary;
	}

	

	@Override
	public boolean equals(Object obj) {
		Employee1 emp=(Employee1)obj;
		return empId==emp.empId;
	}
	
	
	
	
}

public class Q50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        Employee1 ar[]=new Employee1[5];
        
        for(int i=0; i<ar.length; i++) {
        	int empId=sc.nextInt();
            String name=sc.next();
            int salary=sc.nextInt();
            Employee1 e=new Employee1(empId, name, salary);
            ar[i]=e;
        }
        
        for(Employee1 a:ar) {
        	System.out.println(a);
        }
	}

}
