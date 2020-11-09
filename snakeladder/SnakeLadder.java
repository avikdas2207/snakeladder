package snakeladder;

import java.util.Random;

public class SnakeLadder {
	
	public static void main(String[] args) {
		
		
		Random random = new Random();
		int Player1 = 0, Player2 = 0;		
		int option;
		int diceValue, Player1winning = 0, Player2winning = 0;
		
		while(true)
		{
			while(true)
			{
			
				diceValue = random.nextInt(6)+1;
				option = random.nextInt(3);
				Player1winning++;
		
				if(option == 0)
					break;
				else if(option == 1)
				{
					Player1+=diceValue;
					
					if(Player1 > 100)
						Player1-=diceValue;
				}
				else if(option == 2)
				{
					Player1-=diceValue;
					if(Player1 < 0)
						Player1=0;
					break;
				}		
			}
			while(true)
			{
			
				diceValue = random.nextInt(6)+1;
				option = random.nextInt(3);
				Player2winning++;
		
				if(option == 0) 
					break;
				else if(option == 1) 
				{
					Player2+=diceValue;
					
					if(Player2 > 100)
						Player2-=diceValue;
				}
				else if(option == 2)
				{
					Player2-=diceValue;
					if(Player2 < 0)
						Player2=0;
					break;
				}
			}
			System.out.println("Player1 Position : "+Player1+ "\tPlayer2 Position : "+Player2);

			if(Player2 == 100 || Player1 == 100)
				break;
			
		}
		
		if(Player1 == 100)
		{
			System.out.println("\nPlayer1 Win");
		}
		else if(Player2 == 100)
			System.out.println("\nPlayer2 Win");
		
		System.out.println("\nChance of player1 : "+Player1winning+"\nChance of player2 : "+Player2winning);
}


}
