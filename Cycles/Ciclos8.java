import hsa.Console;
public class Ciclos8
{
    static Console c;
    public static void main (String args[])
    {
	c = new Console ();
	int contador = 200;
	while (contador >= 100)
	{
	    if (contador % 2 == 0)
	    {
		c.println (contador);
	    }
	    contador--;
	}
    }
}
