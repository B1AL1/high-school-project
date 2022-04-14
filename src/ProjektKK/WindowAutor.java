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

public class WindowAutor extends JFrame implements ActionListener{
	private JLabel labelTytul, bg, labelImie, labelImie2, labelCytat1, labelNazwisko, labelNazwisko2, labelUrodzenie, labelUrodzenie2, labelKlasa, labelKlasa2;
	private JButton buttonWroc;
	private JTextArea tCytat2;
	
	public WindowAutor() {
		setTitle("O autorze");
		setSize(600, 500);
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		Toolkit zdjecie = Toolkit.getDefaultToolkit(); 
		setIconImage(zdjecie.getImage("1.png"));
		
		
		int style1 = Font.BOLD;
		Font newFont1 = new Font("Calibri", style1, 25);
		int style2 = Font.BOLD;
		Font newFont2 = new Font("Comic Sans MS", style2, 11);
		
		labelTytul = new JLabel("O autorze");
		labelTytul.setHorizontalAlignment(JLabel.CENTER);
		labelTytul.setBounds(50, 10, 500, 60);
		labelTytul.setFont(newFont1);
		labelTytul.setBorder(BorderFactory.createLineBorder(new Color(75, 0, 130)));
		add(labelTytul);
		
		labelImie = new JLabel("Imiê:");
		labelImie.setHorizontalAlignment(JLabel.CENTER);
		labelImie.setBounds(70, 100, 150, 50);
		labelImie.setFont(newFont2);
		labelImie.setBorder(BorderFactory.createLineBorder(new Color(75, 0, 130)));
		add(labelImie);
		
		labelImie2 = new JLabel("Konrad");
		labelImie2.setHorizontalAlignment(JLabel.CENTER);
		labelImie2.setBounds(250, 100, 280, 50);
		labelImie2.setFont(newFont2);
		labelImie2.setBorder(BorderFactory.createLineBorder(new Color(75, 0, 130)));
		add(labelImie2);
		
		labelNazwisko = new JLabel("Nazwisko:");
		labelNazwisko.setHorizontalAlignment(JLabel.CENTER);
		labelNazwisko.setBounds(70, 155, 150, 50);
		labelNazwisko.setFont(newFont2);
		labelNazwisko.setBorder(BorderFactory.createLineBorder(new Color(75, 0, 130)));
		add(labelNazwisko);
		
		labelNazwisko2 = new JLabel("Kalman");
		labelNazwisko2.setHorizontalAlignment(JLabel.CENTER);
		labelNazwisko2.setBounds(250, 155, 280, 50);
		labelNazwisko2.setFont(newFont2);
		labelNazwisko2.setBorder(BorderFactory.createLineBorder(new Color(75, 0, 130)));
		add(labelNazwisko2);
		
		labelCytat1 = new JLabel("Wybranie tematu projektu:");
		labelCytat1.setHorizontalAlignment(JLabel.CENTER);
		labelCytat1.setBounds(70, 210, 150, 50);
		labelCytat1.setFont(newFont2);
		labelCytat1.setBorder(BorderFactory.createLineBorder(new Color(75, 0, 130)));
		add(labelCytat1);
		
		tCytat2 = new JTextArea("(...) ludzie maj¹ wrodzony talent do wybierania    w³aœnie tego, co dla nich najgorsze. ~ J.K.        Rowling – Harry Potter  i Kamieñ Filozoficzny");
		tCytat2.setEditable(false);
		tCytat2.setLineWrap(true);
		tCytat2.setOpaque(false);
		tCytat2.setBounds(250, 210, 280, 50);
		tCytat2.setFont(newFont2);
		tCytat2.setBorder(BorderFactory.createLineBorder(new Color(75, 0, 130)));
		add(tCytat2);
		
		labelUrodzenie = new JLabel("Data urodzenia:");
		labelUrodzenie.setHorizontalAlignment(JLabel.CENTER);
		labelUrodzenie.setBounds(70, 320, 150, 50);
		labelUrodzenie.setFont(newFont2);
		labelUrodzenie.setBorder(BorderFactory.createLineBorder(new Color(75, 0, 130)));
		add(labelUrodzenie);
		
		labelUrodzenie2 = new JLabel("19.02.1999");
		labelUrodzenie2.setHorizontalAlignment(JLabel.CENTER);
		labelUrodzenie2.setBounds(250, 320, 280, 50);
		labelUrodzenie2.setFont(newFont2);
		labelUrodzenie2.setBorder(BorderFactory.createLineBorder(new Color(75, 0, 130)));
		add(labelUrodzenie2);
		
		labelKlasa = new JLabel("Klasa:");
		labelKlasa.setHorizontalAlignment(JLabel.CENTER);
		labelKlasa.setBounds(70, 265, 150, 50);
		labelKlasa.setFont(newFont2);
		labelKlasa.setBorder(BorderFactory.createLineBorder(new Color(75, 0, 130)));
		add(labelKlasa);
		
		labelKlasa2 = new JLabel(" 3A ");
		labelKlasa2.setHorizontalAlignment(JLabel.CENTER);
		labelKlasa2.setBounds(250, 265, 280, 50);
		labelKlasa2.setFont(newFont2);
		labelKlasa2.setBorder(BorderFactory.createLineBorder(new Color(75, 0, 130)));
		add(labelKlasa2);

		buttonWroc = new JButton("Zamknij okno");
		buttonWroc.setBounds(190, 400, 170, 50);
		buttonWroc.addActionListener(this);
		add(buttonWroc);
		
		bg = new JLabel(new ImageIcon("2.png"));
		bg.setOpaque(true);
		bg.setBounds(0, 0, 600, 500);
		add(bg);
	
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent a) {
		setVisible(false);
		
	}
}
