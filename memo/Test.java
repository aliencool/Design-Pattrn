package memo;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Me me = new Me();
		
		//��Ǯ�浽���չ�
		SafeBox safeBox = me.getBox();
		//�ѱ��չ�Ū������
		Bank bank = new Bank();
		System.out.println("Ǯ�Ѿ�������");
		bank.setSafeBox(safeBox);
		
		//ȡǮ 
		System.out.println("��Ҫȡ����");
		//���������õ����չ�
		SafeBox box = bank.getSafeBox();
		//������Ǯ
		System.out.println("���õ���:"+me.getMoneyOfBox(box));
	}

}
