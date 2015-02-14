package creator;

import java.awt.List;
import java.util.ArrayList;

abstract class Build
{
	abstract void Method1();//���췽��1
	abstract void Method2();//���췽��2
	abstract Product getProduct();
}

class Product
{
	private ArrayList<String> list = new ArrayList<String>();
	
	public void construct(String info)
	{
		System.out.println("�ұ�������");
		list.add(info);
	}
	
	public void show()
	{
		for (int i = 0; i < list.size(); i++) {
			System.out.println("�ҽ����"+list.get(i));
		}
	}

}


//����A˵������Ҫ�����һ�� ��� Ư���ġ�

class A extends Build{
	Product p = new Product();
	@Override
	void Method1() {
		// TODO Auto-generated method stub
		p.construct("���");
	}

	@Override
	void Method2() {
		// TODO Auto-generated method stub
		p.construct("������");
	}

	@Override
	Product getProduct() {
		// TODO Auto-generated method stub
		return p;
	}
	
} 


//����B˵������Ҫ�����һ�� ��� ˧�ġ�

class B extends Build{
	Product p = new Product();
	@Override
	void Method1() {
		// TODO Auto-generated method stub
		p.construct("���");
	}

	@Override
	void Method2() {
		// TODO Auto-generated method stub
		p.construct("˧��");
	}

	@Override
	Product getProduct() {
		// TODO Auto-generated method stub
		return p;
	}
	
} 

//����ָ�ӣ�������Ҫ���õ�����
class Director
{
	public void Direct(Build build)
	{
		//����һ
		build.Method1();
		//�����
		build.Method2();
	}
}







public class Construct {

}
