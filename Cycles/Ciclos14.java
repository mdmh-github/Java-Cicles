import hsa.Console;
public class Ciclos14
{
    static Console c;
    public static void main (String args[])
    {
	c = new Console ();

	for (int i = 0 ; i < 21 ; i++)
	{
	    c.println (Math.pow (2, i));
	}
    }
}
