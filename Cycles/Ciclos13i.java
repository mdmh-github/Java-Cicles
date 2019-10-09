import hsa.Console;
public class Ciclos13i
{
    static Console c;
    public static void main (String args[])
    {
	c = new Console ();
       int aprobados = 0, reprobados = 0, calificacion, promedio = 0;
	for ( int contador = 0;contador < 15;contador++)
	{
	    c.print ("escribe la calificacion final del alumno #" + (contador + 1) + " : ");
	    calificacion = c.readInt ();
	    promedio = promedio + calificacion;
	    if (calificacion >= 70)
	    {
		aprobados++;
	    }
	    else
	    {
		reprobados++;
	    }
	    
	}
	promedio = promedio / 15;
	c.println ("El promedio general del grupo es :" + promedio);
	c.println (aprobados + " aprobados");
	c.println (reprobados + " reprobados");
    }
}
