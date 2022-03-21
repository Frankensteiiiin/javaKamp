package sesliHarfler;

public class sesliHarfler {

	public static void main(String[] args) {
		char harf='A';
		char []kalin= {'a','A','ý','I','o','O','u','U'};
		char []ince= {'e','E','i','Ý','ö','Ö','ü','ü'};
		int kontrol=0;
		for(char a:kalin) {
			if(a==harf) {
				kontrol=1;
				System.out.println("harfimiz kalýn harftir");
			}
		}
		if(kontrol!=1) {
			for(char a:ince) {
				if(a==harf) {
					kontrol=2;
					System.out.println("harfimiz ince harftir");
				}
			}
		}
		if(kontrol==0) {
			System.out.println("geçersiz bir deðer girilmiþtir");
		}

	}

}
