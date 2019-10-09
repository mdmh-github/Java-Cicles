import hsa.Console;

public class Ciclos22
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int respuesta, futbol = 0, beisbol = 0, tenis = 0, basquetbol = 0, error = 0;
	for (int i = 0 ; i < 20 ; i++)
	{
	    c.println ("Deporte del alumno # " + (i + 1));
	    respuesta = c.readInt ();
	    switch (respuesta)
	    {
		case 1:
		    futbol++;
		    break;
		case 2:
		    beisbol++;
		    break;
		case 3:
		    tenis++;
		    break;
		case 4:
		    basquetbol++;
		    break;
		default:
		    error++;
		    break;
	    }
	}
	c.println ("futbol: " + futbol + " alumnos, beisbol :" + beisbol + " alumnos,tenis :" + tenis + " alumnos, basquetbol :" + basquetbol + " alumnos");
	if (error != 0)
	{
	    c.println ("Error en respuesta " + error + " alumnos");
	}
    }
}





