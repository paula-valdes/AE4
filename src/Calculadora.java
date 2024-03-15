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
		int suma = num1 + num2;
		
		// resta
		int resta = num1 - num2;
		
		// multiplicacion
		int multiplicacion = num1 * num2;
		
		// division
		int division = num1 / num2;
		
		// visualizacion de resultados
		System.out.println(num1 + " + " + num2 + " = " + suma);
		
		System.out.println(num1 + " - " + num2 + " = " + resta);
		
		System.out.println(num1 + " * " + num2 + " = " + multiplicacion);
		
		System.out.println(num1 + " / " + num2 + " = " + division);

	}

}
