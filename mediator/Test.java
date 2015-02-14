package mediator;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�鱨վ:
		ConcreteMediator mediator = new ConcreteMediator();
		//�ع�A����Ϣ�ŵ��鱨վ
		ColleaugeAgentA agentA = new ColleaugeAgentA(mediator);
		//�鱨վ��ʵ���A
		mediator.setColleaugeAgentA(agentA);
		//�ع�B����Ϣ�ŵ��鱨վ
		ColleaugeAgentB agentB = new ColleaugeAgentB(mediator);
		//�鱨վ��ʵ���B
		mediator.setColleaugeAgentB(agentB);
		
		//ͨ���鱨վ��֪ͨB
		agentA.notifyB(agentB);
		//ͨ���鱨վ��֪ͨA
		agentB.notifyA(agentA);
	}

}
