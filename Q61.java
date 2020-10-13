package a1;
class Prime implements Runnable
{
    public void run()
    {
        int no;
        for(no=2;no<=1000;no++)
        {
            int cnt=0;
            for(int i=2;i<=no/2;i++)
                if(no%i==0)
                {
                    cnt++;
                    break;
                }
            if(cnt==0)
                System.out.println(no+" Number is prime");
        }
    }
}

public class Q61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime p1=new Prime();
        Thread t=new Thread(p1);
        t.start();
	}

}
