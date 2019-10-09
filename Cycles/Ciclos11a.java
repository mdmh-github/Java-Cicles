import hsa.Console;

public class Ciclos11a
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int contador = 1, total = 0;
	do
	{
	    if (contador % 2 == 0)
	    {
		total = total + contador;
	    }
	    contador++;
	}
	while (contador <= 100);
	c.println ("La suma de los numeros pares del 1 al 100 es:" + total);
    }
}
