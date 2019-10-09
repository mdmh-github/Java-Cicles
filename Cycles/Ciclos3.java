import hsa.Console;

public class Ciclos3
{
    static Console c;

    public static void main (String args[])
    {
	c = new Console ();
	int contador = 10;
	while (contador <= 200)
	{
	    if (contador % 5 == 0)
	    {
		c.println (contador);
	    }
	    contador++;
	}

    }
}
