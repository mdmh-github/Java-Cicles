import hsa.Console;
public class Ciclos4
{
    static Console c;
    public static void main (String args[])
    {
	c = new Console ();
	int contador = 0, numero, mayor;
	c.println ("Escribe 20 numeros (>)");
	c.print ("numero 1 : ");
	mayor = c.readInt ();
	while (contador < 19)
	{
	    c.print ("numero " + (contador + 1) + " : ");
	    numero = c.readInt ();
	    if (numero > mayor)
	    {
		mayor = numero;
	    }
	    contador++;
	}
	c.println ("El numero mayor de todos es:" + mayor);
    }
}
