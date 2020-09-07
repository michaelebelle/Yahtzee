public class FullHouse extends Score 
{
	int score = 0;
	public FullHouse(String aName)
	{
		super.name = aName;

	}
	public int getDiceScore(DieInterface[] dice)
	{
	
	
		if (dice[0].getFaceValue() == dice[1].getFaceValue() && dice[0].getFaceValue() == dice[2].getFaceValue() && dice[3].getFaceValue() == dice[4].getFaceValue())
		{
			score = 25;
		}

		if (dice[0].getFaceValue() == dice[1].getFaceValue() && dice[0].getFaceValue() == dice[3].getFaceValue() && dice[2].getFaceValue() == dice[4].getFaceValue())
		{
			score = 25;
		}

		if (dice[0].getFaceValue() == dice[1].getFaceValue() && dice[0].getFaceValue() == dice[4].getFaceValue() && dice[2].getFaceValue() == dice[3].getFaceValue())
		{
			score = 25;
		}

		if (dice[0].getFaceValue() == dice[1].getFaceValue() && dice[0].getFaceValue() == dice[4].getFaceValue() && dice[2].getFaceValue() == dice[3].getFaceValue())
		{
			score = 25;
		}

		if (dice[0].getFaceValue() == dice[2].getFaceValue() && dice[0].getFaceValue() == dice[3].getFaceValue() && dice[1].getFaceValue() == dice[4].getFaceValue())
		{
			score = 25;
		}

		if (dice[0].getFaceValue() == dice[2].getFaceValue() && dice[0].getFaceValue() == dice[4].getFaceValue() && dice[1].getFaceValue() == dice[3].getFaceValue())
		{
			score = 25;
		}

		if (dice[0].getFaceValue() == dice[3].getFaceValue() && dice[0].getFaceValue() == dice[4].getFaceValue() && dice[1].getFaceValue() == dice[2].getFaceValue())
		{
			score = 25;
		}

		if (dice[1].getFaceValue() == dice[2].getFaceValue() && dice[1].getFaceValue() == dice[3].getFaceValue() && dice[0].getFaceValue() == dice[3].getFaceValue())
		{
			score = 25;
		}

		if (dice[1].getFaceValue() == dice[3].getFaceValue() && dice[1].getFaceValue() == dice[4].getFaceValue() && dice[2].getFaceValue() == dice[0].getFaceValue())
		{
			score = 25;
		}

		if (dice[2].getFaceValue() == dice[3].getFaceValue() && dice[2].getFaceValue() == dice[4].getFaceValue() && dice[0].getFaceValue() == dice[1].getFaceValue())
		{
			score = 25;
		}

	return score;





}

}