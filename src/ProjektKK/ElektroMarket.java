package ProjektKK;

import java.util.ArrayList;
import java.util.List;


public class ElektroMarket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Koszyk> koszykLista = new ArrayList<Koszyk>();
		//koszykLista.add(new Koszyk(new Komputery("HP", 2018, "XD", 8, "i7", 500, "GTX1050", 4000), "Jan", "Nowak", "Krasnystaw", "22-300"));
		//koszykLista.add(new Koszyk(new Aparaty("HP", 2018, "lustrzanka", 1.8, "XD", 4000), "Jan", "Nowak", "Krasnystaw", "22-300"));
		//System.out.println(koszykLista);
		new Window(koszykLista);
		
	}

}
