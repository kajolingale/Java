import java.util.Scanner;

class Q126{
  public static void main(String args[]){
  Scanner s=new Scanner(System.in);
  int arr[][]=new int[5][];
  int a[]=new int[5];
  int b[]=new int[3];
  int c[]=new int[3];
  int d[]=new int[3];
  int e[]=new int[3];
  arr[0]=a;
  arr[1]=b;
  arr[2]=c;
  arr[3]=d;
  arr[4]=e;
 
 for(int i=0; i<5; i++){
  for(int j=0; j<arr[i].length; j++){
  arr[i][j]=s.nextInt();
}
}
 int sum=0;
 for(int ar[]:arr){
   for(int k:ar){
   System.out.print(k+" ");
   sum=sum+k;
}
 System.out.println(""); 
}
  System.out.println("Sum = "+sum);
}
}