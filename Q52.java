/*53.	Input data exactly in the following format, and print sum of all integer values.
 *  “67, 89, 23, 67, 12, 55, 66”.   
 * (Hint use String class split method and Integer class parseInt method) */
package a1;
import java.util.Scanner;
public class Q52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String a[]=str.split(", ");
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum=sum+Integer.parseInt(a[i]);
		}
		System.out.println(sum);
	}

}
