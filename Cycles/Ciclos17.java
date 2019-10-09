import hsa.Console;
public class Ciclos17
{
    static Console c;
    public static void main (String args[])
    {
	c = new Console ();
	double estudiantes = 2100;
	for (int i = 0 ; i < 7 ; i++)
	{
	    estudiantes = estudiantes + (estudiantes * 0.12);
	}
	c.println ("Los estudiantes para el 2015 seran: " + ((int) estudiantes));
    }
}
