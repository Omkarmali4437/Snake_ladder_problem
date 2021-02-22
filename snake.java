public class linecomparison {
	public static final int no_play=0, ladder=1, snake=2;
	public static void main(String[] args){
		System.out.println("Welcome to snake ladder problem");

		//Variables
		int first_player , position=0;
		while(position >=0 && position <100)
		{
			first_player=(int)Math.floor((Math.random() * 6) + 1);
			position+=first_player;
			int die_roll=(int)Math.floor(Math.random() * 10 ) % 3;
			switch (die_roll){
				case no_play:
					position=position;
					break;
				case ladder:
					position+=first_player;
					break;
				case snake:
					position-=first_player;
					break;
			}
			System.out.println(position);
			if(position>100)
			{
				position-=position;
			}
			else
			{
				System.out.println(position);
			}
		}
		System.out.println("Winning position is reached by the user: "+position);
		System.out.println("The player is won: "+position);

	}
}

