package mediator;
//�ع�A
public class ColleaugeAgentA extends ColleaugeAgent{

	public ColleaugeAgentA(MediatorIn mediatorIn) {
		super(mediatorIn);
		// TODO Auto-generated constructor stub
	}
	
	//����ȥ֪ͨ�ع�B
	public void notifyB(ColleaugeAgentB agentB)
	{
		//�õ��鱨վ,Ȼ��,���鱨
		getAgentOfLocation().notifyOtheragent(agentB);
	}
	
	public void getMsg()
	{
		System.out.println("A:�ұ�֪���������ˣ����ǣ��Ҳ�֪����˭֪ͨ�ҵ�");
	}

}
