package donguler;

public class donguler {

	public static void main(String[] args) {
		//video 8
		System.out.println("***************************");
		System.out.println("video 8");
		int sayi=8;
		if(sayi<20&sayi!=8) {
			System.out.println("say� 20'den k���kt�r");
		}
		else if(sayi==20) {
			System.out.println("say� 20'ye e�ittir");
		}
		else {
			System.out.println("say� 20'den b�y�kt�r veya 8'e e�ittir");
		}
		System.out.println("***************************");
		//video 9
		System.out.println("***************************");
		System.out.println("video 9");
		int sayi1=20;
		int sayi2=25;
		int sayi3=2;
		if(sayi1<sayi2) {
			if(sayi2<sayi3)
				System.out.println("en b�y�k say� "+sayi3);
			else
				System.out.println("en b�y�k say� "+sayi2);
		}
		else
			if(sayi1<sayi3)
				System.out.println("en b�y�k say� "+sayi3);
			else
				System.out.println("en b�y�k say� "+sayi1);
		System.out.println("***************************");
		//video 10
		System.out.println("***************************");
		System.out.println("video 10");
		char not='A';
		switch(not) {
		case 'A':
			System.out.println(not+" ile ge�tiniz");
			break;
		case 'B':
			System.out.println(not+" ile ge�tiniz");
			break;
		case 'C':
			System.out.println(not+" ile ge�tiniz");
			break;
		case 'D':
			System.out.println(not+" ile ge�tiniz");
			break;
		case 'F':
			System.out.println(not+" ile kald�n�z");
			break;
		default:
				break;
				
				
		}
		System.out.println("***************************");
		//video 11
		System.out.println("***************************");
		System.out.println("video 11");
		for(int i=0;i<10;i=i+2) {
			System.out.println(i);
		}
		System.out.println("***************************");
		//video 12
		System.out.println("***************************");
		System.out.println("video 12");
		int i=0;
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("***************************");
		//video 13
		System.out.println("***************************");
		System.out.println("video 13");
		int j=0;
		do {
			System.out.println(j);
			j+=2;
		}
		
		while(j<10) ;
		
	}

}
