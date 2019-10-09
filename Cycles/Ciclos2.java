import hsa.Console;

public class Ciclos2
{
    static Console c;

    public static void main (String args[])
    {
	c = new Console ();
	int contador = 11;
	while (contador <= 150)
	{
	    if (contador % 2 == 1)
	    {
		c.println (contador);
	    }
	    contador++;
	}
    }
}
