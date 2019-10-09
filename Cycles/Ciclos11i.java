import hsa.Console;
public class Ciclos11i
{
    static Console c;
    public static void main (String args[])
    {
	c = new Console ();
	int contador = 0, aprobados = 0, reprobados = 0, calificacion, promedio = 0;
	do
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
	    contador++;
	}
	while (contador < 15);
	promedio = promedio / 15;
	c.println ("El promedio general del grupo es :" + promedio);
	c.println (aprobados + " aprobados");
	c.println (reprobados + " reprobados");
    }
}
