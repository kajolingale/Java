import java.util.Scanner;
class Q119{
  public static void main(String args[]){
  Scanner s= new Scanner(System.in);
  System.out.println("Enter no");
  int n=s.nextInt();
  for(int i=1; i<=n; i++){
  if(i!=n){
  System.out.print(i+"2 + ");
  }
  else{
  System.out.print(i+"2");
  }
}
}
}