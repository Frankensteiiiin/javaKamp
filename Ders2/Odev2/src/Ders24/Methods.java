package Ders24;

public class Methods {

	public static void main(String[] args) {

	}
	public static void sayiBulma() {
		int[]sayilar=new int[] {1,2,5,7,9,0};
		int aranacak=10;
		boolean kontrol=false;
		for(int sayi:sayilar) {
			if(sayi==aranacak)
				kontrol=true;
		}
		if(kontrol)
			mesajVer("Say� var");
		else
			mesajVer("Say� yok");
	}
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
	
}
