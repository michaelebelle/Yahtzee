public abstract class Score implements ScoreInterface
{
protected String name;
protected int score;
protected boolean isUsed = false;
protected int points;


	public String getName()
	{
		return name;
	}
	public abstract int getDiceScore(DieInterface[] dice);
	
	public int getScore()
	{
		if (isUsed == false)
		{
			score = 0;
		}

		if (isUsed)
		{
			score = points;
		}
		
	return score;
	
	}

	public void setScore(DieInterface[] dice)
	{

	isUsed = true;
	points = getDiceScore(dice);



	}

	public boolean isUsed()
	{

		return isUsed;

	}
	public void reset()
	{
		score = 0;

	}
	public String toString()
	{
    String scoreString = String.format("%3d", score);
    return name + ": " + scoreString;
	}
}