package com.tictactoe.controller;

import java.util.Scanner;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tictactoe.imp.GameBoard;

@RestController
public class GameBoardController {
	
	@RequestMapping("/tictactoe")
    public void gameBoard() 
    {
		
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
	
	
