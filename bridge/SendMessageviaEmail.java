package bridge;

public class SendMessageviaEmail implements Implementor {

	@Override
	public void send(String msg) {
		// TODO Auto-generated method stub
		System.out.println("ͨ���ʼ�����Ϣ:"+msg);
	}
}
