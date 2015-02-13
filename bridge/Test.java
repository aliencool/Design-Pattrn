package bridge;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//手机发送
		SendMessageviaMobile messageviaMobile = new SendMessageviaMobile();
		//业务来发
		AbstractHead abstractHead = new SpecificalMsg(messageviaMobile);
		//发送
		abstractHead.sendMessage("哈哈");
	}

}
