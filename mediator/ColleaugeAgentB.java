package mediator;
//�ع�A
public class ColleaugeAgentB extends ColleaugeAgent{

	public ColleaugeAgentB(MediatorIn mediatorIn) {
		super(mediatorIn);
		// TODO Auto-generated constructor stub
	}
	
	//����ȥ֪ͨ�ع�A
	public void notifyA(ColleaugeAgentA agentA)
	{
		//�õ��鱨վ,Ȼ��,���鱨
		getAgentOfLocation().notifyOtheragent(agentA);
	}
	
	public void getMsg()
	{
		System.out.println("B:�ұ�֪���������ˣ����ǣ��Ҳ�֪����˭֪ͨ�ҵ�");
	}
}
