/*59.	Create a class Voter(voterId, name, age) with parameterized constructor.  
 * The parameterized constructor should throw a checked exception if age is less than 18. 
 * The message of exception is “invalid age for voter ” */
package a1;
import java.util.Scanner;

class VoterAgeException extends Exception{
	VoterAgeException(){
	super("invalid age for voter");
	}
}


class Voter{
	int voterId;
	String name;
	int age;
	Voter(int voterId, String name, int age){
		
			this.voterId=voterId;
			this.name=name;
			this.age=age;
		
	}
	
	void show() throws VoterAgeException {
		if(age>=18) {
			System.out.println(voterId+" "+name+" "+age);
		}
		else {
			throw new VoterAgeException();
		}
	}
}

public class Q59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int voterId=sc.nextInt();
	    String name=sc.next();
	    int age=sc.nextInt();
	    Voter v=new Voter(voterId, name, age);
	    try {
	    	v.show();
	    }
	    catch(VoterAgeException e) {
	    	System.out.println(e);
	    }
	}
}

