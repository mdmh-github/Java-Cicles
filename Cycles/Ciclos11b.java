import hsa.Console;

public class Ciclos11b
{
    static Console c;

    public static void main (String args[])
    {
	c = new Console ();
	int contador = 11;
       do
	{
	    if (contador % 2 == 1)
	    {
		c.println (contador);
	    }
	    contador++;
	}
	 while (contador <= 150);
    }
}
