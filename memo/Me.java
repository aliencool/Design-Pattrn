package memo;

public class Me {
	private String money = "1000000000000000000000000$";
	
	
	//�Ѵ��Ǯ�ı��չ񽻸�����
	public SafeBox getBox()
	{
		return new SaveOrGetMoney(money);
	}
	
	//��Ǯ�ó���
	public String getMoneyOfBox(SafeBox safeBox)
	{
		SaveOrGetMoney getMoney = (SaveOrGetMoney)safeBox;
		return getMoney.getMoney();
	}
	
	//��Ǯ���չ� ��Ǯ�����չ�
	class SaveOrGetMoney implements SafeBox
	{
		private String money;

		public SaveOrGetMoney(String money) {
			super();
			this.money = money;
		}
		//��Ǯ
		public String getMoney() {
			return money;
		}
		
		
	}
	
	
}
