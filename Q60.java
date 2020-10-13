/*60.	Create Interface StudentFee and declare following method.  getFee() throws InvalidFeeException. 
 * This method ask fees from user and throws exception if user enters invalid or negative fees Create class
 *  Student with members (name, fees) and implement the StudentFee Interface.*/
package a1;

import java.util.Scanner;
class InvalidFeeException extends Exception{
	
}

interface StudentFee{
	public void getFee() throws InvalidFeeException;
}

class Student1 implements StudentFee{
	String name;
	int fees;
	Student1(String name, int fees){
		this.name=name;
		this.fees=fees;
	}
	public void getFee() throws InvalidFeeException{
		if(fees>0) {
			System.out.println(name+" "+fees);
		}else {
			throw new InvalidFeeException();
		}
	}
}

public class Q60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		int fees=sc.nextInt();
		Student1 s=new Student1(name, fees);
		try {
			s.getFee();
		}catch(InvalidFeeException e){
			System.out.println(e);
		}
	}

}
