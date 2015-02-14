package mediator;
//�鱨վ��������ع���������Ȼ����ô֪ͨ�أ�
public class ConcreteMediator implements MediatorIn{
	private ColleaugeAgentA colleaugeAgentA;
	private ColleaugeAgentB colleaugeAgentB;
	
	

	public void setColleaugeAgentA(ColleaugeAgentA colleaugeAgentA) {
		this.colleaugeAgentA = colleaugeAgentA;
	}



	public void setColleaugeAgentB(ColleaugeAgentB colleaugeAgentB) {
		this.colleaugeAgentB = colleaugeAgentB;
	}


	//֪ͨ�����ع�
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
