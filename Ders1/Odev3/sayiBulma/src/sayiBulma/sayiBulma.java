package sayiBulma;

public class sayiBulma {

	public static void main(String[] args) {
		int[]sayilar=new int[] {1,2,5,7,9,0};
		int aranacak=10;
		boolean kontrol=false;
		for(int sayi:sayilar) {
			if(sayi==aranacak)
				kontrol=true;
		}
		if(kontrol)
			System.out.println("Sayý var");
		else
			System.out.println("Sayý yok");

	}

}
