package command;

public class ConcreteCommand implements Command{
	//持有执行者的引用
	private Receiver receiver;
	
	
	
	public ConcreteCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	public void delay(String str) {
		// TODO Auto-generated method stub
		str = "延迟了30秒!" + str;
		receiver.delay(str);
	}

	@Override
	public void pause(String str) {
		// TODO Auto-generated method stub
		str = "暂停!"+str;
		receiver.pause(str);
	}

	@Override
	public void start(String str) {
		// TODO Auto-generated method stub
		receiver.start(str);
	}

}
