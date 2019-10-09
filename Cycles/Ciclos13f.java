import hsa.Console;
public class Ciclos13f
{
    static Console c;
    public static void main (String args[])
    {
	c = new Console ();
	c.println ("Cuenta Regresiva");
	for (int contador = 100 ; contador >= 0 ; contador--)
	{
	    c.println (contador);
	}
    }
}
