import hsa.Console;

public class Ciclos21
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	String nombre;
	double edad, peso, estatura, tiposangre, sexo, contador = 0, continuar;
	double hombres = 0, mujeres = 0, edadpromediohombres = 0, hombrestipoa = 0, pesopromediomujeres = 0, estaturageneral = 0;
	do
	{
	    c.println ("Nombre:");
	    nombre = c.readString ();
	    c.println ("Edad:");
	    edad = c.readDouble ();
	    c.println ("Estatura:");
	    estatura = c.readDouble ();
	    c.println ("Peso:");
	    peso = c.readDouble ();
	    c.println ("sexo (1 hombre/2 mujer):");
	    sexo = c.readDouble ();
	    c.println ("tipo de sangre:");
	    c.println ("1:a");
	    c.println ("2:b");
	    c.println ("3:ab");
	    c.println ("4:o");
	    tiposangre = c.readDouble ();
	    if (sexo == 1)
	    {
		hombres++;
		edadpromediohombres = edadpromediohombres + edad;
		if (tiposangre == 1)
		{
		    hombrestipoa++;
		}
	    }
	    else
	    {
		mujeres++;
		pesopromediomujeres = pesopromediomujeres + peso;
	    }
	    estaturageneral = estaturageneral + estatura;
	    contador++;
	    c.println ("Desea dar de alta otro paciente? (1=si/2=no)");
	    continuar = c.readDouble ();
	}
	while (continuar == 1);
	edadpromediohombres = edadpromediohombres / hombres;
	pesopromediomujeres = pesopromediomujeres / mujeres;
	estaturageneral = estaturageneral / contador;
	c.println ("El numero de hombres es " + hombres);
	c.println ("El numero de mujeres es " + mujeres);
	c.println ("La edad promedio de los hombres es" + edadpromediohombres);
	c.println ("El peso promedio de las mujeres es" + pesopromediomujeres);
	c.println ("La cantidad de hombres con sangre tipo A es" + hombrestipoa);
	c.println ("La Estatura promedio es" + estaturageneral);
    }
}





