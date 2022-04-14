package ProjektKK;

import java.util.Scanner;

public class Gry extends Sprzet implements DodawanieDanych{

	private String rodzaj;
	private String platforma;
	private int cena;

	public Gry(String marka, int rocznik, String rodzaj, String platforma, int cena) {
		super(marka, rocznik);
		this.rodzaj=rodzaj;
		this.platforma=platforma;
		this.cena=cena;
	}
	
	public Gry(){
		super();
	}

	@Override
	public void DodajDane() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		super.DodajDane();
		System.out.println("Podaj rodzaj gry");
		this.rodzaj=sc.nextLine();
		System.out.println("Podaj platformê");
		this.platforma=sc.nextLine();
		System.out.println("Podaj cenê");
		this.cena=sc.nextInt();
	};
	
	public String getRodzaj() {
		return rodzaj;
	}

	public void setRodzaj(String rodzaj) {
		this.rodzaj = rodzaj;
	}

	public String getPlatforma() {
		return platforma;
	}

	public void setPlatforma(String platforma) {
		this.platforma = platforma;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	@Override
	public String toString() {
		return "Gra: " + super.toString() + " Rodzaj - " +  rodzaj + " Platforma - " + platforma + " Cena - " + cena;
	}
	
}
