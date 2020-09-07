public class UpperSectionScore extends Score
{
	protected int points;
	protected int counter;
	protected int number;




public UpperSectionScore(String aName, int aNumber)
{
	super.name = aName;
	number = aNumber;

}
public int getDiceScore(DieInterface[] dice)
{
	int numOfPoints = 0;
	for (int i = 0; i < dice.length; i++)
	{
		if (dice[i].getFaceValue() == number)
		{
			counter++;
		}


	}
	
	numOfPoints = counter * number;

return numOfPoints;
}
}


 














