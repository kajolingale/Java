import java.util.Scanner;
class Q114{
   public static void main(String arg[]){
   Scanner s=new Scanner(System.in);
   System.out.print("enter year ");
   int y=s.nextInt();
   if((y/4==0 && y/100!=0) || (y/400==0))
   {
     System.out.println(y+" is leap year");
   }
   else{
     System.out.println(y+" is not leap year");
   } 
}
}

