public class Flower {
	
	private String color;

	public Flower(){}
	
	public Flower(String color){
		this.color= color;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	private static void setProperties(Flower flower)
	{ 
		flower.setColor("Red"); 
		flower = new Flower("Green"); 
		flower.setColor("Blue"); 
	}

	
	public static void swapObjects(Object obj1, Object obj2){
		Object buff = obj1;
		obj1=obj2;
		obj2=buff;
	}

	public static void main(String[] args) {
		Flower rose = new Flower("Red"); 
		Flower iris = new Flower("Blue"); 
		
		swapObjects(rose, iris);
		
		System.out.println("rose color="+rose.getColor());
		System.out.println("iris color="+iris.getColor());
		
		setProperties(iris);
		System.out.println("iris="+iris.getColor());

	}

}
