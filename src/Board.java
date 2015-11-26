
public class Board 
{
	private Tile[][] board = new Tile[6][7];
	private boolean done = false;
	private int count = 0;
	
	public Board()
	{
		board = new Tile[6][7];
		
		for (int i = 0; i < board.length; i++)
		{
			for (int j = 0; j < board[i].length; j++)
			{
				board[i][j] = new Tile();
			}
		}
			
	}
	
	public void checkWin()
	{
		for(int r = 0; r < board.length; r++)
		{
			for(int c = 0; c < 4; c++)
			{
				if(board[r][c].isP1() && board[r][c+1].isP1()
						&& board[r][c+2].isP1() &&  board[r][c+3].isP1())
				{
					done = true;
					System.out.println("Player 1 has won");
					
				}
				else
				{
					if(board[r][c].isP2() && board[r][c+1].isP2()
							&& board[r][c+2].isP2() &&  board[r][c+3].isP2())
					{
						done = true;
						System.out.println("Player 2 has won");
					}
				}
			}
		}
			
		for (int c = 0; c < board[0].length; c++)
		{
			for (int r = 0; r < 3; r++)
			{
				if(board[r][c].isP1() && board[r+1][c].isP1() && board[r+2][c].isP1() 
						&& board[r+3][c].isP1() )
				{
					done = true;
					System.out.println("Player 1 has won");
				}
				else
				{
					if(board[r][c].isP2() && board[r+1][c].isP2() && board[r+2][c].isP2() 
							&& board[r+3][c].isP2() )
					{
						done = true;
						System.out.println("Player 2 has won");
					}
				}
			}
		}
		
		
	    for (int row = 5; row > 0; row--) {
	        for (int col = 0; col < 6; col++) {

	            if (board[row][col].isP1()) {
	                if (!(((row - 1) < 0) || ((col + 1) > 6))) {
	                    if (board[row-1][col+1].isP1()) {
	                        if (!(((row - 2) < 0) || ((col + 2) > 6))) {
	                            if (board[row-2][col+2].isP1()) {
	                                if (!(((row - 3) < 0) || ((col + 3) > 6))) {
	                                    if (board[row-3][col+3].isP1()) 
	                                    {
	                                    	done = true;
	                    					System.out.println("Player 1 has won");
	                                    }
	                                }
	                            }
	                        }
	                    }
	                }
	            }
	            
	            if (board[row][col].isP1()) {
	                if (!(((row - 1) < 0) || ((col - 1) < 0))) {
	                    if (board[row-1][col-1].isP1()) {
	                        if (!(((row - 2) < 0) || ((col - 2)) < 0)) {
	                            if (board[row-2][col-2].isP1()) {
	                                if (!(((row - 3) < 0) || ((col - 3) < 0))) {
	                                    if (board[row-3][col-3].isP1())
	                                    {
	                                    	done = true;
	                    					System.out.println("Player 1 has won");
	                                    }
	                                }
	                            }
	                        }
	                    }
	                }
	            }
	            
	            if (board[row][col].isP2()) {
	                if (!(((row - 1) < 0) || ((col + 1) > 6))) {
	                    if (board[row-1][col+1].isP2()) {
	                        if (!(((row - 2) < 0) || ((col + 2) > 6))) {
	                            if (board[row-2][col+2].isP2()) {
	                                if (!(((row - 3) < 0) || ((col + 3) > 6))) {
	                                    if (board[row-3][col+3].isP2()) 
	                                    {
	                                    	done = true;
	                						System.out.println("Player 2 has won");
	                                    }
	                                }
	                            }
	                        }
	                    }
	                }
	            }
	            
	            if (board[row][col].isP2()) {
	                if (!(((row - 1) < 0) || ((col - 1) < 0))) {
	                    if (board[row-1][col-1].isP2()) {
	                        if (!(((row - 2) < 0) || ((col - 2)) < 0)) {
	                            if (board[row-2][col-2].isP2()) {
	                                if (!(((row - 3) < 0) || ((col - 3) < 0))) {
	                                    if (board[row-3][col-3].isP2()) 
	                                    {
	                                    	done = true;
	                						System.out.println("Player 2 has won");
	                                    }
	                                }
	                            }
	                        }
	                    }
	                }
	            }
	        }
	      }
		if(count == 42)
		{
			done = true;
			System.out.println("It's a draw!");
		}
	}
	
	public void setMove(int col, Player a)
	{
		int num = 5;
		
		while(board[num][col].isFilled())
		{
			num--;
		}
		
		board[num][col].setFilled();
		
		if (a.getPlayerNum() == 1)
		{
			board[num][col].setP1();
			System.out.println("Player 1 placed a checker in column " + col + " and row " + num);
		}
		else
		{
			board[num][col].setP2();
			System.out.println("Player 2 placed a checker in column " + col + " and row " + num);
		}
		
		count++;
		this.checkWin();
		System.out.println(this.toString());
	}
	
	public boolean isDone()
	{
		return done;
	}
	
	public String toString()
	{
		String str = "";
		for(int r = 0; r < board.length; r++)
		{
			str+="\n";
			
			for(int c = 0; c<board[r].length; c++)
			{
				if(!board[r][c].isFilled())
				{
					str+="*";
				}
				else
				{
					if(board[r][c].isP1())
					{
						str+="x";
					}
					else
					{
						str+="o";
					}
					
				}
				str+=" ";
			}
		}
		return str;
	}
}
