package chainofresponsibility;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlerChain responbility1 = new Responbility1();
		HandlerChain responbility2 = new Responbility2();
		HandlerChain responbility3 = new Responbility3();
		
		responbility1.setHandlerChain(responbility2);
		responbility2.setHandlerChain(responbility3);
		
		responbility1.Next(20);
		
	}

}
