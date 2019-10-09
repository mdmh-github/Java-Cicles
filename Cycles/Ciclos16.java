import hsa.Console;
public class Ciclos16
{
    static Console c;
    public static void main (String args[])
    {
	c = new Console ();
	double tarifa = 120;
	c.println ("mes 1 : 120");
	for (int i = 2 ; i < 13 ; i++)
	{
	    tarifa = tarifa + (tarifa * 0.02);
	    c.println ("mes " + i + " : " + tarifa);
	}
    }
}
