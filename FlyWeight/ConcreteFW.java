package FlyWeight;

public class ConcreteFW implements FlyWeightIn{
	
	private DragonBox state;
	
	
	//������Ԫ�Ķ���
	public ConcreteFW(DragonBox state) {
		this.state = state;
	}

	//���Զ�ϸ���Ƚ��в���
	@Override
	public DragonBox operation() {
		// TODO Auto-generated method stub
		return state;
	}

}
