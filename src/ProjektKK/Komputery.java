package ProjektKK;

import java.util.Scanner;

public class Komputery extends Sprzet implements DodawanieDanych{

	private String obudowa;
	private int ram;
	private String procesor;
	private int pDysku;
	private String grafika;
	private int cena;

	public Komputery(String marka, int rocznik, String obudowa, int ram, String procesor, int pDysku, String grafika, int cena) {
		super(marka, rocznik);
		this.obudowa=obudowa;
		this.ram=ram;
		this.procesor=procesor;
		this.pDysku=pDysku;
		this.grafika=grafika;
		this.cena=cena;
	}
	
	public Komputery(){
		super();
	}

	@Override
	public void DodajDane() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		super.DodajDane();
		System.out.println("Podaj obudowê");
		this.obudowa=sc.nextLine();
		System.out.println("Podaj iloœæ ramu");
		this.ram=sc.nextInt();
		System.out.println("Podaj procesor");
		this.procesor=sc.nextLine();
		System.out.println("Podaj pojemnoœæ dysku");
		this.pDysku=sc.nextInt();
		System.out.println("Podaj kartê graficzn¹");
		this.grafika=sc.nextLine();
		System.out.println("Podaj cenê");
		this.cena=sc.nextInt();
	};

	public String getObudowa() {
		return obudowa;
	}

	public void setObudowa(String obudowa) {
		this.obudowa = obudowa;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getProcesor() {
		return procesor;
	}

	public void setProcesor(String procesor) {
		this.procesor = procesor;
	}

	public int getpDysku() {
		return pDysku;
	}

	public void setpDysku(int pDysku) {
		this.pDysku = pDysku;
	}

	public String getGrafika() {
		return grafika;
	}

	public void setGrafika(String grafika) {
		this.grafika = grafika;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	@Override
	public String toString() {
		return "Komputer: " + super.toString() + " Obudowa - " + obudowa + " RAM - " + ram + " Procesor - " + procesor + " Pojemnoœæ dysku - " + pDysku + " Karta graficzna - " + grafika + " Cena - " + cena;
	}
	
}
