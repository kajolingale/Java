package a1;

class chain{
	chain(){
		System.out.println("This 0 parameter constructor");
	}
	chain(int i){
		this();
		System.out.println("This 1 parameter constructor");
	}
	chain(int i, int j){
		this(i);
		System.out.println("This 2 parameter constructor");
	}
}
public class Q47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new chain(2,3);
	}

}
