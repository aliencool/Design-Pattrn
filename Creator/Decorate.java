package Creator;


interface People
{
	void doWork();
}

//敲代码
class Programmer implements People
{

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
	    System.out.println("我有18000元工资");
	}
	
}


//装饰器
abstract class Decorator implements People
{
	
	
}

class Manager extends Decorator
{
	private People people;
	
	public Manager(People people) {
		super();
		this.people = people;
	}

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		people.doWork();
		System.out.println("我升为项目经理了，工资变成:2000000元");
	}
	
}


public class Decorate {

}
