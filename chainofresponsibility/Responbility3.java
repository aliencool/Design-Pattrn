package chainofresponsibility;

public class Responbility3 extends HandlerChain{

	@Override
	protected void Next(int n) {
		// TODO Auto-generated method stub
		if( n>=20 && n<=30)
		{
			System.out.println("������3 N��ֵΪ:" + n);
		}
		else
		{
			System.out.println("��ͷ");
		}
	}

}
