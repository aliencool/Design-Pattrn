package creator;

import java.util.ArrayList;
import java.util.List;

abstract class Componets
{
	protected List list = new ArrayList();
	abstract void add(Componets leaf);
	abstract void del(int i);
	abstract void get(int i);
	//操作
	abstract void operation();
}

class Leaf extends Componets
{

	@Override
	void add(Componets leaf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void del(int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void get(int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void operation() {
		// TODO Auto-generated method stub
		System.out.println("我是叶子");
	}
	

}




class Composite extends Componets
{
	@Override
	void add(Componets leaf) {
		// TODO Auto-generated method stub
		list.add(leaf);
	}

	@Override
	void del(int i) {
		// TODO Auto-generated method stub
		list.remove(i);
	}

	@Override
	void get(int i) {
		// TODO Auto-generated method stub
		list.get(i);
	}

	@Override
	void operation() {
		// TODO Auto-generated method stub
		
	}
	

}









public class CompositePattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leaf leaf = new Leaf();
		
		Composite composite =  new Composite();
		composite.add(leaf);
		
		Composite composite2 =  new Composite();
		composite.add(composite2);
	}

}
