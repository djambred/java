public class StrongReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StrongReference reference = new StrongReference();
		
		System.out.println("Strong reference "+ reference);
		
		reference = null;
		
		System.out.println("Strong reference null value - candidate for garbage collection "+ reference);

	}

}
