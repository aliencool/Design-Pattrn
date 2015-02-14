package iteratorT;

public class Composite implements InteratorTest{
	//隐藏数据结构
	private String [] msg = {"1","2","3","4","5","6"}; 
	private int Count = 0; 
	@Override
	public void Next() {
		// TODO Auto-generated method stub
		if(msg.length >= Count)
		{
			System.out.println(Count+":"+msg[Count]);
			Count++;
		}
	}

	@Override
	public void Previous() {
		// TODO Auto-generated method stub
		if(Count > 0 )
		{
			System.out.println(Count+":"+msg[Count]);
			Count--;
		}
	}

	@Override
	public void First() {
		// TODO Auto-generated method stub
		System.out.println("First:"+msg[0]);
	}

	@Override
	public void Last() {
		// TODO Auto-generated method stub
		System.out.println("Last:"+msg[msg.length-1]);
	}

	@Override
	public int Length() {
		// TODO Auto-generated method stub
		return msg.length;
	}
	
	public InteratorTest returnInterator()
	{
		return this;
	}
}
