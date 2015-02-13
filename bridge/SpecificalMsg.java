package bridge;

public class SpecificalMsg extends AbstractHead{
	private Implementor implementor;
	public SpecificalMsg(Implementor implementor) {
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
		msg = msg + "�ر�!";
		implementor.send(msg);
	}
	
	

}
