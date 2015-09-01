import java.util.Random;


public class Reloj {

	public static void main(String[] args) {
		
		long inicio = System.nanoTime();
		
		for (int i = 0; i < 1000; i++) {
			for (int j = 0; j < 1000; j++) {
				new Random().nextDouble();
			}
		}
		
		long fin = System.nanoTime();
		
		double dif = (double) (fin - inicio) * 1.0e-9;
		
		System.out.println("El programa dura " + dif + " s");
		
	}
	
}
