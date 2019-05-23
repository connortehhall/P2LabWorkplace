package watchDogs;

public class WDPlayer {

	private int nPieces;
	private int nPrevent;
	/*
	public WDPlayer()
	{
		
	}
	*/
	public int getnPieces() 
	{
		return nPieces;
	}
	
	public void setnPieces(int nPieces) 
	{
		this.nPieces = nPieces;
	}
	
	public int getnPrevent() 
	{
		return nPrevent;
	}
	
	public void setnPrevent(int nPrevent) 
	{
		this.nPrevent = nPrevent;
	}
	
	public int rank()
	{
		if (this.nPieces == 0 || this.nPrevent == 0)
		{
			return 0;
		}
		else
		{
			return 1-(1/(this.nPieces * this.nPrevent));
		}
	}
}
