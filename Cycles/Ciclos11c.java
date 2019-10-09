import hsa.Console;

public class Ciclos11c
{
    static Console c;

    public static void main (String args[])
    {
	c = new Console ();
	int contador = 10;
	do
	{
	    if (contador % 5 == 0)
	    {
		c.println (contador);
	    }
	    contador++;
	}
	while (contador <= 200);
    }
}
