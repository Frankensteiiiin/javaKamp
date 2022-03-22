package kodlama.io;

public class kodlama {

	public static void main(String[] args) {
		Kurslarim kurs1=new Kurslarim("yazýlým Geliþtirici Yetiþtime Kampý(JavaScript)",0);//özellik nesnesi

		Kurslarim kurs2=new Kurslarim("yazýlým Geliþtirici Yetiþtime Kampý(Java+react)",15);//özellik nesnesi
		System.out.println(kurs1.kursAd);
		System.out.println(kurs2.kursAd);
		DersGecis ders=new DersGecis();
		ders.onceki();
		ders.sonraki();
	}

}
