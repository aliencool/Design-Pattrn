package mediator;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//情报站:
		ConcreteMediator mediator = new ConcreteMediator();
		//特工A有信息放到情报站
		ColleaugeAgentA agentA = new ColleaugeAgentA(mediator);
		//情报站核实身份A
		mediator.setColleaugeAgentA(agentA);
		//特工B有信息放到情报站
		ColleaugeAgentB agentB = new ColleaugeAgentB(mediator);
		//情报站核实身份B
		mediator.setColleaugeAgentB(agentB);
		
		//通过情报站，通知B
		agentA.notifyB(agentB);
		//通过情报站，通知A
		agentB.notifyA(agentA);
	}

}
