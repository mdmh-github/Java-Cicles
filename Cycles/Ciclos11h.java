import hsa.Console;
public class Ciclos11h
{
    static Console c;
    public static void main (String args[])
    {
	c = new Console ();
	int contador = 200;
	do
	{
	    if (contador % 2 == 0)
	    {
		c.println (contador);
	    }
	    contador--;
	}
	while (contador >= 100);
    }
}
