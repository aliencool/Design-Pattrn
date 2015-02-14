package memo;

public class Me {
	private String money = "1000000000000000000000000$";
	
	
	//把存好钱的保险柜交给银行
	public SafeBox getBox()
	{
		return new SaveOrGetMoney(money);
	}
	
	//把钱拿出来
	public String getMoneyOfBox(SafeBox safeBox)
	{
		SaveOrGetMoney getMoney = (SaveOrGetMoney)safeBox;
		return getMoney.getMoney();
	}
	
	//存钱保险柜 拿钱到保险柜
	class SaveOrGetMoney implements SafeBox
	{
		private String money;

		public SaveOrGetMoney(String money) {
			super();
			this.money = money;
		}
		//拿钱
		public String getMoney() {
			return money;
		}
		
		
	}
	
	
}
