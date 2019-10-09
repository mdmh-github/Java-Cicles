import hsa.Console;

public class Ciclos13a
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int total = 0;
	for (int contador = 1 ; contador <= 100 ; contador++)
	{
	    if (contador % 2 == 0)
	    {
		total = total + contador;
	    }
	}
	c.println ("La suma de los numeros pares del 1 al 100 es:" + total);
    }
}
