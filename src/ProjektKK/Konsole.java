package ProjektKK;

import java.util.Scanner;

public class Konsole extends Sprzet implements DodawanieDanych{

	private String wersja;
	private int pDysku;
	private int cena;

	public Konsole(String marka, int rocznik, String wersja, int pDysku, int cena) {
		super(marka, rocznik);
		this.wersja=wersja;
		this.pDysku=pDysku;
		this.cena=cena;
	}
	
	public Konsole(){
		super();
	}

	@Override
	public void DodajDane() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		super.DodajDane();
		System.out.println("Podaj wersjê konsoli");
		this.wersja=sc.nextLine();
		System.out.println("Podaj pojemnoœæ dysku");
		this.pDysku=sc.nextInt();
		System.out.println("Podaj cenê");
		this.cena=sc.nextInt();
	};
	
	public String getWersja() {
		return wersja;
	}

	public void setWersja(String wersja) {
		this.wersja = wersja;
	}

	public int getpDysku() {
		return pDysku;
	}

	public void setpDysku(int pDysku) {
		this.pDysku = pDysku;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	@Override
	public String toString() {
		return "Konsola: " + super.toString() + " Wersja - " + wersja + " Pojemnoœæ dysku - " + pDysku +  " Cena - " + cena;
	}
	
}
