import hsa.Console;
public class Ciclos15
{
    static Console c;
    public static void main (String args[])
    {
	c = new Console ();
	int salario1 = 300, salario2 = 0;
	for (int i = 1 ; i < 31 ; i++)
	{
	    salario2 = salario2 + i;
	}
	if (salario1 > salario2)
	{
	    c.println ("El primer trabajo es mejor pagado");
	}
	else
	{
	    c.println ("El segundo trabajo es mejor pagado");
	}
    }
}
