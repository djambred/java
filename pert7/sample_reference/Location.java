public class Location {

	public int xcoord;
	public int ycoord;

	public Location(int x, int y)
	{
		this.xcoord = x;
		this.ycoord = y;
	}

	public static void setLocations(Location loc1, Location loc2)
	{
		loc1.xcoord = 30;
		loc1.ycoord = 40;
		Location buf = loc1;
		loc1 = loc2;
		loc2 = buf;
	}

	public static void main(String[] args) {
		Location loc1 = new Location(20,10);
		Location loc2 = new Location(10,50);
		System.out.println("Location 1 X Coordinate: " + loc1.xcoord + " Y Coordinate: " +loc1.ycoord); 
		System.out.println("Location 2 X Coorodinate: " + loc2.xcoord + " Y Coordinate: " +loc2.ycoord);
		System.out.println(" ");
		setLocations(loc1,loc2);
		System.out.println("Location 1 X Coordinate: " + loc1.xcoord + " Y Coordinate: " +loc1.ycoord); 
		System.out.println("Location 2 X Coorodinate: " + loc2.xcoord + " Y Coordinate: " +loc2.ycoord);
		System.out.println(" ");

	}

}
