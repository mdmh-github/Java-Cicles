import hsa.Console;

public class Ciclos19
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	double menoresDe25 = 0, capital = 0, hombre1825 = 0, mujer = 0, edad, sexo, residencia;
	int continuar, contador = 0;
	do
	{
	    c.println ("Edad:");
	    edad = c.readDouble ();
	    c.println ("sexo (1 hombre/2 mujer):");
	    sexo = c.readDouble ();
	    c.println ("Localidad (1 capital/2 provincia):");
	    residencia = c.readDouble ();
	    c.println ("desea agregar otro insidente?");
	    continuar = c.readInt ();
	    if (edad < 25)
	    {
		menoresDe25++;
	    }
	    if (sexo == 2)
	    {
		mujer++;
	    }
	    if (sexo == 1 && edad >= 18 && edad <= 25)
	    {
		hombre1825++;
	    }
	    if (residencia == 1)
	    {
		capital++;
	    }
	    contador++;
	}
	while (continuar == 1);
	menoresDe25 = menoresDe25 * 100 / contador;
	mujer = mujer * 100 / contador;
	hombre1825 = hombre1825 * 100 / contador;
	capital = capital * 100 / contador;
	c.println ("El porcentaje de menores de 25 anios de edad es de :" + menoresDe25);
	c.println ("El porcentaje de mujeres es de :" + mujer);
	c.println ("El porcentaje de hombres entre 18 y 25 anios de edad es de :" + hombre1825);
	c.println ("El porcentaje de conductores en la capital es de :" + capital);
    }
}


