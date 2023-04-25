import java.util.Scanner;

public class DaireAlani {

	public static void main(String[] args) {
		
		int r;
		double 𝛼;
		double pi = 3.14;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Dairenin yarıçapını giriniz :");
		
		r = inp.nextInt();
		
		System.out.print("Açı ölçüsünü giriniz :");
		𝛼 = inp.nextDouble();
		
		double alan = (pi * (r*r) * 𝛼) / 360;
		System.out.println("Dairenin Alanı :" + alan);
		
		//Dairenin alan ve çevresini hesaplayan program
		//double alan = pi * r * r;
		//double cevre = 2 * pi * r;
		
		//System.out.println("Dairenin Alanı :" + alan);
		//System.out.println("Dairenin Çevresi :" + cevre);
	}

}
