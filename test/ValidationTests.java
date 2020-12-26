package com.tictactoe.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Test;

import com.tictactoe.imp.GameBoard;

public class ValidationTests {

	GameBoard gameboard=new GameBoard();	

	/*Positive test case:Validation of game board size for given input*/
	@Test
	public void ValidationBoardCounttestPositive() {
		
		assertEquals(9, gameboard.validateBoardCountTest(3));	

	}
	
	/*Negative test case:Validation of game board size for given input*/
	@Test
	public void ValidationBoardCounttest() {		
	assertNotEquals(16, gameboard.validateBoardCountTest(3));
	}
	
	/*Checking of Horizontal won probabilities*/
	@Test
	public void ValidateHorizontalMoveSuccess(){		
	assertEquals(false,gameboard.ishorizontalWon(1));
	
	}
	/*Checking of Vertical won probabilities*/	
	@Test
	public void ValidateVerticalMoveSuccess(){		
	assertEquals(false,gameboard.isVerticalWon(1));	
	}
}

