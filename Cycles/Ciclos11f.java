import hsa.Console;
public class Ciclos11f
{
    static Console c;
    public static void main (String args[])
    {
	c = new Console ();
	int contador = 100;
	c.println ("Cuenta Regresiva");        
	do
	{
	    c.println (contador);            
	    contador--;
	} 
	while (contador >= 0);
    }
}
