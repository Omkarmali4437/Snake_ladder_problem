public class snake {
	public static final int no_play=0, ladder=1, snake=2;

	public int dice_roll()
	{
		int dice ,position=0 , dieroll=0;
		while(position >=0 && position <100)
		{
			dice=(int)Math.floor((Math.random() * 6) + 1);

			dieroll++;
			position+=dice;
			int die_roll=(int)Math.floor(Math.random() * 10 ) % 3;
			switch (die_roll){
				case no_play:
					position=position;
					break;
				case ladder:
					position+=dice;
					break;
				case snake:
					position-=dice;
					break;
			}
			if(position>100)
			{
				position-=position;
			}
		}
		return dieroll;
	}
	public static void main(String[] args)
	{
      System.out.println("Welcome to snake ladder problem");
		snake fp=new snake();
		int first=fp.dice_roll();
		System.out.println("Total number of times the dice rolled by first player for a win is: "+first);

		snake sp=new snake();
		int second=sp.dice_roll();
		System.out.println("Total number of times the dice is rolled by second player for a win is: "+second);
		if(first<second)
		{
			System.out.println("First player is the winner");
		}
		else if(second<first)
		{
			System.out.println("Second player is the winner");
		}
		else if(first==second)
		{
			System.out.println("It is a tie");
		}
	}
}

