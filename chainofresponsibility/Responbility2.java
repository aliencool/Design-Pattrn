package chainofresponsibility;

public class Responbility2 extends HandlerChain{

	@Override
	protected void Next(int n) {
		// TODO Auto-generated method stub
		if( n>=10 && n<=20)
		{
			System.out.println("������2 N��ֵΪ:" + n);
		}
		else
		{
			this.handlerChain.Next(n);
		}
	}

}
