import java.util.Scanner;

/**
 * aplicación para realizar las 4 operaciones básicas matemáticas 
 * (suma, resta, multiplicación y división)
 * a partir de dos números enteros positivos que introduzca el usuario
 * 
 * @author paula
 * 
 */

public class Calculadora {

	public static void main(String[] args) {
		
		// introducir numeros
		
		Scanner entrada = new Scanner(System.in);
		
		int num1;
		
		int num2;
		
		System.out.println("Introduce el primer número");
		
		num1 = entrada.nextInt();
		
		System.out.println("Introduce el segundo número");
		
		num2 = entrada.nextInt();
		
		entrada.close();
		
		// suma
		int suma = suma(num1, num2);
		
		// resta
		int resta = resta(num1, num2);
		
		// multiplicacion
		int multiplicacion = multiplica(num1, num2);
		
		// division
		int division = divide(num1, num2);
		
		// visualizacion de resultados
		visualiza(num1, num2, suma, resta, multiplicacion, division);

	}

	private static int suma(int num1, int num2) {
		int suma = num1 + num2;
		return suma;
	}

	private static int resta(int num1, int num2) {
		int resta = num1 - num2;
		return resta;
	}

	private static int multiplica(int num1, int num2) {
		int multiplicacion = num1 * num2;
		return multiplicacion;
	}

	private static int divide(int num1, int num2) {
		int division = num1 / num2;
		return division;
	}

	private static void visualiza(int num1, int num2, int suma, int resta, int multiplicacion, int division) {
		System.out.println(num1 + " + " + num2 + " = " + suma);
		
		System.out.println(num1 + " - " + num2 + " = " + resta);
		
		System.out.println(num1 + " * " + num2 + " = " + multiplicacion);
		
		System.out.println(num1 + " / " + num2 + " = " + division);
	}

}
