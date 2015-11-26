
public class Tile 
{
	private boolean filled;
	private boolean p1;
	private boolean p2;
	
	public Tile()
	{
		filled = false;
		p1 = false;
		p2 = false;
	}
	
	public void setFilled()
	{
		filled = true;
	}
	
	public boolean isFilled()
	{
		return filled;
	}
	
	public void setP1()
	{
		p1 = true;
	}
	
	public boolean isP1()
	{
		return p1;
	}
	
	public void setP2()
	{
		p2 = true;
	}
	
	public boolean isP2()
	{
		return p2;
	}
	
}
