package Ders30;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int sayi1 = 6;
		int sayi2 = 3;
		mesaj("toplama sonucu", dortIslem.Topla(sayi1, sayi2));
		mesaj("çýkarma sonucu", dortIslem.Cikar(sayi1, sayi2));
		mesaj("bölme sonucu", dortIslem.Bol(sayi1, sayi2));
		mesaj("çarpma sonucu", dortIslem.Carp(sayi1, sayi2));
	}

	public static void mesaj(String mesaj, int sonuc) {
		System.out.println(mesaj + " " + sonuc);

	}

}
