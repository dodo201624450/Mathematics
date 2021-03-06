package Calculus;
import java.util.Scanner;

public class Gamma implements Calculus{
	static double logGamma(double x) {
		double tmp = (x - 0.5) * Math.log(x + 4.5) - (x + 4.5);
		double ser = 1.0 + 76.18009173    / (x + 0)   - 86.50532033    / (x + 1)
                       + 24.01409822    / (x + 2)   -  1.231739516   / (x + 3)
                       +  0.00120858003 / (x + 4)   -  0.00000536382 / (x + 5);
		return tmp + Math.log(ser * Math.sqrt(2 * Math.PI));
	}
	static double gamma(double x) { return Math.exp(logGamma(x)); }

	public void error() {
		System.err.println("Please provide only numbers (no text). Restart the program and try again!");
	}
	
	public void calculus() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce a number: ");
		double x = sc.nextDouble();
		System.out.println("Gamma(" + x + ") = " + gamma(x));
		System.out.println("log Gamma(" + x + ") = " + logGamma(x));
		sc.close();
	}
}