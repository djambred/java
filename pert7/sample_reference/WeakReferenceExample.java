import java.lang.ref.WeakReference; 
public class WeakReferenceExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WeakReferenceExample reference = new WeakReferenceExample();

		System.out.println("Weak reference example "+ reference);

		
		WeakReference<WeakReferenceExample> weakReference = new WeakReference<WeakReferenceExample>(reference);

		reference = weakReference.get();
		
		System.out.println("Weak reference example from Weak Reference "+ reference);


	}

}
