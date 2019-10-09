import hsa.Console;
public class Ciclos13g
{
    static Console c;
    public static void main (String args[])
    {
	c = new Console ();

	double edadTotal = 0, pesoTotal = 0, edad = 0, peso = 0;
	c.println ("Escriba la edad y el peso de los 22 miembros del equipo de Futbol");
	for (int contador = 0 ; contador < 22 ; contador++)
	{
	    c.println ("Jugador# " + (contador + 1));
	    c.print ("Edad: ");
	    edad = c.readDouble ();
	    c.print ("Peso en Kg:");
	    peso = c.readDouble ();
	    edadTotal = edadTotal + edad;
	    pesoTotal = pesoTotal + peso;
	}
	edadTotal = edadTotal / 22;
	pesoTotal = pesoTotal / 22;
	c.println ("La edad promedio de los Jugadores es :" + edadTotal);
	c.println ("y el peso promedio de los Jugadores es :" + pesoTotal);
    }
}
