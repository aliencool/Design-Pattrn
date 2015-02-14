package creator;

import java.awt.List;
import java.util.ArrayList;

abstract class Build
{
	abstract void Method1();//建造方法1
	abstract void Method2();//建造方法2
	abstract Product getProduct();
}

class Product
{
	private ArrayList<String> list = new ArrayList<String>();
	
	public void construct(String info)
	{
		System.out.println("我被建造了");
		list.add(info);
	}
	
	public void show()
	{
		for (int i = 0; i < list.size(); i++) {
			System.out.println("我建造成"+list.get(i));
		}
	}

}


//建造A说：“我要建造成一个 活的 漂亮的”

class A extends Build{
	Product p = new Product();
	@Override
	void Method1() {
		// TODO Auto-generated method stub
		p.construct("活的");
	}

	@Override
	void Method2() {
		// TODO Auto-generated method stub
		p.construct("美丽的");
	}

	@Override
	Product getProduct() {
		// TODO Auto-generated method stub
		return p;
	}
	
} 


//建造B说：“我要建造成一个 活的 帅的”

class B extends Build{
	Product p = new Product();
	@Override
	void Method1() {
		// TODO Auto-generated method stub
		p.construct("活的");
	}

	@Override
	void Method2() {
		// TODO Auto-generated method stub
		p.construct("帅的");
	}

	@Override
	Product getProduct() {
		// TODO Auto-generated method stub
		return p;
	}
	
} 

//建造指挥，表明他要是拿道工艺
class Director
{
	public void Direct(Build build)
	{
		//工序一
		build.Method1();
		//工序二
		build.Method2();
	}
}







public class Construct {

}
