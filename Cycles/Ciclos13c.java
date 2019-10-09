import hsa.Console;

public class Ciclos13c
{
    static Console c;

    public static void main (String args[])
    {
	c = new Console ();
	for (int contador = 10 ; contador <= 200 ; contador++)
	{
	    if (contador % 5 == 0)
	    {
		c.println (contador);
	    }
	}

    }
}
