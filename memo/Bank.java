package memo;

public class Bank {
	//���б��չ�
	private SafeBox safeBox = null;

	//���б��չ�
	public void setSafeBox(SafeBox safeBox) {
		this.safeBox = safeBox;
	}
	
	//������Ҫ��ʱ�򷵻ر��չ�
	public SafeBox getSafeBox() {
		return safeBox;
	}
	
}
