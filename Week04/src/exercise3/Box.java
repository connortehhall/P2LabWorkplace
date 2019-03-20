package exercise3;

public class Box {

	private int height;
	private int width;
	private int depth;
	private boolean full;
	
	public Box(int height, int width, int depth)
	{
		this.setHeight(height);
		this.setWidth(width);
		this.setDepth(depth);
		this.full = false;
	}

	public void setDepth(int depth) 
	{
		this.depth = depth;
	}
	
	public int getDepth()
	{
		return depth;
	}

	public void setWidth(int width) 
	{
		this.width = width;
	}
	
	public int getWidth()
	{
		return width;
	}

	public void setHeight(int height) 
	{
		this.height = height;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public void setState(boolean full)
	{
		this.full = full;
	}
	
	public boolean getState()
	{
		return full;
	}
	
	public String toString()
	{
		return "Height: " + height + "cm Width: " + width + "cm Depth: " + depth + "cm Full? " + full;
	}
}





