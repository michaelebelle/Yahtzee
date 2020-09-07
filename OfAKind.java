public class OfAKind extends Score 
{
	protected int numSameFace;
	protected int numOfPoints;

	public OfAKind(String aName, int numOfSameFaces)
	{
		super.name = aName; 
		numSameFace = numOfSameFaces;







	}

	public int getDiceScore(DieInterface[] dice)
	{
		

	int numone = 0;
	int numtwo = 0;
	int numthree = 0;
	int numfour = 0;
	int numfive = 0;
	int numsix = 0;
	for (int i = 0; i < dice.length; i++)
	{
		if (dice[i].getFaceValue() == 1)
		{
			numone++;

			if (numSameFace == 5 && numone == numSameFace)
			{
				numOfPoints = 50;
			}
			else if (numone == numSameFace && numSameFace != 5)
			{
				 numOfPoints = numone * dice[i].getFaceValue();
			}

		}

		if (dice[i].getFaceValue() == 2)
		{
			numtwo++;

			if (numSameFace == 5 && numtwo == numSameFace)
			{
				numOfPoints = 50;
			}
			else if (numtwo == numSameFace && numSameFace != 5)
			{
				 numOfPoints = numtwo * dice[i].getFaceValue();
			}
		}

		if (dice[i].getFaceValue() == 3)
		{
			numthree++;
			if (numSameFace == 5 && numthree == numSameFace)
			{
				numOfPoints = 50;
			}
			else if (numthree == numSameFace && numSameFace != 5)
			{
				 numOfPoints = numthree * dice[i].getFaceValue();
			}
		}

		if (dice[i].getFaceValue() == 4)
		{
			numfour++;
			if (numSameFace == 5 && numfour == numSameFace)
			{
				numOfPoints = 50;
			}
			else if (numfour == numSameFace && numSameFace != 5)
			{
				 numOfPoints = numfour * dice[i].getFaceValue();
			}
		}

		if (dice[i].getFaceValue() == 5)
		{
			numfive++;
			if (numSameFace == 5 && numfive == numSameFace)
			{
				numOfPoints = 50;
			}
			else if (numfive == numSameFace && numSameFace != 5)
			{
				 numOfPoints = numfive * dice[i].getFaceValue();
			}
		}

		if (dice[i].getFaceValue() == 6)
		{
			numsix++;

			if (numSameFace == 5 && numsix == numSameFace)
			{
				numOfPoints = 50;
			}

			else if (numsix == numSameFace && numSameFace != 5)
			{
				 numOfPoints = numsix * dice[i].getFaceValue();
			}
		}

	}

	return numOfPoints;


	}



}