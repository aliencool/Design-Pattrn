package FlyWeight;

public class DragonBox {
	private String name = "����";
	private int X ;
	private int Y ;
	private int num ;
	public String getName() {
		return name;
	}
	public int getX() {
		return X;
	}
	public void setX(int x) {
		X = x;
	}
	public int getY() {
		return Y;
	}
	public void setY(int y) {
		Y = y;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public static void main(String[] args) {
		//��һ���õ�����
		FlyWeightIn dragonBox1 = FlyWeightFactory.getFlyWeight("����");
		DragonBox Box1 = dragonBox1.operation();
		Box1.setNum(1);
		System.out.println("�������:"+Box1.getNum());
		
		//�ڶ� ���õ�����
		FlyWeightIn dragonBox2 = FlyWeightFactory.getFlyWeight("����");
		DragonBox Box2 = dragonBox2.operation();
		Box2.setNum(2);
		System.out.println("�������:"+Box2.getNum());
		
		
		System.out.println(Box1 == Box2);
	}
}
