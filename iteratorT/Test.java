package iteratorT;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InteratorTest interatorTest = new Composite();
		interatorTest.Next();
		interatorTest.Previous();
		interatorTest.First();
		interatorTest.Last();
		System.out.println("Length:"+interatorTest.Length());
	}

}
