package ProjektKK;

import java.util.Scanner;

public class Telewizory extends Sprzet implements DodawanieDanych{
	
	private int pEkranu;
	private String rozdzielczosc;
	private int cena;

	public Telewizory(String marka, int rocznik, int pEkranu, String rozdzielczosc, int cena) {
		super(marka, rocznik);
		this.pEkranu=pEkranu;
		this.rozdzielczosc=rozdzielczosc;
		this.cena=cena;
	}
	
	public Telewizory() {
		super();
	}

	@Override
	public void DodajDane() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		super.DodajDane();
		System.out.println("Podaj przek¹tn¹ ekranu");
		this.pEkranu=sc.nextInt();
		System.out.println("Podaj rozdzielczosc ekranu");
		this.rozdzielczosc=sc.nextLine();
		System.out.println("Podaj cenê");
		this.cena=sc.nextInt();
	};

	public int getpEkranu() {
		return pEkranu;
	}

	public void setpEkranu(int pEkranu) {
		this.pEkranu = pEkranu;
	}

	public String getRozdzielczosc() {
		return rozdzielczosc;
	}

	public void setRozdzielczosc(String rozdzielczosc) {
		this.rozdzielczosc = rozdzielczosc;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	@Override
	public String toString() {
		return "Telewizor: " + super.toString() + " Przek¹tna ekranu - " + pEkranu + " Rozdzielczoœæ - " + rozdzielczosc + " Cena - " + cena;
	}
	
	
}
