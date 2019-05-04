/*
 * precious idehen
 * 
 * 
 * program : This program finds the roots of a quadratic equation.
*/
import java.util.Scanner;

public class QuadraticRoots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		System.out.println("Quadratic equation \tax^2+bx+c=0");
		System.out.println();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value of a: ");
		a = input.nextInt();
		System.out.print("Enter the value of b: ");
		b = input.nextInt();
		System.out.print("Enter the value of c: ");
		c = input.nextInt();
		if(b<0 && c<0) {
			System.out.printf("Equation = %dx^2 %dx %d", a, b, c);
		}else if(c<0) {
			System.out.printf("Equation = %dx^2 + %dx %d", a, b, c);
		}else if(b<0) {
			System.out.printf("Equation = %dx^2 %dx + %d", a, b, c);
		}else {
			System.out.printf("Equation = %dx^2 + %dx + %d", a, b, c);
		}
	
		System.out.println();
		System.out.println("\nQr = b^2 - 4ac");
		int x;
		x = (int) (Math.pow(b, 2) - 4*a*c);
		System.out.printf("Qr = %d", x);
		System.out.print("\n\nRoots of the equqtion are: ");
		if(x<0) {
			System.out.println("Imaginary/complex");
		}else if(x==0) {
			System.out.println("Real and equal");
		}else {
			System.out.println("Real and distinct");
		}
		
	
	}

	

}
