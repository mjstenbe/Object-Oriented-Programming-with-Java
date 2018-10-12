import java.util.Scanner;
import javax.swing.JOptionPane;

public class JuomaAutomaattiKäyttöliittymä {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Alusta muuttujat silmukan ulkopuolella
		int valinta = 0;

		// Olet luonut jokaisessa kohdassa uuden JuomaAutomaatin. Tämä aiheuttaa sen,
		// että
		// Juomat eivät koskaan lopu, sillä uusi automaatti on aina täynnä :)
		// Eli koko tehtävässä riittää että luodaan yksi automaatti, jota kaikki kohdat
		// käyttävät

		JuomaAutomaatti matti = new JuomaAutomaatti();

		do {
			String vastaus = JOptionPane.showInputDialog(null,
					"*******Juoma-Automaatti*******\\n\"+\r\n" + "\"1. Kahvi\\n2.Tee\\n3.Kaakao\\n4.Lopeta",
					JOptionPane.QUESTION_MESSAGE);
			valinta = Integer.parseInt(vastaus);

			if (valinta == 1) {

				matti.valmistaKahvi();

				JOptionPane.showMessageDialog(null, matti.toString());
			}
			if (valinta == 2) {
				// JuomaAutomaatti matti = new JuomaAutomaatti();
				matti.valmistaTee();

				JOptionPane.showMessageDialog(null, matti.toString());
			}
			if (valinta == 3) {
				// JuomaAutomaatti matti = new JuomaAutomaatti();
				matti.valmistaKaakao();

				JOptionPane.showMessageDialog(null, matti.toString());
			}
			// valinta-muuttujaa ei voi käyttää while-ehdossa.. Jäin jumiin, miten saisin
			// toteutettua tämän
		} while (valinta != 4);

		System.out.println("Ohjelma loppuu.");

	}
}
