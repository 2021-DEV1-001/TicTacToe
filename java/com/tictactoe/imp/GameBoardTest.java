package com.tictactoe.imp;

import java.util.Scanner;

public class GameBoardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GameBoard gameboard=new GameBoard();
		Scanner s = new Scanner(System.in);
	       int x=0,y=0;
	       do
	       {
	           System.out.println(gameboard.player==gameboard.A?"Player A turn":"Player B turn");
	           System.out.println("Enter board Positions :");
	           x=s.nextInt();
	           y=s.nextInt();
	           gameboard.positionTaken(x, y);
	           System.out.println(gameboard.toString());
	           System.out.println("____________________________");
	           gameboard.displayWinner();
	             
	       }while(gameboard.isEmpty);
	   }
	

	}


