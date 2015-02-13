package Creator;


interface People
{
	void doWork();
}

//�ô���
class Programmer implements People
{

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
	    System.out.println("����18000Ԫ����");
	}
	
}


//װ����
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
		System.out.println("����Ϊ��Ŀ�����ˣ����ʱ��:2000000Ԫ");
	}
	
}


public class Decorate {

}
