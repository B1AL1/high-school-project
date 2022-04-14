package ProjektKK;

import java.util.Scanner;

public class Drukarki extends Sprzet implements DodawanieDanych{

	private String typ;
	private String rozdzielczosc;
	private int cena;

	public Drukarki(String marka, int rocznik, String typ, String rozdzielczosc, int cena) {
		super(marka, rocznik);
		this.typ=typ;
		this.rozdzielczosc=rozdzielczosc;
		this.cena=cena;
	}
	
	public Drukarki(){
		super();
	}

	@Override
	public void DodajDane() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		super.DodajDane();
		System.out.println("Podaj typ drukarki");
		this.typ=sc.nextLine();
		System.out.println("Podaj rodzielczoœæ ekranu");
		this.rozdzielczosc=sc.nextLine();
		System.out.println("Podaj cenê");
		this.cena=sc.nextInt();
	};
	
	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
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
		return "Drukarka: " + super.toString() + " Typ - " +  typ + " Rodzielczoœæ - " + rozdzielczosc + " Cena - " + cena;
	}
	
}
