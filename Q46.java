/*46.	Create a program to demonstrate the use of instanceof operator or secure reference down casting*/
package a1;

class A { }

class Q46 extends A {
  static void method(A a) {
    if(a instanceof Q46){
    	System.out.println("performe downcasting");
       Q46 d=(Q46)a;//downcasting
       System.out.println("done");
    }
  }
 
  public static void main (String [] args) {
    A a=new Q46();
    Q46.method(a);
  }
  
 }

