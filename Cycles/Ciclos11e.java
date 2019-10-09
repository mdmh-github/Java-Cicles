import hsa.Console;
public class Ciclos11e
{
    static Console c;

    public static void main (String args[])
    {
	c = new Console ();
	int contador = 0, numero, menor;
	c.println ("Escribe 20 numeros (<)");
	c.print ("numero 1 : ");
	menor = c.readInt ();
	do
	{
	    c.print ("numero " + (contador + 1) + " : ");
	    numero = c.readInt ();
	    if (numero < menor)
	    {
		menor = numero;
	    }
	    contador++;
	}
	while (contador < 19);
	c.println ("El numero menor de todos es:" + menor);
    }
}
