package Ders26;

public class methods3 {

	public static void main(String[] args) {
		System.out.println(topla(8,3,5,7,10,13,15,1));
		}
	public static void ekle() {
		System.out.println("Eklendi");
	}
	public static int topla(int...sayilar ) {
		int topla=0;
		for(int sayi:sayilar) {
			topla+=sayi;
		}
		return topla;
	}
	
}
