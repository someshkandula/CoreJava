/**
 * 
 */

/**
 * @author ksomalin
 *
 */
public class GCExamples {

	/**
	 * 
	 */
	public GCExamples() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Inside main method...");
		A a = new A();
		A b = new A();
		a = null;
		b = null;
		System.gc();
	}

	public void finalize() {
		System.out.println("G.C.");
	}

}

class A {

}
