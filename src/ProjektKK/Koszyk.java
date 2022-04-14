package ProjektKK;

import java.util.Scanner;

public class Koszyk implements DodawanieDanych{

	private Sprzet sprzet;
	private String imie;
	private String nazwisko;
	private String miejscowosc;
	private String kod;
	
	public Koszyk(Sprzet sprzet, String imie, String nazwisko, String miejscowosc, String kod) {
		this.sprzet=sprzet;
		this.imie=imie;
		this.nazwisko=nazwisko;
		this.miejscowosc=miejscowosc;
		this.kod=kod;
		}
	
	public Koszyk() {
		DodajDane();
	}

	@Override
	public void DodajDane() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Sprzêt nowy pojazd [1.Aparat 2.Drukarka 3.Gra 4.Komputer 5.Konsola 6.Laptop 7.Telefon 8.Telewizor]");
		int a;
		do {
		System.out.println("Podaj liczbe odpowiadajac¹ sprzêtowi");
		a=sc.nextInt();
		}while(a!=1 && a!=2 && a!=3 && a!=4 && a!=5 && a!=6 && a!=7 && a!=8);
		if(a==1)
			this.sprzet=new Aparaty();
		if(a==2)
			this.sprzet=new Drukarki();
		if(a==3)
			this.sprzet=new Gry();
		if(a==4)
			this.sprzet=new Komputery();
		if(a==5)
			this.sprzet=new Konsole();
		if(a==6)
			this.sprzet=new Laptopy();
		if(a==7)
			this.sprzet=new Telefony();
		if(a==8)
			this.sprzet=new Telewizory();
		System.out.println("Podaj imiê");
		this.imie=sc.nextLine();
		System.out.println("Podaj nazwisko");
		this.nazwisko=sc.nextLine();
		System.out.println("Podaj miejsce zamieszkania");
		this.miejscowosc=sc.nextLine();
		System.out.println("Podaj kod i miejscowoœæ poczty");
		this.kod=sc.nextLine();
	}

	public Sprzet getSprzet() {
		return sprzet;
	}

	public void setSprzet(Sprzet sprzet) {
		this.sprzet = sprzet;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getMiejscowosc() {
		return miejscowosc;
	}

	public void setMiejscowosc(String miejscowosc) {
		this.miejscowosc = miejscowosc;
	}

	public String getKod() {
		return kod;
	}

	public void setKod(String kod) {
		this.kod = kod;
	};
	
	@Override
	public String toString() {
		return "Zakup: " + sprzet + " Imiê kupuj¹cego - " +  imie + " Nazwisko kupuj¹cego - " + nazwisko + " Miejsce zamieszkania - " + miejscowosc + " Poczta - " + kod + "\r";
	}
	
}
