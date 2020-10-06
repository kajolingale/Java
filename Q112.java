import java.util.Scanner;
class Q112{
   public static void main(String arg[]){
   Scanner s=new Scanner(System.in);
   int a,b,c;
   System.out.println("A= ");
   a=s.nextInt();
   System.out.println("B= ");
   b=s.nextInt();
   System.out.println("C= ");
   c=s.nextInt();
   if(a>b&&a>c){
   System.out.println(a);
   }
   else if(b>a && b>c){
   System.out.println(b);
   }
   else{
   System.out.println(c);
   }
}
}

