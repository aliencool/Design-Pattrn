package mediator;
//特工类
public abstract class ColleaugeAgent {
	//特工必须是相互是不能认识的，不能交流的，不能说话，只有，通过情报站，所以，每个特工都有情报站
	private MediatorIn mediatorIn;
	
	public ColleaugeAgent(MediatorIn mediatorIn)
	{
		this.mediatorIn = mediatorIn;
	}
	
	protected MediatorIn getAgentOfLocation()
	{
		return mediatorIn;
	}
}
