import hsa.Console;
public class Ciclos13e
{
    static Console c;

    public static void main (String args[])
    {
	c = new Console ();
	int numero, menor;
	c.println ("Escribe 20 numeros (<)");
	c.print ("numero 1 : ");
	menor = c.readInt ();
      for (int contador = 0;contador < 19; contador++)
	{
	    c.print ("numero " + (contador + 1) + " : ");
	    numero = c.readInt ();
	    if (numero < menor)
	    {
		menor = numero;
	    }          
	}
	c.println ("El numero menor de todos es:" + menor);
    }
}
