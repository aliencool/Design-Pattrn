package chainofresponsibility;

public class Responbility1 extends HandlerChain{

	@Override
	protected void Next(int n) {
		// TODO Auto-generated method stub
		if( n>=0 && n<=10)
		{
			System.out.println("������1 N��ֵΪ:" + n);
		}
		else
		{
			this.handlerChain.Next(n);
		}
	}

}
