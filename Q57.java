/*57.	Write a program to reverse every word of the String.*/
package a1;
import java.util.Scanner;
public class Q57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String a[]=str.split(" ");
		for(int i=0; i<a.length; i++) {
			for(int j=a[i].length()-1; j>=0; j--) {
				System.out.print(a[i].charAt(j));
			}
			System.out.print(" ");
		}
	}

}
