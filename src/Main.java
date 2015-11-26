
public class Main 
{

	public static void main(String[] args) 
	{
		Player p1 = new Player(1);
		Player p2 = new Player(2);
		Board board = new Board();
		
		while(!board.isDone())
		{
			p1.move(board);
			if(!board.isDone())
			{
				p2.move(board);
			}
			
		}
	}

}
