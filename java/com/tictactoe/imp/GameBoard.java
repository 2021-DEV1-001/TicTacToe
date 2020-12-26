package com.tictactoe.imp;

public class GameBoard {
public static final int A=1,B=-1;
public static final int empty=0;
public int player= A;
public boolean isEmpty=false;
private int[][] board= new int[3][3];

	/*Validation of game board size*/
	
	public int validateBoardCountTest(int n) {

		int boardsize=n*n;

		return boardsize;

	}
	
	public String toString()
	{
		StringBuilder s = new StringBuilder();
		isEmpty = false;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				switch(board[i][j])
				{
				case A: 
					s.append(" X ");
					break;
				case B: 
					s.append(" O ");
					break;
				case empty: 
					s.append("   ");
					isEmpty=true;
					break;
				}
				if(j<2)
				{
					s.append("|");
				}
				
			}
			if(i<2)
			{
				s.append("\n-----------\n");
			}
		}
		return s.toString();
	}
  
	public void positionTaken(int x, int y) {
		// TODO Auto-generated method stub
		
		if(x<0 || x>2 || y<0 || y>2)
		{
			System.out.println("Invalid board position");
			return;
		}
		if(board[x][y] != empty)
		{
			System.out.println("Board position occupied");
			return;
		}
		board[x][y] = player;
		player = -player;
		
	}
	public void displayWinner() {
		// TODO Auto-generated method stub
		
		if(ishorizontalWon(A)||isVerticalWon(A)||isDiagonalWon(A))
		{
			System.out.println("\n player A won the game!!!!");
			isEmpty=false;
		}
		else if(ishorizontalWon(B)||isVerticalWon(B)||isDiagonalWon(B))
		{
			System.out.println("\n player B won the game!!!!");
			isEmpty=false;
		}
		else
		{
			if(!isEmpty)
			{
				System.out.println("its a tie");
			}
			
		}
		
	}
	
	
	/*Validation of Horizontal move success*/
	public boolean ishorizontalWon(int player){
		
		boolean iswon = false;

	       if (((board[0][0] + board[0][1] + board[0][2]) == (player * 3)) || 
	            ((board[1][0] + board[1][1] + board[1][2]) == (player * 3)) ||  
	            ((board[2][0] + board[2][1] + board[2][2]) == (player * 3)) ) 
	       {
	    	   iswon = true;   
	       }
	       else {
	    	   iswon = false;
	       }
	       return iswon;
	}
  
	/*Validation of Vertical move success*/
	public boolean isVerticalWon(int player){
		
		boolean iswon = false;

	       if (((board[0][0] + board[1][0]  + board[2][0]) == (player * 3)) ||
		            ((board[0][1] + board[1][1] + board[2][1]) == (player * 3)) ||
		            ((board[0][2] + board[1][2] + board[2][2]) == (player * 3)))
	       {
	    	   iswon = true;   
	       }
	       else {
	    	   iswon = false;
	       }
	       return iswon;
	}
 /*Validation of Diagonal move success*/
	public boolean isDiagonalWon(int player){
		  
		  boolean iswon = false;

	      if (((board[0][0] + board[1][1] + board[2][2] == player*3)) ||
					((board[2][0] + board[1][1] + board[0][2] == player*3)))
		           
	      {
	   	   iswon = true;   
	      }
	      else {
	   	   iswon = false;
	      }
	      return iswon;
	  
	  }
}
