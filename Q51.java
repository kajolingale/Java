/*52.	Input name of a person and count how many vowels it contains.  Use String class functions. */
package a1;

import java.util.Scanner;
public class Q51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		String str=st.toLowerCase();
		int count=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
				count++;
			}
		}
		System.out.println(count);
		
	}

}
