package HitungNilaiAkhir;
import java.util.Scanner;
public class HitungNilaiAkhir {
	public static void main(String[] args) {
		Scanner scanterm = new Scanner(System.in);
		int Tugas,UTS,UAS;
		System.out.println("Masukkan nilai tugas");
		Tugas = scanterm.nextInt();
		System.out.println("Masukkan nilai UTS");
		UTS = scanterm.nextInt();
		System.out.println("Masukkan nilai UAS");
		UAS = scanterm.nextInt();
		int a = Tugas*30/100;
		int b = UTS*35/100;
		int c = UAS*35/100;
		int total = a+b+c;
		
		System.out.println("nilai tugas: " + a);
		System.out.println("nilai UTS: " + b);
		System.out.println("nilai UAS: " + c);
		System.out.println("nilai tugas akhir: " + total);
		
}
}