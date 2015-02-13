package bridge;

public class SendMessageviaMobile implements Implementor{

	@Override
	public void send(String msg) {
		// TODO Auto-generated method stub
		System.out.println("通过手机的消息:"+msg);
	}
	

}
