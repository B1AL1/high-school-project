package ProjektKK;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class WindowDane extends JFrame implements ActionListener{
	private JLabel bg, labelTytul, labelNazwa, labelNazwa2, labelWlasciciel, labelWlasciciel2, labelAdres, labelAdres2, labelRok, labelRok2, labelRodzaj, labelRodzaj2;
	private JTextArea tProjekt;
	private JButton buttonWroc;
	
	public WindowDane() {
		setTitle("O sklepie");
		setSize(400, 570);
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		Toolkit zdjecie = Toolkit.getDefaultToolkit(); 
		setIconImage(zdjecie.getImage("1.png"));
		
		int style1 = Font.BOLD;
		Font newFont1 = new Font("Calibri", style1, 25);
		int style2 = Font.BOLD;
		Font newFont2 = new Font("Comic Sans MS", style2, 11);
		int style3 = Font.PLAIN;
		Font newFont3 = new Font("Comic Sans MS", style3, 13);
		
		labelTytul = new JLabel("Krótko o aplikacji");
		labelTytul.setHorizontalAlignment(JLabel.CENTER);
		labelTytul.setBounds(60, 10, 300, 60);
		labelTytul.setFont(newFont1);
		labelTytul.setBorder(BorderFactory.createLineBorder(new Color(75, 0, 130)));
		add(labelTytul);
		
		tProjekt = new JTextArea("Aplikacja jest wykonana w ramach projektu z informatyki klasy 3A ILO im. Władysława Jagiełły w Krasnymstawie w  roku szkolnym 2017/2018. Czas pracy ~22h, 4702 linijki");
		tProjekt.setEditable(false);
		tProjekt.setLineWrap(true);
		tProjekt.setBackground(new Color(240, 230, 140));
		tProjekt.setBounds(20, 80, 360, 60);
		tProjekt.setFont(newFont3);
		tProjekt.setBorder(BorderFactory.createLineBorder(new Color(75, 0, 130)));
		add(tProjekt);
		
		labelNazwa = new JLabel("Nazwa sklepu:");
		labelNazwa.setHorizontalAlignment(JLabel.CENTER);
		labelNazwa.setBounds(20, 155, 150, 50);
		labelNazwa.setFont(newFont2);
		labelNazwa.setBorder(BorderFactory.createLineBorder(new Color(75, 0, 130)));
		add(labelNazwa);
		
		labelNazwa2 = new JLabel("( ͡~ ͜ʖ ͡°)");
		labelNazwa2.setHorizontalAlignment(JLabel.CENTER);
		labelNazwa2.setBounds(200, 155, 180, 50);
		labelNazwa2.setBorder(BorderFactory.createLineBorder(new Color(75, 0, 130)));
		add(labelNazwa2);
		
		labelWlasciciel = new JLabel("Właściciel:");
		labelWlasciciel.setHorizontalAlignment(JLabel.CENTER);
		labelWlasciciel.setBounds(20, 210, 150, 50);
		labelWlasciciel.setFont(newFont2);
		labelWlasciciel.setBorder(BorderFactory.createLineBorder(new Color(75, 0, 130)));
		add(labelWlasciciel);
		
		labelWlasciciel2 = new JLabel("Konrad Kalman");
		labelWlasciciel2.setHorizontalAlignment(JLabel.CENTER);
		labelWlasciciel2.setBounds(200, 210, 180, 50);
		labelWlasciciel2.setBorder(BorderFactory.createLineBorder(new Color(75, 0, 130)));
		add(labelWlasciciel2);
		
		labelAdres = new JLabel("Adres:");
		labelAdres.setHorizontalAlignment(JLabel.CENTER);
		labelAdres.setBounds(20, 265, 150, 50);
		labelAdres.setFont(newFont2);
		labelAdres.setBorder(BorderFactory.createLineBorder(new Color(75, 0, 130)));
		add(labelAdres);
		
		labelAdres2 = new JLabel("ul. Cicha 2, Izbica");
		labelAdres2.setHorizontalAlignment(JLabel.CENTER);
		labelAdres2.setBounds(200, 265, 180, 50);
		labelAdres2.setBorder(BorderFactory.createLineBorder(new Color(75, 0, 130)));
		add(labelAdres2);
		
		labelRok = new JLabel("Rok powstania:");
		labelRok.setHorizontalAlignment(JLabel.CENTER);
		labelRok.setBounds(20, 320, 150, 50);
		labelRok.setFont(newFont2);
		labelRok.setBorder(BorderFactory.createLineBorder(new Color(75, 0, 130)));
		add(labelRok);
		
		labelRok2 = new JLabel("2018");
		labelRok2.setHorizontalAlignment(JLabel.CENTER);
		labelRok2.setBounds(200, 320, 180, 50);
		labelRok2.setBorder(BorderFactory.createLineBorder(new Color(75, 0, 130)));
		add(labelRok2);
		
		labelRodzaj = new JLabel("Rodzaj sklepu:");
		labelRodzaj.setHorizontalAlignment(JLabel.CENTER);
		labelRodzaj.setBounds(20, 375, 150, 50);
		labelRodzaj.setFont(newFont2);
		labelRodzaj.setBorder(BorderFactory.createLineBorder(new Color(75, 0, 130)));
		add(labelRodzaj);
		
		labelRodzaj2 = new JLabel("Elektromarket");
		labelRodzaj2.setHorizontalAlignment(JLabel.CENTER);
		labelRodzaj2.setBounds(200, 375, 180, 50);
		labelRodzaj2.setBorder(BorderFactory.createLineBorder(new Color(75, 0, 130)));
		add(labelRodzaj2);
		

		buttonWroc = new JButton("Zamknij okno");
		buttonWroc.setBounds(120, 450, 160, 50);
		buttonWroc.addActionListener(this);
		add(buttonWroc);
		
		bg = new JLabel(new ImageIcon("2.png"));
		bg.setOpaque(true);
		bg.setBounds(0, 0, 400, 570);
		add(bg);
	
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent a) {
		setVisible(false);
		
	}
}
