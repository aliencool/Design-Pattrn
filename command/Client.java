package command;
//组合体,因为,只有它才知道我的参数给谁调用。如果，没有它就好像一台遥控器的红外线只能一台机器用一样.
public class Client {
	//遥控器
	private static Command command;
	//那台电视机
	private Receiver receiver;
		
	public Client(Receiver receiver) {
		super();
		this.receiver = receiver;
	}
	//对准哪台电视机
	public void assemble()
	{
		command = new ConcreteCommand(receiver);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//我要调用这台电视机的功能,先组合电视机与遥控器
		Client client = new Client(new Receiver());
		client.assemble();
		
		//真正的调用
		Invoker invoker = new Invoker(command);
		invoker.runDelay("延迟开机");
		invoker.runStart("开机");
		invoker.runPause("暂停");
	}

}
