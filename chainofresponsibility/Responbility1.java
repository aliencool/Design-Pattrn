package chainofresponsibility;

public class Responbility1 extends HandlerChain{

	@Override
	protected void Next(int n) {
		// TODO Auto-generated method stub
		if( n>=0 && n<=10)
		{
			System.out.println("在链条1 N的值为:" + n);
		}
		else
		{
			this.handlerChain.Next(n);
		}
	}

}
