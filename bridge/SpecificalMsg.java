package bridge;

public class SpecificalMsg extends AbstractHead{
	private Implementor implementor;
	public SpecificalMsg(Implementor implementor) {
		super(implementor);
		this.implementor = implementor;
	}
	
	//可以扩展
	public void  watch()
	{
	
	}

	@Override
	public void sendMessage(String msg) {
		// TODO Auto-generated method stub
		msg = msg + "特别!";
		implementor.send(msg);
	}
	
	

}
