public class Chance extends Score
{
	int score = 0;
	protected String name;

	public Chance(String aName)
	{
		super.name = aName;
	}

	public int getDiceScore(DieInterface[] dice)
	{
		for (int i = 0; i < dice.length; i++)
		{
			score += dice[i].getFaceValue();
		}

		return score;
	}
}