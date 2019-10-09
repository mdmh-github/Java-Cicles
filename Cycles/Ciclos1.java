import hsa.Console;

public class Ciclos1 {
	static Console c;

	public static void main(String[] args) {
		c = new Console();
		int contador = 1, total = 0;
		while (contador <= 100) {
			if (contador % 2 == 0) {
				total = total + contador;
			}
			contador++;
		}
		c.println ("La suma de los numeros pares del 1 al 100 es:"+total);
	}
}
