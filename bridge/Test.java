package bridge;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ֻ�����
		SendMessageviaMobile messageviaMobile = new SendMessageviaMobile();
		//ҵ������
		AbstractHead abstractHead = new SpecificalMsg(messageviaMobile);
		//����
		abstractHead.sendMessage("����");
	}

}
