import java.util.Scanner;
class Q110{
   public static void main(String arg[]){
   Scanner s=new Scanner(System.in);
   System.out.println("Temp in Fahrenheit");
   double f= s.nextFloat();
   double c= 5.00*(f-32.00)/9.00;
   System.out.println("Temp in Celsius "+c);
}
}