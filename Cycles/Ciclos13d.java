import hsa.Console;
public class Ciclos13d
{
    static Console c;
    public static void main (String args[])
    {
	c = new Console ();
	int numero, mayor;
	c.println ("Escribe 20 numeros (>)");
	c.print ("numero 1 : ");
	mayor = c.readInt ();
	for (int contador = 0 ; contador < 19 ; contador++)
	{
	    c.print ("numero " + (contador + 1) + " : ");
	    numero = c.readInt ();
	    if (numero > mayor)
	    {
		mayor = numero;
	    }
	}
	c.println ("El numero mayor de todos es:" + mayor);
    }
}
