package bridge;

public class UrgencyMsg extends AbstractHead{
	private Implementor implementor;
	public UrgencyMsg(Implementor implementor) {
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
		msg += "特别!";
		implementor.send(msg);
	}
	
	

}
