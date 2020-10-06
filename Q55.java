/*55.	Write a program to count no of words in the String.*/
package a1;

import java.util.Scanner;
public class Q55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String a[]=str.split(" ");
		System.out.println(a.length);
	}

}
