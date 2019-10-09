import hsa.Console;
public class Ciclos11d
{
    static Console c;
    public static void main (String args[])
    {
	c = new Console ();
	int contador = 0, numero, mayor;
	c.println ("Escribe 20 numeros (>)");
	c.print ("numero 1 : ");
	mayor = c.readInt ();
       do
	{
	    c.print ("numero " + (contador + 1) + " : ");
	    numero = c.readInt ();
	    if (numero > mayor)
	    {
		mayor = numero;
	    }
	    contador++;
	}
	 while (contador < 19);
	c.println ("El numero mayor de todos es:" + mayor);
    }
}
