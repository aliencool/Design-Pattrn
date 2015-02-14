package command;
//真正的调用者
public class Invoker {
	//持有命令参数
	private Command command;

	public Invoker(Command command) {
		super();
		this.command = command;
	}
	
	public void runDelay(String str)
	{
		//调用了延迟,延迟多少秒由Command来决定了
		command.delay(str);
	}
	public void runPause(String str)
	{
		//调用了暂停
		command.pause(str);
	}
	public void runStart(String str)
	{
		//调用了开始
		command.start(str);
	}
}
