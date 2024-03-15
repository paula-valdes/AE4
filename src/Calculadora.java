import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num1;
		
		int num2;
		
		System.out.println("Introduce el primer número");
		
		num1 = entrada.nextInt();
		
		System.out.println("Introduce el segundo número");
		
		num2 = entrada.nextInt();
		
		entrada.close();
		
		
		int suma = num1 + num2;
		
		int resta = num1 - num2;
		
		int multiplicacion = num1 * num2;
	
		int division = num1 / num2;
		

		System.out.println(num1 + " + " + num2 + " = " + suma);
		
		System.out.println(num1 + " - " + num2 + " = " + resta);
		
		System.out.println(num1 + " * " + num2 + " = " + multiplicacion);
		
		System.out.println(num1 + " / " + num2 + " = " + division);

	}

}
