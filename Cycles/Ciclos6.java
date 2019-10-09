import hsa.Console;
public class Ciclos6
{
    static Console c;
    public static void main (String args[])
    {
	c = new Console ();
	int contador = 100;
	c.println ("Cuenta Regresiva");        
	while (contador >= 0)
	{
	    c.println (contador);            
	    contador--;
	}        
    }
}
