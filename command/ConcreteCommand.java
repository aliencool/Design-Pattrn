package command;

public class ConcreteCommand implements Command{
	//����ִ���ߵ�����
	private Receiver receiver;
	
	
	
	public ConcreteCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	public void delay(String str) {
		// TODO Auto-generated method stub
		str = "�ӳ���30��!" + str;
		receiver.delay(str);
	}

	@Override
	public void pause(String str) {
		// TODO Auto-generated method stub
		str = "��ͣ!"+str;
		receiver.pause(str);
	}

	@Override
	public void start(String str) {
		// TODO Auto-generated method stub
		receiver.start(str);
	}

}
