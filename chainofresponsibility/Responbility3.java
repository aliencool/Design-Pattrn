package chainofresponsibility;

public class Responbility3 extends HandlerChain{

	@Override
	protected void Next(int n) {
		// TODO Auto-generated method stub
		if( n>=20 && n<=30)
		{
			System.out.println("在链条3 N的值为:" + n);
		}
		else
		{
			System.out.println("尽头");
		}
	}

}
