/*49.	Create Interface Taxable with members salesTax=7% and incomeTax=10.5%. create abstract method 
 * calcTax().
 *  a. Create class Employee(empId,name,salary) and implement Taxable to calculate incomeTax on yearly salary.
 *  b. Create class Product(pid,price,quantity) and implement Taxable to calculate salesTax on unit price of 
 *  product. 
 *  c. Create class for main method(Say XYZ), accept employee information and a product information from user 
 *  and print income tax and sales tax respectively.*/
package a1;

interface Taxable{
	float salesTax=7;
	float incomeTax=10.5f;
	abstract float calcTax();
	
}

class Employee implements Taxable{
	int empId;
	String name; 
	float calcTax() {
		
	}
}

public class Q49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
