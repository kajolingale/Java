/*58.	Store name of weekdays in an array (starting from “Sunday” at 0 index). Ask day position from user and
 *  print day name. Handle array index out of bound exception and give proper message 
 * if user enter day index outside range (0-6). */
package a1;

import java.util.Scanner;
public class Q58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String ar[]= {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		int s=sc.nextInt();
		try {
			
				if(s==0) {System.out.println(ar[0]);}
				else if(s==1) {System.out.println(ar[1]);}
				else if(s==2) {System.out.println(ar[2]);}
				else if(s==3) {System.out.println(ar[3]);}
				else if(s==4) {System.out.println(ar[4]);}
				else if(s==5) {System.out.println(ar[5]);}
				else if(s==6) {System.out.println(ar[6]);}

		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid input");
		}
		
	}

}
