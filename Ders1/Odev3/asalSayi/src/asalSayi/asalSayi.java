package asalSayi;

public class asalSayi {

	public static void main(String[] args) {
		int number=10;
		int number1=number/2;
		int a=0;
		for(int i=2;i<=number1;i++) {
			if(number%i==0) {
				System.out.println("sayı asal değil");
				a=1;
				break;
			}
				
		}
		if(a==0&&number>=2) {
			System.out.println("sayı asal sayıdır");
		}
	}

}
