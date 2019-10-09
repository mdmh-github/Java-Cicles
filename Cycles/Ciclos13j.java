import hsa.Console;
public class Ciclos13j
{
    static Console c;
    public static void main (String args[])
    {
	c = new Console ();
	int contador = 0, aprobados = 0, reprobados = 0, calificacion, promedio = 0;
	for (int continuar = 0 ; continuar > -1 ; contador++)
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
	    c.println ("desea agregar otro alumno?");
	    c.println ("(si:teclee un numero positivo)");
	    c.println ("(no:teclee un numero negativo)");
	    continuar = c.readInt ();
	}
	promedio = promedio / contador;
	c.println ("El promedio general del grupo es :" + promedio);
	c.println (aprobados + " aprobados");
	c.println (reprobados + " reprobados");
    }
}
