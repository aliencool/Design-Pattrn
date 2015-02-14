package mediator;
//特工A
public class ColleaugeAgentB extends ColleaugeAgent{

	public ColleaugeAgentB(MediatorIn mediatorIn) {
		super(mediatorIn);
		// TODO Auto-generated constructor stub
	}
	
	//我想去通知特工A
	public void notifyA(ColleaugeAgentA agentA)
	{
		//得到情报站,然后,给情报
		getAgentOfLocation().notifyOtheragent(agentA);
	}
	
	public void getMsg()
	{
		System.out.println("B:我被知道有任务了，但是，我不知道是谁通知我的");
	}
}
