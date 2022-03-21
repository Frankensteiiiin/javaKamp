package mukemmelSayi;

public class mukemmelSayi {

	public static void main(String[] args) {
		int sayi=28;
		int sayac=0;
		for(int a=1;a<sayi;a++) {
			if(sayi%a==0) {
				sayac=sayac+a;
			}
		}
		if(sayac==sayi)
			System.out.println("Sayý mükemmel sayýdýr");
		else
			System.out.println("Sayý mükemmel sayý deðildir");
	}

}
