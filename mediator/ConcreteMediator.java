package mediator;
//情报站必须持有特工名单，不然，怎么通知呢？
public class ConcreteMediator implements MediatorIn{
	private ColleaugeAgentA colleaugeAgentA;
	private ColleaugeAgentB colleaugeAgentB;
	
	

	public void setColleaugeAgentA(ColleaugeAgentA colleaugeAgentA) {
		this.colleaugeAgentA = colleaugeAgentA;
	}



	public void setColleaugeAgentB(ColleaugeAgentB colleaugeAgentB) {
		this.colleaugeAgentB = colleaugeAgentB;
	}


	//通知其他特工
	@Override
	public void notifyOtheragent(ColleaugeAgent colleaugeAgent) {
		// TODO Auto-generated method stub
		if ( colleaugeAgent instanceof ColleaugeAgentA)
		{
			colleaugeAgentB.getMsg();
		}
		else
		{
			colleaugeAgentA.getMsg();
		}
	}

}
