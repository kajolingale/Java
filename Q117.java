import java.util.Scanner;
class Q117{
  public static void main(String args[]){
  Scanner s= new Scanner(System.in);
  System.out.println("Enter no");
  int n=s.nextInt();
  int rev=0;
  while(n!=0){
  int a=n%10;
  rev=rev*10+a;
  n=n/10;
  }
  System.out.println(rev);
  }
}