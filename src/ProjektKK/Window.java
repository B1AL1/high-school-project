package ProjektKK;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Window extends JFrame implements ActionListener{

	private JLabel labelTytul, bg;
	private JMenuBar menuBar;
	private JMenu zakupy, koszyk, informacja;
	private JMenuItem komputery, laptopy, telefony, telewizory, konsole, aparaty, drukarki, gry, dane, autor, koszykOpen;
	
	/*---------------------------------------------------------------------------------------------------*/
	
	private JLabel markaK, rocznikK, obudowaK,  ramK, procesorK, pDyskuK, grafikaK, cenaK;
	private JComboBox markaKJ, rocznikKJ, obudowaKJ,  ramKJ, procesorKJ, pDyskuKJ, grafikaKJ;
	private JTextArea cenaKomputera;
	private JButton dodajDoKoszykaK, wrocK;
	private int c1=0, c2=0, c3=0, c4=0, c5=0, c6=0, sumaK=c1+c2+c3+c4+c5+c6;
	
	/*---------------------------------------------------------------------------------------------------*/
	
	private JLabel markaL, rocznikL, pEkranuL, matrycaL, rozdzielczoscL,  ramL, procesorL, pDyskuL, grafikaL, cenaL;
	private JComboBox markaLJ, rocznikLJ, pEkranuLJ, matrycaLJ, rozdzielczoscLJ,  ramLJ, procesorLJ, pDyskuLJ, grafikaLJ;
	private JTextArea cenaLaptopa;
	private JButton dodajDoKoszykaL, wrocL;
	private int c20=0, c21=0, c22=0, c23=0, c24=0, c25=0, c26=0, c27=0, sumaL=c20+c21+c22+c23+c24+c25+c26+c27;
	
	/*---------------------------------------------------------------------------------------------------*/
	
	private JLabel markaT, rocznikT, pEkranuT, matrycaT, rozdzielczoscT,  ramT, cenaT;
	private JComboBox markaTJ, rocznikTJ, pEkranuTJ, matrycaTJ, rozdzielczoscTJ,  ramTJ, cenaTJ;
	private JTextArea cenaTelefonu;
	private JButton dodajDoKoszykaT, wrocT;
	private int c28=0, c29=0, c30=0, c31=0, c32=0, sumaT=c28+c29+c30+c31+c32;
	
	/*---------------------------------------------------------------------------------------------------*/
	
	private JLabel markaA, rocznikA, typA, przyslonaA, obiektywA, cenaA;
	private JComboBox markaAJ, rocznikAJ, typAJ, przyslonaAJ, obiektywAJ;
	private JTextArea cenaAparatu;
	private JButton dodajDoKoszykaA, wrocA;
	private int c7=0, c8=0, c9=0, c10=0, sumaA=c7+c8+c9+c10;
	
	/*---------------------------------------------------------------------------------------------------*/
	
	private JLabel markaD, rocznikD, typD, rozdzielczoscD, cenaD;
	private JComboBox markaDJ, rocznikDJ, typDJ, rozdzielczoscDJ;
	private JTextArea cenaDrukarki;
	private JButton dodajDoKoszykaD, wrocD;
	private int c11=0, c12=0, c13=0,  sumaD=c11+c12+c13;
	
	/*---------------------------------------------------------------------------------------------------*/
	
	private JLabel markaTel, rocznikTel, pEkranuTel, rozdzielczoscTel, cenaTel;
	private JComboBox markaTelJ, rocznikTelJ, pEkranuTelJ, rozdzielczoscTelJ;
	private JTextArea cenaTelewizora;
	private JButton dodajDoKoszykaTel, wrocTel;
	private int c33=0, c34=0, c35=0,  sumaTel=c33+c34+c35;
	
	/*---------------------------------------------------------------------------------------------------*/
	
	private JLabel markaG, rocznikG, rodzajG, platformaG, cenaG;
	private JComboBox markaGJ, rocznikGJ, rodzajGJ, platformaGJ;
	private JTextArea cenaGry;
	private JButton dodajDoKoszykaG, wrocG;
	private int c14=0, c15=0, c16=0,  sumaG=c14+c15+c16;
	
	/*---------------------------------------------------------------------------------------------------*/
	
	private JLabel markaKon, rocznikKon, wersjaKon, pDyskuKon, cenaKon;
	private JComboBox markaKonJ, rocznikKonJ, wersjaKonJ, pDyskuKonJ;
	private JTextArea cenaKonsoli;
	private JButton dodajDoKoszykaKon, wrocKon;
	private int c17=0, c18=0, c19=0,  sumaKon=c17+c18+c19;
	
	/*---------------------------------------------------------------------------------------------------*/
	
	private JTextArea koszykDane;
	private JScrollPane scroll; 
	private JButton zapiszZamowienie, wrocKoszyk, wyczyscKoszyk, dodajDaneOsobowe;
	private JLabel imie, nazwisko, miejscowosc, kod;
	private JTextField imieField, nazwiskoField, miejscowoscField, kodField;
	
	/*---------------------------------------------------------------------------------------------------*/
	
	public Window(List <Koszyk> koszykLista) {
		setTitle("Sklep");
		setSize(1000, 600);
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		
		Toolkit zdjecie = Toolkit.getDefaultToolkit(); 
		setIconImage(zdjecie.getImage("1.png"));
		
		String[] rok = { "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000" };
		
		
		/*-------------------------------------KOMPUTER------------------------------------------------------*/

		String[] markiK = { "-", "HP", "Asus", "Acer", "Lenovo", "Dell", "Toshiba", "Samsung", "MSI", "Apple", "Sony" };
		String[] obudowyK = { "-", "SilentiumPC", "Zalman", "Genesis", "Corsair", "be quiet!", "NZXT" };
		String[] ramyK = { "0", "4", "8", "16", "32" };
		String[] procesoryK = { "-", "Intel Core i3", "Intel Core i5", "Intel Core i7" };
		String[] pojemnosciK = { "0", "128", "256", "512", "1024", "2048" };
		String[] grafikiK = { "-", "GTX 1050", "GTX 1050 Ti", "GTX 1060", "GTX 1060 Ti", "GTX 1070", "GTX 1070 Ti", "GTX 1080", "GTX 1080 Ti" };
		
		markaK = new JLabel("Marka:");
		markaK.setBounds(80, 150, 100, 60);
		add(markaK);
		
		markaKJ = new JComboBox(markiK);
		markaKJ.setBounds(300, 165, 200, 25);
		add(markaKJ);
		
		rocznikK = new JLabel("Rok produkcji:");
		rocznikK.setBounds(80, 190, 100, 60);
		add(rocznikK);
		
		rocznikKJ = new JComboBox(rok);
		rocznikKJ.setBounds(300, 205, 200, 25);
		add(rocznikKJ);
		
		obudowaK = new JLabel("Obudowa:");
		obudowaK.setBounds(80, 230, 100, 60);
		add(obudowaK);
		
		obudowaKJ = new JComboBox(obudowyK);
		obudowaKJ.setBounds(300, 245, 200, 25);
		add(obudowaKJ);
		
		ramK = new JLabel("RAM:");
		ramK.setBounds(80, 270, 100, 60);
		add(ramK);
		
		ramKJ = new JComboBox(ramyK);
		ramKJ.setBounds(300, 285, 200, 25);
		add(ramKJ);
		
		procesorK = new JLabel("Procesor:");
		procesorK.setBounds(80, 310, 100, 60);
		add(procesorK);
		
		procesorKJ = new JComboBox(procesoryK);
		procesorKJ.setBounds(300, 325, 200, 25);
		add(procesorKJ);
		
		pDyskuK = new JLabel("Pojemność dysku:");
		pDyskuK.setBounds(80, 350, 150, 60);
		add(pDyskuK);
		
		pDyskuKJ = new JComboBox(pojemnosciK);
		pDyskuKJ.setBounds(300, 365, 200, 25);
		add(pDyskuKJ);
		
		grafikaK = new JLabel("Karta graficzna:");
		grafikaK.setBounds(80, 390, 100, 60);
		add(grafikaK);
		
		grafikaKJ = new JComboBox(grafikiK);
		grafikaKJ.setBounds(300, 405, 200, 25);
		add(grafikaKJ);
		
		cenaK = new JLabel("Cena:");
		cenaK.setBounds(80, 430, 100, 60);
		add(cenaK);
		
		cenaKomputera = new JTextArea();
		cenaKomputera.setBounds(300, 450, 200, 25);
		cenaKomputera.setEditable(false);
		cenaKomputera.setOpaque(false);
		cenaKomputera.setFont(new Font(null , Font.BOLD, 13));
		cenaKomputera.setText(String.valueOf(sumaK));
		cenaKomputera.setBackground(getBackground());
		add(cenaKomputera);
		
		dodajDoKoszykaK = new JButton("Dodaj do koszyka");
		dodajDoKoszykaK.setBounds(650, 175, 200, 45);
		add(dodajDoKoszykaK);
		
		wrocK = new JButton("Wróć");
		wrocK.setBounds(650, 245, 200, 45);
		add(wrocK);
		
		markaK.setVisible(false);
		markaKJ.setVisible(false);
		rocznikK.setVisible(false);
		rocznikKJ.setVisible(false);
		obudowaK.setVisible(false);
		obudowaKJ.setVisible(false);
		ramK.setVisible(false);
		ramKJ.setVisible(false);
		procesorK.setVisible(false);
		procesorKJ.setVisible(false);
		pDyskuK.setVisible(false);
		pDyskuKJ.setVisible(false);
		grafikaK.setVisible(false);
		grafikaKJ.setVisible(false);
		cenaK.setVisible(false);
		cenaKomputera.setVisible(false);
		dodajDoKoszykaK.setVisible(false);
		wrocK.setVisible(false);
		
		wrocK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				markaK.setVisible(false);
				markaKJ.setVisible(false);
				rocznikK.setVisible(false);
				rocznikKJ.setVisible(false);
				obudowaK.setVisible(false);
				obudowaKJ.setVisible(false);
				ramK.setVisible(false);
				ramKJ.setVisible(false);
				procesorK.setVisible(false);
				procesorKJ.setVisible(false);
				pDyskuK.setVisible(false);
				pDyskuKJ.setVisible(false);
				grafikaK.setVisible(false);
				grafikaKJ.setVisible(false);
				cenaK.setVisible(false);
				cenaKomputera.setVisible(false);
				dodajDoKoszykaK.setVisible(false);
				wrocK.setVisible(false);
			}
			
		});
		
		ramKJ.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(ramKJ.getSelectedIndex()==0)
					c1=0;
				if(ramKJ.getSelectedIndex()==1)
					c1=135;
				if(ramKJ.getSelectedIndex()==2)
					c1=400;
				if(ramKJ.getSelectedIndex()==3)
					c1=875;
				if(ramKJ.getSelectedIndex()==4)
					c1=1500;
				sumaK=c1+c2+c3+c4+c5+c6;
				cenaKomputera.setText(String.valueOf(sumaK));
			}
			
		});
		
		procesorKJ.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(procesorKJ.getSelectedIndex()==0)
					c2=0;
				if(procesorKJ.getSelectedIndex()==1)
					c2=700;
				if(procesorKJ.getSelectedIndex()==2)
					c2=1000;
				if(procesorKJ.getSelectedIndex()==3)
					c2=1400;
				sumaK=c1+c2+c3+c4+c5+c6;
				cenaKomputera.setText(String.valueOf(sumaK));
			}
			
		});
		
		grafikaKJ.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(grafikaKJ.getSelectedIndex()==0)
					c3=0;
				if(grafikaKJ.getSelectedIndex()==1)
					c3=600;
				if(grafikaKJ.getSelectedIndex()==2)
					c3=850;
				if(grafikaKJ.getSelectedIndex()==3)
					c3=1200;
				if(grafikaKJ.getSelectedIndex()==4)
					c3=1300;
				if(grafikaKJ.getSelectedIndex()==5)
					c3=2700;
				if(grafikaKJ.getSelectedIndex()==6)
					c3=3000;
				if(grafikaKJ.getSelectedIndex()==7)
					c3=3700;
				if(grafikaKJ.getSelectedIndex()==8)
					c3=4300;
				sumaK=c1+c2+c3+c4+c5+c6;
				cenaKomputera.setText(String.valueOf(sumaK));
			}
			
		});
		
		pDyskuKJ.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(pDyskuKJ.getSelectedIndex()==0)
					c4=0;
				if(pDyskuKJ.getSelectedIndex()==1)
					c4=160;
				if(pDyskuKJ.getSelectedIndex()==2)
					c4=400;
				if(pDyskuKJ.getSelectedIndex()==3)
					c4=625;
				if(pDyskuKJ.getSelectedIndex()==4)
					c4=1000;
				if(pDyskuKJ.getSelectedIndex()==5)
					c4=2000;
				sumaK=c1+c2+c3+c4+c5+c6;
				cenaKomputera.setText(String.valueOf(sumaK));
			}
			
		});
		
		obudowaKJ.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(obudowaKJ.getSelectedIndex()==0)
					c5=0;
				if(obudowaKJ.getSelectedIndex()==1)
					c5=250;
				if(obudowaKJ.getSelectedIndex()==2)
					c5=100;
				if(obudowaKJ.getSelectedIndex()==3)
					c5=120;
				if(obudowaKJ.getSelectedIndex()==4)
					c5=260;
				if(obudowaKJ.getSelectedIndex()==5)
					c5=260;
				if(obudowaKJ.getSelectedIndex()==6)
					c5=300;
				sumaK=c1+c2+c3+c4+c5+c6;
				cenaKomputera.setText(String.valueOf(sumaK));
			}
			
		});
		
		markaKJ.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(markaKJ.getSelectedIndex()==0)
					c6=0;
				if(markaKJ.getSelectedIndex()==1)
					c6=200;
				if(markaKJ.getSelectedIndex()==2)
					c6=350;
				if(markaKJ.getSelectedIndex()==3)
					c6=200;
				if(markaKJ.getSelectedIndex()==4)
					c6=260;
				if(markaKJ.getSelectedIndex()==5)
					c6=250;
				if(markaKJ.getSelectedIndex()==6)
					c6=50;
				if(markaKJ.getSelectedIndex()==7)
					c6=350;
				if(markaKJ.getSelectedIndex()==8)
					c6=500;
				if(markaKJ.getSelectedIndex()==9)
					c6=5000;
				if(markaKJ.getSelectedIndex()==10)
					c6=100;
				sumaK=c1+c2+c3+c4+c5+c6;
				cenaKomputera.setText(String.valueOf(sumaK));
			}
			
		});
		
		dodajDoKoszykaK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(
				markaKJ.getSelectedItem().toString()!="-" &&
				obudowaKJ.getSelectedItem().toString()!="-" ||
				ramKJ.getSelectedItem().toString()!="0" ||
				procesorKJ.getSelectedItem().toString()!="-" ||
				pDyskuKJ.getSelectedItem().toString()!="0" ||
				grafikaKJ.getSelectedItem().toString()!="-")
				{
					koszykLista.add(new Koszyk(new Komputery(markaKJ.getSelectedItem().toString(), Integer.parseInt(rocznikKJ.getSelectedItem().toString()), obudowaKJ.getSelectedItem().toString(), Integer.parseInt(ramKJ.getSelectedItem().toString()), procesorKJ.getSelectedItem().toString(), Integer.parseInt(pDyskuKJ.getSelectedItem().toString()), grafikaKJ.getSelectedItem().toString(), Integer.parseInt(cenaKomputera.getText().toString())), null, null, null, null));
					markaKJ.setSelectedIndex(0);
					rocznikKJ.setSelectedIndex(0);
					obudowaKJ.setSelectedIndex(0);
					ramKJ.setSelectedIndex(0);
					procesorKJ.setSelectedIndex(0);
					pDyskuKJ.setSelectedIndex(0);
					grafikaKJ.setSelectedIndex(0);
					JOptionPane.showMessageDialog(null, "Pomyślnie dodano do koszyka!");
				}
				else {
					JOptionPane.showMessageDialog(null, "Wybierz jeden z wymaganych produktów oraz markę! [Obudowa, RAM, Procesor, Dysk, Karta graficzna]");
				}
			}
			
		});
		
		/*-------------------------------------LAPTOP--------------------------------------------------------*/

		String[] markiL = { "-", "HP", "Asus", "Acer", "Lenovo", "Dell", "Toshiba", "Samsung", "MSI", "Apple", "Sony" };
		String[] przekatneL = { "0", "12", "13", "15", "17" };
		String[] matryceL = { "-", "Matowa", "Błyszcząca" };
		String[] rozdzielczosciL = { "0 x 0", "1280 x 720", "1920 x 1080", "2560 x 1440" };
		String[] ramyL = { "0", "4", "8", "16", "32" };
		String[] procesoryL = { "-", "Intel Core i3", "Intel Core i5", "Intel Core i7" };
		String[] pojemnosciL = { "0", "128", "256", "512", "1024", "2048" };
		String[] grafikiL = { "-", "GTX 1050", "GTX 1050 Ti", "GTX 1060", "GTX 1060 Ti", "GTX 1070", "GTX 1070 Ti", "GTX 1080", "GTX 1080 Ti" };
		
		markaL = new JLabel("Marka:");
		markaL.setBounds(80, 150, 100, 60);
		add(markaL);
		
		markaLJ = new JComboBox(markiL);
		markaLJ.setBounds(300, 165, 200, 25);
		add(markaLJ);
		
		rocznikL = new JLabel("Rok produkcji:");
		rocznikL.setBounds(80, 190, 100, 60);
		add(rocznikL);
		
		rocznikLJ = new JComboBox(rok);
		rocznikLJ.setBounds(300, 205, 200, 25);
		add(rocznikLJ);
		
		pEkranuL = new JLabel("Przekątna:");
		pEkranuL.setBounds(80, 230, 100, 60);
		add(pEkranuL);
		
		pEkranuLJ = new JComboBox(przekatneL);
		pEkranuLJ.setBounds(300, 245, 200, 25);
		add(pEkranuLJ);
		
		matrycaL = new JLabel("Matryca:");
		matrycaL.setBounds(600, 350, 150, 60);
		add(matrycaL);
		
		matrycaLJ = new JComboBox(matryceL);
		matrycaLJ.setBounds(720, 365, 200, 25);
		add(matrycaLJ);
		
		rozdzielczoscL = new JLabel("Rozdzielczość:");
		rozdzielczoscL.setBounds(600, 390, 100, 60);
		add(rozdzielczoscL);
		
		rozdzielczoscLJ = new JComboBox(rozdzielczosciL);
		rozdzielczoscLJ.setBounds(720, 405, 200, 25);
		add(rozdzielczoscLJ);
		
		ramL = new JLabel("RAM:");
		ramL.setBounds(80, 270, 100, 60);
		add(ramL);
		
		ramLJ = new JComboBox(ramyL);
		ramLJ.setBounds(300, 285, 200, 25);
		add(ramLJ);
		
		procesorL = new JLabel("Procesor:");
		procesorL.setBounds(80, 310, 100, 60);
		add(procesorL);
		
		procesorLJ = new JComboBox(procesoryL);
		procesorLJ.setBounds(300, 325, 200, 25);
		add(procesorLJ);
		
		pDyskuL = new JLabel("Pojemność dysku:");
		pDyskuL.setBounds(80, 350, 150, 60);
		add(pDyskuL);
		
		pDyskuLJ = new JComboBox(pojemnosciL);
		pDyskuLJ.setBounds(300, 365, 200, 25);
		add(pDyskuLJ);
		
		grafikaL = new JLabel("Karta graficzna:");
		grafikaL.setBounds(80, 390, 100, 60);
		add(grafikaL);
		
		grafikaLJ = new JComboBox(grafikiL);
		grafikaLJ.setBounds(300, 405, 200, 25);
		add(grafikaLJ);
		
		cenaL = new JLabel("Cena:");
		cenaL.setBounds(80, 430, 100, 60);
		add(cenaL);
		
		cenaLaptopa = new JTextArea();
		cenaLaptopa.setBounds(300, 450, 200, 25);
		cenaLaptopa.setEditable(false);
		cenaLaptopa.setOpaque(false);
		cenaLaptopa.setFont(new Font(null , Font.BOLD, 13));
		cenaLaptopa.setText(String.valueOf(sumaL));
		cenaLaptopa.setBackground(getBackground());
		add(cenaLaptopa);
		
		dodajDoKoszykaL = new JButton("Dodaj do koszyka");
		dodajDoKoszykaL.setBounds(650, 175, 200, 45);
		add(dodajDoKoszykaL);
		
		wrocL = new JButton("Wróć");
		wrocL.setBounds(650, 245, 200, 45);
		add(wrocL);
		
		markaL.setVisible(false);
		markaLJ.setVisible(false);
		rocznikL.setVisible(false);
		rocznikLJ.setVisible(false);
		pEkranuL.setVisible(false);
		pEkranuLJ.setVisible(false);
		matrycaL.setVisible(false);
		matrycaLJ.setVisible(false);
		rozdzielczoscL.setVisible(false);
		rozdzielczoscLJ.setVisible(false);
		ramL.setVisible(false);
		ramLJ.setVisible(false);
		procesorL.setVisible(false);
		procesorLJ.setVisible(false);
		pDyskuL.setVisible(false);
		pDyskuLJ.setVisible(false);
		grafikaL.setVisible(false);
		grafikaLJ.setVisible(false);
		cenaL.setVisible(false);
		cenaLaptopa.setVisible(false);
		dodajDoKoszykaL.setVisible(false);
		wrocL.setVisible(false);
		
		wrocL.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				markaL.setVisible(false);
				markaLJ.setVisible(false);
				rocznikL.setVisible(false);
				rocznikLJ.setVisible(false);
				pEkranuL.setVisible(false);
				pEkranuLJ.setVisible(false);
				matrycaL.setVisible(false);
				matrycaLJ.setVisible(false);
				rozdzielczoscL.setVisible(false);
				rozdzielczoscLJ.setVisible(false);
				ramL.setVisible(false);
				ramLJ.setVisible(false);
				procesorL.setVisible(false);
				procesorLJ.setVisible(false);
				pDyskuL.setVisible(false);
				pDyskuLJ.setVisible(false);
				grafikaL.setVisible(false);
				grafikaLJ.setVisible(false);
				cenaL.setVisible(false);
				cenaLaptopa.setVisible(false);
				dodajDoKoszykaL.setVisible(false);
				wrocL.setVisible(false);
			}
			
		});
		
		pEkranuLJ.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(pEkranuLJ.getSelectedIndex()==0)
					c20=0;
				if(pEkranuLJ.getSelectedIndex()==1)
					c20=300;
				if(pEkranuLJ.getSelectedIndex()==2)
					c20=400;
				if(pEkranuLJ.getSelectedIndex()==3)
					c20=600;
				if(pEkranuLJ.getSelectedIndex()==4)
					c20=800;
				sumaL=c20+c21+c22+c23+c24+c25+c26+c27;
				cenaLaptopa.setText(String.valueOf(sumaL));
			}
			
		});
		
		matrycaLJ.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(matrycaLJ.getSelectedIndex()==0)
					c21=0;
				if(matrycaLJ.getSelectedIndex()==1)
					c21=400;
				if(matrycaLJ.getSelectedIndex()==2)
					c21=200;
				sumaL=c20+c21+c22+c23+c24+c25+c26+c27;
				cenaLaptopa.setText(String.valueOf(sumaL));
			}
			
		});
		
		rozdzielczoscLJ.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(rozdzielczoscLJ.getSelectedIndex()==0)
					c22=0;
				if(rozdzielczoscLJ.getSelectedIndex()==1)
					c22=500;
				if(rozdzielczoscLJ.getSelectedIndex()==2)
					c22=800;
				if(rozdzielczoscLJ.getSelectedIndex()==3)
					c22=1200;
				sumaL=c20+c21+c22+c23+c24+c25+c26+c27;
				cenaLaptopa.setText(String.valueOf(sumaL));
			}
			
		});
		
		procesorLJ.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(procesorLJ.getSelectedIndex()==0)
					c23=0;
				if(procesorLJ.getSelectedIndex()==1)
					c23=700;
				if(procesorLJ.getSelectedIndex()==2)
					c23=1000;
				if(procesorLJ.getSelectedIndex()==3)
					c23=1400;
				sumaL=c20+c21+c22+c23+c24+c25+c26+c27;
				cenaLaptopa.setText(String.valueOf(sumaL));
			}
			
		});
		
		grafikaLJ.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(grafikaLJ.getSelectedIndex()==0)
					c24=0;
				if(grafikaLJ.getSelectedIndex()==1)
					c24=600;
				if(grafikaLJ.getSelectedIndex()==2)
					c24=850;
				if(grafikaLJ.getSelectedIndex()==3)
					c24=1200;
				if(grafikaLJ.getSelectedIndex()==4)
					c24=1300;
				if(grafikaLJ.getSelectedIndex()==5)
					c24=2700;
				if(grafikaLJ.getSelectedIndex()==6)
					c24=3000;
				if(grafikaLJ.getSelectedIndex()==7)
					c24=3700;
				if(grafikaLJ.getSelectedIndex()==8)
					c24=4300;
				sumaL=c20+c21+c22+c23+c24+c25+c26+c27;
				cenaLaptopa.setText(String.valueOf(sumaL));
			}
			
		});
		
		pDyskuLJ.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(pDyskuLJ.getSelectedIndex()==0)
					c25=0;
				if(pDyskuLJ.getSelectedIndex()==1)
					c25=160;
				if(pDyskuLJ.getSelectedIndex()==2)
					c25=400;
				if(pDyskuLJ.getSelectedIndex()==3)
					c25=625;
				if(pDyskuLJ.getSelectedIndex()==4)
					c25=1000;
				if(pDyskuLJ.getSelectedIndex()==5)
					c25=2000;
				sumaL=c20+c21+c22+c23+c24+c25+c26+c27;
				cenaLaptopa.setText(String.valueOf(sumaL));
			}
			
		});
		
		markaLJ.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(markaLJ.getSelectedIndex()==0)
					c26=0;
				if(markaLJ.getSelectedIndex()==1)
					c26=200;
				if(markaLJ.getSelectedIndex()==2)
					c26=350;
				if(markaLJ.getSelectedIndex()==3)
					c26=200;
				if(markaLJ.getSelectedIndex()==4)
					c26=260;
				if(markaLJ.getSelectedIndex()==5)
					c26=250;
				if(markaLJ.getSelectedIndex()==6)
					c26=50;
				if(markaLJ.getSelectedIndex()==7)
					c26=350;
				if(markaLJ.getSelectedIndex()==8)
					c26=500;
				if(markaLJ.getSelectedIndex()==9)
					c26=5000;
				if(markaLJ.getSelectedIndex()==10)
					c26=100;
				sumaL=c20+c21+c22+c23+c24+c25+c26+c27;
				cenaLaptopa.setText(String.valueOf(sumaL));
			}
			
		});
		
		ramLJ.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(ramLJ.getSelectedIndex()==0)
					c27=0;
				if(ramLJ.getSelectedIndex()==1)
					c27=135;
				if(ramLJ.getSelectedIndex()==2)
					c27=400;
				if(ramLJ.getSelectedIndex()==3)
					c27=875;
				if(ramLJ.getSelectedIndex()==4)
					c27=1500;
				sumaL=c20+c21+c22+c23+c24+c25+c26+c27;
				cenaLaptopa.setText(String.valueOf(sumaL));
			}
			
		});
		
		dodajDoKoszykaL.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(
				markaLJ.getSelectedItem().toString()!="-" &&
				pEkranuLJ.getSelectedItem().toString()!="0" &&
				matrycaLJ.getSelectedItem().toString()!="-" &&
				rozdzielczoscLJ.getSelectedItem().toString()!="0 x 0" &&
				ramLJ.getSelectedItem().toString()!="0" &&
				procesorLJ.getSelectedItem().toString()!="-" &&
				pDyskuLJ.getSelectedItem().toString()!="0" &&
				grafikaLJ.getSelectedItem().toString()!="-")
				{
					koszykLista.add(new Koszyk(new Laptopy(markaLJ.getSelectedItem().toString(), Integer.parseInt(rocznikLJ.getSelectedItem().toString()), Integer.parseInt(pEkranuLJ.getSelectedItem().toString()), matrycaLJ.getSelectedItem().toString(), rozdzielczoscLJ.getSelectedItem().toString(), Integer.parseInt(ramLJ.getSelectedItem().toString()), procesorLJ.getSelectedItem().toString(), Integer.parseInt(pDyskuLJ.getSelectedItem().toString()), grafikaLJ.getSelectedItem().toString(), Integer.parseInt(cenaLaptopa.getText().toString())), null, null, null, null));
					markaLJ.setSelectedIndex(0);
					rocznikLJ.setSelectedIndex(0);
					pEkranuLJ.setSelectedIndex(0);
					matrycaLJ.setSelectedIndex(0);
					rozdzielczoscLJ.setSelectedIndex(0);
					ramLJ.setSelectedIndex(0);
					procesorLJ.setSelectedIndex(0);
					pDyskuLJ.setSelectedIndex(0);
					grafikaLJ.setSelectedIndex(0);
					JOptionPane.showMessageDialog(null, "Pomyślnie dodano do koszyka!");
				}
				else {
					JOptionPane.showMessageDialog(null, "Wybierz wszystkie podzespoły!");
				}
			}
			
		});
		
		/*-------------------------------------TELEFON-------------------------------------------------------*/

		String[] markiT = { "-", "HP", "Asus", "Acer", "Lenovo", "Dell", "Toshiba", "Samsung", "MSI", "Apple", "Sony" };
		String[] przekatneT = { "0", "4", "5", "6" };
		String[] matryceT = { "-", "IPS", "OLED" };
		String[] rozdzielczosciT = { "0 x 0", "1280 x 720", "1920 x 1080", "2560 x 1440" };
		String[] ramyT = { "0", "4", "8" };
		
		markaT = new JLabel("Marka:");
		markaT.setBounds(80, 150, 100, 60);
		add(markaT);
		
		markaTJ = new JComboBox(markiT);
		markaTJ.setBounds(300, 165, 200, 25);
		add(markaTJ);
		
		rocznikT = new JLabel("Rok produkcji:");
		rocznikT.setBounds(80, 190, 100, 60);
		add(rocznikT);
		
		rocznikTJ = new JComboBox(rok);
		rocznikTJ.setBounds(300, 205, 200, 25);
		add(rocznikTJ);
		
		pEkranuT = new JLabel("Przekątna:");
		pEkranuT.setBounds(80, 230, 100, 60);
		add(pEkranuT);
		
		pEkranuTJ = new JComboBox(przekatneT);
		pEkranuTJ.setBounds(300, 245, 200, 25);
		add(pEkranuTJ);
		
		matrycaT = new JLabel("Matryca:");
		matrycaT.setBounds(80, 310, 100, 60);
		add(matrycaT);
		
		matrycaTJ = new JComboBox(matryceT);
		matrycaTJ.setBounds(300, 325, 200, 25);
		add(matrycaTJ);
		
		rozdzielczoscT = new JLabel("Rozdzielczość:");
		rozdzielczoscT.setBounds(80, 350, 150, 60);
		add(rozdzielczoscT);
		
		rozdzielczoscTJ = new JComboBox(rozdzielczosciT);
		rozdzielczoscTJ.setBounds(300, 365, 200, 25);
		add(rozdzielczoscTJ);
		
		ramT = new JLabel("RAM:");
		ramT.setBounds(80, 270, 100, 60);
		add(ramT);
		
		ramTJ = new JComboBox(ramyT);
		ramTJ.setBounds(300, 285, 200, 25);
		add(ramTJ);
		
		cenaT = new JLabel("Cena:");
		cenaT.setBounds(80, 390, 100, 60);
		add(cenaT);
		
		cenaTelefonu = new JTextArea();
		cenaTelefonu.setBounds(300, 410, 200, 25);
		cenaTelefonu.setEditable(false);
		cenaTelefonu.setOpaque(false);
		cenaTelefonu.setFont(new Font(null , Font.BOLD, 13));
		cenaTelefonu.setText(String.valueOf(sumaL));
		cenaTelefonu.setBackground(getBackground());
		add(cenaTelefonu);
		
		dodajDoKoszykaT = new JButton("Dodaj do koszyka");
		dodajDoKoszykaT.setBounds(650, 175, 200, 45);
		add(dodajDoKoszykaT);
		
		wrocT = new JButton("Wróć");
		wrocT.setBounds(650, 245, 200, 45);
		add(wrocT);
		
		markaT.setVisible(false);
		markaTJ.setVisible(false);
		rocznikT.setVisible(false);
		rocznikTJ.setVisible(false);
		pEkranuT.setVisible(false);
		pEkranuTJ.setVisible(false);
		matrycaT.setVisible(false);
		matrycaTJ.setVisible(false);
		rozdzielczoscT.setVisible(false);
		rozdzielczoscTJ.setVisible(false);
		ramT.setVisible(false);
		ramTJ.setVisible(false);
		cenaT.setVisible(false);
		cenaTelefonu.setVisible(false);
		dodajDoKoszykaT.setVisible(false);
		wrocT.setVisible(false);
		
		wrocT.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				markaT.setVisible(false);
				markaTJ.setVisible(false);
				rocznikT.setVisible(false);
				rocznikTJ.setVisible(false);
				pEkranuT.setVisible(false);
				pEkranuTJ.setVisible(false);
				matrycaT.setVisible(false);
				matrycaTJ.setVisible(false);
				rozdzielczoscT.setVisible(false);
				rozdzielczoscTJ.setVisible(false);
				ramT.setVisible(false);
				ramTJ.setVisible(false);
				cenaT.setVisible(false);
				cenaTelefonu.setVisible(false);
				dodajDoKoszykaT.setVisible(false);
				wrocT.setVisible(false);
			}
			
		});
		
		pEkranuTJ.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(pEkranuTJ.getSelectedIndex()==0)
					c28=0;
				if(pEkranuTJ.getSelectedIndex()==1)
					c28=300;
				if(pEkranuTJ.getSelectedIndex()==2)
					c28=400;
				if(pEkranuTJ.getSelectedIndex()==3)
					c28=600;
				sumaT=c28+c29+c30+c31+c32;
				cenaTelefonu.setText(String.valueOf(sumaT));
			}
			
		});
		
		matrycaTJ.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(matrycaTJ.getSelectedIndex()==0)
					c29=0;
				if(matrycaTJ.getSelectedIndex()==1)
					c29=400;
				if(matrycaTJ.getSelectedIndex()==2)
					c29=200;
				sumaT=c28+c29+c30+c31+c32;
				cenaTelefonu.setText(String.valueOf(sumaT));
			}
			
		});
		
		rozdzielczoscTJ.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(rozdzielczoscTJ.getSelectedIndex()==0)
					c30=0;
				if(rozdzielczoscTJ.getSelectedIndex()==1)
					c30=500;
				if(rozdzielczoscTJ.getSelectedIndex()==2)
					c30=800;
				if(rozdzielczoscTJ.getSelectedIndex()==3)
					c30=1200;
				sumaT=c28+c29+c30+c31+c32;
				cenaTelefonu.setText(String.valueOf(sumaT));
			}
			
		});
		
		markaTJ.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(markaTJ.getSelectedIndex()==0)
					c31=0;
				if(markaTJ.getSelectedIndex()==1)
					c31=200;
				if(markaTJ.getSelectedIndex()==2)
					c31=350;
				if(markaTJ.getSelectedIndex()==3)
					c31=200;
				if(markaTJ.getSelectedIndex()==4)
					c31=260;
				if(markaTJ.getSelectedIndex()==5)
					c31=250;
				if(markaTJ.getSelectedIndex()==6)
					c31=50;
				if(markaTJ.getSelectedIndex()==7)
					c31=350;
				if(markaTJ.getSelectedIndex()==8)
					c31=500;
				if(markaTJ.getSelectedIndex()==9)
					c31=5000;
				if(markaTJ.getSelectedIndex()==10)
					c31=100;
				sumaT=c28+c29+c30+c31+c32;
				cenaTelefonu.setText(String.valueOf(sumaT));
			}
			
		});
		
		ramTJ.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(ramTJ.getSelectedIndex()==0)
					c32=0;
				if(ramTJ.getSelectedIndex()==1)
					c32=135;
				if(ramTJ.getSelectedIndex()==2)
					c32=400;
				sumaT=c28+c29+c30+c31+c32;
				cenaTelefonu.setText(String.valueOf(sumaT));
			}
			
		});
		
		dodajDoKoszykaT.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(
				markaTJ.getSelectedItem().toString()!="-" &&
				pEkranuTJ.getSelectedItem().toString()!="0" &&
				matrycaTJ.getSelectedItem().toString()!="-" &&
				rozdzielczoscTJ.getSelectedItem().toString()!="0 x 0" &&
				ramTJ.getSelectedItem().toString()!="0")
				{
					koszykLista.add(new Koszyk(new Telefony(markaTJ.getSelectedItem().toString(), Integer.parseInt(rocznikTJ.getSelectedItem().toString()), Integer.parseInt(pEkranuTJ.getSelectedItem().toString()), matrycaTJ.getSelectedItem().toString(), rozdzielczoscTJ.getSelectedItem().toString(), Integer.parseInt(ramTJ.getSelectedItem().toString()), Integer.parseInt(cenaLaptopa.getText().toString())), null, null, null, null));
					markaTJ.setSelectedIndex(0);
					rocznikTJ.setSelectedIndex(0);
					pEkranuTJ.setSelectedIndex(0);
					matrycaTJ.setSelectedIndex(0);
					rozdzielczoscTJ.setSelectedIndex(0);
					ramTJ.setSelectedIndex(0);
					JOptionPane.showMessageDialog(null, "Pomyślnie dodano do koszyka!");
				}
				else {
					JOptionPane.showMessageDialog(null, "Wybierz wszystkie podzespoły!");
				}
			}
			
		});
		
		/*-------------------------------------APARAT--------------------------------------------------------*/
		
		String[] markiA = { "-", "Canon", "Leica", "Nikon", "Sony" };
		String[] typyA = { "-", "Kompaktowy", "Lustrzany", "Polaroid" };
		String[] przyslonyA = { "0", "1.0", "1.4", "1.8", "2.8", "4.0" };
		String[] obiektywyA = { "-", "Klasyczny", "Makro", "Rybie oko", "Lustrzany" };
		
		markaA = new JLabel("Marka:");
		markaA.setBounds(80, 150, 100, 60);
		add(markaA);
		
		markaAJ = new JComboBox(markiA);
		markaAJ.setBounds(300, 165, 200, 25);
		add(markaAJ);
		
		rocznikA = new JLabel("Rok produkcji:");
		rocznikA.setBounds(80, 190, 100, 60);
		add(rocznikA);
		
		rocznikAJ = new JComboBox(rok);
		rocznikAJ.setBounds(300, 205, 200, 25);
		add(rocznikAJ);
		
		typA = new JLabel("Typ:");
		typA.setBounds(80, 230, 100, 60);
		add(typA);
		
		typAJ = new JComboBox(typyA);
		typAJ.setBounds(300, 245, 200, 25);
		add(typAJ);
		
		przyslonaA = new JLabel("Przysłona:");
		przyslonaA.setBounds(80, 270, 100, 60);
		add(przyslonaA);
		
		przyslonaAJ = new JComboBox(przyslonyA);
		przyslonaAJ.setBounds(300, 285, 200, 25);
		add(przyslonaAJ);
		
		obiektywA = new JLabel("Obiektyw:");
		obiektywA.setBounds(80, 310, 100, 60);
		add(obiektywA);
		
		obiektywAJ = new JComboBox(obiektywyA);
		obiektywAJ.setBounds(300, 325, 200, 25);
		add(obiektywAJ);
		
		cenaA = new JLabel("Cena:");
		cenaA.setBounds(80, 350, 150, 60);
		add(cenaA);
		
		cenaAparatu = new JTextArea();
		cenaAparatu.setBounds(300, 370, 200, 25);
		cenaAparatu.setEditable(false);
		cenaAparatu.setOpaque(false);
		cenaAparatu.setFont(new Font(null , Font.BOLD, 13));
		cenaAparatu.setText(String.valueOf(sumaA));
		cenaAparatu.setBackground(getBackground());
		add(cenaAparatu);
		
		dodajDoKoszykaA = new JButton("Dodaj do koszyka");
		dodajDoKoszykaA.setBounds(650, 175, 200, 45);
		add(dodajDoKoszykaA);
		
		wrocA = new JButton("Wróć");
		wrocA.setBounds(650, 245, 200, 45);
		add(wrocA);
		
		markaA.setVisible(false);
		markaAJ.setVisible(false);
		rocznikA.setVisible(false);
		rocznikAJ.setVisible(false);
		typA.setVisible(false);
		typAJ.setVisible(false);
		przyslonaA.setVisible(false);
		przyslonaAJ.setVisible(false);
		obiektywA.setVisible(false);
		obiektywAJ.setVisible(false);
		cenaA.setVisible(false);
		cenaAparatu.setVisible(false);
		dodajDoKoszykaA.setVisible(false);
		wrocA.setVisible(false);
		
		wrocA.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				markaA.setVisible(false);
				markaAJ.setVisible(false);
				rocznikA.setVisible(false);
				rocznikAJ.setVisible(false);
				typA.setVisible(false);
				typAJ.setVisible(false);
				przyslonaA.setVisible(false);
				przyslonaAJ.setVisible(false);
				obiektywA.setVisible(false);
				obiektywAJ.setVisible(false);
				cenaA.setVisible(false);
				cenaAparatu.setVisible(false);
				dodajDoKoszykaA.setVisible(false);
				wrocA.setVisible(false);
			}
			
		});
		
		markaAJ.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(markaAJ.getSelectedIndex()==0)
					c7=0;
				if(markaAJ.getSelectedIndex()==1)
					c7=200;
				if(markaAJ.getSelectedIndex()==2)
					c7=150;
				if(markaAJ.getSelectedIndex()==3)
					c7=180;
				if(markaAJ.getSelectedIndex()==4)
					c7=190;
				sumaA=c7+c8+c9+c10;
				cenaAparatu.setText(String.valueOf(sumaA));
			}
			
		});
		
		typAJ.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(typAJ.getSelectedIndex()==0)
					c8=0;
				if(typAJ.getSelectedIndex()==1)
					c8=1000;
				if(typAJ.getSelectedIndex()==2)
					c8=3000;
				if(typAJ.getSelectedIndex()==3)
					c8=1500;
				sumaA=c7+c8+c9+c10;
				cenaAparatu.setText(String.valueOf(sumaA));
			}
			
		});
		
		przyslonaAJ.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(przyslonaAJ.getSelectedIndex()==0)
					c9=0;
				if(przyslonaAJ.getSelectedIndex()==1)
					c9=500;
				if(przyslonaAJ.getSelectedIndex()==2)
					c9=1000;
				if(przyslonaAJ.getSelectedIndex()==3)
					c9=1500;
				if(przyslonaAJ.getSelectedIndex()==4)
					c9=2000;
				if(przyslonaAJ.getSelectedIndex()==5)
					c9=2500;
				sumaA=c7+c8+c9+c10;
				cenaAparatu.setText(String.valueOf(sumaA));
			}
			
		});
		
		obiektywAJ.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(obiektywAJ.getSelectedIndex()==0)
					c10=0;
				if(obiektywAJ.getSelectedIndex()==1)
					c10=500;
				if(obiektywAJ.getSelectedIndex()==2)
					c10=2000;
				if(obiektywAJ.getSelectedIndex()==3)
					c10=1500;
				if(obiektywAJ.getSelectedIndex()==4)
					c10=2000;
				sumaA=c7+c8+c9+c10;
				cenaAparatu.setText(String.valueOf(sumaA));
			}
			
		});
		
		dodajDoKoszykaA.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(
						markaAJ.getSelectedItem().toString()!="-" &&
						typAJ.getSelectedItem().toString()!="-" &&
						przyslonaAJ.getSelectedItem().toString()!="0" &&
						obiektywAJ.getSelectedItem().toString()!="-")
						{
							koszykLista.add(new Koszyk(new Aparaty(markaAJ.getSelectedItem().toString(), Integer.parseInt(rocznikAJ.getSelectedItem().toString()), typAJ.getSelectedItem().toString(), Double.parseDouble(przyslonaAJ.getSelectedItem().toString()), obiektywAJ.getSelectedItem().toString(), Integer.parseInt(cenaAparatu.getText().toString())), null, null, null, null));
							markaAJ.setSelectedIndex(0);
							rocznikAJ.setSelectedIndex(0);
							typAJ.setSelectedIndex(0);
							przyslonaAJ.setSelectedIndex(0);
							obiektywAJ.setSelectedIndex(0);
							JOptionPane.showMessageDialog(null, "Pomyślnie dodano do koszyka!");
						}
						else {
							JOptionPane.showMessageDialog(null, "Wybierz wszystkie podzespoły!");
						}
				
			}
			
		});
		
		/*-------------------------------------DRUKARKA------------------------------------------------------*/
		
		String[] markiD = { "-", "Canon", "Samsung", "HP", "Epson" };
		String[] typyD = { "-", "Atramentowa", "Laserowa" };
		String[] rozdzielczosciD = { "0 x 0", "600 x 600", "600 x 1200", "1200 x 1200", "2400 x 1200", "2400 x 2400" };
		
		markaD = new JLabel("Marka:");
		markaD.setBounds(80, 150, 100, 60);
		add(markaD);
		
		markaDJ = new JComboBox(markiD);
		markaDJ.setBounds(300, 165, 200, 25);
		add(markaDJ);
		
		rocznikD = new JLabel("Rok produkcji:");
		rocznikD.setBounds(80, 190, 100, 60);
		add(rocznikD);
		
		rocznikDJ = new JComboBox(rok);
		rocznikDJ.setBounds(300, 205, 200, 25);
		add(rocznikDJ);
		
		typD = new JLabel("Typ:");
		typD.setBounds(80, 230, 100, 60);
		add(typD);
		
		typDJ = new JComboBox(typyD);
		typDJ.setBounds(300, 245, 200, 25);
		add(typDJ);
		
		rozdzielczoscD = new JLabel("Rozdzielczość:");
		rozdzielczoscD.setBounds(80, 270, 100, 60);
		add(rozdzielczoscD);
		
		rozdzielczoscDJ = new JComboBox(rozdzielczosciD);
		rozdzielczoscDJ.setBounds(300, 285, 200, 25);
		add(rozdzielczoscDJ);
		
		cenaD = new JLabel("Cena:");
		cenaD.setBounds(80, 310, 150, 60);
		add(cenaD);
		
		cenaDrukarki = new JTextArea();
		cenaDrukarki.setBounds(300, 330, 200, 25);
		cenaDrukarki.setEditable(false);
		cenaDrukarki.setOpaque(false);
		cenaDrukarki.setFont(new Font(null , Font.BOLD, 13));
		cenaDrukarki.setText(String.valueOf(sumaA));
		cenaDrukarki.setBackground(getBackground());
		add(cenaDrukarki);
		
		dodajDoKoszykaD = new JButton("Dodaj do koszyka");
		dodajDoKoszykaD.setBounds(650, 175, 200, 45);
		add(dodajDoKoszykaD);
		
		wrocD = new JButton("Wróć");
		wrocD.setBounds(650, 245, 200, 45);
		add(wrocD);
		
		markaD.setVisible(false);
		markaDJ.setVisible(false);
		rocznikD.setVisible(false);
		rocznikDJ.setVisible(false);
		typD.setVisible(false);
		typDJ.setVisible(false);
		rozdzielczoscD.setVisible(false);
		rozdzielczoscDJ.setVisible(false);
		cenaD.setVisible(false);
		cenaDrukarki.setVisible(false);
		dodajDoKoszykaD.setVisible(false);
		wrocD.setVisible(false);
		
		wrocD.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				markaD.setVisible(false);
				markaDJ.setVisible(false);
				rocznikD.setVisible(false);
				rocznikDJ.setVisible(false);
				typD.setVisible(false);
				typDJ.setVisible(false);
				rozdzielczoscD.setVisible(false);
				rozdzielczoscDJ.setVisible(false);
				cenaD.setVisible(false);
				cenaDrukarki.setVisible(false);
				dodajDoKoszykaD.setVisible(false);
				wrocD.setVisible(false);
			}
			
		});
		
		markaDJ.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(markaDJ.getSelectedIndex()==0)
					c11=0;
				if(markaDJ.getSelectedIndex()==1)
					c11=200;
				if(markaDJ.getSelectedIndex()==2)
					c11=170;
				if(markaDJ.getSelectedIndex()==3)
					c11=180;
				if(markaDJ.getSelectedIndex()==4)
					c11=100;
				sumaD=c11+c12+c13;
				cenaDrukarki.setText(String.valueOf(sumaD));
			}
			
		});
		
		typDJ.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// typDJ Auto-generated method stub
				if(typAJ.getSelectedIndex()==0)
					c12=0;
				if(typDJ.getSelectedIndex()==1)
					c12=1000;
				if(typDJ.getSelectedIndex()==2)
					c12=3000;
				sumaD=c11+c12+c13;
				cenaDrukarki.setText(String.valueOf(sumaD));
			}
			
		});
		
		rozdzielczoscDJ.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(rozdzielczoscDJ.getSelectedIndex()==0)
					c13=0;
				if(rozdzielczoscDJ.getSelectedIndex()==1)
					c13=500;
				if(rozdzielczoscDJ.getSelectedIndex()==2)
					c13=1000;
				if(rozdzielczoscDJ.getSelectedIndex()==3)
					c13=1500;
				if(rozdzielczoscDJ.getSelectedIndex()==4)
					c13=2000;
				if(rozdzielczoscDJ.getSelectedIndex()==5)
					c13=2500;
				sumaD=c11+c12+c13;
				cenaDrukarki.setText(String.valueOf(sumaD));
			}
			
		});
		
		dodajDoKoszykaD.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(
						markaDJ.getSelectedItem().toString()!="-" &&
						typDJ.getSelectedItem().toString()!="-" &&
						rozdzielczoscDJ.getSelectedItem().toString()!="0 x 0")
						{
							koszykLista.add(new Koszyk(new Drukarki(markaDJ.getSelectedItem().toString(), Integer.parseInt(rocznikDJ.getSelectedItem().toString()), typDJ.getSelectedItem().toString(), rozdzielczoscDJ.getSelectedItem().toString(), Integer.parseInt(cenaDrukarki.getText().toString())), null, null, null, null));
							markaDJ.setSelectedIndex(0);
							rocznikDJ.setSelectedIndex(0);
							typDJ.setSelectedIndex(0);
							rozdzielczoscDJ.setSelectedIndex(0);
							JOptionPane.showMessageDialog(null, "Pomyślnie dodano do koszyka!");
						}
						else {
							JOptionPane.showMessageDialog(null, "Wybierz wszystkie podzespoły!");
						}
				
			}
			
		});
		
		/*-------------------------------------TELEWIZOR-----------------------------------------------------*/

		String[] markiTel = { "-", "LG", "Samsung", "Manta", "Sharp" };
		String[] przekatneTel = { "0", "32", "42", "60" };
		String[] rozdzielczosciTel = { "0 x 0", "1280 x 720", "1920 x 1080", "2560 x 1440", "3840 × 2160" };
		
		markaTel = new JLabel("Marka:");
		markaTel.setBounds(80, 150, 100, 60);
		add(markaTel);
		
		markaTelJ = new JComboBox(markiTel);
		markaTelJ.setBounds(300, 165, 200, 25);
		add(markaTelJ);
		
		rocznikTel = new JLabel("Rok produkcji:");
		rocznikTel.setBounds(80, 190, 100, 60);
		add(rocznikTel);
		
		rocznikTelJ = new JComboBox(rok);
		rocznikTelJ.setBounds(300, 205, 200, 25);
		add(rocznikTelJ);
		
		pEkranuTel = new JLabel("Przekątna:");
		pEkranuTel.setBounds(80, 230, 100, 60);
		add(pEkranuTel);
		
		pEkranuTelJ = new JComboBox(przekatneTel);
		pEkranuTelJ.setBounds(300, 245, 200, 25);
		add(pEkranuTelJ);
		
		rozdzielczoscTel = new JLabel("Rozdzielczość:");
		rozdzielczoscTel.setBounds(80, 270, 100, 60);
		add(rozdzielczoscTel);
		
		rozdzielczoscTelJ = new JComboBox(rozdzielczosciTel);
		rozdzielczoscTelJ.setBounds(300, 285, 200, 25);
		add(rozdzielczoscTelJ);
		
		cenaTel = new JLabel("Cena:");
		cenaTel.setBounds(80, 310, 150, 60);
		add(cenaTel);
		
		cenaTelewizora = new JTextArea();
		cenaTelewizora.setBounds(300, 330, 200, 25);
		cenaTelewizora.setEditable(false);
		cenaTelewizora.setOpaque(false);
		cenaTelewizora.setFont(new Font(null , Font.BOLD, 13));
		cenaTelewizora.setText(String.valueOf(sumaTel));
		cenaTelewizora.setBackground(getBackground());
		add(cenaTelewizora);
		
		dodajDoKoszykaTel = new JButton("Dodaj do koszyka");
		dodajDoKoszykaTel.setBounds(650, 175, 200, 45);
		add(dodajDoKoszykaTel);
		
		wrocTel = new JButton("Wróć");
		wrocTel.setBounds(650, 245, 200, 45);
		add(wrocTel);
		
		markaTel.setVisible(false);
		markaTelJ.setVisible(false);
		rocznikTel.setVisible(false);
		rocznikTelJ.setVisible(false);
		pEkranuTel.setVisible(false);
		pEkranuTelJ.setVisible(false);
		rozdzielczoscTel.setVisible(false);
		rozdzielczoscTelJ.setVisible(false);
		cenaTel.setVisible(false);
		cenaTelewizora.setVisible(false);
		dodajDoKoszykaTel.setVisible(false);
		wrocTel.setVisible(false);
		
		wrocTel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				markaTel.setVisible(false);
				markaTelJ.setVisible(false);
				rocznikTel.setVisible(false);
				rocznikTelJ.setVisible(false);
				pEkranuTel.setVisible(false);
				pEkranuTelJ.setVisible(false);
				rozdzielczoscTel.setVisible(false);
				rozdzielczoscTelJ.setVisible(false);
				cenaTel.setVisible(false);
				cenaTelewizora.setVisible(false);
				dodajDoKoszykaTel.setVisible(false);
				wrocTel.setVisible(false);
			}
			
		});
		
		markaTelJ.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(markaTelJ.getSelectedIndex()==0)
					c33=0;
				if(markaTelJ.getSelectedIndex()==1)
					c33=1000;
				if(markaTelJ.getSelectedIndex()==2)
					c33=1100;
				if(markaTelJ.getSelectedIndex()==3)
					c33=900;
				if(markaTelJ.getSelectedIndex()==4)
					c33=1000;
				sumaTel=c33+c34+c35;
				cenaTelewizora.setText(String.valueOf(sumaTel));
			}
			
		});
		
		pEkranuTelJ.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// typDJ Auto-generated method stub
				if(pEkranuTelJ.getSelectedIndex()==0)
					c34=0;
				if(pEkranuTelJ.getSelectedIndex()==1)
					c34=300;
				if(pEkranuTelJ.getSelectedIndex()==2)
					c34=500;
				if(pEkranuTelJ.getSelectedIndex()==3)
					c34=800;
				sumaTel=c33+c34+c35;
				cenaTelewizora.setText(String.valueOf(sumaTel));
			}
			
		});
		
		rozdzielczoscTelJ.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(rozdzielczoscTelJ.getSelectedIndex()==0)
					c35=0;
				if(rozdzielczoscTelJ.getSelectedIndex()==1)
					c35=500;
				if(rozdzielczoscTelJ.getSelectedIndex()==2)
					c35=1000;
				if(rozdzielczoscTelJ.getSelectedIndex()==3)
					c35=1500;
				if(rozdzielczoscTelJ.getSelectedIndex()==4)
					c35=2000;
				sumaTel=c33+c34+c35;
				cenaTelewizora.setText(String.valueOf(sumaTel));
			}
			
		});
		
		dodajDoKoszykaTel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(
						markaTelJ.getSelectedItem().toString()!="-" &&
						pEkranuTelJ.getSelectedItem().toString()!="0" &&
						rozdzielczoscTelJ.getSelectedItem().toString()!="0 x 0")
						{
							koszykLista.add(new Koszyk(new Telewizory(markaTelJ.getSelectedItem().toString(), Integer.parseInt(rocznikTelJ.getSelectedItem().toString()), Integer.parseInt(pEkranuTelJ.getSelectedItem().toString()), rozdzielczoscTelJ.getSelectedItem().toString(), Integer.parseInt(cenaTelewizora.getText().toString())), null, null, null, null));
							markaTelJ.setSelectedIndex(0);
							rocznikTelJ.setSelectedIndex(0);
							pEkranuTelJ.setSelectedIndex(0);
							rozdzielczoscTelJ.setSelectedIndex(0);
							JOptionPane.showMessageDialog(null, "Pomyślnie dodano do koszyka!");
						}
						else {
							JOptionPane.showMessageDialog(null, "Wybierz wszystkie podzespoły!");
						}
				
			}
			
		});
		
		/*-------------------------------------GRA-----------------------------------------------------------*/

		String[] markiG = { "-", "Electronic Arts", "CD Projekt", "Blizzard Entertainment", "Ubisoft" };
		String[] rodzajeG = { "-", "Platformowa", "Przygodowa", "RPG", "Akcji", "Strategiczna", "Wyścigowa" };
		String[] platformyG = { "-", "PC", "PlayStation", "XBox" };
		
		markaG = new JLabel("Marka:");
		markaG.setBounds(80, 150, 100, 60);
		add(markaG);
		
		markaGJ = new JComboBox(markiG);
		markaGJ.setBounds(300, 165, 200, 25);
		add(markaGJ);
		
		rocznikG = new JLabel("Rok produkcji:");
		rocznikG.setBounds(80, 190, 100, 60);
		add(rocznikG);
		
		rocznikGJ = new JComboBox(rok);
		rocznikGJ.setBounds(300, 205, 200, 25);
		add(rocznikGJ);
		
		rodzajG = new JLabel("Rodzaj:");
		rodzajG.setBounds(80, 230, 100, 60);
		add(rodzajG);
		
		rodzajGJ = new JComboBox(rodzajeG);
		rodzajGJ.setBounds(300, 245, 200, 25);
		add(rodzajGJ);
		
		platformaG = new JLabel("Platforma:");
		platformaG.setBounds(80, 270, 100, 60);
		add(platformaG);
		
		platformaGJ = new JComboBox(platformyG);
		platformaGJ.setBounds(300, 285, 200, 25);
		add(platformaGJ);
		
		cenaG = new JLabel("Cena:");
		cenaG.setBounds(80, 310, 150, 60);
		add(cenaG);
		
		cenaGry = new JTextArea();
		cenaGry.setBounds(300, 330, 200, 25);
		cenaGry.setEditable(false);
		cenaGry.setOpaque(false);
		cenaGry.setFont(new Font(null , Font.BOLD, 13));
		cenaGry.setText(String.valueOf(sumaG));
		cenaGry.setBackground(getBackground());
		add(cenaGry);
		
		dodajDoKoszykaG = new JButton("Dodaj do koszyka");
		dodajDoKoszykaG.setBounds(650, 175, 200, 45);
		add(dodajDoKoszykaG);
		
		wrocG = new JButton("Wróć");
		wrocG.setBounds(650, 245, 200, 45);
		add(wrocG);
		
		markaG.setVisible(false);
		markaGJ.setVisible(false);
		rocznikG.setVisible(false);
		rocznikGJ.setVisible(false);
		rodzajG.setVisible(false);
		rodzajGJ.setVisible(false);
		platformaG.setVisible(false);
		platformaGJ.setVisible(false);
		cenaG.setVisible(false);
		cenaGry.setVisible(false);
		dodajDoKoszykaG.setVisible(false);
		wrocG.setVisible(false);
		
		wrocG.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				markaG.setVisible(false);
				markaGJ.setVisible(false);
				rocznikG.setVisible(false);
				rocznikGJ.setVisible(false);
				rodzajG.setVisible(false);
				rodzajGJ.setVisible(false);
				platformaG.setVisible(false);
				platformaGJ.setVisible(false);
				cenaG.setVisible(false);
				cenaGry.setVisible(false);
				dodajDoKoszykaG.setVisible(false);
				wrocG.setVisible(false);
			}
			
		});
		
		markaGJ.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(markaGJ.getSelectedIndex()==0)
					c14=0;
				if(markaGJ.getSelectedIndex()==1)
					c14=10;
				if(markaGJ.getSelectedIndex()==2)
					c14=50;
				if(markaGJ.getSelectedIndex()==3)
					c14=60;
				if(markaGJ.getSelectedIndex()==4)
					c14=20;
				sumaG=c14+c15+c16;
				cenaGry.setText(String.valueOf(sumaG));
			}
			
		});
		
		rodzajGJ.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// typDJ Auto-generated method stub
				if(rodzajGJ.getSelectedIndex()==0)
					c15=0;
				if(rodzajGJ.getSelectedIndex()==1)
					c15=100;
				if(rodzajGJ.getSelectedIndex()==2)
					c15=80;
				if(rodzajGJ.getSelectedIndex()==3)
					c15=120;
				if(rodzajGJ.getSelectedIndex()==4)
					c15=130;
				if(rodzajGJ.getSelectedIndex()==5)
					c15=90;
				if(rodzajGJ.getSelectedIndex()==6)
					c15=80;
				sumaG=c14+c15+c16;
				cenaGry.setText(String.valueOf(sumaG));
			}
			
		});
		
		platformaGJ.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(platformaGJ.getSelectedIndex()==0)
					c16=0;
				if(platformaGJ.getSelectedIndex()==1)
					c16=100;
				if(platformaGJ.getSelectedIndex()==2)
					c16=80;
				if(platformaGJ.getSelectedIndex()==3)
					c16=60;
				sumaG=c14+c15+c16;
				cenaGry.setText(String.valueOf(sumaG));
			}
			
		});
		
		dodajDoKoszykaG.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(
						markaGJ.getSelectedItem().toString()!="-" &&
						rodzajGJ.getSelectedItem().toString()!="-" &&
						platformaGJ.getSelectedItem().toString()!="-")
						{
							koszykLista.add(new Koszyk(new Gry(markaGJ.getSelectedItem().toString(), Integer.parseInt(rocznikGJ.getSelectedItem().toString()), rodzajGJ.getSelectedItem().toString(), platformaGJ.getSelectedItem().toString(), Integer.parseInt(cenaGry.getText().toString())), null, null, null, null));
							markaGJ.setSelectedIndex(0);
							rocznikGJ.setSelectedIndex(0);
							rodzajGJ.setSelectedIndex(0);
							platformaGJ.setSelectedIndex(0);
							JOptionPane.showMessageDialog(null, "Pomyślnie dodano do koszyka!");
						}
						else {
							JOptionPane.showMessageDialog(null, "Wybierz wszystkie elementy!");
						}
				
			}
			
		});
		
		/*-------------------------------------KONSOLA-------------------------------------------------------*/

		String[] markiKon = { "-", "Sony", "Microsoft", "Nintendo" };
		String[] wersjeKon = { "-", "Normalna", "Slim", "Portable", "Pro" };
		String[] pojemnosciKon = { "0", "500", "1000", "2000" };
		
		markaKon = new JLabel("Marka:");
		markaKon.setBounds(80, 150, 100, 60);
		add(markaKon);
		
		markaKonJ = new JComboBox(markiKon);
		markaKonJ.setBounds(300, 165, 200, 25);
		add(markaKonJ);
		
		rocznikKon = new JLabel("Rok produkcji:");
		rocznikKon.setBounds(80, 190, 100, 60);
		add(rocznikKon);
		
		rocznikKonJ = new JComboBox(rok);
		rocznikKonJ.setBounds(300, 205, 200, 25);
		add(rocznikKonJ);
		
		wersjaKon = new JLabel("Wersja:");
		wersjaKon.setBounds(80, 230, 100, 60);
		add(wersjaKon);
		
		wersjaKonJ = new JComboBox(wersjeKon);
		wersjaKonJ.setBounds(300, 245, 200, 25);
		add(wersjaKonJ);
		
		pDyskuKon = new JLabel("Pojemność:");
		pDyskuKon.setBounds(80, 270, 100, 60);
		add(pDyskuKon);
		
		pDyskuKonJ = new JComboBox(pojemnosciKon);
		pDyskuKonJ.setBounds(300, 285, 200, 25);
		add(pDyskuKonJ);
		
		cenaKon = new JLabel("Cena:");
		cenaKon.setBounds(80, 310, 150, 60);
		add(cenaKon);
		
		cenaKonsoli = new JTextArea();
		cenaKonsoli.setBounds(300, 330, 200, 25);
		cenaKonsoli.setEditable(false);
		cenaKonsoli.setOpaque(false);
		cenaKonsoli.setFont(new Font(null , Font.BOLD, 13));
		cenaKonsoli.setText(String.valueOf(sumaKon));
		cenaKonsoli.setBackground(getBackground());
		add(cenaKonsoli);
		
		dodajDoKoszykaKon = new JButton("Dodaj do koszyka");
		dodajDoKoszykaKon.setBounds(650, 175, 200, 45);
		add(dodajDoKoszykaKon);
		
		wrocKon = new JButton("Wróć");
		wrocKon.setBounds(650, 245, 200, 45);
		add(wrocKon);
		
		markaKon.setVisible(false);
		markaKonJ.setVisible(false);
		rocznikKon.setVisible(false);
		rocznikKonJ.setVisible(false);
		wersjaKon.setVisible(false);
		wersjaKonJ.setVisible(false);
		pDyskuKon.setVisible(false);
		pDyskuKonJ.setVisible(false);
		cenaKon.setVisible(false);
		cenaKonsoli.setVisible(false);
		dodajDoKoszykaKon.setVisible(false);
		wrocKon.setVisible(false);
		
		wrocKon.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				markaKon.setVisible(false);
				markaKonJ.setVisible(false);
				rocznikKon.setVisible(false);
				rocznikKonJ.setVisible(false);
				wersjaKon.setVisible(false);
				wersjaKonJ.setVisible(false);
				pDyskuKon.setVisible(false);
				pDyskuKonJ.setVisible(false);
				cenaKon.setVisible(false);
				cenaKonsoli.setVisible(false);
				dodajDoKoszykaKon.setVisible(false);
				wrocKon.setVisible(false);
			}
			
		});
		
		markaKonJ.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(markaKonJ.getSelectedIndex()==0)
					c17=0;
				if(markaKonJ.getSelectedIndex()==1)
					c17=800;
				if(markaKonJ.getSelectedIndex()==2)
					c17=600;
				if(markaKonJ.getSelectedIndex()==3)
					c17=400;
				sumaKon=c17+c18+c19;
				cenaKonsoli.setText(String.valueOf(sumaKon));
			}
			
		});
		
		wersjaKonJ.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// typDJ Auto-generated method stub
				if(wersjaKonJ.getSelectedIndex()==0)
					c18=0;
				if(wersjaKonJ.getSelectedIndex()==1)
					c18=100;
				if(wersjaKonJ.getSelectedIndex()==2)
					c18=80;
				if(wersjaKonJ.getSelectedIndex()==3)
					c18=120;
				if(wersjaKonJ.getSelectedIndex()==4)
					c18=130;
				sumaKon=c17+c18+c19;
				cenaKonsoli.setText(String.valueOf(sumaKon));
			}
			
		});
		
		pDyskuKonJ.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(pDyskuKonJ.getSelectedIndex()==0)
					c19=0;
				if(pDyskuKonJ.getSelectedIndex()==1)
					c19=100;
				if(pDyskuKonJ.getSelectedIndex()==2)
					c19=200;
				if(pDyskuKonJ.getSelectedIndex()==3)
					c19=400;
				sumaKon=c17+c18+c19;
				cenaKonsoli.setText(String.valueOf(sumaKon));
			}
			
		});
		
		dodajDoKoszykaKon.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(
						markaKonJ.getSelectedItem().toString()!="-" &&
						wersjaKonJ.getSelectedItem().toString()!="-" &&
						pDyskuKonJ.getSelectedItem().toString()!="0")
						{
							koszykLista.add(new Koszyk(new Konsole(markaKonJ.getSelectedItem().toString(), Integer.parseInt(rocznikKonJ.getSelectedItem().toString()), wersjaKonJ.getSelectedItem().toString(), Integer.parseInt(pDyskuKonJ.getSelectedItem().toString()), Integer.parseInt(cenaGry.getText().toString())), null, null, null, null));
							markaKonJ.setSelectedIndex(0);
							rocznikKonJ.setSelectedIndex(0);
							wersjaKonJ.setSelectedIndex(0);
							pDyskuKonJ.setSelectedIndex(0);
							JOptionPane.showMessageDialog(null, "Pomyślnie dodano do koszyka!");
						}
						else {
							JOptionPane.showMessageDialog(null, "Wybierz wszystkie elementy!");
						}
				
			}
			
		});
		
		/*---------------------------------------------------------------------------------------------------*/
		
		labelTytul = new JLabel("ELEKTROMARKET ( ͡~ ͜ʖ ͡°)");
		labelTytul.setHorizontalAlignment(JLabel.CENTER);
		labelTytul.setFont(new Font(null, Font.BOLD, 30));
		labelTytul.setBounds(300, 0, 400, 150);
		add(labelTytul);
		
		/*---------------------------------------------------------------------------------------------------*/
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		/*---------------------------------------------------------------------------------------------------*/
		
		zakupy = new JMenu("Zakupy");
		menuBar.add(zakupy);
		
		koszyk = new JMenu("Koszyk");
		menuBar.add(koszyk);
		
		informacja = new JMenu("Informacja");
		menuBar.add(informacja);

		/*---------------------------------------------------------------------------------------------------*/
		
		dane = new JMenuItem("O sklepie");
		informacja.add(dane);
		dane.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new WindowDane();
			}
		}
		
		);
		
		autor = new JMenuItem("O autorze");
		informacja.add(autor);
		autor.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new WindowAutor();
			}
		}
		
		);

		/*---------------------------------------------KOSZYK------------------------------------------------*/
		
		koszykOpen = new JMenuItem("Otwórz koszyk");
		koszyk.add(koszykOpen);
		koszykOpen.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				koszykDane.setVisible(true);
				wrocKoszyk.setVisible(true);
				wyczyscKoszyk.setVisible(true);
				scroll.setVisible(true);
				imie.setVisible(true);
				nazwisko.setVisible(true);
				miejscowosc.setVisible(true);
				kod.setVisible(true);
				imieField.setVisible(true);
				nazwiskoField.setVisible(true);
				miejscowoscField.setVisible(true);
				kodField.setVisible(true);
				dodajDaneOsobowe.setVisible(true);
				zapiszZamowienie.setVisible(true);
				
				koszykDane.setText(null);
				for(int i=0;i<koszykLista.size();i++)
					koszykDane.append(koszykLista.get(i)+"\r\n"+"\r\n");
				
				if(koszykDane.getText().isEmpty()==true)
					koszykDane.append("Koszyk jest pusty!");
				
				markaK.setVisible(false);
				markaKJ.setVisible(false);
				rocznikK.setVisible(false);
				rocznikKJ.setVisible(false);
				obudowaK.setVisible(false);
				obudowaKJ.setVisible(false);
				ramK.setVisible(false);
				ramKJ.setVisible(false);
				procesorK.setVisible(false);
				procesorKJ.setVisible(false);
				pDyskuK.setVisible(false);
				pDyskuKJ.setVisible(false);
				grafikaK.setVisible(false);
				grafikaKJ.setVisible(false);
				cenaK.setVisible(false);
				cenaKomputera.setVisible(false);
				dodajDoKoszykaK.setVisible(false);
				wrocK.setVisible(false);
				
				markaL.setVisible(false);
				markaLJ.setVisible(false);
				rocznikL.setVisible(false);
				rocznikLJ.setVisible(false);
				pEkranuL.setVisible(false);
				pEkranuLJ.setVisible(false);
				matrycaL.setVisible(false);
				matrycaLJ.setVisible(false);
				rozdzielczoscL.setVisible(false);
				rozdzielczoscLJ.setVisible(false);
				ramL.setVisible(false);
				ramLJ.setVisible(false);
				procesorL.setVisible(false);
				procesorLJ.setVisible(false);
				pDyskuL.setVisible(false);
				pDyskuLJ.setVisible(false);
				grafikaL.setVisible(false);
				grafikaLJ.setVisible(false);
				cenaL.setVisible(false);
				cenaLaptopa.setVisible(false);
				dodajDoKoszykaL.setVisible(false);
				wrocL.setVisible(false);
				
				markaT.setVisible(false);
				markaTJ.setVisible(false);
				rocznikT.setVisible(false);
				rocznikTJ.setVisible(false);
				pEkranuT.setVisible(false);
				pEkranuTJ.setVisible(false);
				matrycaT.setVisible(false);
				matrycaTJ.setVisible(false);
				rozdzielczoscT.setVisible(false);
				rozdzielczoscTJ.setVisible(false);
				ramT.setVisible(false);
				ramTJ.setVisible(false);
				cenaT.setVisible(false);
				cenaTelefonu.setVisible(false);
				dodajDoKoszykaT.setVisible(false);
				wrocT.setVisible(false);
				
				markaA.setVisible(false);
				markaAJ.setVisible(false);
				rocznikA.setVisible(false);
				rocznikAJ.setVisible(false);
				typA.setVisible(false);
				typAJ.setVisible(false);
				przyslonaA.setVisible(false);
				przyslonaAJ.setVisible(false);
				obiektywA.setVisible(false);
				obiektywAJ.setVisible(false);
				cenaA.setVisible(false);
				cenaAparatu.setVisible(false);
				dodajDoKoszykaA.setVisible(false);
				wrocA.setVisible(false);
				
				markaD.setVisible(false);
				markaDJ.setVisible(false);
				rocznikD.setVisible(false);
				rocznikDJ.setVisible(false);
				typD.setVisible(false);
				typDJ.setVisible(false);
				rozdzielczoscD.setVisible(false);
				rozdzielczoscDJ.setVisible(false);
				cenaD.setVisible(false);
				cenaDrukarki.setVisible(false);
				dodajDoKoszykaD.setVisible(false);
				wrocD.setVisible(false);
				
				markaTel.setVisible(false);
				markaTelJ.setVisible(false);
				rocznikTel.setVisible(false);
				rocznikTelJ.setVisible(false);
				pEkranuTel.setVisible(false);
				pEkranuTelJ.setVisible(false);
				rozdzielczoscTel.setVisible(false);
				rozdzielczoscTelJ.setVisible(false);
				cenaTel.setVisible(false);
				cenaTelewizora.setVisible(false);
				dodajDoKoszykaTel.setVisible(false);
				wrocTel.setVisible(false);
				
				markaG.setVisible(false);
				markaGJ.setVisible(false);
				rocznikG.setVisible(false);
				rocznikGJ.setVisible(false);
				rodzajG.setVisible(false);
				rodzajGJ.setVisible(false);
				platformaG.setVisible(false);
				platformaGJ.setVisible(false);
				cenaG.setVisible(false);
				cenaGry.setVisible(false);
				dodajDoKoszykaG.setVisible(false);
				wrocG.setVisible(false);
				
				markaKon.setVisible(false);
				markaKonJ.setVisible(false);
				rocznikKon.setVisible(false);
				rocznikKonJ.setVisible(false);
				wersjaKon.setVisible(false);
				wersjaKonJ.setVisible(false);
				pDyskuKon.setVisible(false);
				pDyskuKonJ.setVisible(false);
				cenaKon.setVisible(false);
				cenaKonsoli.setVisible(false);
				dodajDoKoszykaKon.setVisible(false);
				wrocKon.setVisible(false);
			}
			
		});
		
		wrocKoszyk = new JButton("Wróć");
		wrocKoszyk.setBounds(650, 320, 200, 50);
		add(wrocKoszyk);
		wrocKoszyk.setVisible(false);
		wrocKoszyk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				koszykDane.setVisible(false);
				wyczyscKoszyk.setVisible(false);
				wrocKoszyk.setVisible(false);
				scroll.setVisible(false);
				imie.setVisible(false);
				nazwisko.setVisible(false);
				miejscowosc.setVisible(false);
				kod.setVisible(false);
				imieField.setVisible(false);
				nazwiskoField.setVisible(false);
				miejscowoscField.setVisible(false);
				kodField.setVisible(false);
				dodajDaneOsobowe.setVisible(false);
				zapiszZamowienie.setVisible(false);
			}
			
		});
		
		koszykDane = new JTextArea("", 5, 50);
		koszykDane.setLineWrap(true);
		koszykDane.setEditable(false);
		add(koszykDane);
		koszykDane.setVisible(false);
		
		wyczyscKoszyk = new JButton("Wyczyść koszyk");
		wyczyscKoszyk.setBounds(650, 390, 200, 50);
		add(wyczyscKoszyk);
		wyczyscKoszyk.setVisible(false);
		wyczyscKoszyk.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(koszykLista.isEmpty()==true)
					JOptionPane.showMessageDialog(null, "Brak przedmiotów w koszyku!");
				else 
					koszykLista.removeAll(koszykLista);
				koszykDane.setText(null);
				koszykDane.append("Koszyk jest pusty!");
			}
			
		});
	
		scroll = new JScrollPane(koszykDane,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setBounds(70, 130, 860, 150);
		add(scroll);
		scroll.setVisible(false);
		
		zapiszZamowienie = new JButton("Zapisz zamówienie");
		zapiszZamowienie.setBounds(650, 460, 200, 50);
		add(zapiszZamowienie);
		zapiszZamowienie.setVisible(false);
		zapiszZamowienie.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(koszykLista.isEmpty()==true)
					JOptionPane.showMessageDialog(null, "Najpierw dodaj przedmioty do koszyka!");
				else
				{
					JFileChooser fc= new JFileChooser();
					if(fc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION);
					try {
						File h = fc.getSelectedFile();
						FileWriter zapis = new FileWriter(h);
						for(int i=0;i<koszykLista.size();i++)
							zapis.write(koszykLista.get(i)+"\r\n"+"\r\n");
						zapis.close();
						JOptionPane.showMessageDialog(null, "Udało się zapisać zamówienie!");
					}catch(FileNotFoundException e1){
						e1.printStackTrace();
					}catch(IOException ex) {
						System.out.println("Bład wejscia-wyjścia");
					}
				}
					
				}
			}
		
		);
		
		dodajDaneOsobowe = new JButton("Dodaj dane osobowe");
		dodajDaneOsobowe.setBounds(350, 400, 200, 40);
		add(dodajDaneOsobowe);
		dodajDaneOsobowe.setVisible(false);
		dodajDaneOsobowe.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(koszykLista.isEmpty()==true)
					JOptionPane.showMessageDialog(null, "Najpierw dodaj przedmioty do koszyka!");
				else 
				{
				if(
					imieField.getText().isEmpty()==true ||
					nazwiskoField.getText().isEmpty()==true ||
					miejscowoscField.getText().isEmpty()==true ||
					kodField.getText().isEmpty()==true)
				JOptionPane.showMessageDialog(null, "Podaj wszystkie dane! [Imię, Nazwisko, Miejscowość i numer domu, Kod pocztowy i miejscowość poczty]");
				else 
				{
					for(int i=0;i<koszykLista.size();i++)
					{
						koszykLista.get(i).setImie(imieField.getText());
						koszykLista.get(i).setNazwisko(nazwiskoField.getText());
						koszykLista.get(i).setMiejscowosc(miejscowoscField.getText());
						koszykLista.get(i).setKod(kodField.getText());
					}
					koszykDane.setText(null);
					for(int i=0;i<koszykLista.size();i++)
						koszykDane.append(koszykLista.get(i)+"\r\n"+"\r\n");
					
					imieField.setText(null);
					nazwiskoField.setText(null);
					miejscowoscField.setText(null);
					kodField.setText(null);
					}
				}
			}
			
		});
		
		imie = new JLabel("Imię:");
		imie.setBounds(50, 350, 100, 25);
		add(imie);
		imie.setVisible(false);
		
		nazwisko = new JLabel("Nazwisko:");
		nazwisko.setBounds(50, 390, 100, 25);
		add(nazwisko);
		nazwisko.setVisible(false);
		
		miejscowosc = new JLabel("Miejscowość:");
		miejscowosc.setBounds(50, 430, 100, 25);
		add(miejscowosc);
		miejscowosc.setVisible(false);
		
		kod = new JLabel("Kod pocztowy:");
		kod.setBounds(50, 470, 100, 25);
		add(kod);
		kod.setVisible(false);
		
		imieField = new JTextField();
		imieField.setBounds(170, 350, 150, 25);
		add(imieField);
		imieField.setVisible(false);
		
		nazwiskoField = new JTextField();
		nazwiskoField.setBounds(170, 390, 150, 25);
		add(nazwiskoField);
		nazwiskoField.setVisible(false);
		
		miejscowoscField = new JTextField();
		miejscowoscField.setBounds(170, 430, 150, 25);
		add(miejscowoscField);
		miejscowoscField.setVisible(false);
		
		kodField = new JTextField();
		kodField.setBounds(170, 470, 150, 25);
		add(kodField);
		kodField.setVisible(false);
		

		/*---------------------------------------------------------------------------------------------------*/
		
		komputery = new JMenuItem("Komputery");
		zakupy.add(komputery);
		komputery.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				markaK.setVisible(true);
				markaKJ.setVisible(true);
				rocznikK.setVisible(true);
				rocznikKJ.setVisible(true);
				obudowaK.setVisible(true);
				obudowaKJ.setVisible(true);
				ramK.setVisible(true);
				ramKJ.setVisible(true);
				procesorK.setVisible(true);
				procesorKJ.setVisible(true);
				pDyskuK.setVisible(true);
				pDyskuKJ.setVisible(true);
				grafikaK.setVisible(true);
				grafikaKJ.setVisible(true);
				cenaK.setVisible(true);
				cenaKomputera.setVisible(true);
				dodajDoKoszykaK.setVisible(true);
				wrocK.setVisible(true);
				
				markaL.setVisible(false);
				markaLJ.setVisible(false);
				rocznikL.setVisible(false);
				rocznikLJ.setVisible(false);
				pEkranuL.setVisible(false);
				pEkranuLJ.setVisible(false);
				matrycaL.setVisible(false);
				matrycaLJ.setVisible(false);
				rozdzielczoscL.setVisible(false);
				rozdzielczoscLJ.setVisible(false);
				ramL.setVisible(false);
				ramLJ.setVisible(false);
				procesorL.setVisible(false);
				procesorLJ.setVisible(false);
				pDyskuL.setVisible(false);
				pDyskuLJ.setVisible(false);
				grafikaL.setVisible(false);
				grafikaLJ.setVisible(false);
				cenaL.setVisible(false);
				cenaLaptopa.setVisible(false);
				dodajDoKoszykaL.setVisible(false);
				wrocL.setVisible(false);
				
				markaT.setVisible(false);
				markaTJ.setVisible(false);
				rocznikT.setVisible(false);
				rocznikTJ.setVisible(false);
				pEkranuT.setVisible(false);
				pEkranuTJ.setVisible(false);
				matrycaT.setVisible(false);
				matrycaTJ.setVisible(false);
				rozdzielczoscT.setVisible(false);
				rozdzielczoscTJ.setVisible(false);
				ramT.setVisible(false);
				ramTJ.setVisible(false);
				cenaT.setVisible(false);
				cenaTelefonu.setVisible(false);
				dodajDoKoszykaT.setVisible(false);
				wrocT.setVisible(false);
				
				markaA.setVisible(false);
				markaAJ.setVisible(false);
				rocznikA.setVisible(false);
				rocznikAJ.setVisible(false);
				typA.setVisible(false);
				typAJ.setVisible(false);
				przyslonaA.setVisible(false);
				przyslonaAJ.setVisible(false);
				obiektywA.setVisible(false);
				obiektywAJ.setVisible(false);
				cenaA.setVisible(false);
				cenaAparatu.setVisible(false);
				dodajDoKoszykaA.setVisible(false);
				wrocA.setVisible(false);
				
				markaD.setVisible(false);
				markaDJ.setVisible(false);
				rocznikD.setVisible(false);
				rocznikDJ.setVisible(false);
				typD.setVisible(false);
				typDJ.setVisible(false);
				rozdzielczoscD.setVisible(false);
				rozdzielczoscDJ.setVisible(false);
				cenaD.setVisible(false);
				cenaDrukarki.setVisible(false);
				dodajDoKoszykaD.setVisible(false);
				wrocD.setVisible(false);
				
				markaTel.setVisible(false);
				markaTelJ.setVisible(false);
				rocznikTel.setVisible(false);
				rocznikTelJ.setVisible(false);
				pEkranuTel.setVisible(false);
				pEkranuTelJ.setVisible(false);
				rozdzielczoscTel.setVisible(false);
				rozdzielczoscTelJ.setVisible(false);
				cenaTel.setVisible(false);
				cenaTelewizora.setVisible(false);
				dodajDoKoszykaTel.setVisible(false);
				wrocTel.setVisible(false);
				
				markaG.setVisible(false);
				markaGJ.setVisible(false);
				rocznikG.setVisible(false);
				rocznikGJ.setVisible(false);
				rodzajG.setVisible(false);
				rodzajGJ.setVisible(false);
				platformaG.setVisible(false);
				platformaGJ.setVisible(false);
				cenaG.setVisible(false);
				cenaGry.setVisible(false);
				dodajDoKoszykaG.setVisible(false);
				wrocG.setVisible(false);
				
				markaKon.setVisible(false);
				markaKonJ.setVisible(false);
				rocznikKon.setVisible(false);
				rocznikKonJ.setVisible(false);
				wersjaKon.setVisible(false);
				wersjaKonJ.setVisible(false);
				pDyskuKon.setVisible(false);
				pDyskuKonJ.setVisible(false);
				cenaKon.setVisible(false);
				cenaKonsoli.setVisible(false);
				dodajDoKoszykaKon.setVisible(false);
				wrocKon.setVisible(false);
				
				koszykDane.setVisible(false);
				wyczyscKoszyk.setVisible(false);
				wrocKoszyk.setVisible(false);
				scroll.setVisible(false);
				imie.setVisible(false);
				nazwisko.setVisible(false);
				miejscowosc.setVisible(false);
				kod.setVisible(false);
				imieField.setVisible(false);
				nazwiskoField.setVisible(false);
				miejscowoscField.setVisible(false);
				kodField.setVisible(false);
				dodajDaneOsobowe.setVisible(false);
				zapiszZamowienie.setVisible(false);
			}
			
		});
		
		laptopy = new JMenuItem("Laptopy");
		zakupy.add(laptopy);
		laptopy.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				markaL.setVisible(true);
				markaLJ.setVisible(true);
				rocznikL.setVisible(true);
				rocznikLJ.setVisible(true);
				pEkranuL.setVisible(true);
				pEkranuLJ.setVisible(true);
				matrycaL.setVisible(true);
				matrycaLJ.setVisible(true);
				rozdzielczoscL.setVisible(true);
				rozdzielczoscLJ.setVisible(true);
				ramL.setVisible(true);
				ramLJ.setVisible(true);
				procesorL.setVisible(true);
				procesorLJ.setVisible(true);
				pDyskuL.setVisible(true);
				pDyskuLJ.setVisible(true);
				grafikaL.setVisible(true);
				grafikaLJ.setVisible(true);
				cenaL.setVisible(true);
				cenaLaptopa.setVisible(true);
				dodajDoKoszykaL.setVisible(true);
				wrocL.setVisible(true);
				
				markaK.setVisible(false);
				markaKJ.setVisible(false);
				rocznikK.setVisible(false);
				rocznikKJ.setVisible(false);
				obudowaK.setVisible(false);
				obudowaKJ.setVisible(false);
				ramK.setVisible(false);
				ramKJ.setVisible(false);
				procesorK.setVisible(false);
				procesorKJ.setVisible(false);
				pDyskuK.setVisible(false);
				pDyskuKJ.setVisible(false);
				grafikaK.setVisible(false);
				grafikaKJ.setVisible(false);
				cenaK.setVisible(false);
				cenaKomputera.setVisible(false);
				dodajDoKoszykaK.setVisible(false);
				wrocK.setVisible(false);
				
				markaT.setVisible(false);
				markaTJ.setVisible(false);
				rocznikT.setVisible(false);
				rocznikTJ.setVisible(false);
				pEkranuT.setVisible(false);
				pEkranuTJ.setVisible(false);
				matrycaT.setVisible(false);
				matrycaTJ.setVisible(false);
				rozdzielczoscT.setVisible(false);
				rozdzielczoscTJ.setVisible(false);
				ramT.setVisible(false);
				ramTJ.setVisible(false);
				cenaT.setVisible(false);
				cenaTelefonu.setVisible(false);
				dodajDoKoszykaT.setVisible(false);
				wrocT.setVisible(false);
				
				markaA.setVisible(false);
				markaAJ.setVisible(false);
				rocznikA.setVisible(false);
				rocznikAJ.setVisible(false);
				typA.setVisible(false);
				typAJ.setVisible(false);
				przyslonaA.setVisible(false);
				przyslonaAJ.setVisible(false);
				obiektywA.setVisible(false);
				obiektywAJ.setVisible(false);
				cenaA.setVisible(false);
				cenaAparatu.setVisible(false);
				dodajDoKoszykaA.setVisible(false);
				wrocA.setVisible(false);
				
				markaD.setVisible(false);
				markaDJ.setVisible(false);
				rocznikD.setVisible(false);
				rocznikDJ.setVisible(false);
				typD.setVisible(false);
				typDJ.setVisible(false);
				rozdzielczoscD.setVisible(false);
				rozdzielczoscDJ.setVisible(false);
				cenaD.setVisible(false);
				cenaDrukarki.setVisible(false);
				dodajDoKoszykaD.setVisible(false);
				wrocD.setVisible(false);
				
				markaTel.setVisible(false);
				markaTelJ.setVisible(false);
				rocznikTel.setVisible(false);
				rocznikTelJ.setVisible(false);
				pEkranuTel.setVisible(false);
				pEkranuTelJ.setVisible(false);
				rozdzielczoscTel.setVisible(false);
				rozdzielczoscTelJ.setVisible(false);
				cenaTel.setVisible(false);
				cenaTelewizora.setVisible(false);
				dodajDoKoszykaTel.setVisible(false);
				wrocTel.setVisible(false);
				
				markaG.setVisible(false);
				markaGJ.setVisible(false);
				rocznikG.setVisible(false);
				rocznikGJ.setVisible(false);
				rodzajG.setVisible(false);
				rodzajGJ.setVisible(false);
				platformaG.setVisible(false);
				platformaGJ.setVisible(false);
				cenaG.setVisible(false);
				cenaGry.setVisible(false);
				dodajDoKoszykaG.setVisible(false);
				wrocG.setVisible(false);
				
				markaKon.setVisible(false);
				markaKonJ.setVisible(false);
				rocznikKon.setVisible(false);
				rocznikKonJ.setVisible(false);
				wersjaKon.setVisible(false);
				wersjaKonJ.setVisible(false);
				pDyskuKon.setVisible(false);
				pDyskuKonJ.setVisible(false);
				cenaKon.setVisible(false);
				cenaKonsoli.setVisible(false);
				dodajDoKoszykaKon.setVisible(false);
				wrocKon.setVisible(false);
				
				koszykDane.setVisible(false);
				wyczyscKoszyk.setVisible(false);
				wrocKoszyk.setVisible(false);
				scroll.setVisible(false);
				imie.setVisible(false);
				nazwisko.setVisible(false);
				miejscowosc.setVisible(false);
				kod.setVisible(false);
				imieField.setVisible(false);
				nazwiskoField.setVisible(false);
				miejscowoscField.setVisible(false);
				kodField.setVisible(false);
				dodajDaneOsobowe.setVisible(false);
				zapiszZamowienie.setVisible(false);
			}
			
		});
		
		telefony = new JMenuItem("Telefony");
		zakupy.add(telefony);
		telefony.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				markaT.setVisible(true);
				markaTJ.setVisible(true);
				rocznikT.setVisible(true);
				rocznikTJ.setVisible(true);
				pEkranuT.setVisible(true);
				pEkranuTJ.setVisible(true);
				matrycaT.setVisible(true);
				matrycaTJ.setVisible(true);
				rozdzielczoscT.setVisible(true);
				rozdzielczoscTJ.setVisible(true);
				ramT.setVisible(true);
				ramTJ.setVisible(true);
				cenaT.setVisible(true);
				cenaTelefonu.setVisible(true);
				dodajDoKoszykaT.setVisible(true);
				wrocT.setVisible(true);
				
				markaK.setVisible(false);
				markaKJ.setVisible(false);
				rocznikK.setVisible(false);
				rocznikKJ.setVisible(false);
				obudowaK.setVisible(false);
				obudowaKJ.setVisible(false);
				ramK.setVisible(false);
				ramKJ.setVisible(false);
				procesorK.setVisible(false);
				procesorKJ.setVisible(false);
				pDyskuK.setVisible(false);
				pDyskuKJ.setVisible(false);
				grafikaK.setVisible(false);
				grafikaKJ.setVisible(false);
				cenaK.setVisible(false);
				cenaKomputera.setVisible(false);
				dodajDoKoszykaK.setVisible(false);
				wrocK.setVisible(false);
				
				markaL.setVisible(false);
				markaLJ.setVisible(false);
				rocznikL.setVisible(false);
				rocznikLJ.setVisible(false);
				pEkranuL.setVisible(false);
				pEkranuLJ.setVisible(false);
				matrycaL.setVisible(false);
				matrycaLJ.setVisible(false);
				rozdzielczoscL.setVisible(false);
				rozdzielczoscLJ.setVisible(false);
				ramL.setVisible(false);
				ramLJ.setVisible(false);
				procesorL.setVisible(false);
				procesorLJ.setVisible(false);
				pDyskuL.setVisible(false);
				pDyskuLJ.setVisible(false);
				grafikaL.setVisible(false);
				grafikaLJ.setVisible(false);
				cenaL.setVisible(false);
				cenaLaptopa.setVisible(false);
				dodajDoKoszykaL.setVisible(false);
				wrocL.setVisible(false);
				
				markaA.setVisible(false);
				markaAJ.setVisible(false);
				rocznikA.setVisible(false);
				rocznikAJ.setVisible(false);
				typA.setVisible(false);
				typAJ.setVisible(false);
				przyslonaA.setVisible(false);
				przyslonaAJ.setVisible(false);
				obiektywA.setVisible(false);
				obiektywAJ.setVisible(false);
				cenaA.setVisible(false);
				cenaAparatu.setVisible(false);
				dodajDoKoszykaA.setVisible(false);
				wrocA.setVisible(false);
				
				markaD.setVisible(false);
				markaDJ.setVisible(false);
				rocznikD.setVisible(false);
				rocznikDJ.setVisible(false);
				typD.setVisible(false);
				typDJ.setVisible(false);
				rozdzielczoscD.setVisible(false);
				rozdzielczoscDJ.setVisible(false);
				cenaD.setVisible(false);
				cenaDrukarki.setVisible(false);
				dodajDoKoszykaD.setVisible(false);
				wrocD.setVisible(false);
				
				markaTel.setVisible(false);
				markaTelJ.setVisible(false);
				rocznikTel.setVisible(false);
				rocznikTelJ.setVisible(false);
				pEkranuTel.setVisible(false);
				pEkranuTelJ.setVisible(false);
				rozdzielczoscTel.setVisible(false);
				rozdzielczoscTelJ.setVisible(false);
				cenaTel.setVisible(false);
				cenaTelewizora.setVisible(false);
				dodajDoKoszykaTel.setVisible(false);
				wrocTel.setVisible(false);
				
				markaG.setVisible(false);
				markaGJ.setVisible(false);
				rocznikG.setVisible(false);
				rocznikGJ.setVisible(false);
				rodzajG.setVisible(false);
				rodzajGJ.setVisible(false);
				platformaG.setVisible(false);
				platformaGJ.setVisible(false);
				cenaG.setVisible(false);
				cenaGry.setVisible(false);
				dodajDoKoszykaG.setVisible(false);
				wrocG.setVisible(false);
				
				markaKon.setVisible(false);
				markaKonJ.setVisible(false);
				rocznikKon.setVisible(false);
				rocznikKonJ.setVisible(false);
				wersjaKon.setVisible(false);
				wersjaKonJ.setVisible(false);
				pDyskuKon.setVisible(false);
				pDyskuKonJ.setVisible(false);
				cenaKon.setVisible(false);
				cenaKonsoli.setVisible(false);
				dodajDoKoszykaKon.setVisible(false);
				wrocKon.setVisible(false);
				
				koszykDane.setVisible(false);
				wyczyscKoszyk.setVisible(false);
				wrocKoszyk.setVisible(false);
				scroll.setVisible(false);
				imie.setVisible(false);
				nazwisko.setVisible(false);
				miejscowosc.setVisible(false);
				kod.setVisible(false);
				imieField.setVisible(false);
				nazwiskoField.setVisible(false);
				miejscowoscField.setVisible(false);
				kodField.setVisible(false);
				dodajDaneOsobowe.setVisible(false);
				zapiszZamowienie.setVisible(false);
			}
			
		});
		
		telewizory = new JMenuItem("Telewizory");
		zakupy.add(telewizory);
		telewizory.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				markaTel.setVisible(true);
				markaTelJ.setVisible(true);
				rocznikTel.setVisible(true);
				rocznikTelJ.setVisible(true);
				pEkranuTel.setVisible(true);
				pEkranuTelJ.setVisible(true);
				rozdzielczoscTel.setVisible(true);
				rozdzielczoscTelJ.setVisible(true);
				cenaTel.setVisible(true);
				cenaTelewizora.setVisible(true);
				dodajDoKoszykaTel.setVisible(true);
				wrocTel.setVisible(true);
				
				markaK.setVisible(false);
				markaKJ.setVisible(false);
				rocznikK.setVisible(false);
				rocznikKJ.setVisible(false);
				obudowaK.setVisible(false);
				obudowaKJ.setVisible(false);
				ramK.setVisible(false);
				ramKJ.setVisible(false);
				procesorK.setVisible(false);
				procesorKJ.setVisible(false);
				pDyskuK.setVisible(false);
				pDyskuKJ.setVisible(false);
				grafikaK.setVisible(false);
				grafikaKJ.setVisible(false);
				cenaK.setVisible(false);
				cenaKomputera.setVisible(false);
				dodajDoKoszykaK.setVisible(false);
				wrocK.setVisible(false);
				
				markaL.setVisible(false);
				markaLJ.setVisible(false);
				rocznikL.setVisible(false);
				rocznikLJ.setVisible(false);
				pEkranuL.setVisible(false);
				pEkranuLJ.setVisible(false);
				matrycaL.setVisible(false);
				matrycaLJ.setVisible(false);
				rozdzielczoscL.setVisible(false);
				rozdzielczoscLJ.setVisible(false);
				ramL.setVisible(false);
				ramLJ.setVisible(false);
				procesorL.setVisible(false);
				procesorLJ.setVisible(false);
				pDyskuL.setVisible(false);
				pDyskuLJ.setVisible(false);
				grafikaL.setVisible(false);
				grafikaLJ.setVisible(false);
				cenaL.setVisible(false);
				cenaLaptopa.setVisible(false);
				dodajDoKoszykaL.setVisible(false);
				wrocL.setVisible(false);
				
				markaT.setVisible(false);
				markaTJ.setVisible(false);
				rocznikT.setVisible(false);
				rocznikTJ.setVisible(false);
				pEkranuT.setVisible(false);
				pEkranuTJ.setVisible(false);
				matrycaT.setVisible(false);
				matrycaTJ.setVisible(false);
				rozdzielczoscT.setVisible(false);
				rozdzielczoscTJ.setVisible(false);
				ramT.setVisible(false);
				ramTJ.setVisible(false);
				cenaT.setVisible(false);
				cenaTelefonu.setVisible(false);
				dodajDoKoszykaT.setVisible(false);
				wrocT.setVisible(false);
				
				markaA.setVisible(false);
				markaAJ.setVisible(false);
				rocznikA.setVisible(false);
				rocznikAJ.setVisible(false);
				typA.setVisible(false);
				typAJ.setVisible(false);
				przyslonaA.setVisible(false);
				przyslonaAJ.setVisible(false);
				obiektywA.setVisible(false);
				obiektywAJ.setVisible(false);
				cenaA.setVisible(false);
				cenaAparatu.setVisible(false);
				dodajDoKoszykaA.setVisible(false);
				wrocA.setVisible(false);
				
				markaD.setVisible(false);
				markaDJ.setVisible(false);
				rocznikD.setVisible(false);
				rocznikDJ.setVisible(false);
				typD.setVisible(false);
				typDJ.setVisible(false);
				rozdzielczoscD.setVisible(false);
				rozdzielczoscDJ.setVisible(false);
				cenaD.setVisible(false);
				cenaDrukarki.setVisible(false);
				dodajDoKoszykaD.setVisible(false);
				wrocD.setVisible(false);
				
				markaG.setVisible(false);
				markaGJ.setVisible(false);
				rocznikG.setVisible(false);
				rocznikGJ.setVisible(false);
				rodzajG.setVisible(false);
				rodzajGJ.setVisible(false);
				platformaG.setVisible(false);
				platformaGJ.setVisible(false);
				cenaG.setVisible(false);
				cenaGry.setVisible(false);
				dodajDoKoszykaG.setVisible(false);
				wrocG.setVisible(false);
				
				markaKon.setVisible(false);
				markaKonJ.setVisible(false);
				rocznikKon.setVisible(false);
				rocznikKonJ.setVisible(false);
				wersjaKon.setVisible(false);
				wersjaKonJ.setVisible(false);
				pDyskuKon.setVisible(false);
				pDyskuKonJ.setVisible(false);
				cenaKon.setVisible(false);
				cenaKonsoli.setVisible(false);
				dodajDoKoszykaKon.setVisible(false);
				wrocKon.setVisible(false);
				
				koszykDane.setVisible(false);
				wyczyscKoszyk.setVisible(false);
				wrocKoszyk.setVisible(false);
				scroll.setVisible(false);
				imie.setVisible(false);
				nazwisko.setVisible(false);
				miejscowosc.setVisible(false);
				kod.setVisible(false);
				imieField.setVisible(false);
				nazwiskoField.setVisible(false);
				miejscowoscField.setVisible(false);
				kodField.setVisible(false);
				dodajDaneOsobowe.setVisible(false);
				zapiszZamowienie.setVisible(false);
			}
			
		});
		
		konsole = new JMenuItem("Konsole");
		zakupy.add(konsole);
		konsole.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				markaKon.setVisible(true);
				markaKonJ.setVisible(true);
				rocznikKon.setVisible(true);
				rocznikKonJ.setVisible(true);
				wersjaKon.setVisible(true);
				wersjaKonJ.setVisible(true);
				pDyskuKon.setVisible(true);
				pDyskuKonJ.setVisible(true);
				cenaKon.setVisible(true);
				cenaKonsoli.setVisible(true);
				dodajDoKoszykaKon.setVisible(true);
				wrocKon.setVisible(true);
				
				markaK.setVisible(false);
				markaKJ.setVisible(false);
				rocznikK.setVisible(false);
				rocznikKJ.setVisible(false);
				obudowaK.setVisible(false);
				obudowaKJ.setVisible(false);
				ramK.setVisible(false);
				ramKJ.setVisible(false);
				procesorK.setVisible(false);
				procesorKJ.setVisible(false);
				pDyskuK.setVisible(false);
				pDyskuKJ.setVisible(false);
				grafikaK.setVisible(false);
				grafikaKJ.setVisible(false);
				cenaK.setVisible(false);
				cenaKomputera.setVisible(false);
				dodajDoKoszykaK.setVisible(false);
				wrocK.setVisible(false);
				
				markaL.setVisible(false);
				markaLJ.setVisible(false);
				rocznikL.setVisible(false);
				rocznikLJ.setVisible(false);
				pEkranuL.setVisible(false);
				pEkranuLJ.setVisible(false);
				matrycaL.setVisible(false);
				matrycaLJ.setVisible(false);
				rozdzielczoscL.setVisible(false);
				rozdzielczoscLJ.setVisible(false);
				ramL.setVisible(false);
				ramLJ.setVisible(false);
				procesorL.setVisible(false);
				procesorLJ.setVisible(false);
				pDyskuL.setVisible(false);
				pDyskuLJ.setVisible(false);
				grafikaL.setVisible(false);
				grafikaLJ.setVisible(false);
				cenaL.setVisible(false);
				cenaLaptopa.setVisible(false);
				dodajDoKoszykaL.setVisible(false);
				wrocL.setVisible(false);
				
				markaT.setVisible(false);
				markaTJ.setVisible(false);
				rocznikT.setVisible(false);
				rocznikTJ.setVisible(false);
				pEkranuT.setVisible(false);
				pEkranuTJ.setVisible(false);
				matrycaT.setVisible(false);
				matrycaTJ.setVisible(false);
				rozdzielczoscT.setVisible(false);
				rozdzielczoscTJ.setVisible(false);
				ramT.setVisible(false);
				ramTJ.setVisible(false);
				cenaT.setVisible(false);
				cenaTelefonu.setVisible(false);
				dodajDoKoszykaT.setVisible(false);
				wrocT.setVisible(false);
				
				markaA.setVisible(false);
				markaAJ.setVisible(false);
				rocznikA.setVisible(false);
				rocznikAJ.setVisible(false);
				typA.setVisible(false);
				typAJ.setVisible(false);
				przyslonaA.setVisible(false);
				przyslonaAJ.setVisible(false);
				obiektywA.setVisible(false);
				obiektywAJ.setVisible(false);
				cenaA.setVisible(false);
				cenaAparatu.setVisible(false);
				dodajDoKoszykaA.setVisible(false);
				wrocA.setVisible(false);
				
				markaD.setVisible(false);
				markaDJ.setVisible(false);
				rocznikD.setVisible(false);
				rocznikDJ.setVisible(false);
				typD.setVisible(false);
				typDJ.setVisible(false);
				rozdzielczoscD.setVisible(false);
				rozdzielczoscDJ.setVisible(false);
				cenaD.setVisible(false);
				cenaDrukarki.setVisible(false);
				dodajDoKoszykaD.setVisible(false);
				wrocD.setVisible(false);
				
				markaTel.setVisible(false);
				markaTelJ.setVisible(false);
				rocznikTel.setVisible(false);
				rocznikTelJ.setVisible(false);
				pEkranuTel.setVisible(false);
				pEkranuTelJ.setVisible(false);
				rozdzielczoscTel.setVisible(false);
				rozdzielczoscTelJ.setVisible(false);
				cenaTel.setVisible(false);
				cenaTelewizora.setVisible(false);
				dodajDoKoszykaTel.setVisible(false);
				wrocTel.setVisible(false);
				
				markaG.setVisible(false);
				markaGJ.setVisible(false);
				rocznikG.setVisible(false);
				rocznikGJ.setVisible(false);
				rodzajG.setVisible(false);
				rodzajGJ.setVisible(false);
				platformaG.setVisible(false);
				platformaGJ.setVisible(false);
				cenaG.setVisible(false);
				cenaGry.setVisible(false);
				dodajDoKoszykaG.setVisible(false);
				wrocG.setVisible(false);
				
				koszykDane.setVisible(false);
				wyczyscKoszyk.setVisible(false);
				wrocKoszyk.setVisible(false);
				scroll.setVisible(false);
				imie.setVisible(false);
				nazwisko.setVisible(false);
				miejscowosc.setVisible(false);
				kod.setVisible(false);
				imieField.setVisible(false);
				nazwiskoField.setVisible(false);
				miejscowoscField.setVisible(false);
				kodField.setVisible(false);
				dodajDaneOsobowe.setVisible(false);
				zapiszZamowienie.setVisible(false);
			}
			
		});
		
		aparaty = new JMenuItem("Aparaty");
		zakupy.add(aparaty);
		aparaty.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				markaA.setVisible(true);
				markaAJ.setVisible(true);
				rocznikA.setVisible(true);
				rocznikAJ.setVisible(true);
				typA.setVisible(true);
				typAJ.setVisible(true);
				przyslonaA.setVisible(true);
				przyslonaAJ.setVisible(true);
				obiektywA.setVisible(true);
				obiektywAJ.setVisible(true);
				cenaA.setVisible(true);
				cenaAparatu.setVisible(true);
				dodajDoKoszykaA.setVisible(true);
				wrocA.setVisible(true);
				
				markaK.setVisible(false);
				markaKJ.setVisible(false);
				rocznikK.setVisible(false);
				rocznikKJ.setVisible(false);
				obudowaK.setVisible(false);
				obudowaKJ.setVisible(false);
				ramK.setVisible(false);
				ramKJ.setVisible(false);
				procesorK.setVisible(false);
				procesorKJ.setVisible(false);
				pDyskuK.setVisible(false);
				pDyskuKJ.setVisible(false);
				grafikaK.setVisible(false);
				grafikaKJ.setVisible(false);
				cenaK.setVisible(false);
				cenaKomputera.setVisible(false);
				dodajDoKoszykaK.setVisible(false);
				wrocK.setVisible(false);
				
				markaL.setVisible(false);
				markaLJ.setVisible(false);
				rocznikL.setVisible(false);
				rocznikLJ.setVisible(false);
				pEkranuL.setVisible(false);
				pEkranuLJ.setVisible(false);
				matrycaL.setVisible(false);
				matrycaLJ.setVisible(false);
				rozdzielczoscL.setVisible(false);
				rozdzielczoscLJ.setVisible(false);
				ramL.setVisible(false);
				ramLJ.setVisible(false);
				procesorL.setVisible(false);
				procesorLJ.setVisible(false);
				pDyskuL.setVisible(false);
				pDyskuLJ.setVisible(false);
				grafikaL.setVisible(false);
				grafikaLJ.setVisible(false);
				cenaL.setVisible(false);
				cenaLaptopa.setVisible(false);
				dodajDoKoszykaL.setVisible(false);
				wrocL.setVisible(false);
				
				markaT.setVisible(false);
				markaTJ.setVisible(false);
				rocznikT.setVisible(false);
				rocznikTJ.setVisible(false);
				pEkranuT.setVisible(false);
				pEkranuTJ.setVisible(false);
				matrycaT.setVisible(false);
				matrycaTJ.setVisible(false);
				rozdzielczoscT.setVisible(false);
				rozdzielczoscTJ.setVisible(false);
				ramT.setVisible(false);
				ramTJ.setVisible(false);
				cenaT.setVisible(false);
				cenaTelefonu.setVisible(false);
				dodajDoKoszykaT.setVisible(false);
				wrocT.setVisible(false);
				
				markaD.setVisible(false);
				markaDJ.setVisible(false);
				rocznikD.setVisible(false);
				rocznikDJ.setVisible(false);
				typD.setVisible(false);
				typDJ.setVisible(false);
				rozdzielczoscD.setVisible(false);
				rozdzielczoscDJ.setVisible(false);
				cenaD.setVisible(false);
				cenaDrukarki.setVisible(false);
				dodajDoKoszykaD.setVisible(false);
				wrocD.setVisible(false);
				
				markaTel.setVisible(false);
				markaTelJ.setVisible(false);
				rocznikTel.setVisible(false);
				rocznikTelJ.setVisible(false);
				pEkranuTel.setVisible(false);
				pEkranuTelJ.setVisible(false);
				rozdzielczoscTel.setVisible(false);
				rozdzielczoscTelJ.setVisible(false);
				cenaTel.setVisible(false);
				cenaTelewizora.setVisible(false);
				dodajDoKoszykaTel.setVisible(false);
				wrocTel.setVisible(false);
				
				markaG.setVisible(false);
				markaGJ.setVisible(false);
				rocznikG.setVisible(false);
				rocznikGJ.setVisible(false);
				rodzajG.setVisible(false);
				rodzajGJ.setVisible(false);
				platformaG.setVisible(false);
				platformaGJ.setVisible(false);
				cenaG.setVisible(false);
				cenaGry.setVisible(false);
				dodajDoKoszykaG.setVisible(false);
				wrocG.setVisible(false);
				
				markaKon.setVisible(false);
				markaKonJ.setVisible(false);
				rocznikKon.setVisible(false);
				rocznikKonJ.setVisible(false);
				wersjaKon.setVisible(false);
				wersjaKonJ.setVisible(false);
				pDyskuKon.setVisible(false);
				pDyskuKonJ.setVisible(false);
				cenaKon.setVisible(false);
				cenaKonsoli.setVisible(false);
				dodajDoKoszykaKon.setVisible(false);
				wrocKon.setVisible(false);
				
				koszykDane.setVisible(false);
				wyczyscKoszyk.setVisible(false);
				wrocKoszyk.setVisible(false);
				scroll.setVisible(false);
				imie.setVisible(false);
				nazwisko.setVisible(false);
				miejscowosc.setVisible(false);
				kod.setVisible(false);
				imieField.setVisible(false);
				nazwiskoField.setVisible(false);
				miejscowoscField.setVisible(false);
				kodField.setVisible(false);
				dodajDaneOsobowe.setVisible(false);
				zapiszZamowienie.setVisible(false);
			}
			
		});
		
		drukarki = new JMenuItem("Drukarki");
		zakupy.add(drukarki);
		drukarki.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				markaD.setVisible(true);
				markaDJ.setVisible(true);
				rocznikD.setVisible(true);
				rocznikDJ.setVisible(true);
				typD.setVisible(true);
				typDJ.setVisible(true);
				rozdzielczoscD.setVisible(true);
				rozdzielczoscDJ.setVisible(true);
				cenaD.setVisible(true);
				cenaDrukarki.setVisible(true);
				dodajDoKoszykaD.setVisible(true);
				wrocD.setVisible(true);
				
				markaK.setVisible(false);
				markaKJ.setVisible(false);
				rocznikK.setVisible(false);
				rocznikKJ.setVisible(false);
				obudowaK.setVisible(false);
				obudowaKJ.setVisible(false);
				ramK.setVisible(false);
				ramKJ.setVisible(false);
				procesorK.setVisible(false);
				procesorKJ.setVisible(false);
				pDyskuK.setVisible(false);
				pDyskuKJ.setVisible(false);
				grafikaK.setVisible(false);
				grafikaKJ.setVisible(false);
				cenaK.setVisible(false);
				cenaKomputera.setVisible(false);
				dodajDoKoszykaK.setVisible(false);
				wrocK.setVisible(false);
				
				markaL.setVisible(false);
				markaLJ.setVisible(false);
				rocznikL.setVisible(false);
				rocznikLJ.setVisible(false);
				pEkranuL.setVisible(false);
				pEkranuLJ.setVisible(false);
				matrycaL.setVisible(false);
				matrycaLJ.setVisible(false);
				rozdzielczoscL.setVisible(false);
				rozdzielczoscLJ.setVisible(false);
				ramL.setVisible(false);
				ramLJ.setVisible(false);
				procesorL.setVisible(false);
				procesorLJ.setVisible(false);
				pDyskuL.setVisible(false);
				pDyskuLJ.setVisible(false);
				grafikaL.setVisible(false);
				grafikaLJ.setVisible(false);
				cenaL.setVisible(false);
				cenaLaptopa.setVisible(false);
				dodajDoKoszykaL.setVisible(false);
				wrocL.setVisible(false);
				
				markaT.setVisible(false);
				markaTJ.setVisible(false);
				rocznikT.setVisible(false);
				rocznikTJ.setVisible(false);
				pEkranuT.setVisible(false);
				pEkranuTJ.setVisible(false);
				matrycaT.setVisible(false);
				matrycaTJ.setVisible(false);
				rozdzielczoscT.setVisible(false);
				rozdzielczoscTJ.setVisible(false);
				ramT.setVisible(false);
				ramTJ.setVisible(false);
				cenaT.setVisible(false);
				cenaTelefonu.setVisible(false);
				dodajDoKoszykaT.setVisible(false);
				wrocT.setVisible(false);
				
				markaA.setVisible(false);
				markaAJ.setVisible(false);
				rocznikA.setVisible(false);
				rocznikAJ.setVisible(false);
				typA.setVisible(false);
				typAJ.setVisible(false);
				przyslonaA.setVisible(false);
				przyslonaAJ.setVisible(false);
				obiektywA.setVisible(false);
				obiektywAJ.setVisible(false);
				cenaA.setVisible(false);
				cenaAparatu.setVisible(false);
				dodajDoKoszykaA.setVisible(false);
				wrocA.setVisible(false);
				
				markaTel.setVisible(false);
				markaTelJ.setVisible(false);
				rocznikTel.setVisible(false);
				rocznikTelJ.setVisible(false);
				pEkranuTel.setVisible(false);
				pEkranuTelJ.setVisible(false);
				rozdzielczoscTel.setVisible(false);
				rozdzielczoscTelJ.setVisible(false);
				cenaTel.setVisible(false);
				cenaTelewizora.setVisible(false);
				dodajDoKoszykaTel.setVisible(false);
				wrocTel.setVisible(false);
				
				markaG.setVisible(false);
				markaGJ.setVisible(false);
				rocznikG.setVisible(false);
				rocznikGJ.setVisible(false);
				rodzajG.setVisible(false);
				rodzajGJ.setVisible(false);
				platformaG.setVisible(false);
				platformaGJ.setVisible(false);
				cenaG.setVisible(false);
				cenaGry.setVisible(false);
				dodajDoKoszykaG.setVisible(false);
				wrocG.setVisible(false);
				
				markaKon.setVisible(false);
				markaKonJ.setVisible(false);
				rocznikKon.setVisible(false);
				rocznikKonJ.setVisible(false);
				wersjaKon.setVisible(false);
				wersjaKonJ.setVisible(false);
				pDyskuKon.setVisible(false);
				pDyskuKonJ.setVisible(false);
				cenaKon.setVisible(false);
				cenaKonsoli.setVisible(false);
				dodajDoKoszykaKon.setVisible(false);
				wrocKon.setVisible(false);
				
				koszykDane.setVisible(false);
				wyczyscKoszyk.setVisible(false);
				wrocKoszyk.setVisible(false);
				scroll.setVisible(false);
				imie.setVisible(false);
				nazwisko.setVisible(false);
				miejscowosc.setVisible(false);
				kod.setVisible(false);
				imieField.setVisible(false);
				nazwiskoField.setVisible(false);
				miejscowoscField.setVisible(false);
				kodField.setVisible(false);
				dodajDaneOsobowe.setVisible(false);
				zapiszZamowienie.setVisible(false);
			}
			
		});
		
		gry = new JMenuItem("Gry");
		zakupy.add(gry);
		gry.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				markaG.setVisible(true);
				markaGJ.setVisible(true);
				rocznikG.setVisible(true);
				rocznikGJ.setVisible(true);
				rodzajG.setVisible(true);
				rodzajGJ.setVisible(true);
				platformaG.setVisible(true);
				platformaGJ.setVisible(true);
				cenaG.setVisible(true);
				cenaGry.setVisible(true);
				dodajDoKoszykaG.setVisible(true);
				wrocG.setVisible(true);
				
				markaK.setVisible(false);
				markaKJ.setVisible(false);
				rocznikK.setVisible(false);
				rocznikKJ.setVisible(false);
				obudowaK.setVisible(false);
				obudowaKJ.setVisible(false);
				ramK.setVisible(false);
				ramKJ.setVisible(false);
				procesorK.setVisible(false);
				procesorKJ.setVisible(false);
				pDyskuK.setVisible(false);
				pDyskuKJ.setVisible(false);
				grafikaK.setVisible(false);
				grafikaKJ.setVisible(false);
				cenaK.setVisible(false);
				cenaKomputera.setVisible(false);
				dodajDoKoszykaK.setVisible(false);
				wrocK.setVisible(false);
				
				markaL.setVisible(false);
				markaLJ.setVisible(false);
				rocznikL.setVisible(false);
				rocznikLJ.setVisible(false);
				pEkranuL.setVisible(false);
				pEkranuLJ.setVisible(false);
				matrycaL.setVisible(false);
				matrycaLJ.setVisible(false);
				rozdzielczoscL.setVisible(false);
				rozdzielczoscLJ.setVisible(false);
				ramL.setVisible(false);
				ramLJ.setVisible(false);
				procesorL.setVisible(false);
				procesorLJ.setVisible(false);
				pDyskuL.setVisible(false);
				pDyskuLJ.setVisible(false);
				grafikaL.setVisible(false);
				grafikaLJ.setVisible(false);
				cenaL.setVisible(false);
				cenaLaptopa.setVisible(false);
				dodajDoKoszykaL.setVisible(false);
				wrocL.setVisible(false);
				
				markaT.setVisible(false);
				markaTJ.setVisible(false);
				rocznikT.setVisible(false);
				rocznikTJ.setVisible(false);
				pEkranuT.setVisible(false);
				pEkranuTJ.setVisible(false);
				matrycaT.setVisible(false);
				matrycaTJ.setVisible(false);
				rozdzielczoscT.setVisible(false);
				rozdzielczoscTJ.setVisible(false);
				ramT.setVisible(false);
				ramTJ.setVisible(false);
				cenaT.setVisible(false);
				cenaTelefonu.setVisible(false);
				dodajDoKoszykaT.setVisible(false);
				wrocT.setVisible(false);
				
				markaA.setVisible(false);
				markaAJ.setVisible(false);
				rocznikA.setVisible(false);
				rocznikAJ.setVisible(false);
				typA.setVisible(false);
				typAJ.setVisible(false);
				przyslonaA.setVisible(false);
				przyslonaAJ.setVisible(false);
				obiektywA.setVisible(false);
				obiektywAJ.setVisible(false);
				cenaA.setVisible(false);
				cenaAparatu.setVisible(false);
				dodajDoKoszykaA.setVisible(false);
				wrocA.setVisible(false);
				
				markaD.setVisible(false);
				markaDJ.setVisible(false);
				rocznikD.setVisible(false);
				rocznikDJ.setVisible(false);
				typD.setVisible(false);
				typDJ.setVisible(false);
				rozdzielczoscD.setVisible(false);
				rozdzielczoscDJ.setVisible(false);
				cenaD.setVisible(false);
				cenaDrukarki.setVisible(false);
				dodajDoKoszykaD.setVisible(false);
				wrocD.setVisible(false);
				
				markaTel.setVisible(false);
				markaTelJ.setVisible(false);
				rocznikTel.setVisible(false);
				rocznikTelJ.setVisible(false);
				pEkranuTel.setVisible(false);
				pEkranuTelJ.setVisible(false);
				rozdzielczoscTel.setVisible(false);
				rozdzielczoscTelJ.setVisible(false);
				cenaTel.setVisible(false);
				cenaTelewizora.setVisible(false);
				dodajDoKoszykaTel.setVisible(false);
				wrocTel.setVisible(false);
				
				markaKon.setVisible(false);
				markaKonJ.setVisible(false);
				rocznikKon.setVisible(false);
				rocznikKonJ.setVisible(false);
				wersjaKon.setVisible(false);
				wersjaKonJ.setVisible(false);
				pDyskuKon.setVisible(false);
				pDyskuKonJ.setVisible(false);
				cenaKon.setVisible(false);
				cenaKonsoli.setVisible(false);
				dodajDoKoszykaKon.setVisible(false);
				wrocKon.setVisible(false);
				
				koszykDane.setVisible(false);
				wyczyscKoszyk.setVisible(false);
				wrocKoszyk.setVisible(false);
				scroll.setVisible(false);
				imie.setVisible(false);
				nazwisko.setVisible(false);
				miejscowosc.setVisible(false);
				kod.setVisible(false);
				imieField.setVisible(false);
				nazwiskoField.setVisible(false);
				miejscowoscField.setVisible(false);
				kodField.setVisible(false);
				dodajDaneOsobowe.setVisible(false);
				zapiszZamowienie.setVisible(false);
			}
			
		});

		/*---------------------------------------------------------------------------------------------------*/
		
		bg = new JLabel(new ImageIcon("2.png"));
		bg.setOpaque(true);
		bg.setBounds(0, 0, 1000, 600);
		add(bg);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}}

