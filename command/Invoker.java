package command;
//�����ĵ�����
public class Invoker {
	//�����������
	private Command command;

	public Invoker(Command command) {
		super();
		this.command = command;
	}
	
	public void runDelay(String str)
	{
		//�������ӳ�,�ӳٶ�������Command��������
		command.delay(str);
	}
	public void runPause(String str)
	{
		//��������ͣ
		command.pause(str);
	}
	public void runStart(String str)
	{
		//�����˿�ʼ
		command.start(str);
	}
}
