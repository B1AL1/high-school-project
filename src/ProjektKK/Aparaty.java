package ProjektKK;

import java.util.Scanner;

public class Aparaty extends Sprzet implements DodawanieDanych{

	private String typ;
	private double przyslona;
	private String obiektyw;
	private int cena;

	public Aparaty(String marka, int rocznik, String typ, double przyslona, String obiektyw, int cena) {
		super(marka, rocznik);
		this.typ=typ;
		this.przyslona=przyslona;
		this.obiektyw=obiektyw;
		this.cena=cena;
	}
	
	public Aparaty(){
		super();
	}

	@Override
	public void DodajDane() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		super.DodajDane();
		System.out.println("Podaj typ aparatu");
		this.typ=sc.nextLine();
		System.out.println("Podaj przys³onê");
		this.przyslona=sc.nextDouble();
		System.out.println("Podaj obiektyw");
		this.obiektyw=sc.nextLine();
		System.out.println("Podaj cenê");
		this.cena=sc.nextInt();
	};
	
	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public double getPrzyslona() {
		return przyslona;
	}

	public void setPrzyslona(double przyslona) {
		this.przyslona = przyslona;
	}

	public String getObiektyw() {
		return obiektyw;
	}

	public void setObiektyw(String obiektyw) {
		this.obiektyw = obiektyw;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	@Override
	public String toString() {
		return "Aparat: " + super.toString() + " Typ - " +  typ + " Przys³ona - " + przyslona + " Obiektyw - " + obiektyw + " Cena - " + cena;
	}
	
}
