import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		String userName,password,sifreDegisimi,yeniSifre;
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Kullanici adinizi giriniz: ");
		userName = inp.nextLine();
		System.out.print("Sifrenizi giriniz: ");
		password = inp.nextLine();
		
		if(userName.equals("kader") && password.equals("java123")) {
			System.out.println("Basariyla giris yaptiniz");
		}
		else if(userName.equals("kader") && !password.equals("java123")) {
			System.out.println("Sifrenizi yanlis girdiniz, yeni sifre olusturmak ister misiniz?\nEvet\nHayir ");
			System.out.println("Cevabiniz: ");
			sifreDegisimi = inp.nextLine();
			if(sifreDegisimi.equals("Evet")) {
				System.out.println("Yeni sifre: ");
				yeniSifre = inp.nextLine();
				if(yeniSifre.equals("java123")) {
					System.out.println("Sifre olusturulamadi, lutfen başka sifre giriniz.");
				}
				else {
				System.out.println("Sifre olusturuldu");
			}
		}   
				
		else{
			System.out.println("Bilgilerinizi yanlis girdiniz,");
		}

	}

}
	
}
