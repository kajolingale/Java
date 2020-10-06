/*56.	Write a program to convert very first character of every word in uppercase in a String.*/
package a1;

import java.util.Scanner;
public class Q56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		StringBuffer s = new StringBuffer(); 
		  
        char ch = ' '; 
        for (int i = 0; i < str.length(); i++) { 
            if (ch == ' ' && str.charAt(i) != ' ') 
                s.append(Character.toUpperCase(str.charAt(i))); 
            else
                s.append(str.charAt(i)); 
            ch = str.charAt(i); 
        } 
        System.out.println(s.toString().trim());
	}

}
