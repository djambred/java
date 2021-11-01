
import java.lang.ref.SoftReference; 

public class SoftReferenceExample {

	public static void main(String[] args) {
        SoftReferenceExample reference = new SoftReferenceExample();
        
        System.out.println("Soft reference "+ reference);

		
		
		SoftReference<SoftReferenceExample> softReference = new SoftReference<SoftReferenceExample>(reference);
		
		reference = softReference.get();

		System.out.println("Soft reference Example from soft reference "+ reference);
	
	}

}
