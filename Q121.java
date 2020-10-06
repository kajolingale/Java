import java.util.Scanner;
class Q121{
  public static void main(String args[]){
  Scanner s= new Scanner(System.in);
  int arr[] = new int[10];
  int sum=0;
  for(int i=0; i<10; i++){
  arr[i]=s.nextInt();
}
 for(int a:arr){
    sum=sum+a;
 }
 System.out.println("sum = "+sum);
 double avg =sum/10.0;
 System.out.println("Average = "+avg);

}    
}