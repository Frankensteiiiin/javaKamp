package arkadasSayi;

public class arkadasSayi {

	public static void main(String[] args) {
		int sayi=220;
		int sayi1=284;
		int sayac=0;
		int sayac1=0;
		for(int a=1;a<sayi;a++) {
			if(sayi%a==0) {
				sayac=sayac+a;
			}
		}
		for(int a=1;a<sayi1;a++) {
			if(sayi1%a==0) {
				sayac1=sayac1+a;
			}
		}
		if(sayac==sayi1&&sayac1==sayi)
			System.out.println("Sayılar arkadaş sayıdır");
		else
			System.out.println("Sayılar arkadaş sayı değildir");
	}



}
