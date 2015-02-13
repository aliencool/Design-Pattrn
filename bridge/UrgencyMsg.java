package bridge;

public class UrgencyMsg extends AbstractHead{
	private Implementor implementor;
	public UrgencyMsg(Implementor implementor) {
		super(implementor);
		this.implementor = implementor;
	}
	
	//������չ
	public void  watch()
	{
	
	}

	@Override
	public void sendMessage(String msg) {
		// TODO Auto-generated method stub
		msg += "�ر�!";
		implementor.send(msg);
	}
	
	

}
