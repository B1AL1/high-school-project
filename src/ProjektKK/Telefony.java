package ProjektKK;

import java.util.Scanner;


public class Telefony extends Sprzet implements DodawanieDanych{

	private int pEkranu;
	private String matryca;
	private String rozdzielczosc;
	private int ram;
	private int cena;

	public Telefony(String marka, int rocznik, int pEkranu, String matryca, String rozdzielczosc, int ram, int cena) {
		super(marka, rocznik);
		this.pEkranu=pEkranu;
		this.matryca=matryca;
		this.rozdzielczosc=rozdzielczosc;
		this.ram=ram;
		this.cena=cena;
	}
	
	public Telefony() {
		super();
	}

	@Override
	public void DodajDane() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		super.DodajDane();
		System.out.println("Podaj przek¹tn¹ ekranu");
		this.pEkranu=sc.nextInt();
		System.out.println("Podaj matrycê ekranu");
		this.matryca=sc.nextLine();
		System.out.println("Podaj rodzielczoœæ ekranu");
		this.rozdzielczosc=sc.nextLine();
		System.out.println("Podaj iloœæ ramu");
		this.ram=sc.nextInt();
		System.out.println("Podaj cenê");
		this.cena=sc.nextInt();
	};
	
	public int getpEkranu() {
		return pEkranu;
	}

	public void setpEkranu(int pEkranu) {
		this.pEkranu = pEkranu;
	}

	public String getMatryca() {
		return matryca;
	}

	public void setMatryca(String matryca) {
		this.matryca = matryca;
	}

	public String getRozdzielczosc() {
		return rozdzielczosc;
	}

	public void setRozdzielczosc(String rozdzielczosc) {
		this.rozdzielczosc = rozdzielczosc;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	@Override
	public String toString() {
		return "Telefon: " + super.toString() + " Przek¹tna ekranu - " + pEkranu + " Matryca - " + matryca + " Rodzielczoœæ - " + rozdzielczosc + "RAM - " + ram + " Cena - " + cena;
	}
	
}
