import hsa.Console;

public class Ciclos20
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	double peso, personas, totalpeso = 0, totalpersonas = 0;
	int contador = 0;
	do
	{
	    c.println ("Peso en el elevador :");
	    peso = c.readDouble ();
	    if (peso != 0)
	    {
		c.println ("Numero de personas en el elevador");
		personas = c.readDouble ();
		totalpeso = totalpeso + peso;
		totalpersonas = totalpersonas + personas;
		contador++;
	    }
	}
	while (peso != 0);
	c.println ("El total viajes de de " + contador);
	c.println ("El total de personas transportadas es de " + totalpersonas);
	c.println ("El total peso trasportado es de " + totalpeso);
	totalpersonas = totalpersonas / contador;
	totalpeso = totalpeso / contador;
	c.println ("el promedio de personas por viaje es de :" + totalpersonas);
	c.println ("el promedio de peso por viaje es de :" + totalpeso);
    }
}


