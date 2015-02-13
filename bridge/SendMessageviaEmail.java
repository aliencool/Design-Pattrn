package bridge;

public class SendMessageviaEmail implements Implementor {

	@Override
	public void send(String msg) {
		// TODO Auto-generated method stub
		System.out.println("通过邮件的消息:"+msg);
	}
}
