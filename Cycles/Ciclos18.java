import hsa.Console;
public class Ciclos18
{
    static Console c;
    public static void main (String args[])
    {
	c = new Console ();
	double a, p1 = 0, p2 = 0, p3 = 0, pa, pt, c1, c2, c3;
	String nombre;
	c.println ("Cantidad de alumnos en grupo 1 : ");
	a = c.readInt ();
	for (int i = 0 ; i < a ; i++)
	{
	    c.println ("nombre  del alumno #" + (i + 1));
	    nombre = c.readString ();
	    c.println ("Calificacion1");
	    c1 = c.readInt ();
	    c.println ("Calificacion2");
	    c2 = c.readInt ();
	    c.println ("Calificacion3");
	    c3 = c.readInt ();
	    pa = ((c1 + c2 + c3) / 3);
	    c.println ("El promedio del alumno es :" + pa);
	    p1 = p1 + pa;
	}

	c.println ("El promedio del grupo es de :" + p1);
	c.println ("Cantidad de alumnos en grupo 2 : ");
	a = c.readInt ();
	for (int i = 0 ; i < a ; i++)
	{
	    c.println ("nombre  del alumno #" + (i + 1));
	    nombre = c.readString ();
	    c.println ("Calificacion1");
	    c1 = c.readInt ();
	    c.println ("Calificacion2");
	    c2 = c.readInt ();
	    c.println ("Calificacion3");
	    c3 = c.readInt ();
	    pa = ((c1 + c2 + c3) / 3);
	    c.println ("El promedio del alumno es :" + pa);
	    p2 = p2 + pa;
	}
	c.println ("El promedio del grupo es de :" + p2);
	c.println ("Cantidad de alumnos en grupo 3 : ");
	a = c.readInt ();
	for (int i = 0 ; i < a ; i++)
	{
	    c.println ("nombre  del alumno #" + (i + 1));
	    nombre = c.readString ();
	    c.println ("Calificacion1");
	    c1 = c.readInt ();
	    c.println ("Calificacion2");
	    c2 = c.readInt ();
	    c.println ("Calificacion3");
	    c3 = c.readInt ();
	    pa = ((c1 + c2 + c3) / 3);
	    c.println ("El promedio del alumno es :" + pa);
	    p3 = p3 + pa;
	}
	c.println ("El promedio del grupo es de :" + p3);
	pt = (p1 + p2 + p3) / 3;
	c.println ("El promedio Total es :" + pt);
    }
} 
