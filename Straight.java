public class Straight extends Score
{
	protected String name;
	protected int consecFaces;
	public Straight(String aName, int numConsecutiveFaces)
	{
		super.name = aName;
		consecFaces = numConsecutiveFaces;
	}

	public int getDiceScore(DieInterface[] dice)
	{
	DieInterface temp;
	for (int i = 1; i < dice.length; i++) 
	{
    	for (int j = i; j > 0; j--) 
    		{
     			if (dice[j].getFaceValue() < dice[j - 1].getFaceValue()) 
     			{
      				temp = dice[j];
      				dice[j] = dice[j - 1];
      				dice[j - 1] = temp;
     			}
   	 		}
   }


 if (dice[0].getFaceValue() == 1 && dice[1].getFaceValue() == 2 && dice[2].getFaceValue() == 3 && dice[3].getFaceValue() == 4 && consecFaces == 4)
 	{
 		score = 30; 
 	}
if (dice[0].getFaceValue() == 2 && dice[1].getFaceValue() == 3 && dice[2].getFaceValue() == 4 && dice[3].getFaceValue() == 5 && consecFaces == 4)
	{
		score = 30;
	}
if(dice[0].getFaceValue() == 3 && dice[1].getFaceValue() == 4 && dice[2].getFaceValue() == 5 && dice[3].getFaceValue() == 6 && consecFaces == 4)
	{
		score = 30;  
	}
if (dice[0].getFaceValue() == 1 && dice[1].getFaceValue() == 1 && dice[2].getFaceValue() == 2 && dice[3].getFaceValue() == 3 && dice[4].getFaceValue() == 4 && consecFaces == 4)
	{
		score = 30;
	}
if (dice[0].getFaceValue() == 1 && dice[1].getFaceValue() == 2 && dice[2].getFaceValue() == 2 && dice[3].getFaceValue() == 3 && dice[4].getFaceValue() == 4 && consecFaces == 4)
	{
	score = 30;
	}
if (dice[0].getFaceValue() == 1 && dice[1].getFaceValue() == 2 && dice[2].getFaceValue() == 3 && dice[3].getFaceValue() == 3 && dice[4].getFaceValue() == 4 && consecFaces == 4)
	{
	score = 30;
	}
if (dice[0].getFaceValue() == 1 && dice[1].getFaceValue() == 2 && dice[2].getFaceValue() == 3 && dice[3].getFaceValue() == 4 && dice[4].getFaceValue() == 4 && consecFaces == 4)
	{
	score = 30;
	}
if (dice[0].getFaceValue() == 2 && dice[1].getFaceValue() == 2 && dice[2].getFaceValue() == 3 && dice[3].getFaceValue() == 4 && dice[4].getFaceValue() == 5 && consecFaces == 4)
	{
	score = 30;
	}
if (dice[0].getFaceValue() == 2 && dice[1].getFaceValue() == 3 && dice[2].getFaceValue() == 3 && dice[3].getFaceValue() == 4 && dice[4].getFaceValue() == 5 && consecFaces == 4)
	{
	score = 30;
	}
if (dice[0].getFaceValue() == 2 && dice[1].getFaceValue() == 3 && dice[2].getFaceValue() == 4 && dice[3].getFaceValue() == 4 && dice[4].getFaceValue() == 5 && consecFaces == 4)
	{
	score = 30;
	}
if (dice[0].getFaceValue() == 2 && dice[1].getFaceValue() == 3 && dice[2].getFaceValue() == 4 && dice[3].getFaceValue() == 5 && dice[4].getFaceValue() == 5 && consecFaces == 4)
	{
	score = 30;
	}
if (dice[0].getFaceValue() == 2 && dice[1].getFaceValue() == 3 && dice[2].getFaceValue() == 4 && dice[3].getFaceValue() == 5 && dice[4].getFaceValue() == 5 && consecFaces == 4)
	{
	score = 30;
	}
if (dice[0].getFaceValue() == 3 && dice[1].getFaceValue() == 3 && dice[2].getFaceValue() == 4 && dice[3].getFaceValue() == 5 && dice[4].getFaceValue() == 6 && consecFaces == 4)
	{
	score = 30;
	}
if (dice[0].getFaceValue() == 3 && dice[1].getFaceValue() == 4 && dice[2].getFaceValue() == 4 && dice[3].getFaceValue() == 5 && dice[4].getFaceValue() == 6 && consecFaces == 4)
	{
	score = 30;
	}
if (dice[0].getFaceValue() == 3 && dice[1].getFaceValue() == 4 && dice[2].getFaceValue() == 5 && dice[3].getFaceValue() == 5 && dice[4].getFaceValue() == 6 && consecFaces == 4)
	{
	score = 30;
	}
if (dice[0].getFaceValue() == 3 && dice[1].getFaceValue() == 4 && dice[2].getFaceValue() == 5 && dice[3].getFaceValue() == 6 && dice[4].getFaceValue() == 6 && consecFaces == 4)
	{
	score = 30;
	}
if (dice[0].getFaceValue() == 1 && dice[1].getFaceValue() == 2 && dice[2].getFaceValue() == 3 && dice[3].getFaceValue() == 4 && dice[4].getFaceValue() == 5 && consecFaces == 5)
  	 {
  		score = 40;
 	 }

return score;

}
















} 