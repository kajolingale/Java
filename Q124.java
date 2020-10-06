import java.util.Scanner;
class Q124{
  public static void main(String args[]){
  Scanner s= new Scanner(System.in);
  int arr[] = new int[10];
  int sum=0;
  for(int i=0; i<5; i++){
  arr[i]=s.nextInt();
}
 System.out.println("enter no to be searched:");
 int b=s.nextInt();
 int count=0;
 for(int i=0; i<5; i++){
 if(b==arr[i]){ System.out.println("the num "+b+" found at pos "+i);
  count=1;
  break;
 }
}
if(count==0){ System.out.println("number not found");}
}    
}