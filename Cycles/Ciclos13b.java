import hsa.Console;

public class Ciclos13b
{
    static Console c;

    public static void main (String args[])
    {
	c = new Console ();
	for (int contador = 11 ; contador <= 150 ; contador++)
	{
	    if (contador % 2 == 1)
	    {
		c.println (contador);
	    }
	}
    }
}
