//
import hsa.Console;
public class Ciclos12
{
    static Console c;
    public static void main (String args[])
    {
	c = new Console ();
	int carrera, semestre, contador = 1, alumnos = 0;
	c.println ("1.-Civil");
	c.println ("2.-Industrial");
	c.println ("3.-Biologia");
	c.println ("4.-Informatica");
	c.println ("5.-Mecanica");
	c.println ("6.-Electronica");
	c.println ("7.-Sistemas");
	do
	{
	    c.print ("alumno# " + contador + " : ");
	    c.print ("carrera: ");
	    carrera = c.readInt ();
	    c.print ("semestre: ");
	    semestre = c.readInt ();
	    if (carrera == 7 && semestre == 4)
	    {
		alumnos++;
	    }
	    contador++;
	}
	while (contador < 11);
	c.print ("Los alumnos de Sistemas en 4 semestres son :" + alumnos);
    }
}


