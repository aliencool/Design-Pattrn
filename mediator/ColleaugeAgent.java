package mediator;
//�ع���
public abstract class ColleaugeAgent {
	//�ع��������໥�ǲ�����ʶ�ģ����ܽ����ģ�����˵����ֻ�У�ͨ���鱨վ�����ԣ�ÿ���ع������鱨վ
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
