package command;
//�����,��Ϊ,ֻ������֪���ҵĲ�����˭���á������û�����ͺ���һ̨ң�����ĺ�����ֻ��һ̨������һ��.
public class Client {
	//ң����
	private static Command command;
	//��̨���ӻ�
	private Receiver receiver;
		
	public Client(Receiver receiver) {
		super();
		this.receiver = receiver;
	}
	//��׼��̨���ӻ�
	public void assemble()
	{
		command = new ConcreteCommand(receiver);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��Ҫ������̨���ӻ��Ĺ���,����ϵ��ӻ���ң����
		Client client = new Client(new Receiver());
		client.assemble();
		
		//�����ĵ���
		Invoker invoker = new Invoker(command);
		invoker.runDelay("�ӳٿ���");
		invoker.runStart("����");
		invoker.runPause("��ͣ");
	}

}
