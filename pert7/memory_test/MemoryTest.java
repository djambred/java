class Container {
	private String initial = "A";
	
	public String getInitial() {
		return initial;
	}
	
	public void setInitial(String initial) {
		this.initial = initial;
	}
}

class MemoryTest {

	public static void main(String args[]) {
		MemoryTest main = new MemoryTest();
		main.start();
	}
	
	public void start() {
        String last = "D";
		Container container = new Container();
		container.setInitial("C");
        next(container, last);
		System.out.print(container.getInitial());
	}

    public void next(Container initialHolder, String newInitial){
        newInitial.toLowerCase();
		initialHolder.setInitial("B");
        Container initial2 = new Container();
		initialHolder=initial2;
		System.out.print(initialHolder.getInitial());
        System.out.print(newInitial);
    }
}