package ProjektKK;

import java.util.Scanner;

public abstract class Sprzet implements DodawanieDanych{

	private String marka;
	private int rocznik;
	
	public Sprzet(String marka, int rocznik) {
		this.marka=marka;
		this.rocznik=rocznik;
	};
	
	public Sprzet() {
		DodajDane();
	}
	
	@Override
	public void DodajDane() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Podaj marke");
		this.marka=sc.nextLine();
		System.out.println("Podaj rok produkcji");
		this.rocznik=sc.nextInt();
	}
	
	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public int getRocznik() {
		return rocznik;
	}

	public void setRocznik(int rocznik) {
		this.rocznik = rocznik;
	}

	@Override
	public String toString() {
		return "Parametry: " + marka + " Rok produkcji - " + rocznik;
	}
	
}
