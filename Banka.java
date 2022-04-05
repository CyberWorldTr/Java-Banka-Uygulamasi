import java.util.Scanner;

public class ATM {
	

	
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int pin = 3131;
    int deneme = -2;
	String kullanici;
	System.out.println("****At Bank'a Hosgeldiniz****");
	System.out.println("Kullanici Adi giriniz");
	kullanici = sc.nextLine();
	System.out.println("4 Haneli Pin Kodu Giriniz: ");
	int gir = sc.nextInt();
	deneme++;
    while (deneme != pin && deneme < 0) {
	System.out.println("Yanlis Pin Kodu Kalan Deneme " + deneme);
	deneme++;
	System.out.println("4 Haneli Pin Kodu Giriniz: ");
	gir = sc.nextInt();
    } 
	if (gir == pin){

		System.out.println("****Giris Basarili Hosgeldin " + kullanici);
          atm();
	} else if (deneme >= 0){
		System.out.println("Girisiniz Engellenmistir Musteri Hizmetleri Ile Gorusunuz...");
	}
	}
	
	public static void atm(){
	
	int balance = 1000;
	int address;
	int kredi;
	String msg;
	String msg1;
	String msg2;
	Scanner sc = new Scanner(System.in);
	 System.out.println("Para Cekmek Icin: 1 ");
	 System.out.println("Para Yatirmak Icin: 2 ");
	 System.out.println("Bakiye Sorgu Icin: 3 ");
	 System.out.println("Para Gondermek Icin: 4 ");
	 System.out.println("Kredi Basvurusu Yap: 5 ");
	 System.out.println("Kredi Kredi Basvuru Durumu: 6 "); 
	 System.out.println("Musteri Hizmetleri: 0 ");
	 System.out.println("Cikis Yap: 9 ");

	 
	 System.out.print("Yapmak Istediginiz Islemi Giriniz: ");
     String checker = sc.nextLine();
	switch (checker){
		case "1": {
			System.out.println("Lutfen Miktar Giriniz:");
			balance -= sc.nextInt();
			System.out.println("Kalan Miktar " + balance + " TRY");
			break;
		}
		case "2": {
			System.out.println("Lutfen Miktar Giriniz:");
			balance += sc.nextInt();
			System.out.println("Yeni Bakiyeniz " + balance + " TRY");
			break;
		}
		case "3": {
			System.out.println("Para Miktar覺n覺z " + balance + " TRY");
			break;
		}
		case "4": {
			System.out.println("Gonderilecek Kisi: ");
			address = sc.nextInt();
			System.out.println("Gonderilecek Miktari Giriniz: ");
			balance -= sc.nextInt();
			System.out.println("Kalan Miktar: " + balance + " Gonderilen Kisi: " + address);
			System.out.println("Isleminiz Basari Ile Gerceklesti..");
			break;
		}
		case "5": {
			System.out.print("Basvuru Yapmak Istediginiz Kredi Miktarini Giriniz: ");
			kredi = sc.nextInt();
			System.out.print(kredi +  " TL Kredi Basvurunuz Alinmistir...");
			break;
		}
		case "6": {
			kredi = 9999;
			System.out.print( kredi + " TL Degerindeki Krediniz Onaylanmistir..");
			break;
		}
		case "9": {
			System.out.print("Basarili Bir Sekilde C覺k覺s Yaptiniz..");
			break;
		}
		case "0": {
			System.out.print("Musteri Temsilcisine Baglaniyor....");
			System.out.print("Merhaba ben Ali Nasil Yardimci Olabilirim?: ");
			msg = sc.nextLine();
			System.out.print("Lutfen Bakiyenizi Kontrol Ediniz...");
			System.out.print("Farkli Bir Islem: ");
			msg1 = sc.nextLine();
			System.out.print("Kredi Almaya Uygun Degilsiniz... ");
			break;
		}
		default: {
            System.out.println("Yanlis Islem Sectiniz. Tekrar giriniz.");
        }
	}
	System.out.println("At Bank'i Kullandiginiz Icin Tesekkur Eder Saglikli Gunler Dileriz..");
	sc.close();
}
}