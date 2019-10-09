import hsa.Console;
public class Ciclos11g
{
    static Console c;
    public static void main (String args[])
    {
	c = new Console ();
	int contador = 0;
	double edadTotal = 0, pesoTotal = 0, edad = 0, peso = 0;
	c.println ("Escriba la edad y el peso de los 22 miembros del equipo de Futbol");
	do
	{
	    c.println ("Jugador# " + (contador + 1));
	    c.print ("Edad: ");
	    edad = c.readDouble ();
	    c.print ("Peso en Kg:");
	    peso = c.readDouble ();
	    edadTotal = edadTotal + edad;
	    pesoTotal = pesoTotal + peso;
	    contador++;
	}
	while (contador < 22);
	edadTotal = edadTotal / 22;
	pesoTotal = pesoTotal / 22;
	c.println ("La edad promedio de los Jugadores es :" + edadTotal);
	c.println ("y el peso promedio de los Jugadores es :" + pesoTotal);
    }
}
