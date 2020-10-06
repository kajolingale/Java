import java.util.Scanner;
class Q125{
  public static void main(String args[]){
  Scanner s= new Scanner(System.in);
  int arr[] = new int[10];
  int sum=0;
  int sum1=0;
  for(int i=0; i<5; i++){
  arr[i]=s.nextInt();
}
 
 
 for(int i=0; i<5; i++){
    if(arr[i]%2==0){ sum=sum+arr[i];}
    else{ sum1= sum1+arr[i];}   
 }
 System.out.println("Sum of even numbers: "+sum);
 System.out.println("Sum of odd numbers: "+sum1);
}    
}