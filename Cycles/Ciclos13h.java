import hsa.Console;
public class Ciclos13h
{
    static Console c;
    public static void main (String args[])
    {
	c = new Console ();

	for (int contador = 200 ; contador >= 100 ; contador--)
	{
	    if (contador % 2 == 0)
	    {
		c.println (contador);
	    }

	}
    }
}
