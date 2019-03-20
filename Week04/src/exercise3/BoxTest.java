package exercise3;

public class BoxTest {

	public static void main(String[] args) 
	{
		Box box1 = new Box(5, 10, 15);
		box1.setState(false);
		System.out.println(box1.toString());
		
		Box box2 = new Box(6, 11, 16);
		box2.setState(true);
		System.out.println(box2.toString());
		
		Box box3 = new Box(7, 12, 17);
		box3.setState(false);
		System.out.println(box3.toString());
		
		Box box4 = new Box(8, 13, 18);
		box4.setState(true);
		System.out.println(box4.toString());
	}

}
