import java.util.Scanner;
class Q111{
   public static void main(String arg[]){
   Scanner s=new Scanner(System.in);
   int a,b;
   System.out.println("A= ");
   a=s.nextInt();
   System.out.println("B= ");
   b=s.nextInt();
   a=a+b;
   b=a-b;
   a=a-b;
   System.out.println("A= "+a);
   System.out.println("B= "+b);
}
}

