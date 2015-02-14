package memo;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Me me = new Me();
		
		//把钱存到保险柜
		SafeBox safeBox = me.getBox();
		//把保险柜弄到银行
		Bank bank = new Bank();
		System.out.println("钱已经到银行");
		bank.setSafeBox(safeBox);
		
		//取钱 
		System.out.println("我要取现了");
		//从银行先拿到保险柜
		SafeBox box = bank.getSafeBox();
		//开锁拿钱
		System.out.println("我拿到了:"+me.getMoneyOfBox(box));
	}

}
