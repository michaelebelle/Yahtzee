public interface DieInterface
{
	public static String[] dieFaces =
		{"+---+\n|   |\n| o |\n|   |\n+---+",
		 "+---+\n|o  |\n|   |\n|  o|\n+---+",
		 "+---+\n|o  |\n| o |\n|  o|\n+---+",
		 "+---+\n|o o|\n|   |\n|o o|\n+---+",
		 "+---+\n|o o|\n| o |\n|o o|\n+---+",
		 "+---+\n|o o|\n|o o|\n|o o|\n+---+"};

	public static String toDieString(DieInterface aDie)
	{
		return dieFaces[aDie.getFaceValue() - 1];
	}

	// Do not modify above this line

	public static String toDiceString(DieInterface[] dice)
	{ 
		StringBuilder result = new StringBuilder();

		String [][] allDie = new String[dice.length][];
		for (int i = 0; i < dice.length; i++)
		{

			String a = DieInterface.toDieString(dice[i]);
			allDie[i] = a.split("\n");

		}

		for (int i = 0; i < allDie.length; i++)
		{
			for (int j = 0; j < allDie[i].length; j++)
			{
				result.append(allDie[j][i] + " ");

			}

			result.append("\n");
		}

		result.append("  ");
		result.append("1");

		for (int i = 1; i < allDie.length; i++)
		{
			result.append("     ");
			result.append(i+1);
		}
		result.append("\n");

		return result.toString();
	}

	// Do not modify below this line
    public int roll();
	public int getFaceValue();
}