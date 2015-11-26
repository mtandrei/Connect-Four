import java.util.Scanner;

public class Player 
{
	Scanner scan = new Scanner(System.in);
	private int playerNum;
	
	public Player(int num)
	{
		playerNum = num;
	}
	
	public void move(Board board)
	{
		int move = -1;
		while (move < 0 || move > 6)
		{
			System.out.println("Enter the column in which a checker will be placed (0 through 6)");
			move = scan.nextInt();
			if (move < 0 || move > 6)
			{
				System.out.println("Error; invalid column");
			}
			else
			{
				board.setMove(move, this);
			}
		}
	}
	
	public int getPlayerNum()
	{
		return playerNum;
	}
	
	
}
