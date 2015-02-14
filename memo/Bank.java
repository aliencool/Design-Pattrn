package memo;

public class Bank {
	//持有保险柜
	private SafeBox safeBox = null;

	//持有保险柜
	public void setSafeBox(SafeBox safeBox) {
		this.safeBox = safeBox;
	}
	
	//当主人要的时候返回保险柜
	public SafeBox getSafeBox() {
		return safeBox;
	}
	
}
