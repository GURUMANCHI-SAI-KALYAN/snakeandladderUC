
public class snakeandladder {
	
	public static void main(String[] args) {
	int position = 0;
	int LADDER_GAME = 0;
        int SNAKE_GAME = 1;
        int NOCHANCE_GAME = 2;

	int DIE_NUMBER = (int) Math.floor(Math.random() * 10) % 5 + 1;
	while(position != 100) {
	 int option_player = (int) Math.floor(Math.random() * 10) % 3;

	if (option_player == LADDER_GAME) 
		position += DIE_NUMBER;
	 	if (position > 100)
			position -= DIE_NUMBER;

	else if (option_player == SNAKE_GAME) 
		  position -= DIE_NUMBER;

			 if (position < 0) 
				position = 0;

	else if (option_player == NOCHANCE_GAME)
		position = position;
	System.out.println("player position:" + position);
	}
    }
}
