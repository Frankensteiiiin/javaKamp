package kodlama.io;

public class kodlama {

	public static void main(String[] args) {
		Kurslarim kurs1=new Kurslarim("yaz�l�m Geli�tirici Yeti�time Kamp�(JavaScript)",0);//�zellik nesnesi

		Kurslarim kurs2=new Kurslarim("yaz�l�m Geli�tirici Yeti�time Kamp�(Java+react)",15);//�zellik nesnesi
		System.out.println(kurs1.kursAd);
		System.out.println(kurs2.kursAd);
		DersGecis ders=new DersGecis();
		ders.onceki();
		ders.sonraki();
	}

}
