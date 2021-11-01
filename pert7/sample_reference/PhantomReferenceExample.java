import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class PhantomReferenceExample {

	public static void main(String[] args) {
        PhantomReferenceExample reference = new PhantomReferenceExample();
		
        System.out.println("Phantom reference example "+ reference);
        
        ReferenceQueue<PhantomReferenceExample> queue = new ReferenceQueue<PhantomReferenceExample>();
		PhantomReference<PhantomReferenceExample> phantomReference = new PhantomReference<PhantomReferenceExample>(reference,queue);
		
		reference = phantomReference.get();
		
		System.out.println("Phantom reference example from Phantom reference "+ reference);

	}

}
