package mediator;
//特工A
public class ColleaugeAgentA extends ColleaugeAgent{

	public ColleaugeAgentA(MediatorIn mediatorIn) {
		super(mediatorIn);
		// TODO Auto-generated constructor stub
	}
	
	//我想去通知特工B
	public void notifyB(ColleaugeAgentB agentB)
	{
		//得到情报站,然后,给情报
		getAgentOfLocation().notifyOtheragent(agentB);
	}
	
	public void getMsg()
	{
		System.out.println("A:我被知道有任务了，但是，我不知道是谁通知我的");
	}

}
