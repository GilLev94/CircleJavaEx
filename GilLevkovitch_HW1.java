import java.util.Random;
import javax.swing.*;
//import java swing library
public class GilLevkovitch_HW1 {
	//Gil Levkovich ID:312496821

	public static void main(String[] args) {
		String FirstPlayerName= JOptionPane.showInputDialog(null,"Enter name of player 1:");//input of the first player name	
		String SecondPlayerName= JOptionPane.showInputDialog(null,"Enter name of player 2:");//input of the second player name
		
		int Max, Min;
		do
		{
			// input of 2 numbers for the game.
			Min = Integer.parseInt(JOptionPane.showInputDialog("Enter Range[MIN]:"));
			Max = Integer.parseInt(JOptionPane.showInputDialog("Enter Range[MAX]:"));
			if(Min>=Max)
			{
				JOptionPane.showMessageDialog(null, "MAX Must be greater then MIN try Again!", "Wrong Range", JOptionPane.ERROR_MESSAGE);
			}
		} while(Min >= Max);
		//while the input is wrong (min bigger then max) the loop will return all over until it gets right input. 
		
		int GameTargetNum = (int) ((Math.random()*(Max-Min+1))+Min);//getting random number by the function math
		
		String str = "The Random number In A Range Between " + Min + " And " + Max + " Generated Successfully!"; 
		JOptionPane.showMessageDialog(null, str);
		
		String CurrentPlayer = SecondPlayerName;
		Integer RoundCounter = 0;
		//counting the rounds of the game
		int GuessedNumber;
		//the number that the players have to guess
		String Hint = "]";
		//hint for the player
		do
		{
			CurrentPlayer = (CurrentPlayer == FirstPlayerName) ? SecondPlayerName : FirstPlayerName;
			String title =  CurrentPlayer + " Turn!";
			String msg = "Enter Number [Between "+ Min + " And " + Max + Hint;
			// Switch Players

			GuessedNumber = Integer.parseInt(JOptionPane.showInputDialog(null, msg, title, JOptionPane.QUESTION_MESSAGE));
			// increase the round counter
			RoundCounter++;
			// Give Hints to the users according to their input number

			if (GuessedNumber > GameTargetNum )
				Hint = "\nThe number is Less then " + GuessedNumber + "]";
			else
				Hint = "\nThe number is Greater then " + GuessedNumber;
			
		} while(GuessedNumber != GameTargetNum);
		//one of the players guessed the number
		String msg = "Player " + CurrentPlayer + " Wins!";
		msg += "\nNumber of Tries: " + (RoundCounter / 2 + RoundCounter % 2);
		JOptionPane.showMessageDialog(null, msg, "Game Over!!", JOptionPane.INFORMATION_MESSAGE);
	}
}
	
				

				
		




			
		
	

		
	


