package FlyWeight;

public class ConcreteFW implements FlyWeightIn{
	
	private DragonBox state;
	
	
	//传入享元的对象
	public ConcreteFW(DragonBox state) {
		this.state = state;
	}

	//可以对细粒度进行操作
	@Override
	public DragonBox operation() {
		// TODO Auto-generated method stub
		return state;
	}

}
