package bridge;

public abstract class AbstractHead {
	private Implementor implementor;

	public AbstractHead(Implementor implementor) {
		super();
		this.implementor = implementor;
	}
	
	public void sendMessage(String msg)
	{
		this.implementor.send(msg);
	}
}
