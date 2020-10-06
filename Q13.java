class Q13{
    public static void main(String arg[]){
    int x=5;
    int y=(x*x)+(3*x)-7;
    System.out.println(y);
    y=(x++)+(++x);
    System.out.println("y= "+y+" x= "+x);
    int z=(x++)-(--y)-(--x)+(x++);
    System.out.println("x= "+x+" y= "+y+" z= "+z);
    boolean a, b, c;
    a=true;
    b=false;
    c=a && b || !(a || b);
    System.out.println("a= "+a+" b= "+b+" c= "+c);
}
}