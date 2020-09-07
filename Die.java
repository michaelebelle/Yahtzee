
import java.util.Random;
public class Die
{
	private int value;

	public Die()
	{
		value = 0;
	}
	public Die(int val)
	{
			value = val;

	}

	public void setValue(int val)
	{
		value = val;
	}

	public int roll()
	{
		Random rand = new Random();

		int val = rand.nextInt(6) + 1;

		return val;
	}


}